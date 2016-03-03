Example Code for lab #1

> maxNum :: [Int] -> Int
> maxNum [] = error "Invalid Input"
> maxNum [x] = x
> maxNum (x:xs) = if x > maxXs then x else maxXs
>   where maxXs = maxNum xs

Fizzbuzz from lab #1

> fizzBuzz :: Int -> String
> fizzBuzz x
>         | x == 1 = "1"
>         | x < 0 = error "Invalid x"
>         | (x `mod` 3) == 0 && (x `mod` 5) == 0 = (fizzBuzz (x-1)) ++ " fizzbuzz"
>         | (x `mod` 3) == 0 = (fizzBuzz (x-1)) ++ " fizz"
>         | (x `mod` 5) == 0 = (fizzBuzz (x-1)) ++ " buzz"
>         | otherwise = (fizzBuzz (x-1)) ++ " " ++ show x

