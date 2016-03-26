
zayd_map :: (Int -> Int) -> [Int] -> [Int]
zayd_map _ [] = []
zayd_map f (x:xs) = ( f(x) ):( zayd_map(f)(xs) )

addOne :: Int -> Int
addOne x = x + 1

main :: IO ()
main = putStrLn $ show $ zayd_map(addOne)([1, 2, 3])


