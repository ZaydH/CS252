import Text.ParserCombinators.Parsec
import System.Environment

data JValue = JString String
            | JNumber Double
            | JBool Bool
            | JNull
            | JObject [(String, JValue)]
            | JArray [JValue]
  deriving (Eq, Ord, Show)


jsonFile :: GenParser Char st JValue
jsonFile = do
  result <- jsonElem
  spaces
  eof
  return result

jsonElem :: GenParser Char st JValue
jsonElem = do
  spaces
  result <- jsonElem'
  spaces
  return result

jsonElem' = jsonArr
        <|> jsonString
        <|> jsonBool
        <|> jsonNull
        <|> jsonNumber
        <|> jsonObject
--        <?> "json element"

jsonString :: GenParser Char st JValue
jsonString = jsonStringDQ <|> jsonStringSQ

jsonNumber = do
      spaces
      numb <- many1 digit
      spaces
      return $ JString numb

jsonStringDQ = do
  char '"'
  s <- many $ noneOf "\"" -- crude.  does not allow double quotes within strings
  char '"'
  return $ JString s

jsonStringSQ = do
  char '\''
  s <- many $ noneOf "'" -- crude, same as above
  char '\''
  return $ JString s

jsonBool = do
  bStr <- string "true" <|> string "false"
  return $ case bStr of
    "true" -> JBool True
    "false" -> JBool False

jsonNull = do
  string "null"
  return JNull

jsonArr = do
  char '['
  arr <- jsonElem `sepBy` (char ',')
  char ']'
  return $ JArray arr

jsonObject = do
  char '{'
  spaces
  tuples <- jTuple `sepBy` string ","  
  spaces
  char '}'
  return $ JObject tuples

jTuple = do 
         spaces
         str <- many1 letter
         spaces
         string ":"
         elem <- jsonElem
         spaces
         return $ (str, elem)

parseJSON :: String -> Either ParseError JValue
parseJSON input = parse jsonFile "(unknown)" input


printJSON :: JValue -> String
printJSON (JObject xs) = "{\n" ++ (printJObject xs) ++ "\n}"
printJSON (JNull) = "null"
printJSON (JString str) = "\"" ++ str ++ "\""
printJSON (JNumber numb) = show numb
printJSON (JBool bool) = show bool
printJSON (JArray x) = "[\n" ++ printJArray x ++ "\n]"

printJObject :: [(String,JValue)] -> String
printJObject [] = ""
printJObject [(str, jval)] = str ++ ": " ++ printJSON jval
printJObject (x:xs) = printJObject [x] ++ ",\n" ++ printJObject xs

printJArray :: [JValue] -> String
printJArray [] = ""
printJArray [x] = printJSON x
printJArray (x:xs) = printJSON x ++ ",\n" ++ printJArray xs

main = do
  args <- getArgs
  p <- parseFromFile jsonFile (head args)
  case p of
    Left err  -> print err
    Right json -> putStrLn $ printJSON json


