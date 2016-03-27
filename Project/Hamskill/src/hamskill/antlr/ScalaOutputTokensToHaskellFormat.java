package hamskill.antlr;

import java.util.Stack;

public class ScalaOutputTokensToHaskellFormat extends ScalaOutputBaseListener {

    private StringBuffer outputContents = new StringBuffer();
    private StringBuffer activeStringBuffer;
    
    
    private String HASKELL_SOME_MONAD_EQUIVALENT = "Just";
    private String HASEKLL_NONE_MONAD_EQUIVALENT = "Nothing";
    
    // Stacks are used when data may need to be stored across nesting.
    private Stack<Boolean> commaSeparateTerms = new Stack<Boolean>();
    private Stack<Boolean> firstCommaTerm = new Stack<Boolean>();
    private Stack<Boolean> spaceSeparateTerms = new Stack<Boolean>();
    private Stack<Boolean> firstSpaceTerm = new Stack<Boolean>();
    
    
    /**
     * Empty constructor
     */
    public ScalaOutputTokensToHaskellFormat(){
        // Only use a single buffer for now.
        activeStringBuffer = outputContents;
        this.pushSpaceSeparatorOntoStack();;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSpaceSeparatedTerm(ScalaOutputParser.SpaceSeparatedTermContext ctx) {
        this.addSpaceSeparatorAsAppropriate();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSpaceSeparatedTerm(ScalaOutputParser.SpaceSeparatedTermContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParenthesesTerm(ScalaOutputParser.ParenthesesTermContext ctx) {
        this.addLeftParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParenthesesTerm(ScalaOutputParser.ParenthesesTermContext ctx) { 
        this.addRightParenthesis();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Encloses lists and arrays in square brackets and manages
     * adding the comma and spaces.</p>
     */
    @Override public void enterList(ScalaOutputParser.ListContext ctx) { 
        this.pushCommaSeparatorOntoStack();
        activeStringBuffer.append("[");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Closes the list with a square bracket and pops the comma and space separators
     * off the stack.</p>
     */
    @Override public void exitList(ScalaOutputParser.ListContext ctx) { 
        activeStringBuffer.append("]");
        this.popCommaSeparatorOffStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Converts the Scala "Some" monad to the Haskell equivalent.</p>
     */
    @Override public void enterSomePhrase(ScalaOutputParser.SomePhraseContext ctx) { 
        activeStringBuffer.append(this.HASKELL_SOME_MONAD_EQUIVALENT).append(" ");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSomePhrase(ScalaOutputParser.SomePhraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Prints the word in the output and adds a space as appropriate.</p>
     */
    @Override public void enterNormalWord(ScalaOutputParser.NormalWordContext ctx) {
        activeStringBuffer.append(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNormalWord(ScalaOutputParser.NormalWordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Pops a space separator off the stack and inserts a new line.</p>
     */
    @Override public void enterNewLineTerm(ScalaOutputParser.NewLineTermContext ctx) { 
        this.popSpaceSeparatorOffStack();
        activeStringBuffer.append("\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>Pushes a new space separator tracker back onto the stack.</p>
     */
    @Override public void exitNewLineTerm(ScalaOutputParser.NewLineTermContext ctx) {
        this.pushSpaceSeparatorOntoStack();
    }
    /**
     * {@inheritDoc}
     *
     * <p>Converts the Scala "None" to the Haskell equivalent.</p>
     */
    @Override public void enterNone(ScalaOutputParser.NoneContext ctx) { 
        activeStringBuffer.append(this.HASEKLL_NONE_MONAD_EQUIVALENT);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNone(ScalaOutputParser.NoneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>Manages comma separating list terms in Haskell.</p>
     */
    @Override public void enterListTerm(ScalaOutputParser.ListTermContext ctx) {
        this.addCommaSeparatorAsAppropriate();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitListTerm(ScalaOutputParser.ListTermContext ctx) { }
    
    
    
    //------------------------------------- General Helper Functions -----------------------------//
    
    /**
     * Places an opening parenthesis and pushes a space (" ") manager onto the stack.
     */
    public void addLeftParenthesis(){
        this.pushSpaceSeparatorOntoStack();
        activeStringBuffer.append("(");
    }
    /**
     * Places a closing (right) parenthesis and pops the space (" ") manager off the stack.
     */
    public void addRightParenthesis(){
        activeStringBuffer.append(")");
        this.popSpaceSeparatorOffStack();;
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
                activeStringBuffer.append(",");
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
                activeStringBuffer.append(" ");
            }       
        }
        else{
            activeStringBuffer.append(" ");
        }
    }
    /**
     * Outputs the converted Scala Output to Haskell Format
     * 
     * @return Haskell formatted output text.
     */
    @Override public String toString(){
        return outputContents.toString();
    }
    
}
