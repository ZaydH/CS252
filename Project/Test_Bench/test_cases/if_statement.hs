

ifCheck :: Bool -> String
ifCheck x = if (x) then ("True") else ("False")

main :: IO ()
main = do
       putStrLn $ ifCheck $ True
       putStrLn $ ifCheck $ False
