#!/bin/bash



function run_test_bench {
    if [ ${#scheme_source_code} -ne 0 ]; then
        ruby compiler.rb $scheme_source_code $byco_output_file &> /dev/null
    fi
    if [ ${#expected_byco} -ne 0 ]; then
        diff $expected_byco $byco_output_file
    fi
    ruby vm.rb $byco_output_file > $vm_output_file
    diff $expected_output_file $vm_output_file
}

# Convert everything to Unix
dos2unix -r * &> /dev/null

# Expected output directory
EXPECTED_DIR='./expected'
dos2unix "${EXPECTED_DIR}/*" &> /dev/null

# Clean the output directory
OUT_DIR='./output'
rm -rf $OUT_DIR &> /dev/null
mkdir $OUT_DIR


# Test the twoif testcase
scheme_source_code="twoif.scm"
expected_byco="twoif.byco"
byco_output_file="${OUT_DIR}/twoif_zayd.byco"
vm_output_file="${OUT_DIR}/twoif_out.txt"
expected_output_file="${EXPECTED_DIR}/twoif_expected.txt"
# Run the Test Bench
run_test_bench

# Test the single if testcase
scheme_source_code="if.scm"
expected_byco="if.byco"
byco_output_file="${OUT_DIR}/if_zayd.byco"
vm_output_file="${OUT_DIR}/if_out.txt"
expected_output_file="${EXPECTED_DIR}/if_expected.txt"
# Run the Test Bench
run_test_bench


# Test the jmp testcase with a comment.
scheme_source_code=""
expected_byco=""
byco_output_file="jmp.byco"
vm_output_file="${OUT_DIR}/jmp_out.txt"
expected_output_file="${EXPECTED_DIR}/jmp_expected.txt"
# Run the Test Bench
run_test_bench


# Test the "test" testcase with a comment.
scheme_source_code="test.scm"
expected_byco="test.byco"
byco_output_file="${OUT_DIR}/test.byco"
vm_output_file="${OUT_DIR}/test_out.txt"
expected_output_file="${EXPECTED_DIR}/test_expected.txt"
# Run the Test Bench
run_test_bench


# Test the "stor_load" testcase with a comment.
scheme_source_code=""
expected_byco=""
byco_output_file="stor_load.byco"
vm_output_file="${OUT_DIR}/stor_load_out.txt"
expected_output_file="${EXPECTED_DIR}/stor_load_expected.txt"
# Run the Test Bench
run_test_bench


# Test the "print" testcase with a comment.
scheme_source_code="print.scm"
expected_byco=""
byco_output_file="${OUT_DIR}/print_zayd.byco"
vm_output_file="${OUT_DIR}/print_out.txt"
expected_output_file="${EXPECTED_DIR}/print_expected.txt"
# Run the Test Bench
run_test_bench


# Test the "let" testcase with a comment.
scheme_source_code="let.scm"
expected_byco="let.byco"
byco_output_file="${OUT_DIR}/let_zayd.byco"
vm_output_file="${OUT_DIR}/let_out.txt"
expected_output_file="${EXPECTED_DIR}/let_expected.txt"
# Run the Test Bench
run_test_bench
