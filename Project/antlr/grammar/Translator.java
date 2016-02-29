// Import ANTLR's libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


/**
 * 
 * @author Zayd
 *
 * 
 *
 */
public class Translator {
    
    public static void main(String args[]) throws IOException {
        
        // Read the Input from a specified file.
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File(args[0])));
        
        // Create a lexer that feeds off of input CharStream
        HaskellLexer lexer = new HaskellLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        HaskellParser parser = new HaskellParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at "program" rule

        //Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        
        // Walk the tree created during the parse, trigger callbacks
        HaskellTokensToScala scalaCode = new HaskellTokensToScala();
        walker.walk(scalaCode, tree);
        
        System.out.println(scalaCode);
        
        System.out.println(); // print a \n after translation
        
    }
    
}
