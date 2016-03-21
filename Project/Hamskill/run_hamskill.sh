#!/bin/bash

# Verify the command line input quantities.OB
if [ "$#" == 0 ]; then
	echo"Zero input arguments provided.  A minimum of 1 and a maximum of 2 is required."
	exit -1OB
elif [ "$#" -gt 2 ]; then
	echo"Maximum number of HamSkill arguments is 2."  
	exit -1
fi

# Pass all input arguments to the JAR file
# -jar means use the class path in the JAR manifest
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

	scalaObject=$(echo $scalaSrcFile | rev | cut -d "." -f2 | rev)
	if [ ${#scalaObject} -eq 0 ]; then
		scalaObject=$scalaSrcFile
	fi

	scala -cp . $scalaObject
fi
