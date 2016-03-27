#!/bin/bash

# Verify the command line input quantities.OB
if [ "$#" == 0 ]; then
	printf "Zero input arguments provided.  A minimum of 1 and a maximum of 2 is required."
	exit -1
elif [ "$#" -gt 2 ]; then
	printf "Maximum number of HamSkill arguments is 2."  
	exit -1
fi

# Pass all input arguments to the JAR file
# -jar means use the class path in the JAR manifest
#echo $1
java -jar hamskill.jar "$@"

# Run the code in scala for HamSkill+
if [ "$#" -eq 1 ]; then
	haskellSrcFile=$1

	# Get the file name and path
	scalaFilenameAndPath=$(echo $haskellSrcFile | rev | cut -d "." -f2 | rev)
	scalaFileExtension=".scala"

	# Concatenate the file extension onto the scala filename
	scalaSrcFile="${scalaFilenameAndPath}${scalaFileExtension}"
	#echo $scalaSrcFile

	# Compile the scala code	
	scalac $scalaSrcFile

	# Cleanup the scala file name by remove the file extension
	scalaObject=$(echo $scalaSrcFile | rev | cut -d "." -f2 | rev)
	if [ ${#scalaObject} -eq 0 ]; then
		scalaObject=$scalaSrcFile
	fi
	# Remove the file path
	scalaObject=$(echo $scalaObject | cut -d "/" -f2 )
        if [ ${#scalaObject} -eq 0 ]; then
		scalaObject=$scalaSrcFile
        fi

	#echo "${scalaObject}"
	scala -cp . $scalaObject | java -cp hamskill.jar hamskill.ScalaOutput
	#java cfe hamskill.jar hamskill.ScalaOutput hamskill/ScalaOutput.class < scala -cp . $scalaObject

	rm *.class
fi
