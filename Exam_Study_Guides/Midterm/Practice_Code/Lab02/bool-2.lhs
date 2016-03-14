This File is _literate Haskell_.
That means that (in some sense) code and comments are reversed.
By default, everything that I type is actually a comment.

To write code, I preface it with a 'greater than' symbol.
Here we define the expressions in our Bool* language:

> data BoolExp = BTrue
>             | BFalse
>             | B0
>             | Bif BoolExp BoolExp BoolExp
>             | Bsucc BoolExp
>             | Bpred BoolExp
>   deriving Show

When an expression is evaluated, it returns a value.

> data BoolVal = BVTrue
>              | BVFalse
>              | IVal IntVal
>   deriving Show

> data IntVal = BV0
>             | BVSucc IntVal
>             deriving Show 

The evaluate function takes an expression and returns a value
The BTrue case has been done for you.
You must complete the other cases.

> evaluate :: BoolExp -> BoolVal
> evaluate BTrue = BVTrue
> evaluate BFalse = BVFalse
> evaluate (Bif cond bExpTrue bExpFalse) = case evaluate cond of
>                                               BVTrue -> evaluate bExpTrue
>                                               BVFalse -> evaluate bExpFalse
> evaluate B0 = IVal BV0
> evaluate (Bsucc e) = let (IVal v) = evaluate e in IVal $ BVSucc v
> evaluate (Bpred e) = case evaluate e of 
>                             (IVal BV0) -> (IVal BV0)
>                             (IVal (BVSucc v)) -> (IVal v)


And here we have a couple of programs to test.
prog1 should evaluate to BVTrue and prog2 should evaluate to BVFalse

> prog1 = Bif BTrue BTrue BFalse
> prog2 = Bif (Bif BTrue BFalse BTrue) BTrue (Bif BTrue BFalse BTrue)


The following lines evaluate the test Bool* expressions and display the results.
Note the type of main.  'IO ()' indicates that the function performs IO and returns nothing.
The word 'do' begins a block of code, were you can effectively do sequential statements.
(This is a crude generalization, but we'll talk more about what is going on in this function
when we deal with the great and terrible subject of _monads_.

> main :: IO ()
> main = do
>   putStrLn $ "Evaluating '" ++ (show prog1) ++ "' results in " ++ (show $ evaluate prog1)
>   putStrLn $ "Evaluating '" ++ (show prog2) ++ "' results in " ++ (show $ evaluate prog2)


Once you have the evaluate function working
you add in support the expressions 'succ e', 'pred e', and 'zero'.
With this change, it is possible for evaluate to get 'stuck',
e.g. pred true.
For a first pass, simply use the error function in these cases.



