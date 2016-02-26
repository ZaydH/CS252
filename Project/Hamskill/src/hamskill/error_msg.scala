package hamskill

import scala.io.Source // Read file a text file.

class ErrorMsg(filename : String) {
  
  var errors:Map[String,String] = Map()
  for (line <- Source.fromFile(filename).getLines()) {
    var err_msg = line takeWhile (_ != '#')
    if((err_msg.length() > 0) && (err_msg contains '|')){
      var split_err = err_msg split '|'
      errors += (split_err(0) -> split_err(1))
    }
  }
  
  def getErrorMessage(error_type : String): String = {
    return errors.getOrElse(error_type, "Unknown error.")
  } 
  
}