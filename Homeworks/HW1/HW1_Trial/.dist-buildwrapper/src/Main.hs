module Main where

-- Checks for the equality of two big number lists.
bigEq :: [Int] -> [Int] -> Bool
bigEq a b
    | lenA /= lenB = False
    | False `elem` comparedList = False
    | otherwise = True
    where   lenA = length a
            lenB = length b
            comparedList = zipWith (==) a b 

-- Adds to big number lists and returns a big number list.
bigAdd :: [Int] -> [Int] -> [Int]
bigAdd a b = bigAddSum
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (+) paddedA paddedB
            bigAddSum = normalizeList zippedList

-- Subtracts to big number lists.
bigSubtract :: [Int] -> [Int] -> [Int]
bigSubtract a b = bigSubtractDiff
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (-) paddedA paddedB
            -- After normalizing the list, shave off any trailing zeros so list is minimum length.
            subtractDiff = (reverse . dropWhile (==0) . reverse . normalizeList) zippedList
            -- If the list is empty, append one 0. 
            bigSubtractDiff = subtractDiff ++ (null subtractDiff) ? ([], [0])
            
-- Compares whether one list is greater than the other
gt :: [Int] -> [Int] -> Bool
gt a b
    | null a && null b = False
    | null listCompare = False
    | head listCompare > 0 = True
    | otherwise = False
    where   (paddedA, paddedB) = padLists a b
            subtractedList = zipWith (-) a b
            listCompare = (reverse . dropWhile (==0) . reverse) subtractedList

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