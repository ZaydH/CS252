
factorial :: Int -> Int
factorial n = if (n == 0)
              then (1)
              else ( n * (((factorial (n-1) ))) )

main :: IO ()
main = putStrLn $ show $ (((factorial 10)))

