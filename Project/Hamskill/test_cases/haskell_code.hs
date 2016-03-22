

-- Here's a comment.
myFunc :: [Int] -> Int -> Int
myFunc x y = 3 + 5

-- Here's another one.
myFunc2 :: Int -> Int -> Int -> Int
myFunc2 x y z = (-3) * 9 * 10

main :: IO ()
main = do
    putStrLn $ show $ ((myFunc2 3 4 5))

