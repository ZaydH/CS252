
addList :: [Int] -> Int
addList [] = 0
addList (x:xs) = x + ((addList xs))

main :: IO ()
main = putStrLn $ show $ ((addList [1, 2, 3]))

