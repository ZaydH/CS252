{-
  Name: Zayd Hammoudeh
  Class: CS 252
  Assignment: Final Project
  Date: April 1, 2016
  Description: simple_function_call test case.
-}

module Simple_Function_Call (
   myFunc2,
   myFunc
) where

-- Here's a comment.
myFunc :: [Int] -> Int -> Int
myFunc x y = 3 + 5

-- Here's another one.
myFunc2 :: Int -> Int -> Int -> Int
myFunc2 x y z = (-3) * 9 * 10

main :: IO ()
main = do
    putStrLn $ show $ myFunc2(3)(4)(5)

