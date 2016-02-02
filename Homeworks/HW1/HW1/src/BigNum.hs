{-
  Name: Zayd Hammoudeh
  Class: CS 252
  Assigment: HW1
  Date: February 15, 2016
  Description: <Describe the program and what it does>
-}

module BigNum (
  BigNum,
  bigAdd,
  bigSubtract,
  bigMultiply,
  bigEq,
  bigDec,
  bigPowerOf,
  prettyPrint,
  stringToBigNum,
  padLists,
) where

type Block = Int -- An Int from 0-999

type BigNum = [Block]

maxblock = 1000

bigAdd :: BigNum -> BigNum -> BigNum
bigAdd x y = bigAdd' x y 0

bigAdd' :: BigNum -> BigNum -> Block -> BigNum
bigAdd' a b c = bigAddSum
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (+) paddedA paddedB
            bigAddSum = normalizeList zippedList

bigSubtract :: BigNum -> BigNum -> BigNum
bigSubtract x y =
  if length x < length y
    then error "Negative numbers not supported"
    else reverse $ stripLeadingZeroes $ reverse result
      where result = bigSubtract' x y 0

stripLeadingZeroes :: BigNum -> BigNum
stripLeadingZeroes (0:[]) = [0]
stripLeadingZeroes (0:xs) = stripLeadingZeroes xs
stripLeadingZeroes xs = xs

-- Negative numbers are not supported, so you may throw an error in these cases
bigSubtract' :: BigNum -> BigNum -> Block -> BigNum
bigSubtract' a b c = bigSubtractDiff
    where   (paddedA, paddedB) = padLists a b -- Pad the two arrays so they are the same length
            -- Zip the two lists
            zippedList = zipWith (-) paddedA paddedB
            -- After normalizing the list, shave off any trailing zeros so list is minimum length.
            subtractDiff = (reverse . dropWhile (==0) . reverse . normalizeList) zippedList
            -- If the list is empty, append one 0. 
            bigSubtractDiff = subtractDiff ++ (null subtractDiff) ? ([], [0])

bigEq :: BigNum -> BigNum -> Bool
bigEq _ _ = error "Your code here"

bigDec :: BigNum -> BigNum
bigDec x = bigSubtract x [1]

bigMultiply :: BigNum -> BigNum -> BigNum
bigMultiply _ _ = error "Your code here"

bigPowerOf :: BigNum -> BigNum -> BigNum
bigPowerOf _ _ = error "Your code here"

prettyPrint :: BigNum -> String
prettyPrint [] = ""
prettyPrint xs = show first ++ prettyPrint' rest
  where (first:rest) = reverse xs

prettyPrint' :: BigNum -> String
prettyPrint' [] = ""
prettyPrint' (x:xs) = prettyPrintBlock x ++ prettyPrint' xs

prettyPrintBlock :: Int -> String
prettyPrintBlock x | x < 10     = ",00" ++ show x
                   | x < 100    = ",0" ++ show x
                   | otherwise  = "," ++ show x

stringToBigNum :: String -> BigNum
stringToBigNum "0" = [0]
stringToBigNum s = stringToBigNum' $ reverse s

stringToBigNum' :: String -> BigNum
stringToBigNum' [] = []
stringToBigNum' s | length s <= 3 = read (reverse s) : []
stringToBigNum' (a:b:c:rest) = block : stringToBigNum' rest
  where block = read $ c:b:a:[]


-- Given two lists of Blocks (in essentially Little Endian format),
-- pad the shorter list with 0 value blocks and return two new lists. 
padLists :: [Block] -> [Block] -> ([Block], [Block])
padLists a b = (paddedA, paddedB)
    where   lenA = length a
            lenB = length b
            maxLen = max lenA lenB
            paddedA = a ++ replicate (max (maxLen - lenA) 0) 0
            paddedB = b ++ replicate (max (maxLen - lenB) 0) 0

-- Having fun making a ternary operator.
-- Source for Original Idea: https://caffeinatedcode.wordpress.com/2008/04/11/haskell-the-ternary-operator/
(?) :: Bool -> (t, t) -> t
a ? (b, c) = if a then b else c


-- Perform any necessary carries and ensure each block is between 0 and maxblock - 1
normalizeList :: [Int] -> [Int]
normalizeList a = normalizedA
            -- Used to make sure each element is between 0 and maxblock - 1
    where   subtractionList = [ subtract | block <- a, let subtract = (-maxblock) * div block maxblock]
            -- Carry over as needed 
            carryList = 0 : [carry | block <- a, let carry = div block maxblock]
            lastCarry = last carryList
            -- Combine original list plus sums.
            normalizedA = zipWith3 (\x y z -> x + y + z) a subtractionList carryList ++ (lastCarry > 0) ? ([lastCarry], []) 
