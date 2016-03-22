#!\bin\bash
runhaskell test.hs &> output
dos2unix output
dos2unix output_expected.txt
diff output output_expected.txt
