{-
  Name: Zayd Hammoudeh
  Class: CS 252
  Assigment: HW1
  Date: February 15, 2016
  Description: Used to simulate large positive integer arithmetic in Haskell.
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
  if (length x < length y || y `gt` x)
    then error "Negative numbers not supported"
    else reverse $ stripLeadingZeroes $ reverse result
      where result = bigSubtract' x y 0

stripLeadingZeroes :: BigNum -> BigNum
stripLeadingZeroes (0:[]) = [0]
stripLeadingZeroes (0:xs) = stripLeadingZeroes xs
stripLeadingZeroes xs = xs

-- Negative numbers are not supported, so you may throw an error in these cases
bigSubtract' :: BigNum -> BigNum -> Block -> BigNum
bigSubtract' a b c
    | null a = []
    | null b && head a + c >= 0 = (head a + c) : tail a
    | null b = (head a + c + maxblock) : bigSubtract' (tail a) b (-1)
    | (head a + c) >= (head b) = (head a + c - head b) : bigSubtract' (tail a) (tail b) 0 
    | otherwise = (head a + c + maxblock - head b) : bigSubtract' (tail a) (tail b) (-1) 


-- Compares whether one list is greater than the other
gt :: [Block] -> [Block] -> Bool
gt a b
    | null a && null b = False
    | null listCompare = False
    | head listCompare > 0 = True
    | otherwise = False
    where   (paddedA, paddedB) = padLists a b
            subtractedList = zipWith (-) paddedA paddedB
            listCompare = dropWhile (==0) $ reverse subtractedList


-- Checks whether two BigNum lists are equal to one another.
bigEq :: BigNum -> BigNum -> Bool
bigEq a b
    | lenA /= lenB = False
    | False `elem` comparedList = False
    | otherwise = True
    where   lenA = length a
            lenB = length b
            comparedList = zipWith (==) a b 

-- Decrements a big number by 1
bigDec :: BigNum -> BigNum
bigDec x = bigSubtract x [1]

-- Multiplies two big numbers and returns the product
bigMultiply :: BigNum -> BigNum -> BigNum
bigMultiply a b 
    | null a || null b = error "Null lists cannot be passed to bigMultiply."
    -- Will deconstruct second argument recursively so select the shorter one for that
    | length a > length b = reverse $ stripLeadingZeroes $ reverse $ bigMultiply' a b 0
    | otherwise = reverse $ stripLeadingZeroes $ reverse $ bigMultiply' b a 0

-- Recursive multiplication to multiply big number
-- by each of the of the blocks.
bigMultiply' :: BigNum -> BigNum -> Int -> BigNum
-- a - BigNum List
-- b - Second BigNum List
-- d - recursion depth
bigMultiply' a b d
    -- Recursion Base case.
    | length b == 1 = multiplyResult
    | otherwise = bigAdd (bigMultiply' a [head b] d) (bigMultiply' a (tail b) (d+1))
    -- Pad the list with the recursion depth similar to shift in multiplication
    where   multiplyResult = replicate d 0 ++ listScalarMultiply a (head b) 0

-- Multiplies a list by one a block.
listScalarMultiply :: BigNum -> Block -> Int -> BigNum
listScalarMultiply list scalar carry
    -- Handle case where no need to create an extra an extra block 
    | length list == 1 && (headCarryProduct < maxblock) = [headCarryProduct]
    -- Handle case where extra
    | length list == 1 = [headCarryRem, headCarryQuot]
    | otherwise = headCarryRem : (listScalarMultiply (tail list) scalar headCarryQuot)
    where   headCarryProduct = (head list * scalar) + carry
            headCarryQuot = quot headCarryProduct maxblock
            headCarryRem = rem headCarryProduct maxblock

bigPowerOf :: BigNum -> BigNum -> BigNum
-- basic format a ^ b
bigPowerOf a b
    -- Base Case #1 - Raise to the power 0 so always return 1
    | length b == 1 && (head b == 0) = [1]
    | otherwise = reverse $ stripLeadingZeroes $ reverse $ bigMultiply a (bigPowerOf a (bigDec b))

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
normalizeList :: [Block] -> [Block]
normalizeList a = normalizeList' a 0
normalizeList' :: [Block] -> Int -> [Block]
normalizeList' a carry 
    | null a && carry == 0 = []
    | null a && carry > 0 = [ carry]
    | otherwise = headCarryRem : normalizeList' (tail a) headCarryQuot
    where   headCarrySum = head a + carry 
            headCarryRem = headCarrySum `rem` maxblock
            headCarryQuot = headCarrySum `quot` maxblock