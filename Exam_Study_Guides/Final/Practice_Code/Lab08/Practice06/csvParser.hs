import Text.ParserCombinators.Parsec
import System.Environment

csvFile :: GenParser Char st [[String]]
csvFile = line `sepBy` eol 

line :: GenParser Char st [String]
line = cell `sepBy` char ','

cell :: GenParser Char st String
cell = many $ noneOf ",\n"

eol :: GenParser Char st String 
eol = try (string "\n\r")
    <|> try (string "\n")
    <?> "End of Line Error"


main = do
  args <- getArgs
  p <- parseFromFile csvFile (head args)
  case p of
    Left err  -> print err
    Right csv -> print csv

