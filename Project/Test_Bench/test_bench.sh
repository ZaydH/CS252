#!/bin/bash

# Define any global variables.
OUT_DIR="output"
HASKELL_CODE_DIR="test_cases"
HAMSKILL_STANDARD_ARGS_COUNT=4
HAMSKILL_PLUS_ARGS_COUNT=3

# Keep information on the passing and failing tests
numb_tests=0
numb_passing_tests=0

# Prints the final results
function print_final_results {
	printf "\n\n\nFinal Results: ${numb_passing_tests} out of ${numb_tests} passed."
	printf "\n\n"
}


# This function is used to test scripts using the HamSkill Application. #
function hamskill_test {
	
	# Increment the number of tests
	let "numb_tests+=1"

	# Put blank lines between tests
	printf "\n\n"

	# Check the number of inputs
	if [ "$#" != $HAMSKILL_STANDARD_ARGS_COUNT ] && [ "$#" != $HAMSKILL_PLUS_ARGS_COUNT ]; then
		printf "Invalid number of input arguments to the Hamskill tester."
		return -1
	fi
	# Extract the inputs
	input_haskell_file="${1}"
	#echo $input_haskell_file
	output_haskell_file="${2}"
	hamskill_output_file="${3}"

	# Run Haskell
	runhaskell $input_haskell_file > "$OUT_DIR/$output_haskell_file"
	
	# Run either Hamskill+ or Hamskill Standard
	if [ "$#" == $HAMSKILL_STANDARD_ARGS_COUNT ]; then
		hamskill_function_name="${4}"
		hamskill_type_name="Hamskill Standard"

		bash run_hamskill.sh $input_haskell_file main > "$OUT_DIR/$hamskill_output_file"
	else
		hamskill_type_name="Hamskill+"
		bash run_hamskill.sh $input_haskell_file main > "$OUT_DIR/$hamskill_output_file"
	fi

	# Check whether the test passed.
	if cmp -s "$OUT_DIR/$output_haskell_file" "$OUT_DIR/$hamskill_output_file"
	then
		printf "Passed: ${hamskill_type_name} for Haskell file: \"${input_haskell_file}\""
		let "numb_passing_tests+=1"
	else
		printf "ERROR: ${hamskill_type_name} output did not match for file \"${input_haskell_file}\""
	fi

}


# Clean up the directories
rm -rf $OUT_DIR &> /dev/null
mkdir $OUT_DIR


# Test "haskell_code" using Hamskill Standard
test_file="haskell_code.hs"
haskell_output="haskellOut_haskell_code.txt"
hamskill_output="hamskillStd_haskell_code.txt"
hamskill_function="main" #Only main currently supported.
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "haskell_code" using Hamskill+
test_file="haskell_code.hs"
haskell_output="haskellOut_haskell_code.txt"
hamskill_output="hamskillStd_haskell_code.txt"
hamskill_test $test_file $haskell_output $hamskill_output

# This should be the last line in the testbench.  It checks the final results
print_final_results
