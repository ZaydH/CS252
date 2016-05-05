#!/bin/bash

# Convert everything to Unix
dos2unix -r * &> /dev/null

# Expected output directory
EXPECTED_DIR='./expected'
dos2unix "${EXPECTED_DIR}/*" &> /dev/null

# Clean the output directory
OUT_DIR='./output'
rm -rf $OUT_DIR &> /dev/null
mkdir $OUT_DIR


# Test the twoif case
input_file="twoif.scm"
expected_byco="twoif.byco"
byco_output_file="${OUT_DIR}/twoif_zayd.byco"
vm_output_file="${OUT_DIR}/twoif_out.txt"
expected_output_file="${EXPECTED_DIR}/twozayd_expected.txt"

ruby compiler.rb $input_file $byco_output_file &> /dev/null
if [ ${#expected_byco} -ne 0 ]; then
	diff $expected_byco $byco_output_file
fi
ruby vm.rb $byco_output_file > $vm_output_file
diff $expected_output_file $vm_output_file
