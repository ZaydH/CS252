// Generated from Haskell.g4 by ANTLR 4.5.2
package hamskill.antlr;
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
	 * Enter a parse tree produced by {@link HaskellParser#headerCommentNewLine}.
	 * @param ctx the parse tree
	 */
	void enterHeaderCommentNewLine(HaskellParser.HeaderCommentNewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#headerCommentNewLine}.
	 * @param ctx the parse tree
	 */
	void exitHeaderCommentNewLine(HaskellParser.HeaderCommentNewLineContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModuleDefinition(HaskellParser.ModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModuleDefinition(HaskellParser.ModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#moduleOpen}.
	 * @param ctx the parse tree
	 */
	void enterModuleOpen(HaskellParser.ModuleOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#moduleOpen}.
	 * @param ctx the parse tree
	 */
	void exitModuleOpen(HaskellParser.ModuleOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#moduleFunctionList}.
	 * @param ctx the parse tree
	 */
	void enterModuleFunctionList(HaskellParser.ModuleFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#moduleFunctionList}.
	 * @param ctx the parse tree
	 */
	void exitModuleFunctionList(HaskellParser.ModuleFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#moduleClose}.
	 * @param ctx the parse tree
	 */
	void enterModuleClose(HaskellParser.ModuleCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#moduleClose}.
	 * @param ctx the parse tree
	 */
	void exitModuleClose(HaskellParser.ModuleCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(HaskellParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(HaskellParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#moduleFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterModuleFunctionName(HaskellParser.ModuleFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#moduleFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitModuleFunctionName(HaskellParser.ModuleFunctionNameContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#singleLinePartiallyAppliedFunction}.
	 * @param ctx the parse tree
	 */
	void enterSingleLinePartiallyAppliedFunction(HaskellParser.SingleLinePartiallyAppliedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#singleLinePartiallyAppliedFunction}.
	 * @param ctx the parse tree
	 */
	void exitSingleLinePartiallyAppliedFunction(HaskellParser.SingleLinePartiallyAppliedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#partiallyAppliedFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterPartiallyAppliedFunctionName(HaskellParser.PartiallyAppliedFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#partiallyAppliedFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitPartiallyAppliedFunctionName(HaskellParser.PartiallyAppliedFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(HaskellParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(HaskellParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(HaskellParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(HaskellParser.AssignmentExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#monadExpression}.
	 * @param ctx the parse tree
	 */
	void enterMonadExpression(HaskellParser.MonadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#monadExpression}.
	 * @param ctx the parse tree
	 */
	void exitMonadExpression(HaskellParser.MonadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#immutableValueName}.
	 * @param ctx the parse tree
	 */
	void enterImmutableValueName(HaskellParser.ImmutableValueNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#immutableValueName}.
	 * @param ctx the parse tree
	 */
	void exitImmutableValueName(HaskellParser.ImmutableValueNameContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#typeMaybeMonad}.
	 * @param ctx the parse tree
	 */
	void enterTypeMaybeMonad(HaskellParser.TypeMaybeMonadContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#typeMaybeMonad}.
	 * @param ctx the parse tree
	 */
	void exitTypeMaybeMonad(HaskellParser.TypeMaybeMonadContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#typeFunctionSeparator}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionSeparator(HaskellParser.TypeFunctionSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#typeFunctionSeparator}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionSeparator(HaskellParser.TypeFunctionSeparatorContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#primitiveTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveTypeName(HaskellParser.PrimitiveTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#primitiveTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveTypeName(HaskellParser.PrimitiveTypeNameContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#underScoreArgument}.
	 * @param ctx the parse tree
	 */
	void enterUnderScoreArgument(HaskellParser.UnderScoreArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#underScoreArgument}.
	 * @param ctx the parse tree
	 */
	void exitUnderScoreArgument(HaskellParser.UnderScoreArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#justArgument}.
	 * @param ctx the parse tree
	 */
	void enterJustArgument(HaskellParser.JustArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#justArgument}.
	 * @param ctx the parse tree
	 */
	void exitJustArgument(HaskellParser.JustArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#nothingArgument}.
	 * @param ctx the parse tree
	 */
	void enterNothingArgument(HaskellParser.NothingArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#nothingArgument}.
	 * @param ctx the parse tree
	 */
	void exitNothingArgument(HaskellParser.NothingArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#ifStatementPattern}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementPattern(HaskellParser.IfStatementPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ifStatementPattern}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementPattern(HaskellParser.IfStatementPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#ifStatementExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementExpression(HaskellParser.IfStatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ifStatementExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementExpression(HaskellParser.IfStatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#ifTerm}.
	 * @param ctx the parse tree
	 */
	void enterIfTerm(HaskellParser.IfTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ifTerm}.
	 * @param ctx the parse tree
	 */
	void exitIfTerm(HaskellParser.IfTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#thenTerm}.
	 * @param ctx the parse tree
	 */
	void enterThenTerm(HaskellParser.ThenTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#thenTerm}.
	 * @param ctx the parse tree
	 */
	void exitThenTerm(HaskellParser.ThenTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#elseTerm}.
	 * @param ctx the parse tree
	 */
	void enterElseTerm(HaskellParser.ElseTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#elseTerm}.
	 * @param ctx the parse tree
	 */
	void exitElseTerm(HaskellParser.ElseTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#prependTerm}.
	 * @param ctx the parse tree
	 */
	void enterPrependTerm(HaskellParser.PrependTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#prependTerm}.
	 * @param ctx the parse tree
	 */
	void exitPrependTerm(HaskellParser.PrependTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(HaskellParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(HaskellParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#allLambdaArguments}.
	 * @param ctx the parse tree
	 */
	void enterAllLambdaArguments(HaskellParser.AllLambdaArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#allLambdaArguments}.
	 * @param ctx the parse tree
	 */
	void exitAllLambdaArguments(HaskellParser.AllLambdaArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#singleLamdaArgument}.
	 * @param ctx the parse tree
	 */
	void enterSingleLamdaArgument(HaskellParser.SingleLamdaArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#singleLamdaArgument}.
	 * @param ctx the parse tree
	 */
	void exitSingleLamdaArgument(HaskellParser.SingleLamdaArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#underscoreLambdaArgument}.
	 * @param ctx the parse tree
	 */
	void enterUnderscoreLambdaArgument(HaskellParser.UnderscoreLambdaArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#underscoreLambdaArgument}.
	 * @param ctx the parse tree
	 */
	void exitUnderscoreLambdaArgument(HaskellParser.UnderscoreLambdaArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#lamdaArgumentsBodySeparator}.
	 * @param ctx the parse tree
	 */
	void enterLamdaArgumentsBodySeparator(HaskellParser.LamdaArgumentsBodySeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#lamdaArgumentsBodySeparator}.
	 * @param ctx the parse tree
	 */
	void exitLamdaArgumentsBodySeparator(HaskellParser.LamdaArgumentsBodySeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#typedLamdaArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypedLamdaArgument(HaskellParser.TypedLamdaArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#typedLamdaArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypedLamdaArgument(HaskellParser.TypedLamdaArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(HaskellParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(HaskellParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#concatenatedList}.
	 * @param ctx the parse tree
	 */
	void enterConcatenatedList(HaskellParser.ConcatenatedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#concatenatedList}.
	 * @param ctx the parse tree
	 */
	void exitConcatenatedList(HaskellParser.ConcatenatedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#headList}.
	 * @param ctx the parse tree
	 */
	void enterHeadList(HaskellParser.HeadListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#headList}.
	 * @param ctx the parse tree
	 */
	void exitHeadList(HaskellParser.HeadListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#colonTerm}.
	 * @param ctx the parse tree
	 */
	void enterColonTerm(HaskellParser.ColonTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#colonTerm}.
	 * @param ctx the parse tree
	 */
	void exitColonTerm(HaskellParser.ColonTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#underScoreTerm}.
	 * @param ctx the parse tree
	 */
	void enterUnderScoreTerm(HaskellParser.UnderScoreTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#underScoreTerm}.
	 * @param ctx the parse tree
	 */
	void exitUnderScoreTerm(HaskellParser.UnderScoreTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#tailList}.
	 * @param ctx the parse tree
	 */
	void enterTailList(HaskellParser.TailListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#tailList}.
	 * @param ctx the parse tree
	 */
	void exitTailList(HaskellParser.TailListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#emptyList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyList(HaskellParser.EmptyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#emptyList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyList(HaskellParser.EmptyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#populatedList}.
	 * @param ctx the parse tree
	 */
	void enterPopulatedList(HaskellParser.PopulatedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#populatedList}.
	 * @param ctx the parse tree
	 */
	void exitPopulatedList(HaskellParser.PopulatedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#listElement}.
	 * @param ctx the parse tree
	 */
	void enterListElement(HaskellParser.ListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#listElement}.
	 * @param ctx the parse tree
	 */
	void exitListElement(HaskellParser.ListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseTerm}.
	 * @param ctx the parse tree
	 */
	void enterCaseTerm(HaskellParser.CaseTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseTerm}.
	 * @param ctx the parse tree
	 */
	void exitCaseTerm(HaskellParser.CaseTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseStatementAndVariable}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatementAndVariable(HaskellParser.CaseStatementAndVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseStatementAndVariable}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatementAndVariable(HaskellParser.CaseStatementAndVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(HaskellParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(HaskellParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseVariable}.
	 * @param ctx the parse tree
	 */
	void enterCaseVariable(HaskellParser.CaseVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseVariable}.
	 * @param ctx the parse tree
	 */
	void exitCaseVariable(HaskellParser.CaseVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseConditions}.
	 * @param ctx the parse tree
	 */
	void enterCaseConditions(HaskellParser.CaseConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseConditions}.
	 * @param ctx the parse tree
	 */
	void exitCaseConditions(HaskellParser.CaseConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseGeneralStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseGeneralStatement(HaskellParser.CaseGeneralStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseGeneralStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseGeneralStatement(HaskellParser.CaseGeneralStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseValueCompare}.
	 * @param ctx the parse tree
	 */
	void enterCaseValueCompare(HaskellParser.CaseValueCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseValueCompare}.
	 * @param ctx the parse tree
	 */
	void exitCaseValueCompare(HaskellParser.CaseValueCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseOtherwiseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseOtherwiseStatement(HaskellParser.CaseOtherwiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseOtherwiseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseOtherwiseStatement(HaskellParser.CaseOtherwiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseImplementation}.
	 * @param ctx the parse tree
	 */
	void enterCaseImplementation(HaskellParser.CaseImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseImplementation}.
	 * @param ctx the parse tree
	 */
	void exitCaseImplementation(HaskellParser.CaseImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#caseValueImplementationSeparator}.
	 * @param ctx the parse tree
	 */
	void enterCaseValueImplementationSeparator(HaskellParser.CaseValueImplementationSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#caseValueImplementationSeparator}.
	 * @param ctx the parse tree
	 */
	void exitCaseValueImplementationSeparator(HaskellParser.CaseValueImplementationSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#otherwiseTerm}.
	 * @param ctx the parse tree
	 */
	void enterOtherwiseTerm(HaskellParser.OtherwiseTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#otherwiseTerm}.
	 * @param ctx the parse tree
	 */
	void exitOtherwiseTerm(HaskellParser.OtherwiseTermContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#functionToMethod}.
	 * @param ctx the parse tree
	 */
	void enterFunctionToMethod(HaskellParser.FunctionToMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionToMethod}.
	 * @param ctx the parse tree
	 */
	void exitFunctionToMethod(HaskellParser.FunctionToMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#haskellFunctionToScalaMethodName}.
	 * @param ctx the parse tree
	 */
	void enterHaskellFunctionToScalaMethodName(HaskellParser.HaskellFunctionToScalaMethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#haskellFunctionToScalaMethodName}.
	 * @param ctx the parse tree
	 */
	void exitHaskellFunctionToScalaMethodName(HaskellParser.HaskellFunctionToScalaMethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#functionToMethodDollarSign}.
	 * @param ctx the parse tree
	 */
	void enterFunctionToMethodDollarSign(HaskellParser.FunctionToMethodDollarSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionToMethodDollarSign}.
	 * @param ctx the parse tree
	 */
	void exitFunctionToMethodDollarSign(HaskellParser.FunctionToMethodDollarSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#functionToMethodParen}.
	 * @param ctx the parse tree
	 */
	void enterFunctionToMethodParen(HaskellParser.FunctionToMethodParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionToMethodParen}.
	 * @param ctx the parse tree
	 */
	void exitFunctionToMethodParen(HaskellParser.FunctionToMethodParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#functionToMethodTerm}.
	 * @param ctx the parse tree
	 */
	void enterFunctionToMethodTerm(HaskellParser.FunctionToMethodTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionToMethodTerm}.
	 * @param ctx the parse tree
	 */
	void exitFunctionToMethodTerm(HaskellParser.FunctionToMethodTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#recursiveMain}.
	 * @param ctx the parse tree
	 */
	void enterRecursiveMain(HaskellParser.RecursiveMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#recursiveMain}.
	 * @param ctx the parse tree
	 */
	void exitRecursiveMain(HaskellParser.RecursiveMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#returnUnitType}.
	 * @param ctx the parse tree
	 */
	void enterReturnUnitType(HaskellParser.ReturnUnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#returnUnitType}.
	 * @param ctx the parse tree
	 */
	void exitReturnUnitType(HaskellParser.ReturnUnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#booleanTrueFalse}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrueFalse(HaskellParser.BooleanTrueFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#booleanTrueFalse}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrueFalse(HaskellParser.BooleanTrueFalseContext ctx);
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
	 * Enter a parse tree produced by {@link HaskellParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(HaskellParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(HaskellParser.FunctionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#functionCallFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFunctionName(HaskellParser.FunctionCallFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#functionCallFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFunctionName(HaskellParser.FunctionCallFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#nonHaskellReservedFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterNonHaskellReservedFunctionName(HaskellParser.NonHaskellReservedFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#nonHaskellReservedFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitNonHaskellReservedFunctionName(HaskellParser.NonHaskellReservedFunctionNameContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link HaskellParser#stringTerm}.
	 * @param ctx the parse tree
	 */
	void enterStringTerm(HaskellParser.StringTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#stringTerm}.
	 * @param ctx the parse tree
	 */
	void exitStringTerm(HaskellParser.StringTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HaskellParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HaskellParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#doBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoBlock(HaskellParser.DoBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#doBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoBlock(HaskellParser.DoBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#doWord}.
	 * @param ctx the parse tree
	 */
	void enterDoWord(HaskellParser.DoWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#doWord}.
	 * @param ctx the parse tree
	 */
	void exitDoWord(HaskellParser.DoWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#doBlockUnboxings}.
	 * @param ctx the parse tree
	 */
	void enterDoBlockUnboxings(HaskellParser.DoBlockUnboxingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#doBlockUnboxings}.
	 * @param ctx the parse tree
	 */
	void exitDoBlockUnboxings(HaskellParser.DoBlockUnboxingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#monadUnboxing}.
	 * @param ctx the parse tree
	 */
	void enterMonadUnboxing(HaskellParser.MonadUnboxingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#monadUnboxing}.
	 * @param ctx the parse tree
	 */
	void exitMonadUnboxing(HaskellParser.MonadUnboxingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#monadVariableName}.
	 * @param ctx the parse tree
	 */
	void enterMonadVariableName(HaskellParser.MonadVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#monadVariableName}.
	 * @param ctx the parse tree
	 */
	void exitMonadVariableName(HaskellParser.MonadVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#monadUnboxOperator}.
	 * @param ctx the parse tree
	 */
	void enterMonadUnboxOperator(HaskellParser.MonadUnboxOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#monadUnboxOperator}.
	 * @param ctx the parse tree
	 */
	void exitMonadUnboxOperator(HaskellParser.MonadUnboxOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#monadEvaluationExpression}.
	 * @param ctx the parse tree
	 */
	void enterMonadEvaluationExpression(HaskellParser.MonadEvaluationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#monadEvaluationExpression}.
	 * @param ctx the parse tree
	 */
	void exitMonadEvaluationExpression(HaskellParser.MonadEvaluationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#justStatement}.
	 * @param ctx the parse tree
	 */
	void enterJustStatement(HaskellParser.JustStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#justStatement}.
	 * @param ctx the parse tree
	 */
	void exitJustStatement(HaskellParser.JustStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(HaskellParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(HaskellParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#reservedKeywords}.
	 * @param ctx the parse tree
	 */
	void enterReservedKeywords(HaskellParser.ReservedKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#reservedKeywords}.
	 * @param ctx the parse tree
	 */
	void exitReservedKeywords(HaskellParser.ReservedKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#reservedSymbols}.
	 * @param ctx the parse tree
	 */
	void enterReservedSymbols(HaskellParser.ReservedSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#reservedSymbols}.
	 * @param ctx the parse tree
	 */
	void exitReservedSymbols(HaskellParser.ReservedSymbolsContext ctx);
}