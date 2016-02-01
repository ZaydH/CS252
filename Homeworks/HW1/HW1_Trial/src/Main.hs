module Main where

bigEq :: [Int] -> [Int] -> Bool
bigEq a b
    | lenA /= lenB = False
    | False `elem` comparedList = False
    | otherwise = True
    where   lenA = length a
            lenB = length b
            comparedList = zipWith ((==)) a b 

bigAdd :: [Int] -> [Int] -> [Int]
bigAdd a b = bigAddSum
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (+) paddedA paddedB
            bigAddSum = normalizeList zippedList

bigSubtract :: [Int] -> [Int] -> [Int]
bigSubtract a b = bigSubtractDiff
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (-) paddedA paddedB
            bigSubtractDiff = normalizeList zippedList
            

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
    where   subtractionList = [ subtract | block <- a, let subtract = (-maxBlockValue) * div block maxBlockValue]
            -- Carry over as needed 
            carryList = 0 : [carry | block <- a, let carry = div block maxBlockValue]
            lastCarry = last carryList
            -- Combine original list plus sums.
            normalizedA = zipWith3 (\x y z -> x + y + z) a subtractionList carryList ++ (lastCarry > 0) ? ([lastCarry], [])



-- Used as a global to represent the maximum block size
maxBlockValue :: Int
maxBlockValue = 1000

-- Having fun making a ternary operator.
-- Source for Original Idea: https://caffeinatedcode.wordpress.com/2008/04/11/haskell-the-ternary-operator/
(?) :: Bool -> (t, t) -> t
a ? (b, c) = if a then b else c

main::IO()
main = undefined