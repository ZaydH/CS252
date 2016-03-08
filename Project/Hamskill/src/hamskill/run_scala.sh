#!/bin/bash

scalaSrcFile=$1
echo "Compiling the Scala file: $scalaSrcFile" 
scalac $scalaSrcFile
echo "Compile stage completed."

scalaObject=$(echo $scalaSrcFile | rev | cut -d "." -f2 | rev)
if [ ${#scalaObject} -eq 0 ]; then
	scalaObject=$scalaSrcFile
fi

echo "Running the compiled scala code in the object $scalaObject"
scala -cp . $scalaObject

