#!/bin/sh
runhaskell test.hs > output
runhaskell Calculator.hs < input.txt >> output
dos2unix output
diff output output_EXPECTED.txt