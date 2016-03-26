
maybeAddOne :: Int -> (Maybe Int)
maybeAddOne x = if (x < 0)
                then (Nothing)
                else (Just (x + 1))

doubleIncrementMonad :: Int -> (Maybe Int)
doubleIncrementMonad x = (Just x) >>= maybeAddOne >>= maybeAddOne

main :: IO ()
main = do
       putStrLn $ show $ doubleIncrementMonad(3)
       putStrLn $ show $ doubleIncrementMonad(-1)


