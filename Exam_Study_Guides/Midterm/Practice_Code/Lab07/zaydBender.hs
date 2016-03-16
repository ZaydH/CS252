import Data.Map as Map

x -: f = f x

type Pos = (Int, Int)

goalPos = Map.empty
          -: Map.insert (1, 3) "True"
          -: Map.insert (1, 1) "True"
          -: Map.insert (-1,-3) "True"

moveTo :: Pos -> Maybe Pos
moveTo p = if Map.member p goalPos
                 then Nothing
                 else Just p

moveUp (x, y) = moveTo (x, y+1)
moveDown (x, y) = moveTo (x, y-1)
moveRight (x, y) = moveTo (x+1, y)
moveLeft (x, y) = moveTo (x-1, y)

start = (0, 0)

originMove = Just start >>= moveUp >>= moveDown >>= moveLeft >>= moveRight
goalPos1Move = Just start >>= moveUp >>= moveUp >>= moveUp >>= moveRight >>= moveLeft