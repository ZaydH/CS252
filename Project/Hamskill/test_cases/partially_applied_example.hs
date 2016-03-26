

zayd_foldr :: (Int -> Int -> Int) -> Int -> [Int] -> Int
zayd_foldr _ acc [] = acc
zayd_foldr f acc (x:xs) = f (x) (zayd_foldr (f) (acc) (xs))

add3 :: Int -> Int -> Int -> Int
add3 x y z = x + y + z

addTwoPlusOne = add3(1)


main :: IO ()
main = putStrLn $ show $ zayd_foldr (addTwoPlusOne) (0) ([1, 2, 3])

