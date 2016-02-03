-- The following function should take a list of Integers
-- and return the largest.
-- THE DEFINITION MUST BE RECURSIVE.
maxNum :: [Integer] -> Integer
maxNum a
    | null a = error "Empty list.  No max is possible."
    | length a == 1 = head a
    | otherwise = max (head a) (maxNum (tail a))

-- Do the game fizzbuzz (http://en.wikipedia.org/wiki/Fizz_buzz).
-- Return a string counting from 1 to the specified number.
-- Replace numbers divisible by 3 with "fizz" and numbers divisible
-- by 5 with "buzz".  If a number is divisible by both 3 and 5,
-- replace it with "fizzbuzz".
fizzbuzz :: Int -> String
fizzbuzz n
    | n < 1 = error "Invalid game value.  Must be greater than or equal to 1."
    | n == 1 = "1"
    | (rem n 3 == 0) && (rem n 5 == 0) = recursion ++ "fizzbuzz"
    | rem n 3 == 0 = recursion ++ "fizz"
    | rem n 5 == 0 = recursion ++ "buzz"
    | otherwise = recursion ++ show n
    where 
        recursion = fizzbuzz (n-1) ++ " "

main :: IO()
main = do
    putStrLn (fizzbuzz 15)