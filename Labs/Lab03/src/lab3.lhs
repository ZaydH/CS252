
Declare imports

> import Data.List

Experiment with foldl, foldr, and foldl'

First, implement your own version of the foldl function,
defined as myFoldl

> myFoldl :: (a -> b -> a) -> a -> [b] -> a
> myFoldl _ acc [] = acc
> myFoldl f acc (x:xs) = myFoldl f (f acc x) xs 


Next, define a function to reverse a list using foldl.

> myReverse :: [a] -> [a]
> myReverse = foldl(\acc x -> x : acc) []

> myFoldlMyReverse :: [a] -> [a]
> myFoldlMyReverse = myFoldl(\acc x -> x : acc) []

Now define your own version of foldr, named myFoldr

> myFoldr :: (a -> b -> b) -> b -> [a] -> b
> myFoldr _ acc [] = acc
> myFoldr f acc (x:xs) = f x newAcc
>   where
>       newAcc = myFoldr f acc xs


Now try using foldl (the library version, not yours) to sum up the numbers of a large list.
Why is it so slow?

foldl is lazy so it delays executing the sums until all elements in the list have been evaluated.  In the example below:

*Main> foldl (+) 0 [1..10000000]

foldl waits for all 10,000,000 (10 million sums) to be queued then sums them all at the end.  By queueing the sum, you
place a much greater burden on the memory causing more memory IO.  As is well known, memory IO is far slower (especially
if the data must be cached to disk) that CPU operations.  

Instead of foldl, try using foldl'.
Why is it faster?
(Read http://www.haskell.org/haskellwiki/Foldr_Foldl_Foldl%27 for some hints)

foldl' is eager.  Hence, it does not wait for 10,000,000 (10 million) list elements to be queued before summing them.
Rather, when a sum can be made, it sums the terms.  This substantially reduces the memory footprint (and in turn IO)
because it only needs to preserve the accumulator as opposed to all previous calculations.


For an extra challenge, try to implement foldl in terms of foldr.
See http://www.haskell.org/haskellwiki/Foldl_as_foldr for details.

> foldlViaFoldr :: (b -> a -> b) -> b -> [a] -> b
> foldlViaFoldr f acc x = foldr( flip (f) ) acc (reverse x) 

> myFoldlFoldrMyReverse :: [a] -> [a]
> myFoldlFoldrMyReverse = foldlViaFoldr(\acc x -> x : acc) []

------------------------------- Testing My Functions Below --------------------------------

*Main> let x = [1..10]
*Main> myReverse x
[10,9,8,7,6,5,4,3,2,1]
*Main> myFoldlMyReverse x
[10,9,8,7,6,5,4,3,2,1]
*Main> myFoldlFoldrMyReverse x
[10,9,8,7,6,5,4,3,2,1]



Next, using the map function, convert every item in a list to its absolute value

> listAbs :: [Integer] -> [Integer]
> listAbs = map abs 

Finally, write a function that takes a list of Integers and returns the sum of
their absolute values.

> sumAbs :: [Integer] -> Integer
> sumAbs = foldr (\x acc -> acc + abs x) 0

