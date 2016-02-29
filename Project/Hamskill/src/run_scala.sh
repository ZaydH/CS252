#!/bin/bash

scalaSrcFile=$1
echo "Compiling the Scala file: $scalaSrcFile" 
scalac $scalaSrcFile
echo "Compile stage completed."

echo "Running the compiled scala code."
scalaObject=$(echo $scalaSrcFile | rev | cut -d "." -f2 | rev)
if [ ${#scalaObject} -eq 0 ]; then
	scalaObject=$scalaSrcFile
fi
scala $scalaObject
