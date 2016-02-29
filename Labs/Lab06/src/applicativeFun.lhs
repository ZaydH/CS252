> import Control.Applicative

In this lab, we'll look at applicative functors.
Note the import statement at the top of this file.

For this example, we'll use the Tree type from our previous labs.

> data Tree a = Node (Tree a) (Tree a) a
>             | Empty
>   deriving (Show, Eq)

Since value constructors are just functions, we can partially
apply them if we like.  In this case, we do it to create a
leaf function, and avoid typing 'Empty' needlessly.

> leaf = Node Empty Empty

Now, as a review from the previous lab, implement
the fmap functionality for our Tree type.

> instance Functor Tree where
>     fmap f Empty = Empty
>     fmap f (Node left right v) = Node (fmap f left) (fmap f right) (f v)

Call test1 to try out your function:

> test1 = fmap (+1) $ Node (leaf 3) (leaf 7) 5

Next, add support for applicative functors for our Tree type.
We should be able to apply a tree of (+i), where i could be
different for every node, to another Tree of the same shape
and get back a tree with the result.

> instance Applicative Tree where
>   pure = leaf
>   Empty <*> _ = Empty
>   _ <*> Empty = Empty
>   (Node left right f) <*> (Node left' right' v) = Node (left <*> left') (right <*> right') (f v)


Here are a few functions to test out your changes:

> testapp1 = (Node (leaf (+1)) (leaf (+2)) (+7)) <*> (Node (leaf 1) (leaf 8) 3)

> listNums = Node (Node (leaf (1)) (leaf (2)) (7)) (Node (leaf 1) (leaf 8) 3) 42
> testapp2 = (*) <$> listNums <*> listNums

Experiment with this syntax with a few of your own examples.

> testapp3 = (++) <$> ((:[]) <$> listNums) <*> ((:[]) <$> listNums)
Node (Node (Node Empty Empty [1,1]) (Node Empty Empty [2,2]) [7,7]) (Node (Node Empty Empty [1,1]) (Node Empty Empty [8,8]) [3,3]) [42,42]



As a preview of upcoming material, examine the following function:

> foo box = do
>   v <- box
>   return (v+1)

Apply the function foo to (Just 3).  What is the result?  What if you apply it to [6]?
Or [1,2,3]?

Summary of the results
foo (Just 3) = (Just 4)
foo ([6]) = [7]
foo [1,2,3] = [2,3,4]


It is essentially unbox each item (if there are multiple) and then rebuilding them back together.

Some more test functions I tried.

> foo' box = do
>   v <- box
>   return ([v]++"f")

> foo'' box = do
>   v <- box
>   return (show v)
