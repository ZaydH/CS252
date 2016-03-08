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

jsonElem' = jsonObject
        <|> jsonArr
        <|> jsonString
        <|> jsonBool
        <|> jsonNull
        <|> jsonNumber
        <?> "json element"

jsonString :: GenParser Char st JValue
jsonString = jsonStringDQ <|> jsonStringSQ

jsonStringDQ = do
  char '"'
  s <- many $ noneOf "\"" -- crude.  does not allow double quotes within strings
  char '"'
  return $ JString s
  
  
jsonNumber = do
  numb <- many1 digit
  return $ JNumber $ read numb

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
  arr <- jsonTuple `sepBy` (char ',')
  char '}'
  return $ JObject arr
  
jsonTuple = do
  spaces
  name <- many1 $ noneOf ":"
  char ':'
  elem <- jsonElem
  return (name, elem)


printJSON :: JValue -> Int -> String
printJSON (JObject jobj) tab = "{\n" ++ (printElement jobj (tab + 1)) ++ (printTabs tab) ++ "}"
printJSON (JArray jobj) tab = "[\n" ++ (printArrElment jobj (tab + 1)) ++ (printTabs tab) ++ "]"
printJSON (JNumber numb) _ = show numb
printJSON (JBool boolVal) _ = show boolVal
printJSON (JString str) _ = "\"" ++ str ++ "\""
printJSON (JNull) _ = "null"


printElement :: [(String, JValue)] -> Int -> String
printElement [] _ = ""
printElement ((name, jVal):xs) tab = (printTabs tab) ++ name ++ ": " ++ (printJSON jVal tab) ++ (if xs /= [] then ",\n" else "\n") ++ (printElement xs tab)

printArrElment :: [JValue] -> Int -> String
printArrElment [] _ = ""
printArrElment (x:xs) tab = (printTabs tab) ++ (printJSON x tab) ++ (if xs /= [] then ",\n" else "\n") ++ (printArrElment xs tab)



printTabs :: Int -> String
printTabs cnt = concat $ replicate cnt "\t"

main = do
  args <- getArgs
  p <- parseFromFile jsonFile (head args)
  case p of
    Left err  -> print err
    Right json -> putStrLn $ printJSON json 0


