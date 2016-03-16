fizzbuzz :: Int -> String
fizzbuzz 0 = ""
fizzbuzz n = (fizzbuzz (n-1)) ++ " " ++ wholeStr
        where
           fizzStr = if n `mod` 3 == 0 then "fizz" else ""
           buzzStr = if n `mod` 5 == 0 then "buzz" else ""
           wholeStr = let combStr = fizzStr ++ buzzStr in if combStr == "" then (show n) else combStr

maxNum :: [Int] -> Int
maxNum [x] = x
maxNum (x:xs) = let xsMax = (maxNum xs) in if x > xsMax then x else xsMax