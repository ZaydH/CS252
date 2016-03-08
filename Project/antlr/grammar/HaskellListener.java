// Generated from Haskell.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(HaskellParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(HaskellParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#headerComment}.
	 * @param ctx the parse tree
	 */
	void enterHeaderComment(HaskellParser.HeaderCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#headerComment}.
	 * @param ctx the parse tree
	 */
	void exitHeaderComment(HaskellParser.HeaderCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(HaskellParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(HaskellParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#lineComment}.
	 * @param ctx the parse tree
	 */
	void enterLineComment(HaskellParser.LineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#lineComment}.
	 * @param ctx the parse tree
	 */
	void exitLineComment(HaskellParser.LineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#generalComment}.
	 * @param ctx the parse tree
	 */
	void enterGeneralComment(HaskellParser.GeneralCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#generalComment}.
	 * @param ctx the parse tree
	 */
	void exitGeneralComment(HaskellParser.GeneralCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#commentWord}.
	 * @param ctx the parse tree
	 */
	void enterCommentWord(HaskellParser.CommentWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#commentWord}.
	 * @param ctx the parse tree
	 */
	void exitCommentWord(HaskellParser.CommentWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(HaskellParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(HaskellParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#mainPrototype}.
	 * @param ctx the parse tree
	 */
	void enterMainPrototype(HaskellParser.MainPrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#mainPrototype}.
	 * @param ctx the parse tree
	 */
	void exitMainPrototype(HaskellParser.MainPrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#mainHeader}.
	 * @param ctx the parse tree
	 */
	void enterMainHeader(HaskellParser.MainHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#mainHeader}.
	 * @param ctx the parse tree
	 */
	void exitMainHeader(HaskellParser.MainHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(HaskellParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(HaskellParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#mainWords}.
	 * @param ctx the parse tree
	 */
	void enterMainWords(HaskellParser.MainWordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#mainWords}.
	 * @param ctx the parse tree
	 */
	void exitMainWords(HaskellParser.MainWordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#parenMainWord}.
	 * @param ctx the parse tree
	 */
	void enterParenMainWord(HaskellParser.ParenMainWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#parenMainWord}.
	 * @param ctx the parse tree
	 */
	void exitParenMainWord(HaskellParser.ParenMainWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#generalMainWord}.
	 * @param ctx the parse tree
	 */
	void enterGeneralMainWord(HaskellParser.GeneralMainWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#generalMainWord}.
	 * @param ctx the parse tree
	 */
	void exitGeneralMainWord(HaskellParser.GeneralMainWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#funcPrototype}.
	 * @param ctx the parse tree
	 */
	void enterFuncPrototype(HaskellParser.FuncPrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#funcPrototype}.
	 * @param ctx the parse tree
	 */
	void exitFuncPrototype(HaskellParser.FuncPrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(HaskellParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(HaskellParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#typeSignature}.
	 * @param ctx the parse tree
	 */
	void enterTypeSignature(HaskellParser.TypeSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#typeSignature}.
	 * @param ctx the parse tree
	 */
	void exitTypeSignature(HaskellParser.TypeSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#inputType}.
	 * @param ctx the parse tree
	 */
	void enterInputType(HaskellParser.InputTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#inputType}.
	 * @param ctx the parse tree
	 */
	void exitInputType(HaskellParser.InputTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(HaskellParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(HaskellParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HaskellParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HaskellParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#unitType}.
	 * @param ctx the parse tree
	 */
	void enterUnitType(HaskellParser.UnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#unitType}.
	 * @param ctx the parse tree
	 */
	void exitUnitType(HaskellParser.UnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(HaskellParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(HaskellParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#funcStatement}.
	 * @param ctx the parse tree
	 */
	void enterFuncStatement(HaskellParser.FuncStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#funcStatement}.
	 * @param ctx the parse tree
	 */
	void exitFuncStatement(HaskellParser.FuncStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchingArguments}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchingArguments(HaskellParser.PatternMatchingArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchingArguments}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchingArguments(HaskellParser.PatternMatchingArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchingArgument}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchingArgument(HaskellParser.PatternMatchingArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchingArgument}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchingArgument(HaskellParser.PatternMatchingArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#generalMatchingArgument}.
	 * @param ctx the parse tree
	 */
	void enterGeneralMatchingArgument(HaskellParser.GeneralMatchingArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#generalMatchingArgument}.
	 * @param ctx the parse tree
	 */
	void exitGeneralMatchingArgument(HaskellParser.GeneralMatchingArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchParentheses}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchParentheses(HaskellParser.PatternMatchParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchParentheses}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchParentheses(HaskellParser.PatternMatchParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchingExpression}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchingExpression(HaskellParser.PatternMatchingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchingExpression}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchingExpression(HaskellParser.PatternMatchingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchingTerm}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchingTerm(HaskellParser.PatternMatchingTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchingTerm}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchingTerm(HaskellParser.PatternMatchingTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#dollarSignTerm}.
	 * @param ctx the parse tree
	 */
	void enterDollarSignTerm(HaskellParser.DollarSignTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#dollarSignTerm}.
	 * @param ctx the parse tree
	 */
	void exitDollarSignTerm(HaskellParser.DollarSignTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchArray}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchArray(HaskellParser.PatternMatchArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchArray}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchArray(HaskellParser.PatternMatchArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#patternMatchParen}.
	 * @param ctx the parse tree
	 */
	void enterPatternMatchParen(HaskellParser.PatternMatchParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#patternMatchParen}.
	 * @param ctx the parse tree
	 */
	void exitPatternMatchParen(HaskellParser.PatternMatchParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#generalPatternMatchingTerm}.
	 * @param ctx the parse tree
	 */
	void enterGeneralPatternMatchingTerm(HaskellParser.GeneralPatternMatchingTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#generalPatternMatchingTerm}.
	 * @param ctx the parse tree
	 */
	void exitGeneralPatternMatchingTerm(HaskellParser.GeneralPatternMatchingTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#generalFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterGeneralFunctionCall(HaskellParser.GeneralFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#generalFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitGeneralFunctionCall(HaskellParser.GeneralFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunction(HaskellParser.TypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunction(HaskellParser.TypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#haskellFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterHaskellFunctionName(HaskellParser.HaskellFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#haskellFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitHaskellFunctionName(HaskellParser.HaskellFunctionNameContext ctx);
}