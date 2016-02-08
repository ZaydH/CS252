-- A JSON library written in Haskell, adapted from an example
-- from "Real World Haskell".

-- Note that the module name must match the name of the file.
module JSON (
  JValue(..), --The (..) means that we are exporting the type and all of its constructors
  toString,
  isNull,
  jsonRightTriangles)
where

data JValue = JString String
            | JNumber Double
            | JBool Bool
            | JNull
            | JObject [(String, JValue)]
            | JArray [JValue]
  deriving (Eq, Ord, Show)


--The type annotation indicates that the function takes a
toString :: JValue      -> String
toString jVal = toString' jVal 0

toString' :: JValue  -> Int      -> String
toString' (JString s) _   = "\"" ++ s ++ "\""
toString' (JNumber n) _   = show n
toString' (JBool True) _  = "true"
toString' (JBool False) _ = "false"
toString' JNull _         = "null"
toString' (JArray lst) d   = generateTabLine (list2str lst (d+1)) d "[" "]"
-- Comment out the next line, recompile, and call toString with a JObject.  Note the error.
toString' (JObject o) d   = generateTabLine (object2str o (d+1)) d "{" "}"

tabStr :: Int -> String
tabStr d = replicate d '\t'

-- Printing JOject and JArray has a similar master format so these are 
-- combined into a single function.
generateTabLine :: String -> Int -> String -> String -> String 
generateTabLine strFunc d startBracket closeBracket = startBracket ++ "\n" 
                                                      ++ strFunc ++ "\n" 
                                                      ++ tabStr d ++ closeBracket

-- Prints the elements in a JObject element.
-- I modified the class prototype to accept an integer so I can offset tab.
-- If this is not ok, I will resubmit.
object2str :: [(String, JValue)] -> Int -> String
object2str [] _ = ""
object2str (x:[]) d = tabStr d ++ "\"" ++ fst x ++ "\": " ++ toString' (snd x) d
object2str (x:xs) d = (object2str [x] d) ++ ",\n" ++ (object2str xs d)

-- Prints the elements in a JArry element.
-- I modified the class prototype to accept an integer so I can offset tab.
-- If this is not ok, I will resubmit.
list2str :: [JValue] -> Int -> String
list2str [] _ = ""
list2str (x:[]) d = tabStr d ++ (toString' x d)
list2str (x:xs) d = list2str [x] d  ++ ",\n" ++ list2str xs d

isNull JNull  = True
-- The following 5 lines are replaced with the _ version
--isNull (JString s) = False
--isNull (JNumber n) = False
--isNull (JBool b)   = False
--isNull (JObject o) = False
--isNull (JArray a)  = False
isNull _      = False

jsonRightTriangles = JArray [ JObject [("a",JNumber a), ("b",JNumber b), ("c",JNumber c)] |
  a<-[1..10],
  b<-[1..10],
  c<-[1..10],
  a^2 + b^2 == c^2]


