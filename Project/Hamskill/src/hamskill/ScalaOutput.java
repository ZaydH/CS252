package hamskill;

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
        
        // In debug mode, print the scala code.
        if(HamskillMain.DEBUG_PRINT){
            //Print out the scala code for debug purposes.
            System.out.println(this.haskellOutput.toString());
        }
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
