#!/bin/bash

# Define any global variables.
OUT_DIR="output"
HASKELL_CODE_DIR="test_cases"
HAMSKILL_STANDARD_ARGS_COUNT=4
HAMSKILL_PLUS_ARGS_COUNT=3
stdin_input_file="" # Default not used.
expected_output_file="" # This should only be used when the Scala output is known not to
                        # not match the Haskell.  It is cleared by the "hamskill_test" module.

# Keep information on the passing and failing tests
numb_tests=0
numb_passing_tests=0

# Due to git on a Windows systems, files may be changed from \n to \r\n so by default
# Convert the output directory to unix files.
function dos2unixOutputDirectory {
	pushd . &> /dev/null
	cd $OUT_DIR
	dos2unix * &> /dev/null
	popd &> /dev/null
}

# Prints the final results
function print_final_results {
	printf "\n\n\nFinal Results: ${numb_passing_tests} out of ${numb_tests} passed."
	printf "\n\n"
}


function perform_hamskillStd_and_hamskillPlus_test {

	base_filename="${1}"
	test_file="${base_filename}.hs"
	haskell_output="haskellOut_${base_filename}.txt"
	hamskill_output="hamskillStd_${base_filename}.txt"
	hamskill_function="main" #Only main currently supported.
	if [ "$#" -eq 2 ]; then
		expected_output_file="expected_${base_filename}.txt"
	fi
	hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

	#Test "filter_example.hs" using Hamskill+
	hamskill_output="hamskill+_${base_filename}.txt"
	if [ "$#" -eq 2 ]; then
		expected_output_file="expected_${base_filename}.txt"
	fi 
	hamskill_test $test_file $haskell_output $hamskill_output

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
	dos2unix $output_haskell_file &> /dev/null
	dos2unix $hamskill_output_file &> /dev/null
	
	if ! [ -z $expected_output_file ]; then
		known_good_file="$OUT_DIR/$expected_output_file"
		expected_output_file=""
	else
		known_good_file=$output_haskell_file
	fi
	if cmp -s $known_good_file $hamskill_output_file
	then
		printf "Passed: ${hamskill_type_name} for Haskell file: \"${input_haskell_file}\""
		let "numb_passing_tests+=1"
	else
		printf "ERROR: ${hamskill_type_name} output did not match for file \"${input_haskell_file}\""
	fi

}


# Clean up the directories
dos2unixOutputDirectory


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
haskell_output="haskellOut_main_print_string.txt"
hamskill_output="hamskill+_main_print_string.txt"
hamskill_test $test_file $haskell_output $hamskill_output



#Test "get_test.hs" using Hamskill+
#This takes standard input text so pass it to the function.
#Just using any function as the input.
test_file="get_text.hs"
haskell_output="haskellOut_get_text.txt"
hamskill_output="hamskill+_get_text.txt"
stdin_input_file="$HASKELL_CODE_DIR/test.txt"
hamskill_test $test_file $haskell_output $hamskill_output



#Test "factorial.hs" using Hamskill Standard
test_file="factorial.hs"
haskell_output="haskellOut_factorial.txt"
hamskill_output="hamskillStd_factorial.txt"
hamskill_function="main" # Only main is currently supported
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "factorial.hs" using Hamskill+
haskell_output="haskellOut_factorial.txt"
hamskill_output="hamskill+_factorial.txt"
hamskill_test $test_file $haskell_output $hamskill_output



# Test "add_list.hs" using Hamskill Standard
test_file="add_list.hs"
haskell_output="haskellOut_add_list.txt"
hamskill_output="hamskillStd_add_list.txt"
hamskill_function="main" #Only main currently supported.
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "add_list.hs" using Hamskill+
haskell_output="haskellOut_add_list.txt"
hamskill_output="hamskill+_add_list.txt"
hamskill_test $test_file $haskell_output $hamskill_output



# Test "map_example.hs" using Hamskill Standard
test_file="map_example.hs"
haskell_output="haskellOut_map_example.txt"
hamskill_output="hamskillStd_map_example.txt"
hamskill_function="main" #Only main currently supported.
expected_output_file="expected_map_example.txt"
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "map_example.hs" using Hamskill+
hamskill_output="hamskill+_map_example.txt"
expected_output_file="expected_map_example.txt"
hamskill_test $test_file $haskell_output $hamskill_output


# Test "filter_example.hs" using Hamskill Standard
base_filename="filter_example"
test_file="${base_filename}.hs"
haskell_output="haskellOut_${base_filename}.txt"
hamskill_output="hamskillStd_${base_filename}.txt"
hamskill_function="main" #Only main currently supported.
expected_output_file="expected_${base_filename}.txt"
hamskill_test $test_file $haskell_output $hamskill_output $hamskill_function

#Test "filter_example.hs" using Hamskill+
hamskill_output="hamskill+_${base_filename}.txt"
expected_output_file="expected_${base_filename}.txt"
hamskill_test $test_file $haskell_output $hamskill_output




# Perform the case test with strings.
base_filename="case_example"
perform_hamskillStd_and_hamskillPlus_test $base_filename


# Perform a test case with partially applied functions
base_filename="partially_applied_example"
perform_hamskillStd_and_hamskillPlus_test $base_filename

# Perform a test case with all integer math operations
base_filename="simple_math"
perform_hamskillStd_and_hamskillPlus_test $base_filename

# Perform a test case for the boolean operators
base_filename="compare_ops"
perform_hamskillStd_and_hamskillPlus_test $base_filename

# This should be the last line in the testbench.  It checks the final results
print_final_results
