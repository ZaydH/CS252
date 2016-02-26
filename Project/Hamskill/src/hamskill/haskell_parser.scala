package hamskill

import scala.io.Source // Read file a text file.
import java.io._       // Writes to an output file.

class HaskellParser(filename : String) {
  
  val lines = Source.fromFile(filename).getLines().toList
  var typeLookup = Map(("Int", "Int"), ("Char", "Char"), ("String", "String"), ("Bool", "Boolean"))
  val output = parse_input(lines)
  
  printToFile("debug.txt", output)
  
  /**
   * Parses a set of input Haskell strings.
   */
  private def parse_input(lines : List[String]): String ={
    
    var outputContents = new StringBuilder()
    
    // Get the lines to process
    var lines_to_process = Array[String]()
    for(line <- lines){
      val filterLine = removeComment(line)
      if(filterLine.length > 0){
        lines_to_process = lines_to_process :+ filterLine
      }
      else if(filterLine.length == 0 && lines_to_process.length > 0){
        outputContents ++== "\n" + process_lines(lines_to_process)
        lines_to_process = Array[String]() // Reinitialize the lines to process.
      }
    }
    
    // Return the parsed file contents.
    return outputContents.toString()
  }
  
  /**
   * Removes comments from a string
   */
  private def removeComment(line : String): String = {
    val commentIndex = line indexOf "--"
    if(commentIndex < 0)
      return line
    else
      return line substring(0, commentIndex)
  }
  
  private def getScalaParameterName(paramNumb : Int): String = "__" + paramNumb + "__"

  /**
   * Print the contents to a string. 
   */
  private def printToFile(filename : String, contents : String){
    val output_file = new File(filename)
    val buf_write = new BufferedWriter(new FileWriter(output_file))
    buf_write.write(contents)
    buf_write.close()
  }
  
  /**
   * Processes an array of lines that are passed to the function.
   */
  def process_lines(linesToProcess : Array[String]) : String = {
    // Process the first line.
    val splitFirstLine = linesToProcess(0).split(" ")
    
    var outputBuilder = new StringBuilder()
    outputBuilder ++== "def " + splitFirstLine(0) + "("
    
    // Get the first function argument.
    var paramId = 0
    val first_arg = splitFirstLine.indexWhere(_ == "->") - 1
    for( i <- first_arg to splitFirstLine.length - 2 by 2){
      // Put a preceding comma for arguments after the first one.
      if(paramId > 0) outputBuilder ++== ", "
      // Append the type.
      outputBuilder ++== getScalaParameterName(paramId) + ", " + typeLookup(splitFirstLine(i))
      paramId += 1
    }
    // Add the return type
    outputBuilder ++== "): " + splitFirstLine(splitFirstLine.length - 1) + " = {\n"
        
    outputBuilder ++= "}\n" // Close the function
    return outputBuilder.toString()
  }
}