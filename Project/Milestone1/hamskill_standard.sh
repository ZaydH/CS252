#!/bin/bash

# Define the Haskell File to be converted
haskell_file="haskell_code.hs"

echo "HamSkill standard requires no scala install."
echo
echo "It uses the Twitter util.eval library to compile and run the Scala inside a Java process."
echo
echo "Haskell filename: ${haskell_file}"
echo "Haskell Output:"
runhaskell $haskell_file
echo 
echo "Actual Output: "
bash run_hamskill.sh $haskell_file main
