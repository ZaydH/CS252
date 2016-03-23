main :: IO ()
main = do 
     x <- getLine 
     putStrLn $ x
     if (length x == 0) 
     then 
          (return () )
     else
          ( ((main)) )

