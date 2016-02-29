
public class HaskellTokensToScala extends HaskellBaseListener {

    private StringBuilder fileContents = new StringBuilder();
    private int nextParamNumber;
    private int BASE_PARAM_NUMBER = 0;
    private String scalaModuleName;
    private int indentLevel = 0;
    
    /**
     * Operator separating the "case" statement and any pattern matching parameters and
     * the expression.
     */
    private final String PATTERN_MATCHING_OPERATOR = " => ";
    /**
     * Used to represent a tab/indent.  Using spaces.
     */
    private final String TAB_STRING = "  ";
    /**
     * Statement used at the beginning of a pattern matching in Scala.  This is equivalent to the
     * reuse of the function name in Haskell.
     */
    private final String PATTERN_MATCHING_HEADER = "case";
    /**
     * Select type of call by parameter.  Right now using lazy parameters.
     */
    private String SCALAR_INPUT_PARAMETER_CALL_BY_TYPE = ": =>";
    /**
     * Used to invoke the pattern matching syntax.
     */
    private String SCALA_USE_HASKELL_PATTERN_MATCHING_STYLE = "match ";
    /**
     * Haskell Tokenized Analyzer's Constructor.
     * 
     * @param haskellModuleName Name of the Haskell module.  This will eventually become the Scala Object name
     */
    public HaskellTokensToScala(String haskellModuleName){
        
        // Save the specified Haskell name to use in the Scala file definition.
        scalaModuleName = haskellModuleName;
        
        // Set the indent level to zero.
        resetIndentLevel();
    }
    /**
     * Generates the Scala file header.
     * 
     * Also embeds all code inside a Scala object.
     * 
     * @param ctx ANTLR Context
     */
    @Override public void enterProgram(HaskellParser.ProgramContext ctx) { 
        
        // Add indent if any.
        addIndent();
        
        // Put a header at the top of the file.
        fileContents.append(  "/** Autogenerated Scala Code by ANTLR v4 parser.\n"
                            + "  * Original Develop: Zayd Hammoudeh (zayd.hammoudeh@sjsu.edu)\n"
                            + "  */\n\n");
        
        // Embed the code in a Scala object
        fileContents.append("object " + scalaModuleName + " {\n\n");
    }
    
    /**
     * Closes the scala file.
     * 
     * @param ctx ANTLR Context
     */
    @Override public void exitProgram(HaskellParser.ProgramContext ctx) { 
        
        // Decrement the indent and then display it.
        decrementIndentLevel(true);
        
        // Put a header at the top of the file.
        addIndent(); // Add indent if any.
        fileContents.append("}\n");
    }
    /** 
     * General handler that is called when any contiguous block of code (including a comment)
     * is invoked.
     */
    @Override public void enterCodeBlock(HaskellParser.CodeBlockContext ctx) { 
        // Increase the indent by one level then print it.
        incrementIndentLevel(false); 
     }
    /** 
     * General cleanup funciton when a code block is done.
     */
    @Override public void exitCodeBlock(HaskellParser.CodeBlockContext ctx) { 
        // Decrease the indent by one level
        decrementIndentLevel(false);
    }
    /**
     * Takes a line comment from Haskell and adds it to the Scala file.
     */
    @Override public void enterLineComment(HaskellParser.LineCommentContext ctx) { 
        // Increase the indent by one level then print it.
        addIndent();
        fileContents.append("//");
     }
    /**
     * Handles the close of a line comment.
     */
    @Override public void exitLineComment(HaskellParser.LineCommentContext ctx) { 
        // Increase the indent by one level then print it.
        addIndent();
        fileContents.append("\n");
     }
    @Override public void enterCommentWord(HaskellParser.CommentWordContext ctx) { 
        fileContents.append(" ");
        fileContents.append(ctx.getText());
    }
    /**
     * Entry to the Haskell function
     * 
     * @param ctx ANTLR Context
     */
    @Override public void enterFunc(HaskellParser.FuncContext ctx) { 
        // Puts the file header.
        addIndent();
        fileContents.append("def ");
        
        // Reset the parameter number
        resetNextParamNumber();
    }
    /**
     * Handles the end of the Haskell function.
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void exitFunc(HaskellParser.FuncContext ctx) { 
        // Decrement the number of indents and then add it to the file.
        addIndent();
        fileContents.append(  "} // End of function\n\n");
    }
    /**
     * Entry to the Haskell function prototype
     * 
     * @param ctx ANTLR Context
     */
    @Override public void enterFuncPrototype(HaskellParser.FuncPrototypeContext ctx) { 
        // Puts the file header.
        fileContents.append(ctx.functionName().getText());
    }
    /**
     * Closes the function prototype.
     * 
     * @param ctx ANTLR Context
     */
    @Override public void exitFuncPrototype(HaskellParser.FuncPrototypeContext ctx) { 
        fileContents.append("{\n");
    }
    /**
     * Handles the entrance to a Haskell function. 
     */
    @Override public void enterFuncbody(HaskellParser.FuncbodyContext ctx) { 
        // Increase the indent level.
        incrementIndentLevel(false);
        
    }
    /**
     * Handles the exit from a Haskell function. 
     */
    @Override public void exitFuncbody(HaskellParser.FuncbodyContext ctx) { 
        // Increase the indent level.
        decrementIndentLevel(false);
    }
    /**
     * Defines the Scala code when starting the type signature (i.e. input parameters)
     * for a Haskell function.
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void enterTypeSignature(HaskellParser.TypeSignatureContext ctx) { 
        fileContents.append("(");
    }
    /**
     * At the end of a type signature, close the function definition
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void exitTypeSignature(HaskellParser.TypeSignatureContext ctx) { 
        fileContents.append(  ") ");
    }
    /**
     * Performs the handling of the type in function prototype.
     */
    @Override public void enterInputType(HaskellParser.InputTypeContext ctx) { 
        if(!isFirstParameter()) fileContents.append(", ");
        
        // Add the parameter name and type.
        fileContents.append(getInputParameterName());
        fileContents.append(SCALAR_INPUT_PARAMETER_CALL_BY_TYPE);
        fileContents.append(ctx.getText());
    }
    /**
     * Performs any cleanup required at the end of a part.
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void exitInputType(HaskellParser.InputTypeContext ctx) { 
        // Go to the next parameter ID
        incrementParameterId();
    }    
    /**
     * At the end of a type signature, close the function definition
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void enterReturnType(HaskellParser.ReturnTypeContext ctx) {
        fileContents.append(  ": " + ctx.getText() + " = ");
        fileContents.append(SCALA_USE_HASKELL_PATTERN_MATCHING_STYLE);
    }
    /**
     * Handles the entry to a single function/pattern matching statement.
     */
    @Override public void enterFuncStatement(HaskellParser.FuncStatementContext ctx) {
        // Increment the indent and print them.
        incrementIndentLevel(true);
        fileContents.append(PATTERN_MATCHING_HEADER);
    }
    /**
     * Handles the exit to a single function/pattern matching statement.
     */
    @Override public void exitFuncStatement(HaskellParser.FuncStatementContext ctx) { 
        // Close the function statement
        fileContents.append("\n");
        decrementIndentLevel(false);
    }
    /**
     * Handles a single pattern matching argument.
     */
    @Override public void enterPatternMatchingArgument(HaskellParser.PatternMatchingArgumentContext ctx) { 
        fileContents.append(" " + ctx.getText());
    }
    /**
     * End of a pattern matching argument.  Currently a no-op
     */
    @Override public void exitPatternMatchingArgument(HaskellParser.PatternMatchingArgumentContext ctx) { }
    /**
     * End of a ALL pattern matching arguments.  This puts a pattern matching Scala symbol into the string.
     */
    @Override public void exitPatternMatchingArguments(HaskellParser.PatternMatchingArgumentsContext ctx) { 
        fileContents.append(PATTERN_MATCHING_OPERATOR);
    }
    /**
     * Opens an expression. For robustness, everything is put in paranetheses so this puts a left "(" 
     * parentheses at the beginning of the expression.
     */
    @Override public void enterPatternMatchingExpression(HaskellParser.PatternMatchingExpressionContext ctx) { 
        fileContents.append(" (");
    }
    /**
     * Closes expression.  For robustness, everything is put in paranetheses so this puts right ")" 
     * parentheses at the beginning of the expression.
     */
    @Override public void exitPatternMatchingExpression(HaskellParser.PatternMatchingExpressionContext ctx) { 
        fileContents.append(" )");
    }
    /**
     * Prints a pattern matching term.
     */
    @Override public void enterPatternMatchingTerm(HaskellParser.PatternMatchingTermContext ctx) { 
        fileContents.append(" ");
        fileContents.append(ctx.getText());
    }
    /**
     * Outputs the converted Haskell code to Scala.
     * 
     * @return Haskell code as a String of Scala Code
     */
    @Override public String toString(){
        return fileContents.toString();
    }
    /**
     * Creates a standardized, highly customized input parameter name.  This is needed because 
     * by default, Haskell does not have input parameter names.
     * 
     * @param paramNumb       
     * @return              String representing the specified input parameter
     */
    private String getInputParameterName(int paramNumb){ return "___" + paramNumb + "___"; }
    /**
     * Uses the standard getInputParameterName function.  Rather than using a specific parameter
     * number, this one uses the next parameter's ID number.
     * 
     * @return  Next Parameter's Name.
     */
    private String getInputParameterName(){ return getInputParameterName(nextParamNumber); }
    /*
     * At the beginning of a function, reset the parameter number.
     */
    private void incrementParameterId(){ nextParamNumber++; };
    /*
     * At the beginning of a function, reset the parameter number.
     */
    private void resetNextParamNumber(){ nextParamNumber = BASE_PARAM_NUMBER; };
    /**
     * Checks whether handling the first parameter.
     * 
     * @return "true" if the current parameter is the first and "false" otherwise.
     */
    private boolean isFirstParameter(){ return nextParamNumber == BASE_PARAM_NUMBER; }
    /**
     * Sets the indent level to the default.
     */
    private void resetIndentLevel(){indentLevel = BASE_PARAM_NUMBER;}  
    /**
     * Increment the indent by one level.
     * 
     * @param printIndent  If true, an indent at the specified indent level is added.
     */
    private void incrementIndentLevel(boolean printIndent){
        indentLevel++;
        if(printIndent) addIndent();
    }
    /**
     * Decrements the indent by one level.
     * 
     * @param printIndent  If true, an indent at the specified indent level is added.
     */
    private void decrementIndentLevel(boolean printIndent){
        indentLevel--;
        if(printIndent) addIndent();
    }
    /**
     * Adds an indent based off the specified indent level to the scala file contents.
     */
    private void addIndent(){
        for(int i = 0; i < indentLevel; i++)
            fileContents.append(TAB_STRING);
    }
    
}
