module Main where

bigAdd :: [Int] -> [Int] -> [Int]
bigAdd a b = bigAddSum
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (+) paddedA paddedB
            bigAddSum = normalizeList zippedList
            

padLists :: [Int] -> [Int] -> ([Int], [Int])
padLists a b = (paddedA, paddedB)
    where   lenA = length a
            lenB = length b
            maxLen = max lenA lenB
            paddedA = a ++ replicate (max (maxLen - lenA) 0) 0
            paddedB = b ++ replicate (max (maxLen - lenB) 0) 0  

normalizeList :: [Int] -> [Int]
normalizeList a = normalizedA
            -- Used to make sure each element is between 0 and 999
    where   subtractionList = [ subtract | block <- a, let subtract = -1000 * (quot block 1000)]
            -- Carry over as needed 
            carryList = [0] ++  [ carry | block <- a, let carry = quot block 1000]
            lastCarry = last carryList
            -- Combine original list plus sums.
            normalizedA = zipWith3 (\x y z -> x + y + z) a subtractionList carryList ++ (lastCarry > 0) ? ([lastCarry], [])
                

maxBlockValue :: Int
maxBlockValue = 1000

-- Having fun making a ternary operator.
-- Source for Original Idea: https://caffeinatedcode.wordpress.com/2008/04/11/haskell-the-ternary-operator/
(?) :: Bool -> (t, t) -> t
a ? (b, c) = if a then b else c

main::IO()
main = undefined