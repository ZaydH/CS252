
test_math_operators :: Int -> Int
test_math_operators x = (x + (4 `div` 2) * 43 - 4) `mod` 20

main :: IO()
main = do
         putStrLn $ show $ test_math_operators (34)
         putStrLn $ show $ test_math_operators (23)
         putStrLn $ show $ test_math_operators (0)

