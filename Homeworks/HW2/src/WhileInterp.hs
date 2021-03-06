{-
  Name: Zayd Hammoudeh
  Class: CS 252
  Assigment: HW2
  Date: Due March 3, 2016
  Description: A Basic Interpreter for the WHILE Language
-}


module WhileInterp (
  Expression(..),
  Binop(..),
  Value(..),
  testProgram,
  run
) where

import Data.Map (Map)
import qualified Data.Map as Map

-- We represent variables as strings.
type Variable = String

-- The store is an associative map from variables to values.
-- (The store roughly corresponds with the heap in a language like Java).
type Store = Map Variable Value

data Expression =
    Var Variable                            -- x
  | Val Value                               -- v
  | Assign Variable Expression              -- x := e
  | Sequence Expression Expression          -- e1; e2
  | Op Binop Expression Expression
  | If Expression Expression Expression     -- if e1 then e2 else e3
  | While Expression Expression             -- while (e1) e2
  | And Expression Expression               -- and e1
  | Or Expression Expression                -- or e1
  | Not Expression                          -- Not e1
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
  deriving (Show)

data Value =
    IntVal Int
  | BoolVal Bool
  deriving (Show)


-- This function will be useful for defining binary operations.
-- The first case is done for you.
-- Be sure to explicitly check for a divide by 0 and throw an error.
applyOp :: Binop -> Value -> Value -> Value
applyOp Plus (IntVal i) (IntVal j) = IntVal $ i + j
applyOp Minus (IntVal i) (IntVal j) = IntVal $ i - j
applyOp Times (IntVal i) (IntVal j) = IntVal $ i * j
applyOp Divide _ (IntVal 0) = error "Divide by 0 is not a valid operation."
applyOp Divide (IntVal i) (IntVal j) = IntVal $ quot i j
applyOp Gt (IntVal i) (IntVal j) = BoolVal $ i > j
applyOp Ge (IntVal i) (IntVal j) = BoolVal $ i >= j
applyOp Lt (IntVal i) (IntVal j) = BoolVal $ i < j
applyOp Le (IntVal i) (IntVal j) = BoolVal $ i <= j
applyOp _ _ _ = error "Invalid call to applyOp" 


-- Implement this function according to the specified semantics
evaluate :: Expression -> Store -> (Value, Store)
evaluate (Var x) s = do case (Map.lookup x s) of
                              Just i -> (i, s)
                              _      -> error "Key is not in the map"
evaluate (Val x) s = (x, s)
evaluate (Assign a e) s = let (eVal, s') = evaluate e s in (eVal, Map.insert a eVal s')
evaluate (Sequence e1 e2) s = (e2Val, s'') 
    where (_, s') = evaluate e1 s
          (e2Val, s'') = evaluate e2 s'
evaluate (Op o e1 e2) s =
  let (v1,s1) = evaluate e1 s
      (v2,s') = evaluate e2 s1
  in (applyOp o v1 v2, s')
evaluate (If e eTrue eFalse) s = if cond then (evaluate eTrue s') else (evaluate eFalse s')
    where (BoolVal cond, s') = evaluate e s 
evaluate (While e1 e2) s = evaluate (If e1 eTrue eFalse) s 
    where   eTrue = Sequence e2 (While e1 e2)
            eFalse = Val (BoolVal False)
evaluate (Not e) s = case x of
                            BoolVal True -> (BoolVal False, s')
                            BoolVal False -> (BoolVal True, s')
                            _ -> error "\"Not\" only accepts Boolean values."
    where (x, s') = evaluate e s
evaluate (And e1 e2) s = case eVal1 of
                            BoolVal False -> (BoolVal False, s')
                            BoolVal True  -> evaluate (If e2 (Val (BoolVal True)) (Val (BoolVal False))) s' 
                            _ -> error "\"And\" only accepts Boolean values."
    where   (eVal1, s') = evaluate e1 s
evaluate (Or e1 e2) s = evaluate (Not (And (Not e1) (Not e2))) s 

-- Evaluates a program with an initially empty state
run :: Expression -> (Value, Store)
run prog = evaluate prog Map.empty

-- The same as run, but only returns the Store
testProgram :: Expression -> Store
testProgram prog = snd $ run prog


