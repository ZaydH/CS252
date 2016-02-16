import WhileInterp

-- Here are a few tests that you can use to check your implementation.
w_test = (Sequence (Assign "X" (Op Plus (Op Minus (Op Plus (Val (IntVal 1)) (Val (IntVal 2))) (Val (IntVal 3))) (Op Plus (Val (IntVal 1)) (Val (IntVal 3))))) (Sequence (Assign "Y" (Val (IntVal 0))) (While (Op Gt (Var "X") (Val (IntVal 0))) (Sequence (Assign "Y" (Op Plus (Var "Y") (Var "X"))) (Assign "X" (Op Minus (Var "X") (Val (IntVal 1))))))))

w_fact = (Sequence (Assign "N" (Val (IntVal 2))) (Sequence (Assign "F" (Val (IntVal 1))) (While (Op Gt (Var "N") (Val (IntVal 0))) (Sequence (Assign "X" (Var "N")) (Sequence (Assign "Z" (Var "F")) (Sequence (While (Op Gt (Var "X") (Val (IntVal 1))) (Sequence (Assign "F" (Op Plus (Var "Z") (Var "F"))) (Assign "X" (Op Minus (Var "X") (Val (IntVal 1)))))) (Assign "N" (Op Minus (Var "N") (Val (IntVal 1))))))))))

testUnit :: IO ()
testUnit = do
  -- Should be: (IntVal 1,fromList [])
  putStrLn $ show $ WhileInterp.run (Val (IntVal 1))
  -- Should be: (BoolVal True,fromList [("X",BoolVal True)])
  putStrLn $ show $ WhileInterp.run (Assign "X" (Val (BoolVal True)))
  -- Should be: (IntVal 2,fromList [])
  putStrLn $ show $ WhileInterp.run (Sequence (Val (IntVal 1)) (Val (IntVal 2)))
  -- Should be: (IntVal 11,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Plus (Val (IntVal 9)) (Val (IntVal 2)))
  -- Should be: (IntVal 1,fromList [])
  putStrLn $ show $ WhileInterp.run (If (Val (BoolVal True)) (Val (IntVal 1)) (Val (IntVal 2)))
  -- Should be: (IntVal 2,fromList [])
  putStrLn $ show $ WhileInterp.run (If (Val (BoolVal False)) (Val (IntVal 1)) (Val (IntVal 2)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (While (Val (BoolVal False)) (Val (IntVal 42)))
  -- Should be: (IntVal 666,fromList [("X",IntVal 666)])
  putStrLn $ show $ WhileInterp.run (Sequence
                                        (Assign "X" (Val (IntVal 666)))
                                        (Var "X"))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Not (Val (BoolVal True)))
    -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Not (Val (BoolVal False)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (And (Val (BoolVal False)) (Val (BoolVal False)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (And (Val (BoolVal False)) (Val (BoolVal True)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (And (Val (BoolVal True)) (Val (BoolVal False)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (And (Val (BoolVal True)) (Val (BoolVal True)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Or (Val (BoolVal False)) (Val (BoolVal False)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Or (Val (BoolVal False)) (Val (BoolVal True)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Or (Val (BoolVal True)) (Val (BoolVal False)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Or (Val (BoolVal True)) (Val (BoolVal True)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Gt (Val (IntVal 9)) (Val (IntVal 2)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Gt (Val (IntVal 9)) (Val (IntVal 9)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Gt (Val (IntVal 9)) (Val (IntVal 11)))
  -- Should be: (IntVal 2,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Divide (Val (IntVal 9)) (Val (IntVal 4)))
    -- Should be: (IntVal 27,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Times (Val (IntVal 9)) (Val (IntVal 3)))
    -- Should be: (IntVal 7,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Minus (Val (IntVal 9)) (Val (IntVal 2)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Ge (Val (IntVal 9)) (Val (IntVal 2)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Ge (Val (IntVal 9)) (Val (IntVal 9)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Ge (Val (IntVal 9)) (Val (IntVal 11)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Lt (Val (IntVal 9)) (Val (IntVal 2)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Lt (Val (IntVal 9)) (Val (IntVal 9)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Lt (Val (IntVal 9)) (Val (IntVal 11)))
  -- Should be: (BoolVal False,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Le (Val (IntVal 9)) (Val (IntVal 2)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Le (Val (IntVal 9)) (Val (IntVal 9)))
  -- Should be: (BoolVal True,fromList [])
  putStrLn $ show $ WhileInterp.run (Op Le (Val (IntVal 9)) (Val (IntVal 11)))

  putStrLn ""

main :: IO ()
main = do
  testUnit
  -- Should be: fromList [("X",IntVal 0),("Y",IntVal 10)]
  putStrLn $ show $ WhileInterp.testProgram w_test
  -- Should be: fromList [("F",IntVal 2),("N",IntVal 0),("X",IntVal 1),("Z",IntVal 2)]
  putStrLn $ show $ WhileInterp.testProgram w_fact

