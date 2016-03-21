package hamskill;

//Import ANTLR's libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.twitter.util.Eval;

// Import the antlr generated classes
import hamskill.antlr.HaskellLexer;
import hamskill.antlr.HaskellParser;
import hamskill.antlr.HaskellTokensToScala;

/**
 * 
 * @author Zayd Hammoudeh (zayd.hammoudeh@sjsu.edu)
 *
 * Sole Driver for Hamskill Standard.
 * Also serves as the parser for Hamskill+. 
 *
 */
public class HamskillMain {
    
    // Parameters defining the input parameters for the Hamskill input arguments
    private static final int HAMSKILL_FILENAME_INDEX = 0;
    private static final int HAMSKILL_FUNCTION_NAME_INDEX = 1;
    private static final int MINIMUM_NUMBER_OF_ARGUMENTS = 1;
    private static final int MAXIMUM_NUMBER_OF_ARGUMENTS = 2;
    
    /**
     * Stores whether this is Hamskell standard (using the Twitter library) or uses external Scala.
     */
    private boolean isHamskillStandard;
    /**
     * Name of the Haskell Filename
     */
    private String haskellFileName;
    /**
     * Haskell Folder Path.  The Scala file will be outputted to the same path.
     */
    private String haskellFolderPath;
    /**
     * Name of the function to run from the command line.
     */
    private String hamskillStandardFunctionName;
    /**
     * Stores the code converted from Haskell to Scala.
     */
    private HaskellTokensToScala scalaCode;
    
    
    /**
     * 
     * @param args      
     * @throws IOException
     */
    public static void main(String args[]) throws IOException, IllegalArgumentException {
        
        // Validate the input arguments
        if(args.length > MAXIMUM_NUMBER_OF_ARGUMENTS)
            throw new IllegalArgumentException("Error: A maximum two arguments is allowed for Hamskill");
        else if(args.length < MINIMUM_NUMBER_OF_ARGUMENTS)
            throw new IllegalArgumentException("Error: No arguments passed.  One argument is required for standard Hamskill.\n"
                                               + "Two arguments are required for Hamskill+.");
        
        // Create the Hamskill Object
        HamskillMain hamskill = new HamskillMain(args);
        
        // If this a Hamskill Standard object, then run it. 
        if(hamskill.isHamskillStandard)
            hamskill.runScala();
        
    }
    
    /**
     * Standard Hamskill and Hamskill+ Object Constructor
     * 
     * @param args Command line input parameters.
     */
    public HamskillMain(String args[]) throws IOException{
          
        // Read the Input from a specified file.
        this.haskellFileName = args[HamskillMain.HAMSKILL_FILENAME_INDEX];
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File(this.haskellFileName)));
        
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
        int periodIndex = this.haskellFileName.lastIndexOf(".");
        String objectName = this.haskellFileName;
        if(periodIndex >= 0)
            objectName = objectName.substring(0, periodIndex);
        // Get any preceding slashes
        int slashIndex = Math.max(objectName.lastIndexOf("\\"), haskellFileName.lastIndexOf("/"));
        // Extract the Haskell file's folder path.
        if(slashIndex >= 0){
            this.haskellFolderPath = objectName.substring(0, slashIndex);
            objectName = objectName.substring(slashIndex + 1, haskellFileName.length());
        }
        else{
            this.haskellFolderPath = "";
        }
        
        // Walk the tree created during the parse, trigger callbacks
        if(args.length < HAMSKILL_FUNCTION_NAME_INDEX + 1){
            this.isHamskillStandard = false;
        
            // Run as Haskell+.
            this.scalaCode = new HaskellTokensToScala(objectName);
        }
        else{
            this.hamskillStandardFunctionName = args[HAMSKILL_FUNCTION_NAME_INDEX];
            this.isHamskillStandard = true;
            
            // Run as Haskell Standard.
            this.scalaCode = new HaskellTokensToScala(objectName, this.hamskillStandardFunctionName );
        }
        
        // Walk the AST
        walker.walk(this.scalaCode, tree);
        
        //Print out the scala code for debug purposes.
        System.out.println(this.scalaCode);
        System.out.println(); // print a \n after translation
    }
    
    /**
     * For HamSkill standard, this allows the Haskell code to be compiled and run entirelly within
     */
    public void runScala() throws UnsupportedOperationException {
        if(!this.isHamskillStandard)
            throw new UnsupportedOperationException("The \"runScala\" method is only supported for HamSkill standard objects.");
        
        // Compile run and output the Scala results.
        final Eval eval = new Eval();
        final Object result = eval.apply(this.scalaCode.toString(),true);
    }

    
}
