import WhileInterp

test f = do
  putStrLn $ "***Testing " ++ f
  --showParsedExp f
  runFile f
  putStrLn ""

main :: IO ()
main = do
  --test "zayd.imp"
  test "abs.imp"
  test "extra.imp"
  test "fact.imp"
  test "times.imp"
  test "test.imp"
  test "error.imp"
  test "divide0.imp"
