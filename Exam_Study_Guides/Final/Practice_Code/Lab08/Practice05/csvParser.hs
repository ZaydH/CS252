import Text.ParserCombinators.Parsec
import System.Environment

csvFile = line `sepBy` eol

line = cell `sepBy` char ','

cell = many1 $ noneOf ",\n"

eol = try (string "\n\r")
    <|> try (string "\n")
    <?> "End of line"

main = do
  args <- getArgs
  p <- parseFromFile csvFile (head args)
  case p of
    Left err  -> print err
    Right csv -> print csv

