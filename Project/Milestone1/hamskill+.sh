#!/bin/bash

# Define the Haskell File to be converted
haskell_file="haskell_code.hs"


echo "HamSkill+ requires an installed Scala build with class path"
echo
echo "Its primary benefit over standard Hamskill is that it can support a larger set of features."
echo
echo "Hamskill+ transpiles the Haskell code to Scala.  It then compiles and runs the compiled Scala code."
echo
echo "Haskell filename: ${haskell_file}"
echo "Haskell Output:"
runhaskell $haskell_file
echo 
echo "Actual Output: "
bash run_hamskill.sh $haskell_file
