// Generated from ScalaOutput.g4 by ANTLR 4.5.2
package hamskill.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScalaOutputParser}.
 */
public interface ScalaOutputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#reformat}.
	 * @param ctx the parse tree
	 */
	void enterReformat(ScalaOutputParser.ReformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#reformat}.
	 * @param ctx the parse tree
	 */
	void exitReformat(ScalaOutputParser.ReformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#spaceSeparatedTerm}.
	 * @param ctx the parse tree
	 */
	void enterSpaceSeparatedTerm(ScalaOutputParser.SpaceSeparatedTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#spaceSeparatedTerm}.
	 * @param ctx the parse tree
	 */
	void exitSpaceSeparatedTerm(ScalaOutputParser.SpaceSeparatedTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#singleTerm}.
	 * @param ctx the parse tree
	 */
	void enterSingleTerm(ScalaOutputParser.SingleTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#singleTerm}.
	 * @param ctx the parse tree
	 */
	void exitSingleTerm(ScalaOutputParser.SingleTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#nonSpaceSeparatedTerm}.
	 * @param ctx the parse tree
	 */
	void enterNonSpaceSeparatedTerm(ScalaOutputParser.NonSpaceSeparatedTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#nonSpaceSeparatedTerm}.
	 * @param ctx the parse tree
	 */
	void exitNonSpaceSeparatedTerm(ScalaOutputParser.NonSpaceSeparatedTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#newLineTerm}.
	 * @param ctx the parse tree
	 */
	void enterNewLineTerm(ScalaOutputParser.NewLineTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#newLineTerm}.
	 * @param ctx the parse tree
	 */
	void exitNewLineTerm(ScalaOutputParser.NewLineTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#parenthesesTerm}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesTerm(ScalaOutputParser.ParenthesesTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#parenthesesTerm}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesTerm(ScalaOutputParser.ParenthesesTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#monadReformatter}.
	 * @param ctx the parse tree
	 */
	void enterMonadReformatter(ScalaOutputParser.MonadReformatterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#monadReformatter}.
	 * @param ctx the parse tree
	 */
	void exitMonadReformatter(ScalaOutputParser.MonadReformatterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#none}.
	 * @param ctx the parse tree
	 */
	void enterNone(ScalaOutputParser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#none}.
	 * @param ctx the parse tree
	 */
	void exitNone(ScalaOutputParser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#somePhrase}.
	 * @param ctx the parse tree
	 */
	void enterSomePhrase(ScalaOutputParser.SomePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#somePhrase}.
	 * @param ctx the parse tree
	 */
	void exitSomePhrase(ScalaOutputParser.SomePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ScalaOutputParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ScalaOutputParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#listTerm}.
	 * @param ctx the parse tree
	 */
	void enterListTerm(ScalaOutputParser.ListTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#listTerm}.
	 * @param ctx the parse tree
	 */
	void exitListTerm(ScalaOutputParser.ListTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaOutputParser#normalWord}.
	 * @param ctx the parse tree
	 */
	void enterNormalWord(ScalaOutputParser.NormalWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaOutputParser#normalWord}.
	 * @param ctx the parse tree
	 */
	void exitNormalWord(ScalaOutputParser.NormalWordContext ctx);
}