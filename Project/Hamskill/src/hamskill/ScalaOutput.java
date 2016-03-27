package hamskill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import hamskill.antlr.ScalaOutputLexer;
import hamskill.antlr.ScalaOutputParser;
import hamskill.antlr.ScalaOutputTokensToHaskellFormat;

public class ScalaOutput {

    private ScalaOutputTokensToHaskellFormat haskellOutput;
    private String scalaOutputText;
    
    
    public static void main(String args[]) throws IOException {

        // Create the Scala Output object based off the input from StdIn
        ScalaOutput scalaOut = new ScalaOutput(readStdInToEnd());
        
        // Reformat the output to Haskell.
        scalaOut.reformatToHaskell();
        
        // Print the output
        System.out.println(scalaOut.getHaskellOutputText());       
        
    }
    
    private static String readStdInToEnd() throws IOException{
        StringBuffer inputText = new StringBuffer();
       
            // Wrap the System.in inside BufferedReader
            // But do not close it in a finally block, as we 
            // did no open System.in; enforcing the rule that
            // he who opens it, closes it; leave the closing to the OS.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            Boolean isFirstLine = true;
            while ((line = in.readLine()) != null) {
                
                // After the first line, put a newline
                if(!isFirstLine) inputText.append("\n");
                isFirstLine = false;
                
                // Append the text input.
                inputText.append(line);
            }

            return inputText.toString();
    }
    
    /**
     * Builds a Scala Output object.
     * @param scalaOutputText Scala Standard Output Text
     */
    public ScalaOutput(String scalaOutputText){
        this.scalaOutputText = scalaOutputText;
    }
    
    /**
     * Refactors the Scala output text to Haskell format.
     */
    public void reformatToHaskell(){
        ANTLRInputStream input = new ANTLRInputStream(scalaOutputText);
        
        // Create a lexer that feeds off of input CharStream
        ScalaOutputLexer lexer = new ScalaOutputLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        ScalaOutputParser parser = new ScalaOutputParser(tokens);
        ParseTree tree = parser.reformat(); // begin parsing at "program" rule

        //Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        
        // Walk the AST
        haskellOutput = new ScalaOutputTokensToHaskellFormat();
        walker.walk(this.haskellOutput, tree);

    }
    
    /**
     * Haskell Output text accessor.
     * 
     * @return Scala Output Converted to the Haskell Equivalent.
     */
    public String getHaskellOutputText(){
        return this.haskellOutput.toString();
    }
    
}
