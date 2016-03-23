#!/bin/bash

# Define any global variables.
OUT_DIR="output"
HASKELL_CODE_DIR="test_cases"
HAMSKILL_STANDARD_ARGS_COUNT=4
HAMSKILL_PLUS_ARGS_COUNT=3
stdin_input_file="" # Default not used.

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
	input_haskell_file="$HASKELL_CODE_DIR/${1}"
	#echo $input_haskell_file
	output_haskell_file="$OUT_DIR/${2}"
	hamskill_output_file="$OUT_DIR/${3}"
	#echo $hamskill_output_file

	# Run Haskell
	if [ -z $stdin_input_file ]; then
		runhaskell $input_haskell_file > $output_haskell_file
	else
		runhaskell $input_haskell_file < $stdin_input_file > $output_haskell_file
	fi
	
	# Run either Hamskill+ or Hamskill Standard
	if [ "$#" == $HAMSKILL_STANDARD_ARGS_COUNT ]; then
		hamskill_function_name="${4}"
		hamskill_type_name="Hamskill Standard"

		# As error checking, make sure Hamskill Standard is not passed a text file.
		if ! [ -z $stdin_input_file ]; then
			printf "\n\nError: Cannot pass a text file input to HamSkill standard."
			return -1
		fi

		#echo $input_haskell_file
		#echo $hamskill_function_name
		bash run_hamskill.sh $input_haskell_file $hamskill_function_name > $hamskill_output_file
	else
		hamskill_type_name="Hamskill+"
		if [ -z $stdin_input_file ]; then
			bash run_hamskill.sh $input_haskell_file > $hamskill_output_file
		else
			bash run_hamskill.sh $input_haskell_file < $stdin_input_file > $hamskill_output_file
		fi
		stdin_input_file="" # Clear the stdin_input_file

		# Delete the scala code
		cd $HASKELL_CODE_DIR
		rm *.scala
		cd ..
	fi

	# Check whether the test passed.
	if cmp -s $output_haskell_file $hamskill_output_file
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
test_file="simple_function_call.hs"
haskell_output="haskellOut_haskell_code.txt"
hamskill_output="hamskillStd_haskell_code.txt"
hamskill_function="main" #Only main currently supported.
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "haskell_code" using Hamskill+
test_file="simple_function_call.hs"
haskell_output="haskellOut_haskell_code.txt"
hamskill_output="hamskill+_haskell_code.txt"
hamskill_test $test_file $haskell_output $hamskill_output


# Test "main_print_string" using Hamskill Standard
test_file="main_print_string.hs"
haskell_output="haskellOut_main_print_string.txt"
hamskill_output="hamskillStd_main_print_string.txt"
hamskill_function="main" #Only main currently supported.
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "main_print_string" using Hamskill+
test_file="main_print_string.hs"
haskell_output="haskellOut_main_print_string.txt"
hamskill_output="hamskill+_main_print_string.txt"
hamskill_test $test_file $haskell_output $hamskill_output

#Test "get_test.hs" using Hamskill+
#This takes standard input text so pass it to the function.
#Just using any function as the input.
test_file="get_text.hs"
haskell_output="haskellOut_get_text.txt"
hamskill_output="hamskill+_get_text.txt"
stdin_input_file="test.txt"
hamskill_test $test_file $haskell_output $hamskill_output


# This should be the last line in the testbench.  It checks the final results
print_final_results
