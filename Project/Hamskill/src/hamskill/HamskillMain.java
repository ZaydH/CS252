package hamskill;

//Import ANTLR's libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

// Import the antlr generated classes
import hamskill.antlr.HaskellLexer;
import hamskill.antlr.HaskellParser;
import hamskill.antlr.HaskellTokensToScala;
import scala.collection.JavaConversions;
import scala.tools.nsc.Global;
import scala.tools.nsc.Settings;

/**
 * 
 * @author Zayd
 *
 * 
 *
 */
public class HamskillMain {
    
    public static void main(String args[]) throws IOException {
        
        // Read the Input from a specified file.
        String fileName = args[0];
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File(fileName)));
        
        // Create a lexer that feeds off of input CharStream
        HaskellLexer lexer = new HaskellLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        HaskellParser parser = new HaskellParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at "program" rule

        //Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        
        // Get the Haskell file name
        int periodIndex = fileName.lastIndexOf(".");
        String haskellFileName = fileName;
        if(periodIndex >= 0)
            haskellFileName = haskellFileName.substring(0, periodIndex);
        // Get any preceding slashes
        int slashIndex = Math.max(haskellFileName.lastIndexOf("\\"), haskellFileName.lastIndexOf("/"));
        if(slashIndex >= 0)
            haskellFileName = haskellFileName.substring(slashIndex + 1, haskellFileName.length());
        
        // Walk the tree created during the parse, trigger callbacks
        HaskellTokensToScala scalaCode = new HaskellTokensToScala(haskellFileName);
        walker.walk(scalaCode, tree);
        
        //Print out the scala code for debug purposes.
        System.out.println(scalaCode);
        System.out.println(); // print a \n after translation
        
        
        Global g = new Global(new Settings());
        Global.Run run = g.new Run();
        List<String> fileNames = new ArrayList<String>(Arrays.asList("Hello.scala"));
        run.compile(JavaConversions.asScalaBuffer(fileNames).toList());
        
        //// Compile the Scala Code.
        //Runtime rt = Runtime.getRuntime();
        //Process pr = rt.exec("java -cp scala-library.jar;. Hello");
//        try {
//            pr.wait();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        //System.out.println(haskell_code.main(String args[]));
//        String x = pr.toString();
//        System.out.println(x);
//        x = "herew";
        
    }
    
    private void writeToScalaFile(String scalaCode, String fileName){
        
    }
    
}
