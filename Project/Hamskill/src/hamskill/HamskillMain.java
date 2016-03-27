package hamskill;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
//Import ANTLR's libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

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
     * If true, debug messages are print to the command line.
     */
    static final boolean DEBUG_PRINT = false;
    
    /**
     * Stores whether this is Hamskill standard (using the Twitter library) or uses external Scala.
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
     * Stores the output file name for the scala file.
     */
    public String objectName;
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
        else
            hamskill.exportScalaToFile();
        
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
        this.objectName = this.haskellFileName;
        if(periodIndex >= 0)
            this.objectName = this.objectName.substring(0, periodIndex);
        // Get any preceding slashes
        int slashIndex = Math.max(this.objectName.lastIndexOf("\\"), haskellFileName.lastIndexOf("/"));
        // Extract the Haskell file's folder path.
        if(slashIndex >= 0){
            this.haskellFolderPath = objectName.substring(0, slashIndex+1);
            this.objectName = this.objectName.substring(slashIndex + 1, objectName.length());
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
        
        // In debug mode, print the scala code.
        if(HamskillMain.DEBUG_PRINT){
            //Print out the scala code for debug purposes.
            System.out.println(this.scalaCode);
        }
    }
    /**
     * For HamSkill standard, this allows the Haskell code to be compiled and run entirelly within
     */
    public void runScala() throws UnsupportedOperationException {
        if(!this.isHamskillStandard)
            throw new UnsupportedOperationException("The \"runScala\" method is only supported for HamSkill standard objects.");
        
        /** Technique for redirecting System.out is borrowed from here: 
         * 
         * http://stackoverflow.com/questions/8708342/redirect-console-output-to-string-in-java
         */
        // Create a printStream where IO will direct to. 
        ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutStream);
        
        // Save the old print stream
        PrintStream oldSysOut = System.out;

        // Redirect to the new stream
        System.setOut(printStream);       
        
        // Compile run and output the Scala results.
        final Eval eval = new Eval();
        eval.apply(this.scalaCode.toString(),true);
        
        // Reset System.out
        System.out.flush();
        System.setOut(oldSysOut);
        
        // Get the Scala standard output as a String.
        String scalaOutputString = byteArrayOutStream.toString();
        
        // In debug mode, print the output 
        if(HamskillMain.DEBUG_PRINT)
            System.out.println(scalaOutputString);
        
        
        // Show what happened
        ScalaOutput scalaOut = new ScalaOutput(scalaOutputString);
        scalaOut.reformatToHaskell();
        System.out.println(scalaOut.getHaskellOutputText() );
    }
    /**
     * Export the Scala code to a file.
     */
    public void exportScalaToFile() throws IOException {
        if(this.isHamskillStandard)
            throw new UnsupportedOperationException("The \"exportScalaToFile\" method is only supported for HamSkill+ objects.");
        
        // Define the output filemae based off the original filename.
        String outputFileName = this.haskellFolderPath + this.objectName + ".scala";
        
        // Try writing the file
        try{
            // Use a StringReader and BufferedReader to properly handle newlines.
            StringReader strReader = new StringReader(this.scalaCode.toString());
            BufferedReader bufReader = new BufferedReader(strReader);
            
            // Write to the file.
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            for(String line = bufReader.readLine(); line != null; line = bufReader.readLine()) {
                bufWriter.write(line);
                bufWriter.newLine();
            }
            bufReader.close();
            bufWriter.close();
        }
        catch(Exception e){
            System.out.println("Unable to write to the file: " + outputFileName);
        }
    }

    
}
