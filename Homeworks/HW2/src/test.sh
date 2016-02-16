#!/bin/sh
runhaskell test.hs > output
dos2unix output
diff output output_EXPECTED.txt