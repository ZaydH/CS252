-- The following function should take a list of Integers
-- and return the largest.
-- THE DEFINITION MUST BE RECURSIVE.
maxNum :: [Integer] -> Integer
maxNum [] = error "Empty list.  No max is possible."
maxNum (x:[]) = x
maxNum (x:xs) = if x > xsMax then x else xsMax
    where
        xsMax = maxNum xs

-- Do the game fizzbuzz (http://en.wikipedia.org/wiki/Fizz_buzz).
-- Return a string counting from 1 to the specified number.
-- Replace numbers divisible by 3 with "fizz" and numbers divisible
-- by 5 with "buzz".  If a number is divisible by both 3 and 5,
-- replace it with "fizzbuzz".
fizzbuzz :: Int -> String
fizzbuzz n
    | n < 1 = error "Invalid game value.  Must be greater than or equal to 1."
    | n == 1 = "1"
    | otherwise = recursion ++ fizzStr ++ buzzStr ++ numbStr
    where 
        fizzStr = if (rem n 3 == 0) then "fizz" else ""
        buzzStr = if (rem n 5 == 0) then "buzz" else ""
        numbStr = if (buzzStr == "" && fizzStr =="") then show n else ""
        recursion = fizzbuzz (n-1) ++ " "

main :: IO()
main = do
    putStrLn $ fizzbuzz (12)
    let x = [34, 42, 4, 62, -1, 20, 54, 34, -9999]
    putStrLn $ show $ maxNum x