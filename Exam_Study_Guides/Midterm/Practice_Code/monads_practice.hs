
type Bird = Int
type Pole = (Bird, Bird)

landLeft :: Int -> Pole -> Maybe Pole
landLeft b (left, right) = if (abs(left + b - right) >= 4) then Nothing else Just (left + b, right)

landRight :: Int -> Pole -> Maybe Pole
landRight b (left, right) = if (abs( left - (right + b)) >= 4) then Nothing else Just (left, right + b)

-- With Binds, you get a nothing here as expected.
routineBind = return (0, 0) >>= (landLeft 2) >>= (landRight 2) >>= (landRight 2) >>= (landRight 2)

-- Using do, you also get Nothing since <- is just syntactic sugar for >>=
routine = do
          first <- landLeft 2 (0,0)
          second <- landLeft 2 first
          third <- landLeft 2 second
          landLeft 2 third
