package hamskill

import hamskill.ErrorMsg
import hamskill.HaskellParser

object ham {
  
  lazy val hamskill_version = "0.00.00" // Define the version number.
  val errors = new ErrorMsg("errors.txt")
  
  def main( args : Array[String] ){
    
    println("HamSkill, by Zayd Hammoudeh.  Version: " + hamskill_version)
    
    var test = new HaskellParser("haskell.txt")
    
    var my_map = Map(("name", "Zayd"), ("age", 20))
    println(my_map("name"))
    while(true){
      print("> ")
      var ln = scala.io.StdIn.readLine()
      println(ln)
    }
  
  
  }
  
}