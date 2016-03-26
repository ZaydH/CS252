

notEqual :: Int -> Int -> String
notEqual x y = if (x /= y)
               then ("not equal")
               else ("equal")

equal :: Int -> Int -> String
equal x y = if (x == y) 
            then ("equal")
            else ("not_equal")

greater :: Int -> Int -> String
greater x y = if (x > y) 
              then ("greater")
              else ("less than or equal")

lessThan :: Int -> Int -> String
lessThan x y = if (x < y) 
               then ("less than")
               else ("greater than or equal")

greaterThanEqual :: Int -> Int -> String
greaterThanEqual x y = if (x >= y)
                       then ("Greater than or equal")
                       else ("Less than")

lessThanEqual :: Int -> Int -> String
lessThanEqual x y = if (x <= y) 
                    then ("Less THAN or equal")
                    else ("greater than")

main :: IO ()
main = do 
       putStrLn $ notEqual (5)(4)
       putStrLn $ notEqual (3)(3)
       putStrLn $ equal (5)(4)
       putStrLn $ equal (4)(4)
       putStrLn $ greater (4)(3)
       putStrLn $ greater (3)(3)
       putStrLn $ greater (3)(4)
       putStrLn $ lessThan (4)(3)
       putStrLn $ lessThan (3)(3)
       putStrLn $ lessThan (10)(20)
       putStrLn $ greaterThanEqual (-3)(-3)
       putStrLn $ greaterThanEqual (-3)(-4)
       putStrLn $ greaterThanEqual (-30)(-2)
       putStrLn $ lessThanEqual (-3)(-3)
       putStrLn $ lessThanEqual (-3)(-4)
       putStrLn $ lessThanEqual (-30)(-2)       


