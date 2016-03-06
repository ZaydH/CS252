> import Data.List

Experiment with foldl, foldr, and foldl'

First, implement your own version of the foldl function,
defined as myFoldl

> myFoldl :: (a -> b -> a) -> a -> [b] -> a
> myFoldl _ acc [] = acc
> myFoldl f acc (x:xs) = myFoldl f (f acc x) xs


Next, define a function to reverse a list using foldl.

> myReverse :: [a] -> [a]
> myReverse x = foldl (\acc x -> x:acc) [] x


Now define your own version of foldr, named myFoldr

> myFoldr :: (a -> b -> b) -> b -> [a] -> b
> myFoldr _ acc [] = acc 
> myFoldr f acc (x:xs) = f x acc'
>                        where
>                           acc' = myFoldr f acc xs


Now try using foldl (the library version, not yours) to sum up the numbers of a large list.
Why is it so slow?

Unless absolutely necessary, foldl creates thunks.  It does not do eager execution.  
Creating and storing all of those thunks adds overhead, which slows down overall
execution time.

Instead of foldl, try using foldl'.
Why is it faster?
(Read http://www.haskell.org/haskellwiki/Foldr_Foldl_Foldl%27 for some hints)

foldl' calculates the results eagerly.  That eliminates the need to create and store
thunks (unlike foldl).  This greatly improves efficiency.

For an extra challenge, try to implement foldl in terms of foldr.
See http://www.haskell.org/haskellwiki/Foldl_as_foldr for details.

> myFoldl' f acc x = foldr (flip f) acc (reverse x)

Next, using the map function, convert every item in a list to its absolute value

> listAbs :: [Integer] -> [Integer]
> listAbs x = map (abs) x

Finally, write a function that takes a list of Integers and returns the sum of
their absolute values.

> sumAbs :: [Integer] -> Integer
> sumAbs [] = 0
> sumAbs (x:xs) = abs (x) + sumAbs xs

Below is the above code written in tail recursive form.

> sumAbs' :: Integer -> [Integer] -> Integer
> sumAbs' acc [] = acc
> sumAbs' acc (x:xs) = sumAbs' (acc + abs x) xs