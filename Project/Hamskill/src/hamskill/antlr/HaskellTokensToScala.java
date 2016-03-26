package hamskill.antlr;

import java.util.ArrayList;
import java.util.Stack;

public class HaskellTokensToScala extends HaskellBaseListener {

    private StringBuilder fileContents = new StringBuilder();
    private int nextParamNumber;
    private int BASE_PARAM_NUMBER = 0;
    private String scalaModuleName;
    private int indentLevel = 0;
    
    // Stacks are used when data may need to be stored across nesting.
    private Stack<Boolean> commaSeparateTerms = new Stack<Boolean>();
    private Stack<Boolean> firstCommaTerm = new Stack<Boolean>();
    private Stack<Boolean> spaceSeparateTerms = new Stack<Boolean>();
    private Stack<Boolean> firstSpaceTerm = new Stack<Boolean>();
    private Stack<String> haskellFunctionToScalaMethodName = new Stack<String>();
    private boolean isHamskillStandard = false;
    private String hamskillStandardFunctionName;
    private String hamskillStandardFunctionArgs;
    private ArrayList<String> publicFunctionList = new ArrayList<String>();
   
    
    private boolean firstPatternMatchingArgument;
    
    /**
     * Base error message used for printing when something when wrong.
     */
    private final String baseErrorMessage = "Something went wrong here.  Did not expect this ";
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
    private String SCALA_INPUT_PARAMETER_CALL_BY_TYPE = ":";
    /**
     * When passing a function as a parameter, this separates the types.
     */
    private String SCALA_FUNCTION_TYPE_SEPARATOR = " => ";
    /**
     * Used to invoke the pattern matching syntax.
     */
    private String SCALA_USE_HASKELL_PATTERN_MATCHING_STYLE = "match";
    /**
     * Used in Scala to denote private versus public functions.
     */
    private String SCALA_PRIVATE_FUNCTION_DESIGNATOR = "private";
    /**
     * Define a Scala empty list.
     */
    private String SCALA_EMPTY_LIST = "Nil";
    /**
     * Denotes a list in Scala.
     */
    private String SCALA_LIST_DESIGNATOR = "List";
    /**
     * Scala's prepend operator (equivalent of ":" in Haskell).
     */
    private String SCALA_PREPEND_OPERATOR = "::";
    /**
     * Scala argument to ignore an input parameter.
     */
    private String SCALA_IGNORE_INPUT_ARGUMENT = "_";
    /**
     * Symbol that separates the anonymous function argument(s) from the 
     * actual function implementation.
     */
    private String SCALA_ANONYMOUS_FUNCTION_ARGUMENTS_BODY_SEPARATOR = "=>";
    /**
     * Scala equivalent of Haskell's otherwise.
     */
    private String SCALA_OTHERWISE_RESERVED_KEYWORD = "whatever";
    /**
     * Scala's equivalent of Haskell's "error" function.
     */
    private String SCALA_ERROR_FUNCTION = "sys.error";
    private String SCALA_CASE_VALUE_IMPLEMENTATION_SEPARATOR = "=>";
    /**
     * Scala requires a special symbol to indicate partially applied functions.
     * This variable defines that value.
     */
    private String SCALA_PARTIALLY_APPLIED_FUNCTION_SYMBOL = "_";
    /**
     * Denotes a Scala function.
     */
    private String SCALA_FUNCTION_DESIGNATOR = "def";
    /**
     * Define the type name for the parameters.
     */
    private final static String SCALA_TYPE_NAME_BOOL = "Boolean";
    private final static String SCALA_TYPE_NAME_INT = "Int";
    private final static String SCALA_TYPE_NAME_LIST_INT = "List[" + SCALA_TYPE_NAME_INT + "]";
    
    private final static String ARG_TYPE_SUFFIX_BOOL = "BOOL";
    private final static String ARG_TYPE_SUFFIX_INT = "INT";
    private final static String ARG_TYPE_SUFFIX_LIST_INT = "LstINT";

    

    /**
     * Haskell Tokenized Analyzer's Constructor for HamSkill+.
     * @param haskellModuleName Name of the Haskell module.  This will eventually become the Scala Object name
     */
    public HaskellTokensToScala(String haskellModuleName){
        // Chain to the two argument constructor.
        this(haskellModuleName, "");
    }
    /**
     * Haskell Tokenized Analyzer's Constructor.
     * 
     * @param haskellModuleName Name of the Haskell module.  This will eventually become the Scala Object name
     */
    public HaskellTokensToScala(String haskellModuleName, String standardHamSkillFunctionName){
        
        // Save the specified Haskell name to use in the Scala file definition.
        scalaModuleName = haskellModuleName;
        
        // Determine if this is Hamskill Standard or not.
        if(!standardHamSkillFunctionName.equals("")){
            this.isHamskillStandard = true;
            this.hamskillStandardFunctionName = standardHamSkillFunctionName; // For now only support runn
            this.hamskillStandardFunctionArgs = "(Array())";
        }    
        else{
            this.isHamskillStandard = false;
        }
                
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
        printIndent();
        
        // Put a header at the top of the file.
        fileContents.append("/** Autogenerated Scala Code by ANTLR v4 parser.\n"
                            + "  * Originally Developed by: Zayd Hammoudeh (zayd.hammoudeh@sjsu.edu)\n"
                            + "  * \n"
                            + "  * Course: CS252 (Spring 2016)\n"
                            + "  * Special Thanks to Dr. Thomas Austin (thomas.austin@sjsu.edu)\n"
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
        printIndent(); // Add indent if any.
        fileContents.append("}\n");
        
        // Put the object run String if it is HamSkill standard.
        if(this.isHamskillStandard)
            printHamskillStandardClosing();
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
     * General cleanup function when a code block is done.
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
        printIndent();
        fileContents.append("//");
     }
    /**
     * Handles the close of a line comment.
     */
    @Override public void exitLineComment(HaskellParser.LineCommentContext ctx) { 
        // Increase the indent by one level then print it.
        printIndent();
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
        printIndent();
        
        // Determine whether the function is private or public.
        HaskellParser.FuncPrototypeContext functProto = ctx.funcPrototype();
        // If not a standard function (e.g. main), then always public.
        if(functProto != null){
            String funcName = functProto.functionName().getText();
            // Any function not in the module statement is marked as private.
            if(!publicFunctionList.contains(funcName))
                fileContents.append(SCALA_PRIVATE_FUNCTION_DESIGNATOR).append(" ");
        }
        
        // Designate as a function.
        fileContents.append(this.SCALA_FUNCTION_DESIGNATOR).append(" ");
        
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
        printIndent();
        fileContents.append("} // End of function\n\n");
    }
    /**
     * Entry to the Haskell function prototype
     * 
     * @param ctx ANTLR Context
     */
    @Override public void enterFuncPrototype(HaskellParser.FuncPrototypeContext ctx) { 
        String functionName = ctx.functionName().getText();
        // Puts the file name
        fileContents.append(functionName);
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
        //this.addLeftParenthesis();
        fileContents.append(" ");
        this.pushSpaceSeparatorOntoStack();
    }
    /**
     * At the end of a type signature, close the function definition
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void exitTypeSignature(HaskellParser.TypeSignatureContext ctx) { 
        //fileContents.append(") ");
        fileContents.append(" ");
        this.popSpaceSeparatorOffStack();
    }
    /**
     * Performs the handling of the type in function prototype.
     */
    @Override public void enterInputType(HaskellParser.InputTypeContext ctx) { 
        //if(!isFirstParameter()) fileContents.append(", ");
        
        this.addSpaceSeparatorAsAppropriate();
        this.addLeftParenthesis();
        // Add the parameter name and type.
        fileContents.append(getInputParameterName());
        fileContents.append(" ").append(SCALA_INPUT_PARAMETER_CALL_BY_TYPE);
    }
    /**
     * Performs any cleanup required at the end of a part.
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void exitInputType(HaskellParser.InputTypeContext ctx) { 
        // Go to the next parameter ID
        incrementParameterId();
        this.addRightParenthesis();
    }  
    /**
     * {@inheritDoc}
     *
     * <p>Print the primitive type name (e.g. "Int", "Bool", etc.)  This function converts
     * any Haskell specific names to those compatible with Scala.</p>
     */
    @Override public void enterPrimitiveTypeName(HaskellParser.PrimitiveTypeNameContext ctx) { 
        fileContents.append(" ").append(convertHaskellTypeNameToScala(ctx.getText()));
    }
    /**
     * {@inheritDoc}
     *
     * <p>Need to special handle a function passed to the input function.  This
     * writes the Scala type separator.</p>
     */
    @Override public void enterTypeFunctionSeparator(HaskellParser.TypeFunctionSeparatorContext ctx) {
        fileContents.append(SCALA_FUNCTION_TYPE_SEPARATOR);
    }
    /**
     * Used to store the list of public functions from the Haskell "module" statement.
     *
     * @param ctx The ANTLR Context
     */
    @Override public void enterModuleFunctionName(HaskellParser.ModuleFunctionNameContext ctx) {
        String text = ctx.getText().replace("\n", "").replace("\r", "");
        publicFunctionList.add(text);
    }  
    /**
     * At the end of a type signature, close the function definition
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void enterReturnType(HaskellParser.ReturnTypeContext ctx) {
        fileContents.append(": ");
    }
    /**
     * At the end of a type signature, close the function definition
     * 
     * @param ctx The ANTLR Context
     */
    @Override public void exitReturnType(HaskellParser.ReturnTypeContext ctx) {
        fileContents.append(" = ");
        this.addLeftParenthesis();
        this.pushCommaSeparatorOntoStack();
        // List all parameters for the function.
        for(int i = BASE_PARAM_NUMBER; i < nextParamNumber; i++){
            // Comma separate multiple arguments
            
            // Put the parameter name
            this.addCommaSeparatorAsAppropriate();
            fileContents.append(getInputParameterName(i));
        }
        this.popCommaSeparatorOffStack();
        this.addRightParenthesis();
        fileContents.append(" ").append(SCALA_USE_HASKELL_PATTERN_MATCHING_STYLE).append(" ");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Handles the underscore.  Currently primarily used for pattern matching when
     * Haskell says it does not care about an argument.</p>
     */
    @Override public void enterUnderScoreTerm(HaskellParser.UnderScoreTermContext ctx) { 
        fileContents.append("_");
    }
    /**
     * Handles the entry to a single function/pattern matchinging statement.
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
     * End of a ALL pattern matching arguments.  This puts a pattern matching Scala symbol into the string.
     */
    @Override public void enterPatternMatchingArguments(HaskellParser.PatternMatchingArgumentsContext ctx) { 
        fileContents.append(" ");
        this.addLeftParenthesis();
        firstPatternMatchingArgument = true;
        
    }
    /**
     * End of a ALL pattern matching arguments.  This puts a pattern matching Scala symbol into the string.
     */
    @Override public void exitPatternMatchingArguments(HaskellParser.PatternMatchingArgumentsContext ctx) {         
        this.addRightParenthesis();
        fileContents.append(PATTERN_MATCHING_OPERATOR);
    }
    /**
     * Handles a single pattern matching argument.
     */
    @Override public void enterPatternMatchingArgument(HaskellParser.PatternMatchingArgumentContext ctx) { 
        // If not the first pattern matching argument, then comma separate.
        if(!firstPatternMatchingArgument)
            fileContents.append(", ");
        firstPatternMatchingArgument = false;
    }
    /**
     * {@inheritDoc}
     *
     * <p>In Haskell, you can ignore an input argument by using the underscore ("_").  This
     * handles that case.</p>
     */
    @Override public void enterUnderScoreArgument(HaskellParser.UnderScoreArgumentContext ctx) { 
        fileContents.append(SCALA_IGNORE_INPUT_ARGUMENT);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGeneralMatchingArgument(HaskellParser.GeneralMatchingArgumentContext ctx) { 
        // Print the parameter information.
        fileContents.append(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>Manages spacing within the parentheses by pushing the space tracker onto the stack.</p>
     */
    @Override public void enterPatternMatchParentheses(HaskellParser.PatternMatchParenthesesContext ctx) {
        //// Print the parameter information.
        //ctx.getText();
        this.pushSpaceSeparatorOntoStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Manages spacing within the parentheses by pop the space tracker onto the stack
     * since now the end of the parentheses.</p>
     */
    @Override public void exitPatternMatchParentheses(HaskellParser.PatternMatchParenthesesContext ctx) {
        this.popSpaceSeparatorOffStack();
    }
    /**
     * End of a pattern matching argument.  Currently a no-op
     */
    @Override public void exitPatternMatchingArgument(HaskellParser.PatternMatchingArgumentContext ctx) { }
    /**
     * Opens an expression. 
     */
    @Override public void enterPatternMatchingExpression(HaskellParser.PatternMatchingExpressionContext ctx) { 
        //fileContents.append(" ");
        //this.addSpaceSeparatorAsAppropriate();
    }
    /**
     * Prints a pattern matching term.  Currently this does nothing.
     */
    @Override public void enterPatternMatchingTerm(HaskellParser.PatternMatchingTermContext ctx) {
        this.addSpaceSeparatorAsAppropriate();
    }
    /**
     * Opens a parenthesis for the pattern matching term.
     */
    @Override public void enterPatternMatchParen(HaskellParser.PatternMatchParenContext ctx) {
        this.addLeftParenthesis();
    }
    /**
     * Opens a parenthesis for the pattern matching term.
     */
    @Override public void exitPatternMatchParen(HaskellParser.PatternMatchParenContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * Opens a parenthesis for the pattern matching term.
     */
    @Override public void enterPatternMatchArray(HaskellParser.PatternMatchArrayContext ctx) { 
        fileContents.append("List(");
    }
    /**
     * Opens a parenthesis for the pattern matching term.
     */
    @Override public void exitPatternMatchArray(HaskellParser.PatternMatchArrayContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * Opens a parenthesis for the pattern matching term.
     */
    @Override public void enterGeneralPatternMatchingTerm(HaskellParser.GeneralPatternMatchingTermContext ctx) { 
        fileContents.append(ctx.getText());
    }
    /**
     * Used for a function call inside a Haskell program.  Opens the call for scala.
     */
    @Override public void enterGeneralFunctionCall(HaskellParser.GeneralFunctionCallContext ctx) { 
        //fileContents.append("(");
        this.pushSpaceSeparatorOntoStack();
        this.pushCommaSeparatorOntoStack();
    }
    /**
     * Used for a function call inside a Haskell Program.  Closes the call in Scala.
     */
    @Override public void exitGeneralFunctionCall(HaskellParser.GeneralFunctionCallContext ctx) { 
        this.addRightParenthesis();
        // Clear any nested functions.
        this.popCommaSeparatorOffStack();
    }
    @Override public void enterFunctionCallFunctionName(HaskellParser.FunctionCallFunctionNameContext ctx) { 
        //fileContents.append(ctx.getText());
    }
    /**
     * Prints an open parenthesis before the function call.
     */
    @Override public void exitFunctionCallFunctionName(HaskellParser.FunctionCallFunctionNameContext ctx){
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>This function is used to comma separate function arguments.</p>
     */
    @Override public void enterFunctionArgument(HaskellParser.FunctionArgumentContext ctx) { 
        this.addCommaSeparatorAsAppropriate();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunctionArgument(HaskellParser.FunctionArgumentContext ctx) { }
    /**
     * Handles the dollar sign operator in Haskell.  Surrounds the items by an open parenthesis.
     */
    @Override public void enterDollarSignTerm(HaskellParser.DollarSignTermContext ctx) { 
        this.addLeftParenthesis();
    }
    /**
     * Handles the dollar sign operator in Haskell.  Surrounds the items by an close parenthesis.
     */
    @Override public void exitDollarSignTerm(HaskellParser.DollarSignTermContext ctx) { 
        this.addRightParenthesis();
    }   
    /**
     * Whenever a Haskell function that needs to be converted to a Scala method is found, this pushes that method
     * onto the function name stack. 
     */
    @Override public void enterHaskellFunctionToScalaMethodName(HaskellParser.HaskellFunctionToScalaMethodNameContext ctx) { 
        haskellFunctionToScalaMethodName.push(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>Prints the name of a generic method that is not Haskell specific.</p>
     */
    @Override public void enterNonHaskellReservedFunctionName(HaskellParser.NonHaskellReservedFunctionNameContext ctx) { 
        fileContents.append(ctx.getText());
    }
    /**
     * Called when converting a Haskell function (followed by a dollar sign) to a Scala object method. Currently a no-op.
     */
    @Override public void enterFunctionToMethodDollarSign(HaskellParser.FunctionToMethodDollarSignContext ctx) { }
    /**
     * Called when converting a Haskell function (followed by a dollar sign) to a Scala object method. Currently a no-op.
     */
    @Override public void exitFunctionToMethodDollarSign(HaskellParser.FunctionToMethodDollarSignContext ctx) { }
    /**
     * Called when converting a Haskell function (surrounded in a parenthesis) to a Scala object method. Currently a no-op.
     */
    @Override public void enterFunctionToMethodParen(HaskellParser.FunctionToMethodParenContext ctx) { }
    /**
     * Called when converting a Haskell function (surrounded in a parenthesis) to a Scala object method. Currently a no-op. 
     */
    @Override public void exitFunctionToMethodParen(HaskellParser.FunctionToMethodParenContext ctx) { }
    /**
     * To simplify support in Scala, we need to surrunound in parentheses.
     */
    @Override public void enterFunctionToMethodTerm(HaskellParser.FunctionToMethodTermContext ctx) { 
        this.addLeftParenthesis();
    }
    /**
     * When just a simple term, need to surround in parenthesis.
     */
    @Override public void exitFunctionToMethodTerm(HaskellParser.FunctionToMethodTermContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * Some functions in Haskell are converted to methods in Scala.  This is called at the beginning of that.
     */
    @Override public void enterFunctionToMethod(HaskellParser.FunctionToMethodContext ctx) { }
    /**
     * Called at the end of function to method conversion.  Converts the Haskell function
     * name to scala.  Pops the function name off the stack.
     */
    @Override public void exitFunctionToMethod(HaskellParser.FunctionToMethodContext ctx) { 
        String haskellFuncName = haskellFunctionToScalaMethodName.pop();
        fileContents.append(".").append(convertHaskellFunctionToScalaMethod(haskellFuncName)).append("()");
    }
    /**
     * Used to handle an "if" statement.  Prints "if" and an open parentheses.
     */
    @Override public void enterIfTerm(HaskellParser.IfTermContext ctx) { 
        fileContents.append("if");
        this.addLeftParenthesis();
    }
    /**
     * Closes the "if" parenthesis.
     */
    @Override public void exitIfTerm(HaskellParser.IfTermContext ctx) {
    }
    /**
     * There is no "then" in Scala so just use curly brackets.
     */
    @Override public void enterThenTerm(HaskellParser.ThenTermContext ctx) {
        this.addRightParenthesis();
        fileContents.append("\n");
        this.incrementIndentLevel(true);
        fileContents.append("{\n");
        incrementIndentLevel(true);
    }

    /**
     * Else requires an explicit keyword and curly bracket.
     */
    @Override public void enterElseTerm(HaskellParser.ElseTermContext ctx) {
        fileContents.append("\n");
        decrementIndentLevel(true);
        fileContents.append("}\n");
        printIndent();
        fileContents.append("else{\n");
        incrementIndentLevel(true);
    }
    /**
     * Close the else with a curly bracket,
     */
    @Override public void exitIfStatementPattern(HaskellParser.IfStatementPatternContext ctx) {
        fileContents.append("\n");
        decrementIndentLevel(true);
        fileContents.append("}");
        this.decrementIndentLevel(false);
    }
    /**
     * {@inheritDoc}
     *
     * <p>Handles an empty list (i.e. "[]" in Haskell).</p>
     */
    @Override public void enterEmptyList(HaskellParser.EmptyListContext ctx) { 
        fileContents.append(SCALA_EMPTY_LIST);
    }
    /**
     * {@inheritDoc}
     *
     * <p>Opens the handling of a Haskell concatenated list for pattern checking.
     * Just puts a left parenthesis "(".</p>
     */
    @Override public void enterConcatenatedList(HaskellParser.ConcatenatedListContext ctx) { 
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Opens the handling of a Haskell concatenated list for pattern checking.
     * Just puts a right parenthesis ")"</p>
     */
    @Override public void exitConcatenatedList(HaskellParser.ConcatenatedListContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>For the head of a concatenated list, just use parentheses to 
     * make to the code more robust.  For entering, it puts a left 
     * parentheses "(".</p>
     */
    @Override public void enterHeadList(HaskellParser.HeadListContext ctx) {
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>For the head of a concatenated list, just use parentheses to 
     * make to the code more robust.  For exiting the head list, it puts a left 
     * parentheses ")".</p>
     */
    @Override public void exitHeadList(HaskellParser.HeadListContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Converts the Haskell prepend operator (:) to the Scala
     * prepend operator.</p>
     */
    @Override public void enterColonTerm(HaskellParser.ColonTermContext ctx) {
        fileContents.append(SCALA_PREPEND_OPERATOR);
    }
    /**
     * {@inheritDoc}
     *
     * <p>For the tail of a concatenated list, just use parentheses to 
     * make to the code more robust.  For entering the tail list, it puts a left 
     * parentheses "(".</p>
     */
    @Override public void enterTailList(HaskellParser.TailListContext ctx) {
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>For the tail of a concatenated list, just use parentheses to 
     * make to the code more robust.  For exiting the tail list, it puts a right 
     * parentheses ")".</p>
     */
    @Override public void exitTailList(HaskellParser.TailListContext ctx) {
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>On entry to a list, marks it as a Scala List</p>
     */
    @Override public void enterPopulatedList(HaskellParser.PopulatedListContext ctx) {
        this.pushSpaceSeparatorOntoStack();
        this.pushCommaSeparatorOntoStack();
        fileContents.append(SCALA_LIST_DESIGNATOR).append("(");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Closes a Scala List with a parentheses. </p>
     */
    @Override public void exitPopulatedList(HaskellParser.PopulatedListContext ctx) { 
        this.addRightParenthesis();
        this.popCommaSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>ListElement handles comma separating terms.</p>
     */
    @Override public void enterListElement(HaskellParser.ListElementContext ctx) {
        this.addCommaSeparatorAsAppropriate();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Surround a lambda function by parentheses.  This places the left
     * parenthesis.</p>
     */
    @Override public void enterLambdaFunction(HaskellParser.LambdaFunctionContext ctx) { 
        this.addLeftParenthesis();
        //fileContents.append(" ");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Surround a lambda function by parentheses.  This places the right
     * parenthesis.</p>
     */
    @Override public void exitLambdaFunction(HaskellParser.LambdaFunctionContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>In Scala, the lambda/anonymous function arguments are surrounded by parentheses.
     * This function places the left (open) parenthesis.</p>
     */
    @Override public void enterAllLambdaArguments(HaskellParser.AllLambdaArgumentsContext ctx) { 
        this.pushCommaSeparatorOntoStack();
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>In Scala, the lambda/anonymous function arguments are surrounded by parentheses.
     * This function places the right (close) parenthesis.</p>
     */
    @Override public void exitAllLambdaArguments(HaskellParser.AllLambdaArgumentsContext ctx) {
        this.addRightParenthesis();
        this.popCommaSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSingleLamdaArgument(HaskellParser.SingleLamdaArgumentContext ctx) { 
        this.addCommaSeparatorAsAppropriate();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSingleLamdaArgument(HaskellParser.SingleLamdaArgumentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypedLamdaArgument(HaskellParser.TypedLamdaArgumentContext ctx) { 
        String argName = ctx.getText();
        fileContents.append(argName);
        fileContents.append(": ");
        fileContents.append(this.getTypeFromArgumentName(argName));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypedLamdaArgument(HaskellParser.TypedLamdaArgumentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterUnderscoreLambdaArgument(HaskellParser.UnderscoreLambdaArgumentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Underscore arguments are listed as "Any" type so add the Any type signature..</p>
     */
    @Override public void exitUnderscoreLambdaArgument(HaskellParser.UnderscoreLambdaArgumentContext ctx) { 
        fileContents.append(": Any");
    }
    /**
     * {@inheritDoc}
     *
     * <p>For maximum code robustness, Hamskill surrounds the anonymous function body in 
     * parentheses.  This function places the <b>left</b> (<i>open</i>) parenthesis.</p>
     */
    @Override public void enterLambdaBody(HaskellParser.LambdaBodyContext ctx) {
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>For maximum code robustness, Hamskill surrounds the anonymous function body in 
     * parentheses.  This function places the <b>right</b> (<i>open</i>) parenthesis.</p>
     */
    @Override public void exitLambdaBody(HaskellParser.LambdaBodyContext ctx) {
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>In Haskell, a right arrow ("->") separates the anonymous arguments from the
     * function implementation.  This adds the scala equivalent ("=>").</p>
     */
    @Override public void enterLamdaArgumentsBodySeparator(HaskellParser.LamdaArgumentsBodySeparatorContext ctx) { 
        fileContents.append(" ").append(SCALA_ANONYMOUS_FUNCTION_ARGUMENTS_BODY_SEPARATOR).append(" ");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCaseTerm(HaskellParser.CaseTermContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCaseTerm(HaskellParser.CaseTermContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCaseStatementAndVariable(HaskellParser.CaseStatementAndVariableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCaseStatementAndVariable(HaskellParser.CaseStatementAndVariableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCaseStatement(HaskellParser.CaseStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCaseStatement(HaskellParser.CaseStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Case Variables are surrounded by parentheses for robustness.  This function
     * adds the left (open) parenthesis.</p>
     */
    @Override public void enterCaseVariable(HaskellParser.CaseVariableContext ctx) { 
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Case Variables are surrounded by parentheses for robustness.  This function
     * adds the right (close) parenthesis.
     * 
     * It also adds the terms to indicate to Scala this is a case statement</p>
     */
    @Override public void exitCaseVariable(HaskellParser.CaseVariableContext ctx) {
        fileContents.append(") " );
        fileContents.append(SCALA_USE_HASKELL_PATTERN_MATCHING_STYLE).append(" ");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCaseConditions(HaskellParser.CaseConditionsContext ctx) {
        fileContents.append("{\n");
        this.incrementIndentLevel(false);
    }
    /**
     * {@inheritDoc}
     *
     * <p>Case conditions are surrounded by curly brackets.  This function first decrements the 
     * indent and adds the closing curly brackets then opens a new line.</p>
     */
    @Override public void exitCaseConditions(HaskellParser.CaseConditionsContext ctx) { 
        this.decrementIndentLevel(true);
        fileContents.append("}\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Prints idents and prints that this is a case statement</p>
     */
    @Override public void enterCaseGeneralStatement(HaskellParser.CaseGeneralStatementContext ctx) {
        this.printIndent();
        fileContents.append(PATTERN_MATCHING_HEADER).append(" ");
        this.pushSpaceSeparatorOntoStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCaseGeneralStatement(HaskellParser.CaseGeneralStatementContext ctx) {
        this.popSpaceSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>For added robustness, the case statement is surrounded by parentheses so 
     * add the left (open) parentheses.</p>
     */
    @Override public void enterCaseValueCompare(HaskellParser.CaseValueCompareContext ctx) { 
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>For added robustness, the case statement is surrounded by parentheses so 
     * add the right (close) parentheses.</p>
     */
    @Override public void exitCaseValueCompare(HaskellParser.CaseValueCompareContext ctx) {
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCaseOtherwiseStatement(HaskellParser.CaseOtherwiseStatementContext ctx) { 
        this.printIndent();
        fileContents.append(PATTERN_MATCHING_HEADER).append(" ");
        this.pushSpaceSeparatorOntoStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCaseOtherwiseStatement(HaskellParser.CaseOtherwiseStatementContext ctx) {
        this.popSpaceSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Surround the case implementation section in parentheses.  This function adds the 
     * open (left) parenthesis.</p>
     */
    @Override public void enterCaseImplementation(HaskellParser.CaseImplementationContext ctx) {
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>At the end of a case implementation, add a new line. This function also closes the 
     * parenthesis.</p>
     */
    @Override public void exitCaseImplementation(HaskellParser.CaseImplementationContext ctx) { 
        fileContents.append(")\n");
        this.popSpaceSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>In Scala, the value of a case statement and its implementation have a separator between them.
     * This listener adds that separator.</p>
     */
    @Override public void enterCaseValueImplementationSeparator(HaskellParser.CaseValueImplementationSeparatorContext ctx) {
        fileContents.append(" ").append(this.SCALA_CASE_VALUE_IMPLEMENTATION_SEPARATOR).append(" ");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Converts the Haskell "otherwise" to the Scala equivalent.</p>
     */
    @Override public void enterOtherwiseTerm(HaskellParser.OtherwiseTermContext ctx) { 
        fileContents.append(this.SCALA_OTHERWISE_RESERVED_KEYWORD);
    }
    /**
     * {@inheritDoc}
     *
     * <p>Strings are surrounded by quotation makes so put the left quotation mark.</p>
     */
    @Override public void enterStringTerm(HaskellParser.StringTermContext ctx) {        
        this.pushSpaceSeparatorOntoStack();
        fileContents.append("\"");
        
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStringTerm(HaskellParser.StringTermContext ctx) { 
        fileContents.append("\"");
        this.popSpaceSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Prints the word and optionally a space.</p>
     */
    @Override public void enterWord(HaskellParser.WordContext ctx) { 
        this.addSpaceSeparatorAsAppropriate();
        fileContents.append(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWord(HaskellParser.WordContext ctx) { }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>Handles the Haskell "error" function.</p>
//     */
//    @Override public void enterErrorTerm(HaskellParser.ErrorTermContext ctx) { 
//        fileContents.append(this.SCALA_ERROR_FUNCTION);
//    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitErrorTerm(HaskellParser.ErrorTermContext ctx) { }
    
    
    
    /************************************************************************************
    *                    Methods Related to the Main Method Only                        *
    ************************************************************************************/
    /**
     * Starts a main function.  Currently a no-op.
     */
    @Override public void enterMainFunction(HaskellParser.MainFunctionContext ctx) { }
    /**
     * Ends the main function.  Used to decrement the indent.
     */
    @Override public void exitMainFunction(HaskellParser.MainFunctionContext ctx) {
        decrementIndentLevel(false);
    }
    /**
     * Defines the main function prototype
     */
    @Override public void enterMainPrototype(HaskellParser.MainPrototypeContext ctx) { 
        fileContents.append("main(args : Array[String]){\n");
        incrementIndentLevel(false);
    }
    /**
     * Opens a main function statement. This currently just handles indenting the statement.
     */
    @Override public void enterMainStatement(HaskellParser.MainStatementContext ctx) { 
        printIndent();
    }
    /**
     * Closes a main function statement. This currently just handles indenting the statement.
     */
    @Override public void exitMainStatement(HaskellParser.MainStatementContext ctx) { 
        fileContents.append("\n");
    }
    /**
     * Used to convert a haskell Function name to a Scala function name.
     */
    @Override public void enterHaskellFunctionName(HaskellParser.HaskellFunctionNameContext ctx) {
        fileContents.append(convertHaskellFunctionNameToScala(ctx.getText()));
    }
    /**
     * Handle a LEFT parenthesis in the main method.  Just prints "("
     */
    @Override public void enterParenMainWord(HaskellParser.ParenMainWordContext ctx) { 
        this.addLeftParenthesis();
    }
    /**
     * Handle a RIGHT parenthesis in the main method.  Just prints ")"
     */
    @Override public void exitParenMainWord(HaskellParser.ParenMainWordContext ctx) { 
        decrementIndentLevel(true);
        this.addRightParenthesis();
    }
    /**
     * Handle a LEFT parenthesis in the main method.  Just prints "("
     */
    @Override public void enterGeneralMainWord(HaskellParser.GeneralMainWordContext ctx) { 
        //fileContents.append(" ").append(ctx.getText());
    }
    /**
     * Handle Monad expressions specifically.  This is the entrance to a monad.
     */
    @Override public void enterMonadExpression(HaskellParser.MonadExpressionContext ctx) { 
        
    }
    /**
     *Add a semicolon at the end of a monad.
     */
    @Override public void exitMonadExpression(HaskellParser.MonadExpressionContext ctx) {
        fileContents.append(";");
    }
    /**
     * Creates the variable name (as immutable) and adds the equal sign.
     */
    @Override public void enterImmutableValueName(HaskellParser.ImmutableValueNameContext ctx) {
        fileContents.append("lazy val ").append(ctx.getText()).append(" =");
    }
    /**
     * Called at the end of an immutable value name.  Currently a no-op.
     */
    @Override public void exitImmutableValueName(HaskellParser.ImmutableValueNameContext ctx) { }
    /**
     * If main is recursive to itself, then need to pass its arguments.
     * Changes recursive main function call to include args.
     */
    @Override public void enterRecursiveMain(HaskellParser.RecursiveMainContext ctx) { 
        fileContents.append("main(args)");
    }
    /**
     * Handles a recursive call to main.  No-op currently. 
     */
    @Override public void exitRecursiveMain(HaskellParser.RecursiveMainContext ctx) { }
    /**
     * Handle the return of the unit type.  
     */
    @Override public void enterReturnUnitType(HaskellParser.ReturnUnitTypeContext ctx) { 
        fileContents.append("return;");
    }
    /**
     * Handle the return of the unit type.  Closing currently does nothing.
     */
    @Override public void exitReturnUnitType(HaskellParser.ReturnUnitTypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Begins the management of the spaces for the partially applied function line.</p>
     */
    @Override public void enterSingleLinePartiallyAppliedFunction(HaskellParser.SingleLinePartiallyAppliedFunctionContext ctx) {
        this.pushSpaceSeparatorOntoStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Ends the management of the spaces for partially applied function line.</p>
     */
    @Override public void exitSingleLinePartiallyAppliedFunction(HaskellParser.SingleLinePartiallyAppliedFunctionContext ctx) { 
        this.popSpaceSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Prints the function name.</p>
     */
    @Override public void enterPartiallyAppliedFunctionName(HaskellParser.PartiallyAppliedFunctionNameContext ctx) {
        fileContents.append(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPartiallyAppliedFunctionName(HaskellParser.PartiallyAppliedFunctionNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignmentOperator(HaskellParser.AssignmentOperatorContext ctx) { 
        fileContents.append(" = {");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignmentOperator(HaskellParser.AssignmentOperatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignmentExpression(HaskellParser.AssignmentExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Denotes the object as a partially applied function by appending Scala'a special
     * symbol for partially applied functions.</p>
     */
    @Override public void exitAssignmentExpression(HaskellParser.AssignmentExpressionContext ctx) { 
        this.addSpaceSeparatorAsAppropriate();
        fileContents.append(this.SCALA_PARTIALLY_APPLIED_FUNCTION_SYMBOL);
    }
    
    
    /**************************************************************************************
     *   Generic Helper Functions.  These are not relays to the Grammar's Base Listener   *
     *************************************************************************************/
    
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
//    /**
//     * Checks whether handling the first parameter.
//     * 
//     * @return "true" if the current parameter is the first and "false" otherwise.
//     */
//    private boolean isFirstParameter(){ return nextParamNumber == BASE_PARAM_NUMBER; }
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
        if(printIndent) printIndent();
    }
    /**
     * Decrements the indent by one level.
     * 
     * @param printIndent  If true, an indent at the specified indent level is added.
     */
    private void decrementIndentLevel(boolean printIndent){
        indentLevel--;
        if(printIndent) printIndent();
    }
    /**
     * Adds an indent based off the specified indent level to the scala file contents.
     */
    private void printIndent(){
        for(int i = 0; i < indentLevel; i++)
            fileContents.append(TAB_STRING);
    }
    /**
     * 
     * @param haskellType
     * @return
     */
    private String convertHaskellTypeNameToScala(String haskellType){
        // Handle the support Haskell types.
        switch(haskellType){
            case "Int": return SCALA_TYPE_NAME_INT;
            case "[Int]": return SCALA_TYPE_NAME_LIST_INT;
            case "Bool": return SCALA_TYPE_NAME_BOOL;
            case "[Char]": return "String";
            case "String": return "String";
            case "Char": return "Char";
            
        }
        // Handle the base case.
        return baseErrorMessage + "TYPE NAME.";
    }
    /**
     * Converts Haskell function names to their Scala equivalents.
     * 
     * @param functionName  A supported Haskell function name.
     * @return              Equivalent Scala function name.
     */
    public String convertHaskellFunctionNameToScala(String functionName){
        switch(functionName){
            case "putStrLn": return "println";
            case "putStr": return "print";
            case "getLine" : return "scala.io.StdIn.readLine()";
            case "error" : return SCALA_ERROR_FUNCTION;
            case "`div`" : return "/";
            case "`mod`" : return "%";
            case "/=" : return "!=";
        }
        return baseErrorMessage + "FUNCTION NAME.";
    }
    
    /**
     * Since Haskell does not have objects in an object oriented way, all operations are done
     * as functions.  In contrast, Scala supports objects so some of operations that in Haskell
     * are functions are methods in Scala.  An example of this is "show" in Haskell which
     * translates to "toString()" in Scala.
     * 
     * @param functionName Function name in Haskell
     * 
     * @return   Matching method name in Scala.
     */
    public String convertHaskellFunctionToScalaMethod(String functionName){
        switch(functionName){
            case "show": return "toString";
            case "length": return "length";
        }
        return baseErrorMessage + "FUNCTION NAME.";
    }
    
    /**
     * When running Hamskill Standard, this function will add a call to the specified function so it
     * is runnable using Twitter's eval library.
     */
    public void printHamskillStandardClosing(){
        fileContents.append("\n\n");
        fileContents.append(scalaModuleName).append(".");
        fileContents.append(this.hamskillStandardFunctionName).append(this.hamskillStandardFunctionArgs);
        fileContents.append(";\n\n");
    }
    
    /**
     * Some terms in Scala need to be comma separated.  This is a generic structure to support
     * managing when commas are needed.  Relies on a stack.  
     * 
     * This denotes a new nested comma required location.
     */
    private void pushCommaSeparatorOntoStack(){
        commaSeparateTerms.push(Boolean.TRUE);
        firstCommaTerm.push(Boolean.TRUE);
    }
    /**
     * Some terms in Scala need to be comma separated.  This is a generic structure to support
     * managing when commas are needed.  Relies on a stack.  
     * 
     * This denotes a new nested comma required location.
     */
    private void popCommaSeparatorOffStack(){
        // Clear any nested functions.
        commaSeparateTerms.pop();
        firstCommaTerm.pop();
    }
    /**
     * When handling comma separated lists from Haskell to Scala, this function will
     * add commas to the text as needed.  If it is the first element in the list it does nothing.
     */
    private void addCommaSeparatorAsAppropriate(){
        if(!commaSeparateTerms.isEmpty()){
            // For the first term, just skip and do not put a comma,
            if(firstCommaTerm.peek() == Boolean.TRUE){
                firstCommaTerm.pop();
                firstCommaTerm.push(Boolean.FALSE);
            }
            // For everything after the first term, 
            else{
                // For multiple terms, 
                fileContents.append(", ");
            }       
        }
        else{
            //fileContents.append(" ");
        }
    }
    /**
     * Some terms in Scala need to be comma separated.  This is a generic structure to support
     * managing when commas are needed.  Relies on a stack.  
     * 
     * This denotes a new nested comma required location.
     */
    private void pushSpaceSeparatorOntoStack(){
        this.spaceSeparateTerms.push(Boolean.TRUE);
        this.firstSpaceTerm.push(Boolean.TRUE);
    }
    /**
     * Some terms in Scala need to be comma separated.  This is a generic structure to support
     * managing when commas are needed.  Relies on a stack.  
     * 
     * This denotes a new nested comma required location.
     */
    private void popSpaceSeparatorOffStack(){
        // Clear any nested functions.
        this.spaceSeparateTerms.pop();
        this.firstSpaceTerm.pop();
    }
    /**
     * When handling comma separated lists from Haskell to Scala, this function will
     * add commas to the text as needed.  If it is the first element in the list it does nothing.
     */
    private void addSpaceSeparatorAsAppropriate(){
        if(!spaceSeparateTerms.isEmpty()){
            // For the first term, just skip and do not put a comma,
            if(firstSpaceTerm.peek() == Boolean.TRUE){
                firstSpaceTerm.pop();
                firstSpaceTerm.push(Boolean.FALSE);
            }
            // For everything after the first term, 
            else{
                // For multiple terms, 
                fileContents.append(" ");
            }       
        }
        else{
            fileContents.append(" ");
        }
    }
    /**
     * Given a parameter name (particular for Lambda functions), this
     * function can determine the appropriate type of the variable.
     * 
     * @param argName Name of the function argument.
     * @return Type of the argument based off the argument name,
     */
    private String getTypeFromArgumentName(String argName){
        
        // Check if parameter is a bool
        if(isArgumentSpecificType(argName, ARG_TYPE_SUFFIX_BOOL))
            return SCALA_TYPE_NAME_BOOL;

        // Check if parameter is a list of integers
        if(isArgumentSpecificType(argName, ARG_TYPE_SUFFIX_LIST_INT))
            return SCALA_TYPE_NAME_LIST_INT;
        
        // Check if parameter is a single integer
        if(isArgumentSpecificType(argName, ARG_TYPE_SUFFIX_INT))
            return SCALA_TYPE_NAME_INT;
        
        // Throw an error since cannot parse parameter name.
        throw new IllegalArgumentException("Specified type name cannot be determined for parameter :\""
                                           + argName + "\"");
        
    }
    /**
     * Checks whether a specific parameter is a specific type based off whether the end
     * of the parameter name matches the specified type specific suffix.
     * 
     * @param argName Name of the function argument
     * @param argTypeSuffix Type specific suffix for an argument name.
     * @return "True" if the end of the parameter matches the suffix and "false" otherwise.
     */
    private boolean isArgumentSpecificType(String argName, String argTypeSuffix){
        int argNameLen = argName.length();
        int substrStart = argNameLen - argTypeSuffix.length();
        if(substrStart > 0 && argName.substring(substrStart).equals(argTypeSuffix))
            return true;
        else
            return false;
    }
    
    /**
     * Places an opening parenthesis and pushes a space (" ") manager onto the stack.
     */
    public void addLeftParenthesis(){
        this.pushSpaceSeparatorOntoStack();
        fileContents.append("(");
    }
    /**
     * Places a closing (right) parenthesis and pops the space (" ") manager off the stack.
     */
    public void addRightParenthesis(){
        fileContents.append(")");
        this.popSpaceSeparatorOffStack();;
    }
    
    
}
