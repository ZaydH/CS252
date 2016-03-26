
zayd_filter :: (Int -> Bool) -> [Int] -> [Int]
zayd_filter _ [] = []
zayd_filter f (x:xs) = if ( (((f x))) )
                       then ( (x):( zayd_filter(f) (xs)  ))
                       else ( zayd_filter(f)(xs) )

main :: IO ()
main = putStrLn $ show $ ( zayd_filter ( (\xINT -> xINT > 30) ) ([1, 459, 43, (-30), 34]) )

