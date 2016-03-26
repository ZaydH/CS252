// Generated from Haskell.g4 by ANTLR 4.5.2
package hamskill.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_SQUARE_BRACKET=1, RIGHT_SQUARE_BRACKET=2, HEADER_COMMENT_OPEN=3, 
		HEADER_COMMENT_CLOSE=4, MODULE_STRING=5, WHERE_STRING=6, COMMA=7, FUNC_ARGS_OPEN_PAREN=8, 
		FUNC_ARGS_CLOSE_PAREN=9, HASKELL_FUNCTIONS_METHODS_IN_SCALA=10, QUOTATION_MARK=11, 
		LEFT_PAREN=12, RIGHT_PAREN=13, COLON=14, INLINE_COMMENT_SYMBOL=15, EQUAL_SIGN=16, 
		RIGHT_ASSOC_DOLLAR_SIGN=17, UNDERSCORE=18, BACKSLASH=19, IO=20, DO=21, 
		LET=22, CASE=23, OF=24, IF=25, THEN=26, ELSE=27, RETURN=28, OTHERWISE=29, 
		MAYBE=30, ARG_TYPE_SEPARATOR=31, MONAD_ARROW=32, TYPE_SEPARATOR=33, MAIN_FUNCTION=34, 
		INT_VAL=35, INT_OP=36, TYPE_NAME=37, HASKELL_FUNCTION_NAME=38, UNIT_TYPE=39, 
		BIND_OPERATOR=40, JUST=41, NOTHING=42, NEWLINE=43, NAME=44, WS=45;
	public static final int
		RULE_program = 0, RULE_codeBlock = 1, RULE_headerComment = 2, RULE_lineComment = 3, 
		RULE_generalComment = 4, RULE_commentWord = 5, RULE_moduleDefinition = 6, 
		RULE_moduleOpen = 7, RULE_moduleFunctionList = 8, RULE_moduleClose = 9, 
		RULE_moduleName = 10, RULE_moduleFunctionName = 11, RULE_func = 12, RULE_singleLinePartiallyAppliedFunction = 13, 
		RULE_partiallyAppliedFunctionName = 14, RULE_assignmentOperator = 15, 
		RULE_assignmentExpression = 16, RULE_mainFunction = 17, RULE_mainPrototype = 18, 
		RULE_mainHeader = 19, RULE_mainStatement = 20, RULE_mainWords = 21, RULE_parenMainWord = 22, 
		RULE_generalMainWord = 23, RULE_monadExpression = 24, RULE_immutableValueName = 25, 
		RULE_funcPrototype = 26, RULE_functionName = 27, RULE_typeSignature = 28, 
		RULE_typeMaybeMonad = 29, RULE_typeFunction = 30, RULE_typeFunctionSeparator = 31, 
		RULE_inputType = 32, RULE_returnType = 33, RULE_type = 34, RULE_primitiveTypeName = 35, 
		RULE_unitType = 36, RULE_funcbody = 37, RULE_funcStatement = 38, RULE_patternMatchingArguments = 39, 
		RULE_patternMatchingArgument = 40, RULE_generalMatchingArgument = 41, 
		RULE_patternMatchParentheses = 42, RULE_underScoreArgument = 43, RULE_justArgument = 44, 
		RULE_nothingArgument = 45, RULE_patternMatchingExpression = 46, RULE_patternMatchingTerm = 47, 
		RULE_ifStatementPattern = 48, RULE_ifStatementExpression = 49, RULE_ifTerm = 50, 
		RULE_thenTerm = 51, RULE_elseTerm = 52, RULE_prependTerm = 53, RULE_lambdaFunction = 54, 
		RULE_allLambdaArguments = 55, RULE_singleLamdaArgument = 56, RULE_underscoreLambdaArgument = 57, 
		RULE_lamdaArgumentsBodySeparator = 58, RULE_typedLamdaArgument = 59, RULE_lambdaBody = 60, 
		RULE_concatenatedList = 61, RULE_headList = 62, RULE_colonTerm = 63, RULE_underScoreTerm = 64, 
		RULE_tailList = 65, RULE_emptyList = 66, RULE_populatedList = 67, RULE_listElement = 68, 
		RULE_caseTerm = 69, RULE_caseStatementAndVariable = 70, RULE_caseStatement = 71, 
		RULE_caseVariable = 72, RULE_caseConditions = 73, RULE_caseGeneralStatement = 74, 
		RULE_caseValueCompare = 75, RULE_caseOtherwiseStatement = 76, RULE_caseImplementation = 77, 
		RULE_caseValueImplementationSeparator = 78, RULE_otherwiseTerm = 79, RULE_dollarSignTerm = 80, 
		RULE_functionToMethod = 81, RULE_haskellFunctionToScalaMethodName = 82, 
		RULE_functionToMethodDollarSign = 83, RULE_functionToMethodParen = 84, 
		RULE_functionToMethodTerm = 85, RULE_recursiveMain = 86, RULE_returnUnitType = 87, 
		RULE_patternMatchArray = 88, RULE_patternMatchParen = 89, RULE_generalPatternMatchingTerm = 90, 
		RULE_generalFunctionCall = 91, RULE_functionArgument = 92, RULE_functionCallFunctionName = 93, 
		RULE_nonHaskellReservedFunctionName = 94, RULE_haskellFunctionName = 95, 
		RULE_stringTerm = 96, RULE_word = 97, RULE_monadUnboxing = 98, RULE_monadVariableName = 99, 
		RULE_monadUnboxOperator = 100, RULE_monadEvaluationExpression = 101, RULE_justStatement = 102, 
		RULE_returnStatement = 103, RULE_bindExpression = 104, RULE_bindFunction = 105;
	public static final String[] ruleNames = {
		"program", "codeBlock", "headerComment", "lineComment", "generalComment", 
		"commentWord", "moduleDefinition", "moduleOpen", "moduleFunctionList", 
		"moduleClose", "moduleName", "moduleFunctionName", "func", "singleLinePartiallyAppliedFunction", 
		"partiallyAppliedFunctionName", "assignmentOperator", "assignmentExpression", 
		"mainFunction", "mainPrototype", "mainHeader", "mainStatement", "mainWords", 
		"parenMainWord", "generalMainWord", "monadExpression", "immutableValueName", 
		"funcPrototype", "functionName", "typeSignature", "typeMaybeMonad", "typeFunction", 
		"typeFunctionSeparator", "inputType", "returnType", "type", "primitiveTypeName", 
		"unitType", "funcbody", "funcStatement", "patternMatchingArguments", "patternMatchingArgument", 
		"generalMatchingArgument", "patternMatchParentheses", "underScoreArgument", 
		"justArgument", "nothingArgument", "patternMatchingExpression", "patternMatchingTerm", 
		"ifStatementPattern", "ifStatementExpression", "ifTerm", "thenTerm", "elseTerm", 
		"prependTerm", "lambdaFunction", "allLambdaArguments", "singleLamdaArgument", 
		"underscoreLambdaArgument", "lamdaArgumentsBodySeparator", "typedLamdaArgument", 
		"lambdaBody", "concatenatedList", "headList", "colonTerm", "underScoreTerm", 
		"tailList", "emptyList", "populatedList", "listElement", "caseTerm", "caseStatementAndVariable", 
		"caseStatement", "caseVariable", "caseConditions", "caseGeneralStatement", 
		"caseValueCompare", "caseOtherwiseStatement", "caseImplementation", "caseValueImplementationSeparator", 
		"otherwiseTerm", "dollarSignTerm", "functionToMethod", "haskellFunctionToScalaMethodName", 
		"functionToMethodDollarSign", "functionToMethodParen", "functionToMethodTerm", 
		"recursiveMain", "returnUnitType", "patternMatchArray", "patternMatchParen", 
		"generalPatternMatchingTerm", "generalFunctionCall", "functionArgument", 
		"functionCallFunctionName", "nonHaskellReservedFunctionName", "haskellFunctionName", 
		"stringTerm", "word", "monadUnboxing", "monadVariableName", "monadUnboxOperator", 
		"monadEvaluationExpression", "justStatement", "returnStatement", "bindExpression", 
		"bindFunction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{-'", "'-}'", "'module'", "'where'", "','", "'((('", 
		"')))'", null, "'\"'", "'('", "')'", "':'", "'--'", "'='", "'$'", "'_'", 
		"'\\'", "'IO'", "'do'", "'let'", "'case'", "'of'", "'if'", "'then'", "'else'", 
		"'return'", "'otherwise'", "'Maybe'", "'::'", "'<-'", "'->'", "'main'", 
		null, null, null, null, "'()'", "'>>='", "'Just'", "'Nothing'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "QUOTATION_MARK", 
		"LEFT_PAREN", "RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", 
		"RIGHT_ASSOC_DOLLAR_SIGN", "UNDERSCORE", "BACKSLASH", "IO", "DO", "LET", 
		"CASE", "OF", "IF", "THEN", "ELSE", "RETURN", "OTHERWISE", "MAYBE", "ARG_TYPE_SEPARATOR", 
		"MONAD_ARROW", "TYPE_SEPARATOR", "MAIN_FUNCTION", "INT_VAL", "INT_OP", 
		"TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", "BIND_OPERATOR", "JUST", 
		"NOTHING", "NEWLINE", "NAME", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderCommentContext headerComment() {
			return getRuleContext(HeaderCommentContext.class,0);
		}
		public ModuleDefinitionContext moduleDefinition() {
			return getRuleContext(ModuleDefinitionContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if (_la==HEADER_COMMENT_OPEN) {
				{
				setState(212);
				headerComment();
				}
			}

			setState(216);
			_la = _input.LA(1);
			if (_la==MODULE_STRING) {
				{
				setState(215);
				moduleDefinition();
				}
			}

			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(218);
						match(NEWLINE);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(224);
					codeBlock();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(230);
				match(NEWLINE);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LineCommentContext lineComment() {
			return getRuleContext(LineCommentContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeBlock);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case MAIN_FUNCTION:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				func();
				}
				break;
			case INLINE_COMMENT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				lineComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderCommentContext extends ParserRuleContext {
		public TerminalNode HEADER_COMMENT_OPEN() { return getToken(HaskellParser.HEADER_COMMENT_OPEN, 0); }
		public TerminalNode HEADER_COMMENT_CLOSE() { return getToken(HaskellParser.HEADER_COMMENT_CLOSE, 0); }
		public List<TerminalNode> NAME() { return getTokens(HaskellParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HaskellParser.NAME, i);
		}
		public HeaderCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterHeaderComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitHeaderComment(this);
		}
	}

	public final HeaderCommentContext headerComment() throws RecognitionException {
		HeaderCommentContext _localctx = new HeaderCommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headerComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(HEADER_COMMENT_OPEN);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(241);
				match(NAME);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(HEADER_COMMENT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineCommentContext extends ParserRuleContext {
		public GeneralCommentContext generalComment() {
			return getRuleContext(GeneralCommentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public LineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLineComment(this);
		}
	}

	public final LineCommentContext lineComment() throws RecognitionException {
		LineCommentContext _localctx = new LineCommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			generalComment();
			setState(250);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralCommentContext extends ParserRuleContext {
		public TerminalNode INLINE_COMMENT_SYMBOL() { return getToken(HaskellParser.INLINE_COMMENT_SYMBOL, 0); }
		public List<CommentWordContext> commentWord() {
			return getRuleContexts(CommentWordContext.class);
		}
		public CommentWordContext commentWord(int i) {
			return getRuleContext(CommentWordContext.class,i);
		}
		public GeneralCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGeneralComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGeneralComment(this);
		}
	}

	public final GeneralCommentContext generalComment() throws RecognitionException {
		GeneralCommentContext _localctx = new GeneralCommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_generalComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(INLINE_COMMENT_SYMBOL);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(253);
				commentWord();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentWordContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public CommentWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCommentWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCommentWord(this);
		}
	}

	public final CommentWordContext commentWord() throws RecognitionException {
		CommentWordContext _localctx = new CommentWordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commentWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDefinitionContext extends ParserRuleContext {
		public ModuleOpenContext moduleOpen() {
			return getRuleContext(ModuleOpenContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public ModuleFunctionListContext moduleFunctionList() {
			return getRuleContext(ModuleFunctionListContext.class,0);
		}
		public ModuleCloseContext moduleClose() {
			return getRuleContext(ModuleCloseContext.class,0);
		}
		public ModuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterModuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitModuleDefinition(this);
		}
	}

	public final ModuleDefinitionContext moduleDefinition() throws RecognitionException {
		ModuleDefinitionContext _localctx = new ModuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moduleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			moduleOpen();
			setState(262);
			moduleName();
			setState(263);
			moduleFunctionList();
			setState(264);
			moduleClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleOpenContext extends ParserRuleContext {
		public TerminalNode MODULE_STRING() { return getToken(HaskellParser.MODULE_STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public ModuleOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterModuleOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitModuleOpen(this);
		}
	}

	public final ModuleOpenContext moduleOpen() throws RecognitionException {
		ModuleOpenContext _localctx = new ModuleOpenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(MODULE_STRING);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(267);
				match(NEWLINE);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleFunctionListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public List<ModuleFunctionNameContext> moduleFunctionName() {
			return getRuleContexts(ModuleFunctionNameContext.class);
		}
		public ModuleFunctionNameContext moduleFunctionName(int i) {
			return getRuleContext(ModuleFunctionNameContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HaskellParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HaskellParser.COMMA, i);
		}
		public ModuleFunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleFunctionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterModuleFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitModuleFunctionList(this);
		}
	}

	public final ModuleFunctionListContext moduleFunctionList() throws RecognitionException {
		ModuleFunctionListContext _localctx = new ModuleFunctionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleFunctionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(273);
				match(NEWLINE);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(LEFT_PAREN);
			setState(280);
			moduleFunctionName();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				moduleFunctionName();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(RIGHT_PAREN);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(NEWLINE);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleCloseContext extends ParserRuleContext {
		public TerminalNode WHERE_STRING() { return getToken(HaskellParser.WHERE_STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public ModuleCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterModuleClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitModuleClose(this);
		}
	}

	public final ModuleCloseContext moduleClose() throws RecognitionException {
		ModuleCloseContext _localctx = new ModuleCloseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(295);
				match(NEWLINE);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(WHERE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitModuleName(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moduleName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(NAME);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					match(NEWLINE);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleFunctionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public ModuleFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterModuleFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitModuleFunctionName(this);
		}
	}

	public final ModuleFunctionNameContext moduleFunctionName() throws RecognitionException {
		ModuleFunctionNameContext _localctx = new ModuleFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_moduleFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(310);
				match(NEWLINE);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(NAME);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(317);
				match(NEWLINE);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncPrototypeContext funcPrototype() {
			return getRuleContext(FuncPrototypeContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public SingleLinePartiallyAppliedFunctionContext singleLinePartiallyAppliedFunction() {
			return getRuleContext(SingleLinePartiallyAppliedFunctionContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func);
		try {
			int _alt;
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				funcPrototype();
				setState(324);
				funcbody();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(NEWLINE);
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				mainFunction();
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(NEWLINE);
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				singleLinePartiallyAppliedFunction();
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
						match(NEWLINE);
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLinePartiallyAppliedFunctionContext extends ParserRuleContext {
		public PartiallyAppliedFunctionNameContext partiallyAppliedFunctionName() {
			return getRuleContext(PartiallyAppliedFunctionNameContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public SingleLinePartiallyAppliedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLinePartiallyAppliedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterSingleLinePartiallyAppliedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitSingleLinePartiallyAppliedFunction(this);
		}
	}

	public final SingleLinePartiallyAppliedFunctionContext singleLinePartiallyAppliedFunction() throws RecognitionException {
		SingleLinePartiallyAppliedFunctionContext _localctx = new SingleLinePartiallyAppliedFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_singleLinePartiallyAppliedFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			partiallyAppliedFunctionName();
			setState(348);
			assignmentOperator();
			setState(349);
			assignmentExpression();
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(350);
					match(NEWLINE);
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartiallyAppliedFunctionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public PartiallyAppliedFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partiallyAppliedFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPartiallyAppliedFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPartiallyAppliedFunctionName(this);
		}
	}

	public final PartiallyAppliedFunctionNameContext partiallyAppliedFunctionName() throws RecognitionException {
		PartiallyAppliedFunctionNameContext _localctx = new PartiallyAppliedFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partiallyAppliedFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_SIGN() { return getToken(HaskellParser.EQUAL_SIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(EQUAL_SIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionContext extends ParserRuleContext {
		public MainPrototypeContext mainPrototype() {
			return getRuleContext(MainPrototypeContext.class,0);
		}
		public MainHeaderContext mainHeader() {
			return getRuleContext(MainHeaderContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public List<MainStatementContext> mainStatement() {
			return getRuleContexts(MainStatementContext.class);
		}
		public MainStatementContext mainStatement(int i) {
			return getRuleContext(MainStatementContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMainFunction(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			mainPrototype();
			setState(364);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(363);
				match(NEWLINE);
				}
			}

			setState(366);
			mainHeader();
			setState(368);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(367);
				match(NEWLINE);
				}
			}

			setState(371); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(370);
					mainStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(373); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(375);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainPrototypeContext extends ParserRuleContext {
		public TerminalNode MAIN_FUNCTION() { return getToken(HaskellParser.MAIN_FUNCTION, 0); }
		public TerminalNode ARG_TYPE_SEPARATOR() { return getToken(HaskellParser.ARG_TYPE_SEPARATOR, 0); }
		public TerminalNode IO() { return getToken(HaskellParser.IO, 0); }
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public MainPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMainPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMainPrototype(this);
		}
	}

	public final MainPrototypeContext mainPrototype() throws RecognitionException {
		MainPrototypeContext _localctx = new MainPrototypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mainPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(MAIN_FUNCTION);
			setState(379);
			match(ARG_TYPE_SEPARATOR);
			setState(380);
			match(IO);
			setState(381);
			unitType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainHeaderContext extends ParserRuleContext {
		public TerminalNode MAIN_FUNCTION() { return getToken(HaskellParser.MAIN_FUNCTION, 0); }
		public TerminalNode EQUAL_SIGN() { return getToken(HaskellParser.EQUAL_SIGN, 0); }
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public MainHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMainHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMainHeader(this);
		}
	}

	public final MainHeaderContext mainHeader() throws RecognitionException {
		MainHeaderContext _localctx = new MainHeaderContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mainHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(MAIN_FUNCTION);
			setState(384);
			match(EQUAL_SIGN);
			setState(386);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(385);
				match(DO);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainStatementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public List<MonadExpressionContext> monadExpression() {
			return getRuleContexts(MonadExpressionContext.class);
		}
		public MonadExpressionContext monadExpression(int i) {
			return getRuleContext(MonadExpressionContext.class,i);
		}
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMainStatement(this);
		}
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mainStatement);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					monadExpression();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(393);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				patternMatchingExpression();
				setState(396);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainWordsContext extends ParserRuleContext {
		public HaskellFunctionNameContext haskellFunctionName() {
			return getRuleContext(HaskellFunctionNameContext.class,0);
		}
		public ParenMainWordContext parenMainWord() {
			return getRuleContext(ParenMainWordContext.class,0);
		}
		public GeneralMainWordContext generalMainWord() {
			return getRuleContext(GeneralMainWordContext.class,0);
		}
		public MainWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainWords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMainWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMainWords(this);
		}
	}

	public final MainWordsContext mainWords() throws RecognitionException {
		MainWordsContext _localctx = new MainWordsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mainWords);
		try {
			setState(403);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				haskellFunctionName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				parenMainWord();
				}
				break;
			case INT_VAL:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				generalMainWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenMainWordContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public List<MainWordsContext> mainWords() {
			return getRuleContexts(MainWordsContext.class);
		}
		public MainWordsContext mainWords(int i) {
			return getRuleContext(MainWordsContext.class,i);
		}
		public ParenMainWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenMainWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterParenMainWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitParenMainWord(this);
		}
	}

	public final ParenMainWordContext parenMainWord() throws RecognitionException {
		ParenMainWordContext _localctx = new ParenMainWordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parenMainWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LEFT_PAREN);
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(406);
				mainWords();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << INT_VAL) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0) );
			setState(411);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralMainWordContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public TerminalNode INT_VAL() { return getToken(HaskellParser.INT_VAL, 0); }
		public GeneralMainWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalMainWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGeneralMainWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGeneralMainWord(this);
		}
	}

	public final GeneralMainWordContext generalMainWord() throws RecognitionException {
		GeneralMainWordContext _localctx = new GeneralMainWordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_generalMainWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==INT_VAL || _la==NAME) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonadExpressionContext extends ParserRuleContext {
		public ImmutableValueNameContext immutableValueName() {
			return getRuleContext(ImmutableValueNameContext.class,0);
		}
		public TerminalNode MONAD_ARROW() { return getToken(HaskellParser.MONAD_ARROW, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public MonadExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMonadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMonadExpression(this);
		}
	}

	public final MonadExpressionContext monadExpression() throws RecognitionException {
		MonadExpressionContext _localctx = new MonadExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_monadExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			immutableValueName();
			setState(416);
			match(MONAD_ARROW);
			setState(417);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableValueNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public ImmutableValueNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutableValueName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterImmutableValueName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitImmutableValueName(this);
		}
	}

	public final ImmutableValueNameContext immutableValueName() throws RecognitionException {
		ImmutableValueNameContext _localctx = new ImmutableValueNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_immutableValueName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncPrototypeContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode ARG_TYPE_SEPARATOR() { return getToken(HaskellParser.ARG_TYPE_SEPARATOR, 0); }
		public TypeSignatureContext typeSignature() {
			return getRuleContext(TypeSignatureContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public FuncPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFuncPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFuncPrototype(this);
		}
	}

	public final FuncPrototypeContext funcPrototype() throws RecognitionException {
		FuncPrototypeContext _localctx = new FuncPrototypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			functionName();
			setState(422);
			match(ARG_TYPE_SEPARATOR);
			setState(423);
			typeSignature();
			setState(424);
			returnType();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(425);
				match(NEWLINE);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSignatureContext extends ParserRuleContext {
		public List<InputTypeContext> inputType() {
			return getRuleContexts(InputTypeContext.class);
		}
		public InputTypeContext inputType(int i) {
			return getRuleContext(InputTypeContext.class,i);
		}
		public List<TerminalNode> TYPE_SEPARATOR() { return getTokens(HaskellParser.TYPE_SEPARATOR); }
		public TerminalNode TYPE_SEPARATOR(int i) {
			return getToken(HaskellParser.TYPE_SEPARATOR, i);
		}
		public TypeSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypeSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypeSignature(this);
		}
	}

	public final TypeSignatureContext typeSignature() throws RecognitionException {
		TypeSignatureContext _localctx = new TypeSignatureContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeSignature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					inputType();
					setState(434);
					match(TYPE_SEPARATOR);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMaybeMonadContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public TerminalNode MAYBE() { return getToken(HaskellParser.MAYBE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public TypeMaybeMonadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMaybeMonad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypeMaybeMonad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypeMaybeMonad(this);
		}
	}

	public final TypeMaybeMonadContext typeMaybeMonad() throws RecognitionException {
		TypeMaybeMonadContext _localctx = new TypeMaybeMonadContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeMaybeMonad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LEFT_PAREN);
			setState(442);
			match(MAYBE);
			setState(443);
			type();
			setState(444);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFunctionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public List<TypeFunctionSeparatorContext> typeFunctionSeparator() {
			return getRuleContexts(TypeFunctionSeparatorContext.class);
		}
		public TypeFunctionSeparatorContext typeFunctionSeparator(int i) {
			return getRuleContext(TypeFunctionSeparatorContext.class,i);
		}
		public TypeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypeFunction(this);
		}
	}

	public final TypeFunctionContext typeFunction() throws RecognitionException {
		TypeFunctionContext _localctx = new TypeFunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LEFT_PAREN);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					type();
					setState(448);
					typeFunctionSeparator();
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(455);
			type();
			setState(456);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFunctionSeparatorContext extends ParserRuleContext {
		public TerminalNode TYPE_SEPARATOR() { return getToken(HaskellParser.TYPE_SEPARATOR, 0); }
		public TypeFunctionSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunctionSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypeFunctionSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypeFunctionSeparator(this);
		}
	}

	public final TypeFunctionSeparatorContext typeFunctionSeparator() throws RecognitionException {
		TypeFunctionSeparatorContext _localctx = new TypeFunctionSeparatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeFunctionSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(TYPE_SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InputTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterInputType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitInputType(this);
		}
	}

	public final InputTypeContext inputType() throws RecognitionException {
		InputTypeContext _localctx = new InputTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inputType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeMaybeMonadContext typeMaybeMonad() {
			return getRuleContext(TypeMaybeMonadContext.class,0);
		}
		public PrimitiveTypeNameContext primitiveTypeName() {
			return getRuleContext(PrimitiveTypeNameContext.class,0);
		}
		public TypeFunctionContext typeFunction() {
			return getRuleContext(TypeFunctionContext.class,0);
		}
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				typeMaybeMonad();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				primitiveTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				typeFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				unitType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeNameContext extends ParserRuleContext {
		public TerminalNode TYPE_NAME() { return getToken(HaskellParser.TYPE_NAME, 0); }
		public PrimitiveTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPrimitiveTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPrimitiveTypeName(this);
		}
	}

	public final PrimitiveTypeNameContext primitiveTypeName() throws RecognitionException {
		PrimitiveTypeNameContext _localctx = new PrimitiveTypeNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primitiveTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(TYPE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitTypeContext extends ParserRuleContext {
		public TerminalNode UNIT_TYPE() { return getToken(HaskellParser.UNIT_TYPE, 0); }
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitUnitType(this);
		}
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(UNIT_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncbodyContext extends ParserRuleContext {
		public List<FuncStatementContext> funcStatement() {
			return getRuleContexts(FuncStatementContext.class);
		}
		public FuncStatementContext funcStatement(int i) {
			return getRuleContext(FuncStatementContext.class,i);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFuncbody(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_funcbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					funcStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(477); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncStatementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public PatternMatchingArgumentsContext patternMatchingArguments() {
			return getRuleContext(PatternMatchingArgumentsContext.class,0);
		}
		public TerminalNode EQUAL_SIGN() { return getToken(HaskellParser.EQUAL_SIGN, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public FuncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFuncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFuncStatement(this);
		}
	}

	public final FuncStatementContext funcStatement() throws RecognitionException {
		FuncStatementContext _localctx = new FuncStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_funcStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(NAME);
			setState(480);
			patternMatchingArguments();
			setState(481);
			match(EQUAL_SIGN);
			setState(482);
			patternMatchingExpression();
			setState(483);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchingArgumentsContext extends ParserRuleContext {
		public List<PatternMatchingArgumentContext> patternMatchingArgument() {
			return getRuleContexts(PatternMatchingArgumentContext.class);
		}
		public PatternMatchingArgumentContext patternMatchingArgument(int i) {
			return getRuleContext(PatternMatchingArgumentContext.class,i);
		}
		public PatternMatchingArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchingArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchingArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchingArguments(this);
		}
	}

	public final PatternMatchingArgumentsContext patternMatchingArguments() throws RecognitionException {
		PatternMatchingArgumentsContext _localctx = new PatternMatchingArgumentsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_patternMatchingArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << JUST) | (1L << NOTHING) | (1L << NAME))) != 0)) {
				{
				{
				setState(485);
				patternMatchingArgument();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchingArgumentContext extends ParserRuleContext {
		public PatternMatchParenthesesContext patternMatchParentheses() {
			return getRuleContext(PatternMatchParenthesesContext.class,0);
		}
		public ConcatenatedListContext concatenatedList() {
			return getRuleContext(ConcatenatedListContext.class,0);
		}
		public EmptyListContext emptyList() {
			return getRuleContext(EmptyListContext.class,0);
		}
		public UnderScoreTermContext underScoreTerm() {
			return getRuleContext(UnderScoreTermContext.class,0);
		}
		public JustArgumentContext justArgument() {
			return getRuleContext(JustArgumentContext.class,0);
		}
		public NothingArgumentContext nothingArgument() {
			return getRuleContext(NothingArgumentContext.class,0);
		}
		public GeneralMatchingArgumentContext generalMatchingArgument() {
			return getRuleContext(GeneralMatchingArgumentContext.class,0);
		}
		public PatternMatchingArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchingArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchingArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchingArgument(this);
		}
	}

	public final PatternMatchingArgumentContext patternMatchingArgument() throws RecognitionException {
		PatternMatchingArgumentContext _localctx = new PatternMatchingArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_patternMatchingArgument);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				patternMatchParentheses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				concatenatedList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				emptyList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				underScoreTerm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				justArgument();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(496);
				nothingArgument();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(497);
				generalMatchingArgument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralMatchingArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public GeneralMatchingArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalMatchingArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGeneralMatchingArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGeneralMatchingArgument(this);
		}
	}

	public final GeneralMatchingArgumentContext generalMatchingArgument() throws RecognitionException {
		GeneralMatchingArgumentContext _localctx = new GeneralMatchingArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_generalMatchingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchParenthesesContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public List<PatternMatchingArgumentContext> patternMatchingArgument() {
			return getRuleContexts(PatternMatchingArgumentContext.class);
		}
		public PatternMatchingArgumentContext patternMatchingArgument(int i) {
			return getRuleContext(PatternMatchingArgumentContext.class,i);
		}
		public PatternMatchParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchParentheses(this);
		}
	}

	public final PatternMatchParenthesesContext patternMatchParentheses() throws RecognitionException {
		PatternMatchParenthesesContext _localctx = new PatternMatchParenthesesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_patternMatchParentheses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(LEFT_PAREN);
			setState(504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				patternMatchingArgument();
				}
				}
				setState(506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << JUST) | (1L << NOTHING) | (1L << NAME))) != 0) );
			setState(508);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnderScoreArgumentContext extends ParserRuleContext {
		public UnderScoreTermContext underScoreTerm() {
			return getRuleContext(UnderScoreTermContext.class,0);
		}
		public UnderScoreArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underScoreArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterUnderScoreArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitUnderScoreArgument(this);
		}
	}

	public final UnderScoreArgumentContext underScoreArgument() throws RecognitionException {
		UnderScoreArgumentContext _localctx = new UnderScoreArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_underScoreArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			underScoreTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JustArgumentContext extends ParserRuleContext {
		public TerminalNode JUST() { return getToken(HaskellParser.JUST, 0); }
		public PatternMatchingArgumentContext patternMatchingArgument() {
			return getRuleContext(PatternMatchingArgumentContext.class,0);
		}
		public JustArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterJustArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitJustArgument(this);
		}
	}

	public final JustArgumentContext justArgument() throws RecognitionException {
		JustArgumentContext _localctx = new JustArgumentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_justArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(JUST);
			setState(513);
			patternMatchingArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NothingArgumentContext extends ParserRuleContext {
		public TerminalNode NOTHING() { return getToken(HaskellParser.NOTHING, 0); }
		public NothingArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nothingArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterNothingArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitNothingArgument(this);
		}
	}

	public final NothingArgumentContext nothingArgument() throws RecognitionException {
		NothingArgumentContext _localctx = new NothingArgumentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nothingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(NOTHING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchingExpressionContext extends ParserRuleContext {
		public List<PatternMatchingTermContext> patternMatchingTerm() {
			return getRuleContexts(PatternMatchingTermContext.class);
		}
		public PatternMatchingTermContext patternMatchingTerm(int i) {
			return getRuleContext(PatternMatchingTermContext.class,i);
		}
		public PatternMatchingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchingExpression(this);
		}
	}

	public final PatternMatchingExpressionContext patternMatchingExpression() throws RecognitionException {
		PatternMatchingExpressionContext _localctx = new PatternMatchingExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_patternMatchingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(517);
					patternMatchingTerm();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(520); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchingTermContext extends ParserRuleContext {
		public DollarSignTermContext dollarSignTerm() {
			return getRuleContext(DollarSignTermContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public BindExpressionContext bindExpression() {
			return getRuleContext(BindExpressionContext.class,0);
		}
		public GeneralFunctionCallContext generalFunctionCall() {
			return getRuleContext(GeneralFunctionCallContext.class,0);
		}
		public PatternMatchParenContext patternMatchParen() {
			return getRuleContext(PatternMatchParenContext.class,0);
		}
		public FunctionToMethodContext functionToMethod() {
			return getRuleContext(FunctionToMethodContext.class,0);
		}
		public HaskellFunctionNameContext haskellFunctionName() {
			return getRuleContext(HaskellFunctionNameContext.class,0);
		}
		public PrependTermContext prependTerm() {
			return getRuleContext(PrependTermContext.class,0);
		}
		public GeneralPatternMatchingTermContext generalPatternMatchingTerm() {
			return getRuleContext(GeneralPatternMatchingTermContext.class,0);
		}
		public PatternMatchArrayContext patternMatchArray() {
			return getRuleContext(PatternMatchArrayContext.class,0);
		}
		public IfStatementPatternContext ifStatementPattern() {
			return getRuleContext(IfStatementPatternContext.class,0);
		}
		public RecursiveMainContext recursiveMain() {
			return getRuleContext(RecursiveMainContext.class,0);
		}
		public ReturnUnitTypeContext returnUnitType() {
			return getRuleContext(ReturnUnitTypeContext.class,0);
		}
		public ConcatenatedListContext concatenatedList() {
			return getRuleContext(ConcatenatedListContext.class,0);
		}
		public EmptyListContext emptyList() {
			return getRuleContext(EmptyListContext.class,0);
		}
		public PopulatedListContext populatedList() {
			return getRuleContext(PopulatedListContext.class,0);
		}
		public CaseTermContext caseTerm() {
			return getRuleContext(CaseTermContext.class,0);
		}
		public StringTermContext stringTerm() {
			return getRuleContext(StringTermContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MonadUnboxOperatorContext monadUnboxOperator() {
			return getRuleContext(MonadUnboxOperatorContext.class,0);
		}
		public JustStatementContext justStatement() {
			return getRuleContext(JustStatementContext.class,0);
		}
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public PatternMatchingTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchingTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchingTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchingTerm(this);
		}
	}

	public final PatternMatchingTermContext patternMatchingTerm() throws RecognitionException {
		PatternMatchingTermContext _localctx = new PatternMatchingTermContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_patternMatchingTerm);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				dollarSignTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				lambdaFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				bindExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				generalFunctionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				patternMatchParen();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(527);
				functionToMethod();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(528);
				haskellFunctionName();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(529);
				prependTerm();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(530);
				generalPatternMatchingTerm();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(531);
				patternMatchArray();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(532);
				ifStatementPattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(533);
				recursiveMain();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(534);
				returnUnitType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(535);
				concatenatedList();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(536);
				emptyList();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(537);
				populatedList();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(538);
				caseTerm();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(539);
				stringTerm();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(540);
				returnStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(541);
				monadUnboxOperator();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(542);
				justStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(543);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementPatternContext extends ParserRuleContext {
		public IfTermContext ifTerm() {
			return getRuleContext(IfTermContext.class,0);
		}
		public List<IfStatementExpressionContext> ifStatementExpression() {
			return getRuleContexts(IfStatementExpressionContext.class);
		}
		public IfStatementExpressionContext ifStatementExpression(int i) {
			return getRuleContext(IfStatementExpressionContext.class,i);
		}
		public ThenTermContext thenTerm() {
			return getRuleContext(ThenTermContext.class,0);
		}
		public ElseTermContext elseTerm() {
			return getRuleContext(ElseTermContext.class,0);
		}
		public IfStatementPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIfStatementPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIfStatementPattern(this);
		}
	}

	public final IfStatementPatternContext ifStatementPattern() throws RecognitionException {
		IfStatementPatternContext _localctx = new IfStatementPatternContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ifStatementPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			ifTerm();
			setState(547);
			ifStatementExpression();
			setState(548);
			thenTerm();
			setState(549);
			ifStatementExpression();
			setState(550);
			elseTerm();
			setState(551);
			ifStatementExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public IfStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIfStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIfStatementExpression(this);
		}
	}

	public final IfStatementExpressionContext ifStatementExpression() throws RecognitionException {
		IfStatementExpressionContext _localctx = new IfStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifStatementExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(553);
				match(NEWLINE);
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			match(LEFT_PAREN);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(560);
				match(NEWLINE);
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			patternMatchingExpression();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(567);
				match(NEWLINE);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(RIGHT_PAREN);
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					match(NEWLINE);
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfTermContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public IfTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIfTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIfTerm(this);
		}
	}

	public final IfTermContext ifTerm() throws RecognitionException {
		IfTermContext _localctx = new IfTermContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ifTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenTermContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public ThenTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterThenTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitThenTerm(this);
		}
	}

	public final ThenTermContext thenTerm() throws RecognitionException {
		ThenTermContext _localctx = new ThenTermContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_thenTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(THEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseTermContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public ElseTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterElseTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitElseTerm(this);
		}
	}

	public final ElseTermContext elseTerm() throws RecognitionException {
		ElseTermContext _localctx = new ElseTermContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrependTermContext extends ParserRuleContext {
		public List<PatternMatchParenContext> patternMatchParen() {
			return getRuleContexts(PatternMatchParenContext.class);
		}
		public PatternMatchParenContext patternMatchParen(int i) {
			return getRuleContext(PatternMatchParenContext.class,i);
		}
		public ColonTermContext colonTerm() {
			return getRuleContext(ColonTermContext.class,0);
		}
		public PrependTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prependTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPrependTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPrependTerm(this);
		}
	}

	public final PrependTermContext prependTerm() throws RecognitionException {
		PrependTermContext _localctx = new PrependTermContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_prependTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			patternMatchParen();
			setState(587);
			colonTerm();
			setState(588);
			patternMatchParen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public TerminalNode BACKSLASH() { return getToken(HaskellParser.BACKSLASH, 0); }
		public AllLambdaArgumentsContext allLambdaArguments() {
			return getRuleContext(AllLambdaArgumentsContext.class,0);
		}
		public LamdaArgumentsBodySeparatorContext lamdaArgumentsBodySeparator() {
			return getRuleContext(LamdaArgumentsBodySeparatorContext.class,0);
		}
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLambdaFunction(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(LEFT_PAREN);
			setState(591);
			match(BACKSLASH);
			setState(592);
			allLambdaArguments();
			setState(593);
			lamdaArgumentsBodySeparator();
			setState(594);
			patternMatchingExpression();
			setState(595);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllLambdaArgumentsContext extends ParserRuleContext {
		public List<SingleLamdaArgumentContext> singleLamdaArgument() {
			return getRuleContexts(SingleLamdaArgumentContext.class);
		}
		public SingleLamdaArgumentContext singleLamdaArgument(int i) {
			return getRuleContext(SingleLamdaArgumentContext.class,i);
		}
		public AllLambdaArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allLambdaArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAllLambdaArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAllLambdaArguments(this);
		}
	}

	public final AllLambdaArgumentsContext allLambdaArguments() throws RecognitionException {
		AllLambdaArgumentsContext _localctx = new AllLambdaArgumentsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_allLambdaArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(597);
				singleLamdaArgument();
				}
				}
				setState(600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNDERSCORE || _la==NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLamdaArgumentContext extends ParserRuleContext {
		public UnderscoreLambdaArgumentContext underscoreLambdaArgument() {
			return getRuleContext(UnderscoreLambdaArgumentContext.class,0);
		}
		public TypedLamdaArgumentContext typedLamdaArgument() {
			return getRuleContext(TypedLamdaArgumentContext.class,0);
		}
		public SingleLamdaArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLamdaArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterSingleLamdaArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitSingleLamdaArgument(this);
		}
	}

	public final SingleLamdaArgumentContext singleLamdaArgument() throws RecognitionException {
		SingleLamdaArgumentContext _localctx = new SingleLamdaArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_singleLamdaArgument);
		try {
			setState(604);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				underscoreLambdaArgument();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				typedLamdaArgument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnderscoreLambdaArgumentContext extends ParserRuleContext {
		public UnderScoreTermContext underScoreTerm() {
			return getRuleContext(UnderScoreTermContext.class,0);
		}
		public UnderscoreLambdaArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underscoreLambdaArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterUnderscoreLambdaArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitUnderscoreLambdaArgument(this);
		}
	}

	public final UnderscoreLambdaArgumentContext underscoreLambdaArgument() throws RecognitionException {
		UnderscoreLambdaArgumentContext _localctx = new UnderscoreLambdaArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_underscoreLambdaArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			underScoreTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LamdaArgumentsBodySeparatorContext extends ParserRuleContext {
		public TerminalNode TYPE_SEPARATOR() { return getToken(HaskellParser.TYPE_SEPARATOR, 0); }
		public LamdaArgumentsBodySeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lamdaArgumentsBodySeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLamdaArgumentsBodySeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLamdaArgumentsBodySeparator(this);
		}
	}

	public final LamdaArgumentsBodySeparatorContext lamdaArgumentsBodySeparator() throws RecognitionException {
		LamdaArgumentsBodySeparatorContext _localctx = new LamdaArgumentsBodySeparatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lamdaArgumentsBodySeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(TYPE_SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedLamdaArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public TypedLamdaArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedLamdaArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypedLamdaArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypedLamdaArgument(this);
		}
	}

	public final TypedLamdaArgumentContext typedLamdaArgument() throws RecognitionException {
		TypedLamdaArgumentContext _localctx = new TypedLamdaArgumentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_typedLamdaArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatenatedListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public HeadListContext headList() {
			return getRuleContext(HeadListContext.class,0);
		}
		public ColonTermContext colonTerm() {
			return getRuleContext(ColonTermContext.class,0);
		}
		public TailListContext tailList() {
			return getRuleContext(TailListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public ConcatenatedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenatedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterConcatenatedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitConcatenatedList(this);
		}
	}

	public final ConcatenatedListContext concatenatedList() throws RecognitionException {
		ConcatenatedListContext _localctx = new ConcatenatedListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_concatenatedList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LEFT_PAREN);
			setState(615);
			headList();
			setState(616);
			colonTerm();
			setState(617);
			tailList();
			setState(618);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadListContext extends ParserRuleContext {
		public PatternMatchingTermContext patternMatchingTerm() {
			return getRuleContext(PatternMatchingTermContext.class,0);
		}
		public HeadListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterHeadList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitHeadList(this);
		}
	}

	public final HeadListContext headList() throws RecognitionException {
		HeadListContext _localctx = new HeadListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_headList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			patternMatchingTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColonTermContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(HaskellParser.COLON, 0); }
		public ColonTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterColonTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitColonTerm(this);
		}
	}

	public final ColonTermContext colonTerm() throws RecognitionException {
		ColonTermContext _localctx = new ColonTermContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_colonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnderScoreTermContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(HaskellParser.UNDERSCORE, 0); }
		public UnderScoreTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underScoreTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterUnderScoreTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitUnderScoreTerm(this);
		}
	}

	public final UnderScoreTermContext underScoreTerm() throws RecognitionException {
		UnderScoreTermContext _localctx = new UnderScoreTermContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_underScoreTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailListContext extends ParserRuleContext {
		public PatternMatchingTermContext patternMatchingTerm() {
			return getRuleContext(PatternMatchingTermContext.class,0);
		}
		public TailListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tailList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTailList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTailList(this);
		}
	}

	public final TailListContext tailList() throws RecognitionException {
		TailListContext _localctx = new TailListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tailList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			patternMatchingTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyListContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(HaskellParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(HaskellParser.RIGHT_SQUARE_BRACKET, 0); }
		public EmptyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterEmptyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitEmptyList(this);
		}
	}

	public final EmptyListContext emptyList() throws RecognitionException {
		EmptyListContext _localctx = new EmptyListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(LEFT_SQUARE_BRACKET);
			setState(629);
			match(RIGHT_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopulatedListContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(HaskellParser.LEFT_SQUARE_BRACKET, 0); }
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(HaskellParser.RIGHT_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HaskellParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HaskellParser.COMMA, i);
		}
		public PopulatedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_populatedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPopulatedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPopulatedList(this);
		}
	}

	public final PopulatedListContext populatedList() throws RecognitionException {
		PopulatedListContext _localctx = new PopulatedListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_populatedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LEFT_SQUARE_BRACKET);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(632);
					listElement();
					setState(633);
					match(COMMA);
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(640);
			listElement();
			setState(641);
			match(RIGHT_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListElementContext extends ParserRuleContext {
		public PatternMatchingTermContext patternMatchingTerm() {
			return getRuleContext(PatternMatchingTermContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitListElement(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			patternMatchingTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseTermContext extends ParserRuleContext {
		public CaseStatementAndVariableContext caseStatementAndVariable() {
			return getRuleContext(CaseStatementAndVariableContext.class,0);
		}
		public CaseConditionsContext caseConditions() {
			return getRuleContext(CaseConditionsContext.class,0);
		}
		public CaseTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseTerm(this);
		}
	}

	public final CaseTermContext caseTerm() throws RecognitionException {
		CaseTermContext _localctx = new CaseTermContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_caseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			caseStatementAndVariable();
			setState(646);
			caseConditions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementAndVariableContext extends ParserRuleContext {
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public CaseVariableContext caseVariable() {
			return getRuleContext(CaseVariableContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public TerminalNode OF() { return getToken(HaskellParser.OF, 0); }
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public CaseStatementAndVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatementAndVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseStatementAndVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseStatementAndVariable(this);
		}
	}

	public final CaseStatementAndVariableContext caseStatementAndVariable() throws RecognitionException {
		CaseStatementAndVariableContext _localctx = new CaseStatementAndVariableContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_caseStatementAndVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			caseStatement();
			setState(649);
			match(LEFT_PAREN);
			setState(650);
			caseVariable();
			setState(651);
			match(RIGHT_PAREN);
			setState(652);
			match(OF);
			setState(653);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(HaskellParser.CASE, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(CASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseVariableContext extends ParserRuleContext {
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public CaseVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseVariable(this);
		}
	}

	public final CaseVariableContext caseVariable() throws RecognitionException {
		CaseVariableContext _localctx = new CaseVariableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_caseVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseConditionsContext extends ParserRuleContext {
		public CaseOtherwiseStatementContext caseOtherwiseStatement() {
			return getRuleContext(CaseOtherwiseStatementContext.class,0);
		}
		public List<CaseGeneralStatementContext> caseGeneralStatement() {
			return getRuleContexts(CaseGeneralStatementContext.class);
		}
		public CaseGeneralStatementContext caseGeneralStatement(int i) {
			return getRuleContext(CaseGeneralStatementContext.class,i);
		}
		public CaseConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseConditions(this);
		}
	}

	public final CaseConditionsContext caseConditions() throws RecognitionException {
		CaseConditionsContext _localctx = new CaseConditionsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_caseConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << CASE) | (1L << IF) | (1L << RETURN) | (1L << MONAD_ARROW) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << JUST) | (1L << NAME))) != 0)) {
				{
				{
				setState(659);
				caseGeneralStatement();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			caseOtherwiseStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseGeneralStatementContext extends ParserRuleContext {
		public CaseValueCompareContext caseValueCompare() {
			return getRuleContext(CaseValueCompareContext.class,0);
		}
		public CaseValueImplementationSeparatorContext caseValueImplementationSeparator() {
			return getRuleContext(CaseValueImplementationSeparatorContext.class,0);
		}
		public CaseImplementationContext caseImplementation() {
			return getRuleContext(CaseImplementationContext.class,0);
		}
		public CaseGeneralStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseGeneralStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseGeneralStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseGeneralStatement(this);
		}
	}

	public final CaseGeneralStatementContext caseGeneralStatement() throws RecognitionException {
		CaseGeneralStatementContext _localctx = new CaseGeneralStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_caseGeneralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			caseValueCompare();
			setState(668);
			caseValueImplementationSeparator();
			setState(669);
			caseImplementation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseValueCompareContext extends ParserRuleContext {
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public CaseValueCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseValueCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseValueCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseValueCompare(this);
		}
	}

	public final CaseValueCompareContext caseValueCompare() throws RecognitionException {
		CaseValueCompareContext _localctx = new CaseValueCompareContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_caseValueCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseOtherwiseStatementContext extends ParserRuleContext {
		public OtherwiseTermContext otherwiseTerm() {
			return getRuleContext(OtherwiseTermContext.class,0);
		}
		public CaseValueImplementationSeparatorContext caseValueImplementationSeparator() {
			return getRuleContext(CaseValueImplementationSeparatorContext.class,0);
		}
		public CaseImplementationContext caseImplementation() {
			return getRuleContext(CaseImplementationContext.class,0);
		}
		public CaseOtherwiseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseOtherwiseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseOtherwiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseOtherwiseStatement(this);
		}
	}

	public final CaseOtherwiseStatementContext caseOtherwiseStatement() throws RecognitionException {
		CaseOtherwiseStatementContext _localctx = new CaseOtherwiseStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_caseOtherwiseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			otherwiseTerm();
			setState(674);
			caseValueImplementationSeparator();
			setState(675);
			caseImplementation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseImplementationContext extends ParserRuleContext {
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public CaseImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseImplementation(this);
		}
	}

	public final CaseImplementationContext caseImplementation() throws RecognitionException {
		CaseImplementationContext _localctx = new CaseImplementationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_caseImplementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			patternMatchingExpression();
			setState(678);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseValueImplementationSeparatorContext extends ParserRuleContext {
		public TerminalNode TYPE_SEPARATOR() { return getToken(HaskellParser.TYPE_SEPARATOR, 0); }
		public CaseValueImplementationSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseValueImplementationSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCaseValueImplementationSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCaseValueImplementationSeparator(this);
		}
	}

	public final CaseValueImplementationSeparatorContext caseValueImplementationSeparator() throws RecognitionException {
		CaseValueImplementationSeparatorContext _localctx = new CaseValueImplementationSeparatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_caseValueImplementationSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(TYPE_SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherwiseTermContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(HaskellParser.OTHERWISE, 0); }
		public OtherwiseTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwiseTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterOtherwiseTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitOtherwiseTerm(this);
		}
	}

	public final OtherwiseTermContext otherwiseTerm() throws RecognitionException {
		OtherwiseTermContext _localctx = new OtherwiseTermContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_otherwiseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(OTHERWISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DollarSignTermContext extends ParserRuleContext {
		public TerminalNode RIGHT_ASSOC_DOLLAR_SIGN() { return getToken(HaskellParser.RIGHT_ASSOC_DOLLAR_SIGN, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public DollarSignTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollarSignTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDollarSignTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDollarSignTerm(this);
		}
	}

	public final DollarSignTermContext dollarSignTerm() throws RecognitionException {
		DollarSignTermContext _localctx = new DollarSignTermContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dollarSignTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(RIGHT_ASSOC_DOLLAR_SIGN);
			setState(685);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionToMethodContext extends ParserRuleContext {
		public FunctionToMethodDollarSignContext functionToMethodDollarSign() {
			return getRuleContext(FunctionToMethodDollarSignContext.class,0);
		}
		public FunctionToMethodParenContext functionToMethodParen() {
			return getRuleContext(FunctionToMethodParenContext.class,0);
		}
		public FunctionToMethodTermContext functionToMethodTerm() {
			return getRuleContext(FunctionToMethodTermContext.class,0);
		}
		public FunctionToMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionToMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionToMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionToMethod(this);
		}
	}

	public final FunctionToMethodContext functionToMethod() throws RecognitionException {
		FunctionToMethodContext _localctx = new FunctionToMethodContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionToMethod);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				functionToMethodDollarSign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				functionToMethodParen();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				functionToMethodTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HaskellFunctionToScalaMethodNameContext extends ParserRuleContext {
		public TerminalNode HASKELL_FUNCTIONS_METHODS_IN_SCALA() { return getToken(HaskellParser.HASKELL_FUNCTIONS_METHODS_IN_SCALA, 0); }
		public HaskellFunctionToScalaMethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haskellFunctionToScalaMethodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterHaskellFunctionToScalaMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitHaskellFunctionToScalaMethodName(this);
		}
	}

	public final HaskellFunctionToScalaMethodNameContext haskellFunctionToScalaMethodName() throws RecognitionException {
		HaskellFunctionToScalaMethodNameContext _localctx = new HaskellFunctionToScalaMethodNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_haskellFunctionToScalaMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(HASKELL_FUNCTIONS_METHODS_IN_SCALA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionToMethodDollarSignContext extends ParserRuleContext {
		public HaskellFunctionToScalaMethodNameContext haskellFunctionToScalaMethodName() {
			return getRuleContext(HaskellFunctionToScalaMethodNameContext.class,0);
		}
		public DollarSignTermContext dollarSignTerm() {
			return getRuleContext(DollarSignTermContext.class,0);
		}
		public FunctionToMethodDollarSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionToMethodDollarSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionToMethodDollarSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionToMethodDollarSign(this);
		}
	}

	public final FunctionToMethodDollarSignContext functionToMethodDollarSign() throws RecognitionException {
		FunctionToMethodDollarSignContext _localctx = new FunctionToMethodDollarSignContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_functionToMethodDollarSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			haskellFunctionToScalaMethodName();
			setState(695);
			dollarSignTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionToMethodParenContext extends ParserRuleContext {
		public HaskellFunctionToScalaMethodNameContext haskellFunctionToScalaMethodName() {
			return getRuleContext(HaskellFunctionToScalaMethodNameContext.class,0);
		}
		public PatternMatchParenContext patternMatchParen() {
			return getRuleContext(PatternMatchParenContext.class,0);
		}
		public FunctionToMethodParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionToMethodParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionToMethodParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionToMethodParen(this);
		}
	}

	public final FunctionToMethodParenContext functionToMethodParen() throws RecognitionException {
		FunctionToMethodParenContext _localctx = new FunctionToMethodParenContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_functionToMethodParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			haskellFunctionToScalaMethodName();
			setState(698);
			patternMatchParen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionToMethodTermContext extends ParserRuleContext {
		public HaskellFunctionToScalaMethodNameContext haskellFunctionToScalaMethodName() {
			return getRuleContext(HaskellFunctionToScalaMethodNameContext.class,0);
		}
		public GeneralPatternMatchingTermContext generalPatternMatchingTerm() {
			return getRuleContext(GeneralPatternMatchingTermContext.class,0);
		}
		public FunctionToMethodTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionToMethodTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionToMethodTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionToMethodTerm(this);
		}
	}

	public final FunctionToMethodTermContext functionToMethodTerm() throws RecognitionException {
		FunctionToMethodTermContext _localctx = new FunctionToMethodTermContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionToMethodTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			haskellFunctionToScalaMethodName();
			setState(701);
			generalPatternMatchingTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursiveMainContext extends ParserRuleContext {
		public TerminalNode FUNC_ARGS_OPEN_PAREN() { return getToken(HaskellParser.FUNC_ARGS_OPEN_PAREN, 0); }
		public TerminalNode MAIN_FUNCTION() { return getToken(HaskellParser.MAIN_FUNCTION, 0); }
		public TerminalNode FUNC_ARGS_CLOSE_PAREN() { return getToken(HaskellParser.FUNC_ARGS_CLOSE_PAREN, 0); }
		public RecursiveMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursiveMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterRecursiveMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitRecursiveMain(this);
		}
	}

	public final RecursiveMainContext recursiveMain() throws RecognitionException {
		RecursiveMainContext _localctx = new RecursiveMainContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_recursiveMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(704);
			match(MAIN_FUNCTION);
			setState(705);
			match(FUNC_ARGS_CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnUnitTypeContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HaskellParser.RETURN, 0); }
		public TerminalNode UNIT_TYPE() { return getToken(HaskellParser.UNIT_TYPE, 0); }
		public ReturnUnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnUnitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterReturnUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitReturnUnitType(this);
		}
	}

	public final ReturnUnitTypeContext returnUnitType() throws RecognitionException {
		ReturnUnitTypeContext _localctx = new ReturnUnitTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_returnUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(RETURN);
			setState(708);
			match(UNIT_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(HaskellParser.LEFT_SQUARE_BRACKET, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(HaskellParser.RIGHT_SQUARE_BRACKET, 0); }
		public PatternMatchArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchArray(this);
		}
	}

	public final PatternMatchArrayContext patternMatchArray() throws RecognitionException {
		PatternMatchArrayContext _localctx = new PatternMatchArrayContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_patternMatchArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(LEFT_SQUARE_BRACKET);
			setState(711);
			patternMatchingExpression();
			setState(712);
			match(RIGHT_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternMatchParenContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(HaskellParser.LEFT_PAREN, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HaskellParser.RIGHT_PAREN, 0); }
		public PatternMatchParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatchParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPatternMatchParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPatternMatchParen(this);
		}
	}

	public final PatternMatchParenContext patternMatchParen() throws RecognitionException {
		PatternMatchParenContext _localctx = new PatternMatchParenContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_patternMatchParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LEFT_PAREN);
			setState(715);
			patternMatchingExpression();
			setState(716);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralPatternMatchingTermContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(HaskellParser.INT_VAL, 0); }
		public TerminalNode INT_OP() { return getToken(HaskellParser.INT_OP, 0); }
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public GeneralPatternMatchingTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalPatternMatchingTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGeneralPatternMatchingTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGeneralPatternMatchingTerm(this);
		}
	}

	public final GeneralPatternMatchingTermContext generalPatternMatchingTerm() throws RecognitionException {
		GeneralPatternMatchingTermContext _localctx = new GeneralPatternMatchingTermContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_generalPatternMatchingTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_VAL) | (1L << INT_OP) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralFunctionCallContext extends ParserRuleContext {
		public TerminalNode FUNC_ARGS_OPEN_PAREN() { return getToken(HaskellParser.FUNC_ARGS_OPEN_PAREN, 0); }
		public FunctionCallFunctionNameContext functionCallFunctionName() {
			return getRuleContext(FunctionCallFunctionNameContext.class,0);
		}
		public TerminalNode FUNC_ARGS_CLOSE_PAREN() { return getToken(HaskellParser.FUNC_ARGS_CLOSE_PAREN, 0); }
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public GeneralFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGeneralFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGeneralFunctionCall(this);
		}
	}

	public final GeneralFunctionCallContext generalFunctionCall() throws RecognitionException {
		GeneralFunctionCallContext _localctx = new GeneralFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_generalFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(721);
			functionCallFunctionName();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << CASE) | (1L << IF) | (1L << RETURN) | (1L << MONAD_ARROW) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << JUST) | (1L << NAME))) != 0)) {
				{
				{
				setState(722);
				functionArgument();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(FUNC_ARGS_CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentContext extends ParserRuleContext {
		public PatternMatchingTermContext patternMatchingTerm() {
			return getRuleContext(PatternMatchingTermContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionArgument(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			patternMatchingTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallFunctionNameContext extends ParserRuleContext {
		public HaskellFunctionNameContext haskellFunctionName() {
			return getRuleContext(HaskellFunctionNameContext.class,0);
		}
		public NonHaskellReservedFunctionNameContext nonHaskellReservedFunctionName() {
			return getRuleContext(NonHaskellReservedFunctionNameContext.class,0);
		}
		public FunctionCallFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunctionCallFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunctionCallFunctionName(this);
		}
	}

	public final FunctionCallFunctionNameContext functionCallFunctionName() throws RecognitionException {
		FunctionCallFunctionNameContext _localctx = new FunctionCallFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_functionCallFunctionName);
		try {
			setState(734);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				haskellFunctionName();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				nonHaskellReservedFunctionName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonHaskellReservedFunctionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public NonHaskellReservedFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonHaskellReservedFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterNonHaskellReservedFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitNonHaskellReservedFunctionName(this);
		}
	}

	public final NonHaskellReservedFunctionNameContext nonHaskellReservedFunctionName() throws RecognitionException {
		NonHaskellReservedFunctionNameContext _localctx = new NonHaskellReservedFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_nonHaskellReservedFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HaskellFunctionNameContext extends ParserRuleContext {
		public TerminalNode HASKELL_FUNCTION_NAME() { return getToken(HaskellParser.HASKELL_FUNCTION_NAME, 0); }
		public HaskellFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haskellFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterHaskellFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitHaskellFunctionName(this);
		}
	}

	public final HaskellFunctionNameContext haskellFunctionName() throws RecognitionException {
		HaskellFunctionNameContext _localctx = new HaskellFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_haskellFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(HASKELL_FUNCTION_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringTermContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARK() { return getTokens(HaskellParser.QUOTATION_MARK); }
		public TerminalNode QUOTATION_MARK(int i) {
			return getToken(HaskellParser.QUOTATION_MARK, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public StringTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitStringTerm(this);
		}
	}

	public final StringTermContext stringTerm() throws RecognitionException {
		StringTermContext _localctx = new StringTermContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_stringTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(QUOTATION_MARK);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(741);
				word();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747);
			match(QUOTATION_MARK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonadUnboxingContext extends ParserRuleContext {
		public MonadVariableNameContext monadVariableName() {
			return getRuleContext(MonadVariableNameContext.class,0);
		}
		public MonadUnboxOperatorContext monadUnboxOperator() {
			return getRuleContext(MonadUnboxOperatorContext.class,0);
		}
		public MonadEvaluationExpressionContext monadEvaluationExpression() {
			return getRuleContext(MonadEvaluationExpressionContext.class,0);
		}
		public MonadUnboxingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadUnboxing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMonadUnboxing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMonadUnboxing(this);
		}
	}

	public final MonadUnboxingContext monadUnboxing() throws RecognitionException {
		MonadUnboxingContext _localctx = new MonadUnboxingContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_monadUnboxing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			monadVariableName();
			setState(752);
			monadUnboxOperator();
			setState(753);
			monadEvaluationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonadVariableNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public MonadVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMonadVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMonadVariableName(this);
		}
	}

	public final MonadVariableNameContext monadVariableName() throws RecognitionException {
		MonadVariableNameContext _localctx = new MonadVariableNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_monadVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonadUnboxOperatorContext extends ParserRuleContext {
		public TerminalNode MONAD_ARROW() { return getToken(HaskellParser.MONAD_ARROW, 0); }
		public MonadUnboxOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadUnboxOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMonadUnboxOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMonadUnboxOperator(this);
		}
	}

	public final MonadUnboxOperatorContext monadUnboxOperator() throws RecognitionException {
		MonadUnboxOperatorContext _localctx = new MonadUnboxOperatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_monadUnboxOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(MONAD_ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonadEvaluationExpressionContext extends ParserRuleContext {
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public MonadEvaluationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadEvaluationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterMonadEvaluationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitMonadEvaluationExpression(this);
		}
	}

	public final MonadEvaluationExpressionContext monadEvaluationExpression() throws RecognitionException {
		MonadEvaluationExpressionContext _localctx = new MonadEvaluationExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_monadEvaluationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JustStatementContext extends ParserRuleContext {
		public TerminalNode JUST() { return getToken(HaskellParser.JUST, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public JustStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterJustStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitJustStatement(this);
		}
	}

	public final JustStatementContext justStatement() throws RecognitionException {
		JustStatementContext _localctx = new JustStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_justStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(JUST);
			setState(762);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HaskellParser.RETURN, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(RETURN);
			setState(765);
			patternMatchingExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindExpressionContext extends ParserRuleContext {
		public PatternMatchParenContext patternMatchParen() {
			return getRuleContext(PatternMatchParenContext.class,0);
		}
		public List<BindFunctionContext> bindFunction() {
			return getRuleContexts(BindFunctionContext.class);
		}
		public BindFunctionContext bindFunction(int i) {
			return getRuleContext(BindFunctionContext.class,i);
		}
		public BindExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterBindExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitBindExpression(this);
		}
	}

	public final BindExpressionContext bindExpression() throws RecognitionException {
		BindExpressionContext _localctx = new BindExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_bindExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			patternMatchParen();
			setState(769); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(768);
					bindFunction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(771); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindFunctionContext extends ParserRuleContext {
		public TerminalNode BIND_OPERATOR() { return getToken(HaskellParser.BIND_OPERATOR, 0); }
		public PatternMatchingExpressionContext patternMatchingExpression() {
			return getRuleContext(PatternMatchingExpressionContext.class,0);
		}
		public BindFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterBindFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitBindFunction(this);
		}
	}

	public final BindFunctionContext bindFunction() throws RecognitionException {
		BindFunctionContext _localctx = new BindFunctionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_bindFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(773);
			match(BIND_OPERATOR);
			setState(774);
			patternMatchingExpression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u030b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\5\2\u00d8\n\2\3\2\5\2\u00db\n\2\3\2\7\2\u00de\n\2\f\2\16\2\u00e1"+
		"\13\2\3\2\7\2\u00e4\n\2\f\2\16\2\u00e7\13\2\3\2\7\2\u00ea\n\2\f\2\16\2"+
		"\u00ed\13\2\3\3\3\3\5\3\u00f1\n\3\3\4\3\4\7\4\u00f5\n\4\f\4\16\4\u00f8"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6\u0101\n\6\f\6\16\6\u0104\13\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u010f\n\t\f\t\16\t\u0112\13\t\3"+
		"\n\7\n\u0115\n\n\f\n\16\n\u0118\13\n\3\n\3\n\3\n\3\n\7\n\u011e\n\n\f\n"+
		"\16\n\u0121\13\n\3\n\3\n\7\n\u0125\n\n\f\n\16\n\u0128\13\n\3\13\7\13\u012b"+
		"\n\13\f\13\16\13\u012e\13\13\3\13\3\13\3\f\3\f\7\f\u0134\n\f\f\f\16\f"+
		"\u0137\13\f\3\r\7\r\u013a\n\r\f\r\16\r\u013d\13\r\3\r\3\r\7\r\u0141\n"+
		"\r\f\r\16\r\u0144\13\r\3\16\3\16\3\16\7\16\u0149\n\16\f\16\16\16\u014c"+
		"\13\16\3\16\3\16\7\16\u0150\n\16\f\16\16\16\u0153\13\16\3\16\3\16\7\16"+
		"\u0157\n\16\f\16\16\16\u015a\13\16\5\16\u015c\n\16\3\17\3\17\3\17\3\17"+
		"\7\17\u0162\n\17\f\17\16\17\u0165\13\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\5\23\u016f\n\23\3\23\3\23\5\23\u0173\n\23\3\23\6\23\u0176\n"+
		"\23\r\23\16\23\u0177\3\23\5\23\u017b\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u0185\n\25\3\26\6\26\u0188\n\26\r\26\16\26\u0189\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0191\n\26\3\27\3\27\3\27\5\27\u0196\n\27\3"+
		"\30\3\30\6\30\u019a\n\30\r\30\16\30\u019b\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u01ad\n\34\f\34\16"+
		"\34\u01b0\13\34\3\35\3\35\3\36\3\36\3\36\7\36\u01b7\n\36\f\36\16\36\u01ba"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u01c5\n \f \16 \u01c8\13"+
		" \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u01d7\n$\3%\3%\3&\3&\3\'"+
		"\6\'\u01de\n\'\r\'\16\'\u01df\3(\3(\3(\3(\3(\3(\3)\7)\u01e9\n)\f)\16)"+
		"\u01ec\13)\3*\3*\3*\3*\3*\3*\3*\5*\u01f5\n*\3+\3+\3,\3,\6,\u01fb\n,\r"+
		",\16,\u01fc\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\6\60\u0209\n\60\r\60\16\60"+
		"\u020a\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0223\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\7\63\u022d\n\63\f\63\16\63\u0230\13\63"+
		"\3\63\3\63\7\63\u0234\n\63\f\63\16\63\u0237\13\63\3\63\3\63\7\63\u023b"+
		"\n\63\f\63\16\63\u023e\13\63\3\63\3\63\7\63\u0242\n\63\f\63\16\63\u0245"+
		"\13\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\38\39\69\u0259\n9\r9\169\u025a\3:\3:\5:\u025f\n:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3E\3"+
		"E\7E\u027e\nE\fE\16E\u0281\13E\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H"+
		"\3H\3H\3I\3I\3J\3J\3K\7K\u0297\nK\fK\16K\u029a\13K\3K\3K\3L\3L\3L\3L\3"+
		"M\3M\3N\3N\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3S\5S\u02b5\nS\3"+
		"T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3"+
		"[\3[\3[\3\\\3\\\3]\3]\3]\7]\u02d6\n]\f]\16]\u02d9\13]\3]\3]\3^\3^\3_\3"+
		"_\5_\u02e1\n_\3`\3`\3a\3a\3b\3b\7b\u02e9\nb\fb\16b\u02ec\13b\3b\3b\3c"+
		"\3c\3d\3d\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\6j\u0304\nj"+
		"\rj\16j\u0305\3k\3k\3k\3k\2\2l\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\2\4\4\2%%..\4\2%&..\u02f3\2\u00d7\3\2\2"+
		"\2\4\u00f0\3\2\2\2\6\u00f2\3\2\2\2\b\u00fb\3\2\2\2\n\u00fe\3\2\2\2\f\u0105"+
		"\3\2\2\2\16\u0107\3\2\2\2\20\u010c\3\2\2\2\22\u0116\3\2\2\2\24\u012c\3"+
		"\2\2\2\26\u0131\3\2\2\2\30\u013b\3\2\2\2\32\u015b\3\2\2\2\34\u015d\3\2"+
		"\2\2\36\u0166\3\2\2\2 \u0168\3\2\2\2\"\u016a\3\2\2\2$\u016c\3\2\2\2&\u017c"+
		"\3\2\2\2(\u0181\3\2\2\2*\u0190\3\2\2\2,\u0195\3\2\2\2.\u0197\3\2\2\2\60"+
		"\u019f\3\2\2\2\62\u01a1\3\2\2\2\64\u01a5\3\2\2\2\66\u01a7\3\2\2\28\u01b1"+
		"\3\2\2\2:\u01b8\3\2\2\2<\u01bb\3\2\2\2>\u01c0\3\2\2\2@\u01cc\3\2\2\2B"+
		"\u01ce\3\2\2\2D\u01d0\3\2\2\2F\u01d6\3\2\2\2H\u01d8\3\2\2\2J\u01da\3\2"+
		"\2\2L\u01dd\3\2\2\2N\u01e1\3\2\2\2P\u01ea\3\2\2\2R\u01f4\3\2\2\2T\u01f6"+
		"\3\2\2\2V\u01f8\3\2\2\2X\u0200\3\2\2\2Z\u0202\3\2\2\2\\\u0205\3\2\2\2"+
		"^\u0208\3\2\2\2`\u0222\3\2\2\2b\u0224\3\2\2\2d\u022e\3\2\2\2f\u0246\3"+
		"\2\2\2h\u0248\3\2\2\2j\u024a\3\2\2\2l\u024c\3\2\2\2n\u0250\3\2\2\2p\u0258"+
		"\3\2\2\2r\u025e\3\2\2\2t\u0260\3\2\2\2v\u0262\3\2\2\2x\u0264\3\2\2\2z"+
		"\u0266\3\2\2\2|\u0268\3\2\2\2~\u026e\3\2\2\2\u0080\u0270\3\2\2\2\u0082"+
		"\u0272\3\2\2\2\u0084\u0274\3\2\2\2\u0086\u0276\3\2\2\2\u0088\u0279\3\2"+
		"\2\2\u008a\u0285\3\2\2\2\u008c\u0287\3\2\2\2\u008e\u028a\3\2\2\2\u0090"+
		"\u0291\3\2\2\2\u0092\u0293\3\2\2\2\u0094\u0298\3\2\2\2\u0096\u029d\3\2"+
		"\2\2\u0098\u02a1\3\2\2\2\u009a\u02a3\3\2\2\2\u009c\u02a7\3\2\2\2\u009e"+
		"\u02aa\3\2\2\2\u00a0\u02ac\3\2\2\2\u00a2\u02ae\3\2\2\2\u00a4\u02b4\3\2"+
		"\2\2\u00a6\u02b6\3\2\2\2\u00a8\u02b8\3\2\2\2\u00aa\u02bb\3\2\2\2\u00ac"+
		"\u02be\3\2\2\2\u00ae\u02c1\3\2\2\2\u00b0\u02c5\3\2\2\2\u00b2\u02c8\3\2"+
		"\2\2\u00b4\u02cc\3\2\2\2\u00b6\u02d0\3\2\2\2\u00b8\u02d2\3\2\2\2\u00ba"+
		"\u02dc\3\2\2\2\u00bc\u02e0\3\2\2\2\u00be\u02e2\3\2\2\2\u00c0\u02e4\3\2"+
		"\2\2\u00c2\u02e6\3\2\2\2\u00c4\u02ef\3\2\2\2\u00c6\u02f1\3\2\2\2\u00c8"+
		"\u02f5\3\2\2\2\u00ca\u02f7\3\2\2\2\u00cc\u02f9\3\2\2\2\u00ce\u02fb\3\2"+
		"\2\2\u00d0\u02fe\3\2\2\2\u00d2\u0301\3\2\2\2\u00d4\u0307\3\2\2\2\u00d6"+
		"\u00d8\5\6\4\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00db\5\16\b\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00e5\3\2\2\2\u00dc\u00de\7-\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\5\4\3\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00ea\7-\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\3\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f1\5\32\16\2\u00ef\u00f1\5\b\5\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\5\3\2\2\2\u00f2\u00f6\7\5\2\2\u00f3\u00f5\7"+
		".\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\6"+
		"\2\2\u00fa\7\3\2\2\2\u00fb\u00fc\5\n\6\2\u00fc\u00fd\7-\2\2\u00fd\t\3"+
		"\2\2\2\u00fe\u0102\7\21\2\2\u00ff\u0101\5\f\7\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\13\3\2\2"+
		"\2\u0104\u0102\3\2\2\2\u0105\u0106\7.\2\2\u0106\r\3\2\2\2\u0107\u0108"+
		"\5\20\t\2\u0108\u0109\5\26\f\2\u0109\u010a\5\22\n\2\u010a\u010b\5\24\13"+
		"\2\u010b\17\3\2\2\2\u010c\u0110\7\7\2\2\u010d\u010f\7-\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\21\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\7-\2\2\u0114\u0113\3\2\2\2"+
		"\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\16\2\2\u011a\u011f\5\30\r\2"+
		"\u011b\u011c\7\t\2\2\u011c\u011e\5\30\r\2\u011d\u011b\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0126\7\17\2\2\u0123\u0125\7-\2\2\u0124\u0123\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\23\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7-\2\2\u012a\u0129\3\2\2\2"+
		"\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\b\2\2\u0130\25\3\2\2\2\u0131"+
		"\u0135\7.\2\2\u0132\u0134\7-\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\27\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u013a\7-\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u0142\7.\2\2\u013f\u0141\7-\2\2\u0140\u013f\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\31\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\5\66\34\2\u0146\u014a\5L\'\2\u0147\u0149\7"+
		"-\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u015c\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0151\5$"+
		"\23\2\u014e\u0150\7-\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u015c\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0158\5\34\17\2\u0155\u0157\7-\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u0145\3\2\2\2\u015b\u014d\3\2\2\2\u015b"+
		"\u0154\3\2\2\2\u015c\33\3\2\2\2\u015d\u015e\5\36\20\2\u015e\u015f\5 \21"+
		"\2\u015f\u0163\5\"\22\2\u0160\u0162\7-\2\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\35\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7.\2\2\u0167\37\3\2\2\2\u0168\u0169\7\22\2"+
		"\2\u0169!\3\2\2\2\u016a\u016b\5^\60\2\u016b#\3\2\2\2\u016c\u016e\5&\24"+
		"\2\u016d\u016f\7-\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0172\5(\25\2\u0171\u0173\7-\2\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0176\5*\26\2\u0175\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u017b\7-\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b%\3\2\2\2\u017c\u017d\7$\2\2\u017d\u017e\7!\2\2\u017e\u017f"+
		"\7\26\2\2\u017f\u0180\5J&\2\u0180\'\3\2\2\2\u0181\u0182\7$\2\2\u0182\u0184"+
		"\7\22\2\2\u0183\u0185\7\27\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2"+
		"\u0185)\3\2\2\2\u0186\u0188\5\62\32\2\u0187\u0186\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\7-\2\2\u018c\u0191\3\2\2\2\u018d\u018e\5^\60\2\u018e\u018f\7-\2"+
		"\2\u018f\u0191\3\2\2\2\u0190\u0187\3\2\2\2\u0190\u018d\3\2\2\2\u0191+"+
		"\3\2\2\2\u0192\u0196\5\u00c0a\2\u0193\u0196\5.\30\2\u0194\u0196\5\60\31"+
		"\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196-"+
		"\3\2\2\2\u0197\u0199\7\16\2\2\u0198\u019a\5,\27\2\u0199\u0198\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019e\7\17\2\2\u019e/\3\2\2\2\u019f\u01a0\t\2\2\2\u01a0"+
		"\61\3\2\2\2\u01a1\u01a2\5\64\33\2\u01a2\u01a3\7\"\2\2\u01a3\u01a4\5^\60"+
		"\2\u01a4\63\3\2\2\2\u01a5\u01a6\7.\2\2\u01a6\65\3\2\2\2\u01a7\u01a8\5"+
		"8\35\2\u01a8\u01a9\7!\2\2\u01a9\u01aa\5:\36\2\u01aa\u01ae\5D#\2\u01ab"+
		"\u01ad\7-\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\67\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2"+
		"\7.\2\2\u01b29\3\2\2\2\u01b3\u01b4\5B\"\2\u01b4\u01b5\7#\2\2\u01b5\u01b7"+
		"\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9;\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7\16\2\2"+
		"\u01bc\u01bd\7 \2\2\u01bd\u01be\5F$\2\u01be\u01bf\7\17\2\2\u01bf=\3\2"+
		"\2\2\u01c0\u01c6\7\16\2\2\u01c1\u01c2\5F$\2\u01c2\u01c3\5@!\2\u01c3\u01c5"+
		"\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\5F"+
		"$\2\u01ca\u01cb\7\17\2\2\u01cb?\3\2\2\2\u01cc\u01cd\7#\2\2\u01cdA\3\2"+
		"\2\2\u01ce\u01cf\5F$\2\u01cfC\3\2\2\2\u01d0\u01d1\5F$\2\u01d1E\3\2\2\2"+
		"\u01d2\u01d7\5<\37\2\u01d3\u01d7\5H%\2\u01d4\u01d7\5> \2\u01d5\u01d7\5"+
		"J&\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7G\3\2\2\2\u01d8\u01d9\7\'\2\2\u01d9I\3\2\2\2\u01da"+
		"\u01db\7)\2\2\u01dbK\3\2\2\2\u01dc\u01de\5N(\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0M\3\2\2\2"+
		"\u01e1\u01e2\7.\2\2\u01e2\u01e3\5P)\2\u01e3\u01e4\7\22\2\2\u01e4\u01e5"+
		"\5^\60\2\u01e5\u01e6\7-\2\2\u01e6O\3\2\2\2\u01e7\u01e9\5R*\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"Q\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f5\5V,\2\u01ee\u01f5\5|?\2\u01ef"+
		"\u01f5\5\u0086D\2\u01f0\u01f5\5\u0082B\2\u01f1\u01f5\5Z.\2\u01f2\u01f5"+
		"\5\\/\2\u01f3\u01f5\5T+\2\u01f4\u01ed\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4"+
		"\u01ef\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f5S\3\2\2\2\u01f6\u01f7\7.\2\2\u01f7U\3\2"+
		"\2\2\u01f8\u01fa\7\16\2\2\u01f9\u01fb\5R*\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u01ff\7\17\2\2\u01ffW\3\2\2\2\u0200\u0201\5\u0082B\2\u0201"+
		"Y\3\2\2\2\u0202\u0203\7+\2\2\u0203\u0204\5R*\2\u0204[\3\2\2\2\u0205\u0206"+
		"\7,\2\2\u0206]\3\2\2\2\u0207\u0209\5`\61\2\u0208\u0207\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b_\3\2\2\2\u020c"+
		"\u0223\5\u00a2R\2\u020d\u0223\5n8\2\u020e\u0223\5\u00d2j\2\u020f\u0223"+
		"\5\u00b8]\2\u0210\u0223\5\u00b4[\2\u0211\u0223\5\u00a4S\2\u0212\u0223"+
		"\5\u00c0a\2\u0213\u0223\5l\67\2\u0214\u0223\5\u00b6\\\2\u0215\u0223\5"+
		"\u00b2Z\2\u0216\u0223\5b\62\2\u0217\u0223\5\u00aeX\2\u0218\u0223\5\u00b0"+
		"Y\2\u0219\u0223\5|?\2\u021a\u0223\5\u0086D\2\u021b\u0223\5\u0088E\2\u021c"+
		"\u0223\5\u008cG\2\u021d\u0223\5\u00c2b\2\u021e\u0223\5\u00d0i\2\u021f"+
		"\u0223\5\u00caf\2\u0220\u0223\5\u00ceh\2\u0221\u0223\7.\2\2\u0222\u020c"+
		"\3\2\2\2\u0222\u020d\3\2\2\2\u0222\u020e\3\2\2\2\u0222\u020f\3\2\2\2\u0222"+
		"\u0210\3\2\2\2\u0222\u0211\3\2\2\2\u0222\u0212\3\2\2\2\u0222\u0213\3\2"+
		"\2\2\u0222\u0214\3\2\2\2\u0222\u0215\3\2\2\2\u0222\u0216\3\2\2\2\u0222"+
		"\u0217\3\2\2\2\u0222\u0218\3\2\2\2\u0222\u0219\3\2\2\2\u0222\u021a\3\2"+
		"\2\2\u0222\u021b\3\2\2\2\u0222\u021c\3\2\2\2\u0222\u021d\3\2\2\2\u0222"+
		"\u021e\3\2\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2"+
		"\2\2\u0223a\3\2\2\2\u0224\u0225\5f\64\2\u0225\u0226\5d\63\2\u0226\u0227"+
		"\5h\65\2\u0227\u0228\5d\63\2\u0228\u0229\5j\66\2\u0229\u022a\5d\63\2\u022a"+
		"c\3\2\2\2\u022b\u022d\7-\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0235\7\16\2\2\u0232\u0234\7-\2\2\u0233\u0232\3\2\2\2\u0234"+
		"\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2"+
		"\2\2\u0237\u0235\3\2\2\2\u0238\u023c\5^\60\2\u0239\u023b\7-\2\2\u023a"+
		"\u0239\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0243\7\17\2\2\u0240"+
		"\u0242\7-\2\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244e\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247"+
		"\7\33\2\2\u0247g\3\2\2\2\u0248\u0249\7\34\2\2\u0249i\3\2\2\2\u024a\u024b"+
		"\7\35\2\2\u024bk\3\2\2\2\u024c\u024d\5\u00b4[\2\u024d\u024e\5\u0080A\2"+
		"\u024e\u024f\5\u00b4[\2\u024fm\3\2\2\2\u0250\u0251\7\16\2\2\u0251\u0252"+
		"\7\25\2\2\u0252\u0253\5p9\2\u0253\u0254\5v<\2\u0254\u0255\5^\60\2\u0255"+
		"\u0256\7\17\2\2\u0256o\3\2\2\2\u0257\u0259\5r:\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bq\3\2\2\2"+
		"\u025c\u025f\5t;\2\u025d\u025f\5x=\2\u025e\u025c\3\2\2\2\u025e\u025d\3"+
		"\2\2\2\u025fs\3\2\2\2\u0260\u0261\5\u0082B\2\u0261u\3\2\2\2\u0262\u0263"+
		"\7#\2\2\u0263w\3\2\2\2\u0264\u0265\7.\2\2\u0265y\3\2\2\2\u0266\u0267\5"+
		"^\60\2\u0267{\3\2\2\2\u0268\u0269\7\16\2\2\u0269\u026a\5~@\2\u026a\u026b"+
		"\5\u0080A\2\u026b\u026c\5\u0084C\2\u026c\u026d\7\17\2\2\u026d}\3\2\2\2"+
		"\u026e\u026f\5`\61\2\u026f\177\3\2\2\2\u0270\u0271\7\20\2\2\u0271\u0081"+
		"\3\2\2\2\u0272\u0273\7\24\2\2\u0273\u0083\3\2\2\2\u0274\u0275\5`\61\2"+
		"\u0275\u0085\3\2\2\2\u0276\u0277\7\3\2\2\u0277\u0278\7\4\2\2\u0278\u0087"+
		"\3\2\2\2\u0279\u027f\7\3\2\2\u027a\u027b\5\u008aF\2\u027b\u027c\7\t\2"+
		"\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0283\5\u008aF\2\u0283\u0284\7\4\2\2\u0284\u0089\3\2\2\2\u0285\u0286"+
		"\5`\61\2\u0286\u008b\3\2\2\2\u0287\u0288\5\u008eH\2\u0288\u0289\5\u0094"+
		"K\2\u0289\u008d\3\2\2\2\u028a\u028b\5\u0090I\2\u028b\u028c\7\16\2\2\u028c"+
		"\u028d\5\u0092J\2\u028d\u028e\7\17\2\2\u028e\u028f\7\32\2\2\u028f\u0290"+
		"\7-\2\2\u0290\u008f\3\2\2\2\u0291\u0292\7\31\2\2\u0292\u0091\3\2\2\2\u0293"+
		"\u0294\5^\60\2\u0294\u0093\3\2\2\2\u0295\u0297\5\u0096L\2\u0296\u0295"+
		"\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\5\u009aN\2\u029c\u0095"+
		"\3\2\2\2\u029d\u029e\5\u0098M\2\u029e\u029f\5\u009eP\2\u029f\u02a0\5\u009c"+
		"O\2\u02a0\u0097\3\2\2\2\u02a1\u02a2\5^\60\2\u02a2\u0099\3\2\2\2\u02a3"+
		"\u02a4\5\u00a0Q\2\u02a4\u02a5\5\u009eP\2\u02a5\u02a6\5\u009cO\2\u02a6"+
		"\u009b\3\2\2\2\u02a7\u02a8\5^\60\2\u02a8\u02a9\7-\2\2\u02a9\u009d\3\2"+
		"\2\2\u02aa\u02ab\7#\2\2\u02ab\u009f\3\2\2\2\u02ac\u02ad\7\37\2\2\u02ad"+
		"\u00a1\3\2\2\2\u02ae\u02af\7\23\2\2\u02af\u02b0\5^\60\2\u02b0\u00a3\3"+
		"\2\2\2\u02b1\u02b5\5\u00a8U\2\u02b2\u02b5\5\u00aaV\2\u02b3\u02b5\5\u00ac"+
		"W\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u00a5\3\2\2\2\u02b6\u02b7\7\f\2\2\u02b7\u00a7\3\2\2\2\u02b8\u02b9\5\u00a6"+
		"T\2\u02b9\u02ba\5\u00a2R\2\u02ba\u00a9\3\2\2\2\u02bb\u02bc\5\u00a6T\2"+
		"\u02bc\u02bd\5\u00b4[\2\u02bd\u00ab\3\2\2\2\u02be\u02bf\5\u00a6T\2\u02bf"+
		"\u02c0\5\u00b6\\\2\u02c0\u00ad\3\2\2\2\u02c1\u02c2\7\n\2\2\u02c2\u02c3"+
		"\7$\2\2\u02c3\u02c4\7\13\2\2\u02c4\u00af\3\2\2\2\u02c5\u02c6\7\36\2\2"+
		"\u02c6\u02c7\7)\2\2\u02c7\u00b1\3\2\2\2\u02c8\u02c9\7\3\2\2\u02c9\u02ca"+
		"\5^\60\2\u02ca\u02cb\7\4\2\2\u02cb\u00b3\3\2\2\2\u02cc\u02cd\7\16\2\2"+
		"\u02cd\u02ce\5^\60\2\u02ce\u02cf\7\17\2\2\u02cf\u00b5\3\2\2\2\u02d0\u02d1"+
		"\t\3\2\2\u02d1\u00b7\3\2\2\2\u02d2\u02d3\7\n\2\2\u02d3\u02d7\5\u00bc_"+
		"\2\u02d4\u02d6\5\u00ba^\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02da\u02db\7\13\2\2\u02db\u00b9\3\2\2\2\u02dc\u02dd\5`\61\2\u02dd"+
		"\u00bb\3\2\2\2\u02de\u02e1\5\u00c0a\2\u02df\u02e1\5\u00be`\2\u02e0\u02de"+
		"\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u00bd\3\2\2\2\u02e2\u02e3\7.\2\2\u02e3"+
		"\u00bf\3\2\2\2\u02e4\u02e5\7(\2\2\u02e5\u00c1\3\2\2\2\u02e6\u02ea\7\r"+
		"\2\2\u02e7\u02e9\5\u00c4c\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02ee\7\r\2\2\u02ee\u00c3\3\2\2\2\u02ef\u02f0\7.\2\2\u02f0"+
		"\u00c5\3\2\2\2\u02f1\u02f2\5\u00c8e\2\u02f2\u02f3\5\u00caf\2\u02f3\u02f4"+
		"\5\u00ccg\2\u02f4\u00c7\3\2\2\2\u02f5\u02f6\7.\2\2\u02f6\u00c9\3\2\2\2"+
		"\u02f7\u02f8\7\"\2\2\u02f8\u00cb\3\2\2\2\u02f9\u02fa\5^\60\2\u02fa\u00cd"+
		"\3\2\2\2\u02fb\u02fc\7+\2\2\u02fc\u02fd\5^\60\2\u02fd\u00cf\3\2\2\2\u02fe"+
		"\u02ff\7\36\2\2\u02ff\u0300\5^\60\2\u0300\u00d1\3\2\2\2\u0301\u0303\5"+
		"\u00b4[\2\u0302\u0304\5\u00d4k\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2"+
		"\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u00d3\3\2\2\2\u0307\u0308"+
		"\7*\2\2\u0308\u0309\5^\60\2\u0309\u00d5\3\2\2\2\67\u00d7\u00da\u00df\u00e5"+
		"\u00eb\u00f0\u00f6\u0102\u0110\u0116\u011f\u0126\u012c\u0135\u013b\u0142"+
		"\u014a\u0151\u0158\u015b\u0163\u016e\u0172\u0177\u017a\u0184\u0189\u0190"+
		"\u0195\u019b\u01ae\u01b8\u01c6\u01d6\u01df\u01ea\u01f4\u01fc\u020a\u0222"+
		"\u022e\u0235\u023c\u0243\u025a\u025e\u027f\u0298\u02b4\u02d7\u02e0\u02ea"+
		"\u0305";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}