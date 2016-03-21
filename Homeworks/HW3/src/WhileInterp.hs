{-
  Name: Zayd Hammoudeh
  Class: CS 252
  Assigment: HW3
  Date: March 24, 2016
  Description: <Describe the program and what it does>
-}


module WhileInterp (
  Expression(..),
  Binop(..),
  Value(..),
  runFile,
  showParsedExp,
  run
) where

import Data.Map (Map)
import qualified Data.Map as Map
import Text.ParserCombinators.Parsec
import Control.Monad.Except

-- We represent variables as strings.
type Variable = String

--We also represent error messages as strings.
type ErrorMsg = String

-- The store is an associative map from variables to values.
-- (The store roughly corresponds with the heap in a language like Java).
type Store = Map Variable Value

data Expression =
    Var Variable                            -- x
  | Val Value                               -- v
  | Assign Variable Expression              -- x := e
  | Sequence Expression Expression          -- e1; e2
  | Op Binop Expression Expression
  | If Expression Expression Expression     -- if e1 then e2 else e3 endif
  | While Expression Expression             -- while e1 do e2 endwhile
  deriving (Show)

data Binop =
    Plus     -- +  :: Int  -> Int  -> Int
  | Minus    -- -  :: Int  -> Int  -> Int
  | Times    -- *  :: Int  -> Int  -> Int
  | Divide   -- /  :: Int  -> Int  -> Int
  | Gt       -- >  :: Int -> Int -> Bool
  | Ge       -- >= :: Int -> Int -> Bool
  | Lt       -- <  :: Int -> Int -> Bool
  | Le       -- <= :: Int -> Int -> Bool
  deriving (Show, Eq)

data Value =
    IntVal Int
  | BoolVal Bool
  deriving (Show)


fileP :: GenParser Char st Expression
fileP = do
  prog <- exprP
  eof
  return prog

exprP = do
  e <- exprP'
  rest <- optionMaybe restSeqP
  return (case rest of
    Nothing   -> e
    Just e' -> Sequence e e')

-- Expressions are divided into terms and expressions for the sake of
-- parsing.  Note that binary operators **DO NOT** follow the expected
-- precedence rules.
--
-- ***FOR 2pts EXTRA CREDIT (hard, no partial credit)***
-- Correct the precedence of the binary operators.
exprP' = do
  spaces
  t <- termP
  spaces
  rest <- optionMaybe restP
  spaces
  return (case rest of
    Nothing   -> t
    Just (":=", t') -> (case t of
      Var varName -> Assign varName t'
      _           -> error "Expected var")
    Just (op, t') -> Op (transOp op) t t')

restSeqP = do
  char ';'
  exprP

transOp s = case s of
  "+"  -> Plus
  "-"  -> Minus
  "*"  -> Times
  "/"  -> Divide
  ">=" -> Ge
  ">"  -> Gt
  "<=" -> Le
  "<"  -> Lt
  o    -> error $ "Unexpected operator " ++ o

-- Some string, followed by an expression
restP = do
  ch <- string "+"
    <|> string "-"
    <|> string "*"
    <|> string "/"
    <|> try (string "<=")
    <|> string "<"
    <|> try (string ">=")
    <|> string ">"
    <|> string ":=" -- not really a binary operator, but it fits in nicely here.
    <?> "binary operator"
  e <- exprP'
  return (ch, e)

-- All terms can be distinguished by looking at the first character
termP = valP
    <|> ifP
    <|> whileP
    <|> parenP
    <|> varP
    <?> "value, variable, 'if', 'while', or '('"

valP = do
  v <- boolP <|> numberP
  return $ Val v

boolP = do
  bStr <- string "true" <|> string "false" <|> string "skip"
  return $ case bStr of
    "true" -> BoolVal True
    "false" -> BoolVal False
    "skip" -> BoolVal False -- Treating the command 'skip' as a synonym for false, for ease of parsing

-- Numbers are positive integers.
--numberP = error "TBD_numberP"
numberP = do
    intStr <- many1 digit
    return $ IntVal (read intStr :: Int)

-- Variables are specified via a capital letter 
--varP = error "TBD_varP"
--varP = do
--    varStr <- many1 upper
--    return $ Var varStr
varP = do
    varStr <- many1 letter
    return $ Var varStr

--ifP = error "TBD_iFP"
ifP = do
    _ <- string "if"
    e1 <- exprP
    _ <- string "then"
    e2 <- exprP
    _ <- string "else"
    e3 <- exprP
    _ <- string "endif"
    return $ If e1 e2 e3

-- Parse the While Loop
--whileP = error "TBD_whileP"
whileP = do
    _ <- string "while"
    e1 <- exprP
    _ <- string "do"
    e2 <- exprP
    _ <- string "endwhile"
    return $ While e1 e2

-- An expression in parens, e.g. (9-5)*2
--parenP = error "TBD_parenP"
parenP = do
    _ <- string "("
    e <- exprP
    _ <- string ")"
    return e


-- This function will be useful for defining binary operations.
-- Unlike in the previous assignment, this function returns an "Either value".
-- The right side represents a successful computation.
-- The left side is an error message indicating a problem with the program.
-- The first case is done for you.
applyOp :: Binop -> Value -> Value -> Either ErrorMsg Value
applyOp Plus (IntVal i) (IntVal j) = Right $ IntVal $ i + j
applyOp Minus (IntVal i) (IntVal j) = Right $ IntVal $ i - j
applyOp Times (IntVal i) (IntVal j) = Right $ IntVal $ i * j
applyOp Divide (IntVal i) (IntVal j) = Right $ IntVal $ i `div` j
applyOp Ge (IntVal i) (IntVal j) = Right $ BoolVal $ i >= j
applyOp Gt (IntVal i) (IntVal j) = Right $ BoolVal $ i > j
applyOp Le (IntVal i) (IntVal j) = Right $ BoolVal $ i <= j
applyOp Lt (IntVal i) (IntVal j) = Right $ BoolVal $ i < j
applyOp _ _ _ = error "Invalid Operator."

-- As with the applyOp method, the semantics for this function
-- should return Either values.  Left <error msg> indicates an error,
-- whereas Right <something> indicates a successful execution.
evaluate :: Expression -> Store -> Either ErrorMsg (Value, Store)
evaluate (Op o e1 e2) s
        | (o == Times) || (o == Divide) = do 
                                          (v2, o2, e3) <- return $ evaluateOpBackTrack e2 s
                                          (v12', s') <- evaluateOp o e1 (Val (IntVal v2)) s 
                                          evaluate (Op o2 (Val v12') e3) s'
        | (o == Plus) = do
                        (v2, s') <- evaluate e2 s 
                        evaluateOp o e1 (Val v2) s'
        | (o == Minus) = do
                         (v2, o2, e3) <- return $ evaluateOpBackTrack e2 s
                         -- If it is not a multiply or divide, then prioritize the subtraction
                         if (o2 /= Times) && (o2 /= Divide) then do
                            (v12', s') <- evaluateOp o e1 (Val (IntVal v2)) s 
                            evaluate (Op o2 (Val v12') e3) s'
                         -- If it is a multiply or divide
                         else do
                            (v23, s') <- evaluate (Op o2 (Val (IntVal v2)) e3) s
                            evaluate (Op o e1 (Val v23)) s'
        | otherwise = evaluateOp o e1 e2 s
evaluate (If e eTrue eFalse) s = do 
                                 (val, s') <- (evaluate e s) 
                                 case val of
                                      (BoolVal cond) -> if cond then (evaluate eTrue s') else (evaluate eFalse s')
                                      (IntVal x) -> error $ "Non-boolean value '" ++ (show x) ++ "' used as a conditional"
evaluate (Val x) s = do return (x, s)
evaluate (Var x) s = do case (Map.lookup x s) of
                              Just i -> return (i, s)
                              _      -> error "Key is not in the map"
evaluate (While e1 e2) s = do
                           evaluate (If e1 (Sequence e2 (While e1 e2)) (Val $ BoolVal False)) s
evaluate (Assign a e) s = do
                          (eVal, s') <- evaluate e s
                          return (eVal, Map.insert a eVal s')
evaluate (Sequence e1 e2) s = do
                              (_, s') <- evaluate e1 s
                              evaluate e2 s'
--evaluate _ _ = error "TBD_NoEvaluate"


evaluateOp :: Binop -> Expression -> Expression -> Store -> Either ErrorMsg (Value, Store)
evaluateOp o e1 e2 s = do
                          (v1,s1) <- evaluate e1 s
                          (v2,s') <- evaluate e2 s1
                          v <- applyOp o v1 v2
                          return (v, s')


evaluateOpBackTrack :: Expression -> Store -> (Int, Binop, Expression)
evaluateOpBackTrack (Val  (IntVal x)) _ = (x, Plus, (Val (IntVal 0)))
evaluateOpBackTrack (Var y) s = (yVal, Plus, (Val (IntVal 0)))
                              where
                              Right ((IntVal yVal), _) = evaluate (Var y) s
evaluateOpBackTrack (Op o (Val (IntVal x)) e2) _ = (x, o, e2)
evaluateOpBackTrack (Op o (Var x) e2) s = (xVal, o, e2)
                                        where 
                                        Right ((IntVal xVal), _) = evaluate (Var x) s

-- Evaluates a program with an initially empty state
run :: Expression -> Either ErrorMsg (Value, Store)
run prog = evaluate prog Map.empty

showParsedExp fileName = do
  p <- parseFromFile fileP fileName
  case p of
    Left parseErr -> print parseErr
    Right exp -> print exp

runFile fileName = do
  p <- parseFromFile fileP fileName
  case p of
    Left parseErr -> print parseErr
    Right exp ->
      case (run exp) of
        Left msg -> print msg
        Right (v,s) -> print $ show s


