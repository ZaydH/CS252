case_example :: Int -> [Char]
case_example x = case (x) of
                     1 -> "Positive One"
                     (-1) -> "Negative One"
                     0 -> "Zero"
                     otherwise -> ((error "Something went wrong here"))

main :: IO ()
main = do
       putStrLn $ ((case_example 1))
       putStrLn $ ((case_example 0))
       putStrLn $ ((case_example (-1) ))

