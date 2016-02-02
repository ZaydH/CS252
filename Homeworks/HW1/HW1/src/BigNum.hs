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
            bigSubtractDiff = normalizeList zippedList
            -- After normalizing the list, shave off any trailing zeros so list is minimum length.
            --subtractDiff = (reverse . dropWhile (==0) . reverse . normalizeList) zippedList
            -- If the list is empty, append one 0. 
            --bigSubtractDiff = subtractDiff ++ (null subtractDiff) ? ([], [0])


-- Checks whether two BigNum lists are equal to one another.
bigEq :: BigNum -> BigNum -> Bool
bigEq a b
    | lenA /= lenB = False
    | False `elem` comparedList = False
    | otherwise = True
    where   lenA = length a
            lenB = length b
            comparedList = zipWith (==) a b 

bigDec :: BigNum -> BigNum
bigDec x = bigSubtract x [1]

bigMultiply :: BigNum -> BigNum -> BigNum
bigMultiply a b 
    | null a || null b = error "Null lists cannot be passed to bigMultiply."
    -- Will deconstruct second argument recursively so select the shorter one for that
    | length a > length b = bigMultiply' a b 0
    | otherwise = bigMultiply' b a 0


bigMultiply' :: BigNum -> BigNum -> Int -> BigNum
-- a - BigNum List
-- b - Second BigNum List
-- d - recursion depth
bigMultiply' a b d
    -- Recursion Base case.
    | length b == 1 = multiplyResult
    | otherwise = bigAdd (bigMultiply' a [head b] d) (bigMultiply' a (tail b) (d+1))
    -- Pad the list with the recursion depth similar to shift in multiplication
    where   multiplyResult = stripLeadingZeroes $ replicate d 0 ++ listScalarMultiply a (head b) 0

listScalarMultiply :: BigNum -> Block -> Int -> BigNum
listScalarMultiply list scalar carry
    -- Handle case where no need to create an extra an extra block 
    | (length list) == 1 && (headCarryProduct < maxblock) = [headCarryProduct]
    -- Handle case where extra
    | length list == 1 = [headCarryRem, headCarryQuot]
    | otherwise = headCarryRem : (listScalarMultiply (tail list) scalar headCarryQuot)
    where   lenList = length list
            headCarryProduct = (head list + carry) * scalar
            headCarryQuot = quot headCarryProduct maxblock
            headCarryRem = rem headCarryProduct maxblock

bigPowerOf :: BigNum -> BigNum -> BigNum
-- basic format a ^ b
bigPowerOf a b
    -- Base Case #1 - Raise to the power 0 so always return 1
    | length b == 1 && (head b == 0) = [1]
    -- Base Case #2 - Raise to the power 1 so always return a
    | length b == 1 && (head b == 1) = a
    | otherwise = stripLeadingZeroes $ bigMultiply a (bigPowerOf a (bigDec b))

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
normalizeList a = normalizedA
            -- Used to make sure each element is between 0 and maxblock - 1
    where   subtractionList = [ subtract | block <- a, let subtract = (-maxblock) * div block maxblock]
            -- Carry over as needed 
            carryList = 0 : [carry | block <- a, let carry = div block maxblock]
            lastCarry = last carryList
            -- Combine original list plus sums.
            normalizedA = zipWith3 (\x y z -> x + y + z) a subtractionList carryList ++ (lastCarry > 0) ? ([lastCarry], []) 
