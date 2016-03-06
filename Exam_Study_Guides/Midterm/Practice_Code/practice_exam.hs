
myadd :: Int -> Int -> Maybe Int
myadd x y = Just (x + y)

mysub :: Int -> Int -> Maybe Int
mysub x y = Just (y - x)

mymul :: Int -> Int -> Maybe Int
mymul x y = Just (x * y)

mydiv :: Int -> Int -> Maybe Int
mydiv 0 _ = Nothing
mydiv x y = Just (y `div` x)

testMyMath1 = (return 10) >>= (mydiv 5) >>= (myadd 4) >>= (mysub 2)

testMyMathErr = (return 10) >>= (mydiv 5) >>= (myadd 4) >>= (mysub 2) >>= (mydiv 0) >>= (mymul 10)

foo :: Int -> Maybe Int
foo x = do
        y <- mydiv 60 x
        z <- myadd 9 3
        mymul y z

greaterThan8Bind :: Maybe Bool
greaterThan8Bind = (Just 9) >>= (\x -> Just(x > 8))

greaterThan8Do :: Maybe Bool
greaterThan8Do = do
                 x <- (Just 9) 
                 Just (x > 8)