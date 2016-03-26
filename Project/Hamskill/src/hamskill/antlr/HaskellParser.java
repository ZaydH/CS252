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
		ARG_TYPE_SEPARATOR=30, MONAD_ARROW=31, TYPE_SEPARATOR=32, MAIN_FUNCTION=33, 
		INT_VAL=34, INT_OP=35, TYPE_NAME=36, HASKELL_FUNCTION_NAME=37, UNIT_TYPE=38, 
		NEWLINE=39, NAME=40, WS=41;
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
		RULE_typeFunction = 29, RULE_typeFunctionSeparator = 30, RULE_inputType = 31, 
		RULE_returnType = 32, RULE_type = 33, RULE_primitiveTypeName = 34, RULE_unitType = 35, 
		RULE_funcbody = 36, RULE_funcStatement = 37, RULE_patternMatchingArguments = 38, 
		RULE_patternMatchingArgument = 39, RULE_generalMatchingArgument = 40, 
		RULE_patternMatchParentheses = 41, RULE_underScoreArgument = 42, RULE_patternMatchingExpression = 43, 
		RULE_patternMatchingTerm = 44, RULE_ifStatementPattern = 45, RULE_ifStatementExpression = 46, 
		RULE_ifTerm = 47, RULE_thenTerm = 48, RULE_elseTerm = 49, RULE_prependTerm = 50, 
		RULE_lambdaFunction = 51, RULE_allLambdaArguments = 52, RULE_singleLamdaArgument = 53, 
		RULE_underscoreLambdaArgument = 54, RULE_lamdaArgumentsBodySeparator = 55, 
		RULE_typedLamdaArgument = 56, RULE_lambdaBody = 57, RULE_concatenatedList = 58, 
		RULE_headList = 59, RULE_colonTerm = 60, RULE_underScoreTerm = 61, RULE_tailList = 62, 
		RULE_emptyList = 63, RULE_populatedList = 64, RULE_listElement = 65, RULE_caseTerm = 66, 
		RULE_caseStatementAndVariable = 67, RULE_caseStatement = 68, RULE_caseVariable = 69, 
		RULE_caseConditions = 70, RULE_caseGeneralStatement = 71, RULE_caseValueCompare = 72, 
		RULE_caseOtherwiseStatement = 73, RULE_caseImplementation = 74, RULE_caseValueImplementationSeparator = 75, 
		RULE_otherwiseTerm = 76, RULE_dollarSignTerm = 77, RULE_functionToMethod = 78, 
		RULE_haskellFunctionToScalaMethodName = 79, RULE_functionToMethodDollarSign = 80, 
		RULE_functionToMethodParen = 81, RULE_functionToMethodTerm = 82, RULE_recursiveMain = 83, 
		RULE_returnUnitType = 84, RULE_patternMatchArray = 85, RULE_patternMatchParen = 86, 
		RULE_generalPatternMatchingTerm = 87, RULE_generalFunctionCall = 88, RULE_functionArgument = 89, 
		RULE_functionCallFunctionName = 90, RULE_nonHaskellReservedFunctionName = 91, 
		RULE_haskellFunctionName = 92, RULE_stringTerm = 93, RULE_word = 94;
	public static final String[] ruleNames = {
		"program", "codeBlock", "headerComment", "lineComment", "generalComment", 
		"commentWord", "moduleDefinition", "moduleOpen", "moduleFunctionList", 
		"moduleClose", "moduleName", "moduleFunctionName", "func", "singleLinePartiallyAppliedFunction", 
		"partiallyAppliedFunctionName", "assignmentOperator", "assignmentExpression", 
		"mainFunction", "mainPrototype", "mainHeader", "mainStatement", "mainWords", 
		"parenMainWord", "generalMainWord", "monadExpression", "immutableValueName", 
		"funcPrototype", "functionName", "typeSignature", "typeFunction", "typeFunctionSeparator", 
		"inputType", "returnType", "type", "primitiveTypeName", "unitType", "funcbody", 
		"funcStatement", "patternMatchingArguments", "patternMatchingArgument", 
		"generalMatchingArgument", "patternMatchParentheses", "underScoreArgument", 
		"patternMatchingExpression", "patternMatchingTerm", "ifStatementPattern", 
		"ifStatementExpression", "ifTerm", "thenTerm", "elseTerm", "prependTerm", 
		"lambdaFunction", "allLambdaArguments", "singleLamdaArgument", "underscoreLambdaArgument", 
		"lamdaArgumentsBodySeparator", "typedLamdaArgument", "lambdaBody", "concatenatedList", 
		"headList", "colonTerm", "underScoreTerm", "tailList", "emptyList", "populatedList", 
		"listElement", "caseTerm", "caseStatementAndVariable", "caseStatement", 
		"caseVariable", "caseConditions", "caseGeneralStatement", "caseValueCompare", 
		"caseOtherwiseStatement", "caseImplementation", "caseValueImplementationSeparator", 
		"otherwiseTerm", "dollarSignTerm", "functionToMethod", "haskellFunctionToScalaMethodName", 
		"functionToMethodDollarSign", "functionToMethodParen", "functionToMethodTerm", 
		"recursiveMain", "returnUnitType", "patternMatchArray", "patternMatchParen", 
		"generalPatternMatchingTerm", "generalFunctionCall", "functionArgument", 
		"functionCallFunctionName", "nonHaskellReservedFunctionName", "haskellFunctionName", 
		"stringTerm", "word"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{-'", "'-}'", "'module'", "'where'", "','", "'((('", 
		"')))'", null, "'\"'", "'('", "')'", "':'", "'--'", "'='", "'$'", "'_'", 
		"'\\'", "'IO'", "'do'", "'let'", "'case'", "'of'", "'if'", "'then'", "'else'", 
		"'return'", "'otherwise'", "'::'", "'<-'", "'->'", "'main'", null, null, 
		null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "QUOTATION_MARK", 
		"LEFT_PAREN", "RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", 
		"RIGHT_ASSOC_DOLLAR_SIGN", "UNDERSCORE", "BACKSLASH", "IO", "DO", "LET", 
		"CASE", "OF", "IF", "THEN", "ELSE", "RETURN", "OTHERWISE", "ARG_TYPE_SEPARATOR", 
		"MONAD_ARROW", "TYPE_SEPARATOR", "MAIN_FUNCTION", "INT_VAL", "INT_OP", 
		"TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", "NEWLINE", "NAME", 
		"WS"
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
			setState(191);
			_la = _input.LA(1);
			if (_la==HEADER_COMMENT_OPEN) {
				{
				setState(190);
				headerComment();
				}
			}

			setState(194);
			_la = _input.LA(1);
			if (_la==MODULE_STRING) {
				{
				setState(193);
				moduleDefinition();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(196);
						match(NEWLINE);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(202);
					codeBlock();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(208);
				match(NEWLINE);
				}
				}
				setState(213);
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
			setState(216);
			switch (_input.LA(1)) {
			case MAIN_FUNCTION:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				func();
				}
				break;
			case INLINE_COMMENT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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
			setState(218);
			match(HEADER_COMMENT_OPEN);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(219);
				match(NAME);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
			setState(227);
			generalComment();
			setState(228);
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
			setState(230);
			match(INLINE_COMMENT_SYMBOL);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(231);
				commentWord();
				}
				}
				setState(236);
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
			setState(237);
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
			setState(239);
			moduleOpen();
			setState(240);
			moduleName();
			setState(241);
			moduleFunctionList();
			setState(242);
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
			setState(244);
			match(MODULE_STRING);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(245);
				match(NEWLINE);
				}
				}
				setState(250);
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
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(251);
				match(NEWLINE);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(LEFT_PAREN);
			setState(258);
			moduleFunctionName();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				moduleFunctionName();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(RIGHT_PAREN);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(NEWLINE);
					}
					} 
				}
				setState(272);
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
			setState(281);
			match(NAME);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(NEWLINE);
					}
					} 
				}
				setState(287);
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(288);
				match(NEWLINE);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(NAME);
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				funcPrototype();
				setState(302);
				funcbody();
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(NEWLINE);
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				mainFunction();
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310);
						match(NEWLINE);
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				singleLinePartiallyAppliedFunction();
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						match(NEWLINE);
						}
						} 
					}
					setState(322);
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
			setState(325);
			partiallyAppliedFunctionName();
			setState(326);
			assignmentOperator();
			setState(327);
			assignmentExpression();
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					match(NEWLINE);
					}
					} 
				}
				setState(333);
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
			setState(334);
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
			setState(336);
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
			setState(338);
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
			setState(340);
			mainPrototype();
			setState(342);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(341);
				match(NEWLINE);
				}
			}

			setState(344);
			mainHeader();
			setState(346);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(345);
				match(NEWLINE);
				}
			}

			setState(349); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(348);
					mainStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(351); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(353);
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
			setState(356);
			match(MAIN_FUNCTION);
			setState(357);
			match(ARG_TYPE_SEPARATOR);
			setState(358);
			match(IO);
			setState(359);
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
			setState(361);
			match(MAIN_FUNCTION);
			setState(362);
			match(EQUAL_SIGN);
			setState(364);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(363);
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
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366);
					monadExpression();
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(371);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				patternMatchingExpression();
				setState(374);
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
			setState(381);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				haskellFunctionName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				parenMainWord();
				}
				break;
			case INT_VAL:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
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
			setState(383);
			match(LEFT_PAREN);
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				mainWords();
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << INT_VAL) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0) );
			setState(389);
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
			setState(391);
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
			setState(393);
			immutableValueName();
			setState(394);
			match(MONAD_ARROW);
			setState(395);
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
			setState(397);
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
			setState(399);
			functionName();
			setState(400);
			match(ARG_TYPE_SEPARATOR);
			setState(401);
			typeSignature();
			setState(402);
			returnType();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(403);
				match(NEWLINE);
				}
				}
				setState(408);
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
			setState(409);
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
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					inputType();
					setState(412);
					match(TYPE_SEPARATOR);
					}
					} 
				}
				setState(418);
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

	public static class TypeFunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
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
		enterRule(_localctx, 58, RULE_typeFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(LEFT_PAREN);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					type();
					setState(421);
					typeFunctionSeparator();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(428);
			type();
			setState(429);
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
		enterRule(_localctx, 60, RULE_typeFunctionSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 62, RULE_inputType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 64, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 66, RULE_type);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case TYPE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				primitiveTypeName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				typeFunction();
				}
				break;
			case UNIT_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				unitType();
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
		enterRule(_localctx, 68, RULE_primitiveTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		enterRule(_localctx, 70, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		enterRule(_localctx, 72, RULE_funcbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(446);
					funcStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(449); 
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
		enterRule(_localctx, 74, RULE_funcStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(NAME);
			setState(452);
			patternMatchingArguments();
			setState(453);
			match(EQUAL_SIGN);
			setState(454);
			patternMatchingExpression();
			setState(455);
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
		enterRule(_localctx, 76, RULE_patternMatchingArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << NAME))) != 0)) {
				{
				{
				setState(457);
				patternMatchingArgument();
				}
				}
				setState(462);
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
		enterRule(_localctx, 78, RULE_patternMatchingArgument);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				patternMatchParentheses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				concatenatedList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				emptyList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				underScoreTerm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
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
		enterRule(_localctx, 80, RULE_generalMatchingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		enterRule(_localctx, 82, RULE_patternMatchParentheses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(LEFT_PAREN);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				patternMatchingArgument();
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << NAME))) != 0) );
			setState(478);
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
		enterRule(_localctx, 84, RULE_underScoreArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		enterRule(_localctx, 86, RULE_patternMatchingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(482);
					patternMatchingTerm();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485); 
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
		enterRule(_localctx, 88, RULE_patternMatchingTerm);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				dollarSignTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				lambdaFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				generalFunctionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				patternMatchParen();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				functionToMethod();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				haskellFunctionName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				prependTerm();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(494);
				generalPatternMatchingTerm();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				patternMatchArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(496);
				ifStatementPattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(497);
				recursiveMain();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(498);
				returnUnitType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(499);
				concatenatedList();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(500);
				emptyList();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(501);
				populatedList();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(502);
				caseTerm();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(503);
				stringTerm();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(504);
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
		enterRule(_localctx, 90, RULE_ifStatementPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			ifTerm();
			setState(508);
			ifStatementExpression();
			setState(509);
			thenTerm();
			setState(510);
			ifStatementExpression();
			setState(511);
			elseTerm();
			setState(512);
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
		enterRule(_localctx, 92, RULE_ifStatementExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(514);
				match(NEWLINE);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			match(LEFT_PAREN);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(521);
				match(NEWLINE);
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			patternMatchingExpression();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(528);
				match(NEWLINE);
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(RIGHT_PAREN);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					match(NEWLINE);
					}
					} 
				}
				setState(540);
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
		enterRule(_localctx, 94, RULE_ifTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		enterRule(_localctx, 96, RULE_thenTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 98, RULE_elseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		enterRule(_localctx, 100, RULE_prependTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			patternMatchParen();
			setState(548);
			colonTerm();
			setState(549);
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
		enterRule(_localctx, 102, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(LEFT_PAREN);
			setState(552);
			match(BACKSLASH);
			setState(553);
			allLambdaArguments();
			setState(554);
			lamdaArgumentsBodySeparator();
			setState(555);
			patternMatchingExpression();
			setState(556);
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
		enterRule(_localctx, 104, RULE_allLambdaArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(558);
				singleLamdaArgument();
				}
				}
				setState(561); 
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
		enterRule(_localctx, 106, RULE_singleLamdaArgument);
		try {
			setState(565);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				underscoreLambdaArgument();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
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
		enterRule(_localctx, 108, RULE_underscoreLambdaArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 110, RULE_lamdaArgumentsBodySeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 112, RULE_typedLamdaArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 114, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		enterRule(_localctx, 116, RULE_concatenatedList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(LEFT_PAREN);
			setState(576);
			headList();
			setState(577);
			colonTerm();
			setState(578);
			tailList();
			setState(579);
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
		enterRule(_localctx, 118, RULE_headList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
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
		enterRule(_localctx, 120, RULE_colonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
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
		enterRule(_localctx, 122, RULE_underScoreTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		enterRule(_localctx, 124, RULE_tailList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		enterRule(_localctx, 126, RULE_emptyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(LEFT_SQUARE_BRACKET);
			setState(590);
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
		enterRule(_localctx, 128, RULE_populatedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(LEFT_SQUARE_BRACKET);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(593);
					listElement();
					setState(594);
					match(COMMA);
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(601);
			listElement();
			setState(602);
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
		enterRule(_localctx, 130, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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
		enterRule(_localctx, 132, RULE_caseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			caseStatementAndVariable();
			setState(607);
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
		enterRule(_localctx, 134, RULE_caseStatementAndVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			caseStatement();
			setState(610);
			match(LEFT_PAREN);
			setState(611);
			caseVariable();
			setState(612);
			match(RIGHT_PAREN);
			setState(613);
			match(OF);
			setState(614);
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
		enterRule(_localctx, 136, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
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
		enterRule(_localctx, 138, RULE_caseVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		enterRule(_localctx, 140, RULE_caseConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << CASE) | (1L << IF) | (1L << RETURN) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0)) {
				{
				{
				setState(620);
				caseGeneralStatement();
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
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
		enterRule(_localctx, 142, RULE_caseGeneralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			caseValueCompare();
			setState(629);
			caseValueImplementationSeparator();
			setState(630);
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
		enterRule(_localctx, 144, RULE_caseValueCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
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
		enterRule(_localctx, 146, RULE_caseOtherwiseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			otherwiseTerm();
			setState(635);
			caseValueImplementationSeparator();
			setState(636);
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
		enterRule(_localctx, 148, RULE_caseImplementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			patternMatchingExpression();
			setState(639);
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
		enterRule(_localctx, 150, RULE_caseValueImplementationSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		enterRule(_localctx, 152, RULE_otherwiseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
		enterRule(_localctx, 154, RULE_dollarSignTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(RIGHT_ASSOC_DOLLAR_SIGN);
			setState(646);
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
		enterRule(_localctx, 156, RULE_functionToMethod);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				functionToMethodDollarSign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				functionToMethodParen();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
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
		enterRule(_localctx, 158, RULE_haskellFunctionToScalaMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		enterRule(_localctx, 160, RULE_functionToMethodDollarSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			haskellFunctionToScalaMethodName();
			setState(656);
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
		enterRule(_localctx, 162, RULE_functionToMethodParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			haskellFunctionToScalaMethodName();
			setState(659);
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
		enterRule(_localctx, 164, RULE_functionToMethodTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			haskellFunctionToScalaMethodName();
			setState(662);
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
		enterRule(_localctx, 166, RULE_recursiveMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(665);
			match(MAIN_FUNCTION);
			setState(666);
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
		enterRule(_localctx, 168, RULE_returnUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(RETURN);
			setState(669);
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
		enterRule(_localctx, 170, RULE_patternMatchArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(LEFT_SQUARE_BRACKET);
			setState(672);
			patternMatchingExpression();
			setState(673);
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
		enterRule(_localctx, 172, RULE_patternMatchParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(LEFT_PAREN);
			setState(676);
			patternMatchingExpression();
			setState(677);
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
		enterRule(_localctx, 174, RULE_generalPatternMatchingTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
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
		enterRule(_localctx, 176, RULE_generalFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(682);
			functionCallFunctionName();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << CASE) | (1L << IF) | (1L << RETURN) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0)) {
				{
				{
				setState(683);
				functionArgument();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
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
		enterRule(_localctx, 178, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		enterRule(_localctx, 180, RULE_functionCallFunctionName);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				haskellFunctionName();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
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
		enterRule(_localctx, 182, RULE_nonHaskellReservedFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		enterRule(_localctx, 184, RULE_haskellFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		enterRule(_localctx, 186, RULE_stringTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(QUOTATION_MARK);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(702);
				word();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708);
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
		enterRule(_localctx, 188, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u02cb\4\2\t\2\4"+
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
		"`\t`\3\2\5\2\u00c2\n\2\3\2\5\2\u00c5\n\2\3\2\7\2\u00c8\n\2\f\2\16\2\u00cb"+
		"\13\2\3\2\7\2\u00ce\n\2\f\2\16\2\u00d1\13\2\3\2\7\2\u00d4\n\2\f\2\16\2"+
		"\u00d7\13\2\3\3\3\3\5\3\u00db\n\3\3\4\3\4\7\4\u00df\n\4\f\4\16\4\u00e2"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6\u00eb\n\6\f\6\16\6\u00ee\13\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00f9\n\t\f\t\16\t\u00fc\13\t\3"+
		"\n\7\n\u00ff\n\n\f\n\16\n\u0102\13\n\3\n\3\n\3\n\3\n\7\n\u0108\n\n\f\n"+
		"\16\n\u010b\13\n\3\n\3\n\7\n\u010f\n\n\f\n\16\n\u0112\13\n\3\13\7\13\u0115"+
		"\n\13\f\13\16\13\u0118\13\13\3\13\3\13\3\f\3\f\7\f\u011e\n\f\f\f\16\f"+
		"\u0121\13\f\3\r\7\r\u0124\n\r\f\r\16\r\u0127\13\r\3\r\3\r\7\r\u012b\n"+
		"\r\f\r\16\r\u012e\13\r\3\16\3\16\3\16\7\16\u0133\n\16\f\16\16\16\u0136"+
		"\13\16\3\16\3\16\7\16\u013a\n\16\f\16\16\16\u013d\13\16\3\16\3\16\7\16"+
		"\u0141\n\16\f\16\16\16\u0144\13\16\5\16\u0146\n\16\3\17\3\17\3\17\3\17"+
		"\7\17\u014c\n\17\f\17\16\17\u014f\13\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\5\23\u0159\n\23\3\23\3\23\5\23\u015d\n\23\3\23\6\23\u0160\n"+
		"\23\r\23\16\23\u0161\3\23\5\23\u0165\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u016f\n\25\3\26\6\26\u0172\n\26\r\26\16\26\u0173\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u017b\n\26\3\27\3\27\3\27\5\27\u0180\n\27\3"+
		"\30\3\30\6\30\u0184\n\30\r\30\16\30\u0185\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u0197\n\34\f\34\16"+
		"\34\u019a\13\34\3\35\3\35\3\36\3\36\3\36\7\36\u01a1\n\36\f\36\16\36\u01a4"+
		"\13\36\3\37\3\37\3\37\3\37\7\37\u01aa\n\37\f\37\16\37\u01ad\13\37\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\5#\u01bb\n#\3$\3$\3%\3%\3&\6&"+
		"\u01c2\n&\r&\16&\u01c3\3\'\3\'\3\'\3\'\3\'\3\'\3(\7(\u01cd\n(\f(\16(\u01d0"+
		"\13(\3)\3)\3)\3)\3)\5)\u01d7\n)\3*\3*\3+\3+\6+\u01dd\n+\r+\16+\u01de\3"+
		"+\3+\3,\3,\3-\6-\u01e6\n-\r-\16-\u01e7\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u01fc\n.\3/\3/\3/\3/\3/\3/\3/\3\60\7\60\u0206"+
		"\n\60\f\60\16\60\u0209\13\60\3\60\3\60\7\60\u020d\n\60\f\60\16\60\u0210"+
		"\13\60\3\60\3\60\7\60\u0214\n\60\f\60\16\60\u0217\13\60\3\60\3\60\7\60"+
		"\u021b\n\60\f\60\16\60\u021e\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u0232\n\66"+
		"\r\66\16\66\u0233\3\67\3\67\5\67\u0238\n\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3B\7B\u0257"+
		"\nB\fB\16B\u025a\13B\3B\3B\3B\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3"+
		"F\3G\3G\3H\7H\u0270\nH\fH\16H\u0273\13H\3H\3H\3I\3I\3I\3I\3J\3J\3K\3K"+
		"\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3P\5P\u028e\nP\3Q\3Q\3R\3R"+
		"\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3Y"+
		"\3Y\3Z\3Z\3Z\7Z\u02af\nZ\fZ\16Z\u02b2\13Z\3Z\3Z\3[\3[\3\\\3\\\5\\\u02ba"+
		"\n\\\3]\3]\3^\3^\3_\3_\7_\u02c2\n_\f_\16_\u02c5\13_\3_\3_\3`\3`\3`\2\2"+
		"a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\2\4\4\2$$**\4\2$%**\u02b6\2\u00c1\3\2\2\2\4\u00da\3\2\2\2\6\u00dc"+
		"\3\2\2\2\b\u00e5\3\2\2\2\n\u00e8\3\2\2\2\f\u00ef\3\2\2\2\16\u00f1\3\2"+
		"\2\2\20\u00f6\3\2\2\2\22\u0100\3\2\2\2\24\u0116\3\2\2\2\26\u011b\3\2\2"+
		"\2\30\u0125\3\2\2\2\32\u0145\3\2\2\2\34\u0147\3\2\2\2\36\u0150\3\2\2\2"+
		" \u0152\3\2\2\2\"\u0154\3\2\2\2$\u0156\3\2\2\2&\u0166\3\2\2\2(\u016b\3"+
		"\2\2\2*\u017a\3\2\2\2,\u017f\3\2\2\2.\u0181\3\2\2\2\60\u0189\3\2\2\2\62"+
		"\u018b\3\2\2\2\64\u018f\3\2\2\2\66\u0191\3\2\2\28\u019b\3\2\2\2:\u01a2"+
		"\3\2\2\2<\u01a5\3\2\2\2>\u01b1\3\2\2\2@\u01b3\3\2\2\2B\u01b5\3\2\2\2D"+
		"\u01ba\3\2\2\2F\u01bc\3\2\2\2H\u01be\3\2\2\2J\u01c1\3\2\2\2L\u01c5\3\2"+
		"\2\2N\u01ce\3\2\2\2P\u01d6\3\2\2\2R\u01d8\3\2\2\2T\u01da\3\2\2\2V\u01e2"+
		"\3\2\2\2X\u01e5\3\2\2\2Z\u01fb\3\2\2\2\\\u01fd\3\2\2\2^\u0207\3\2\2\2"+
		"`\u021f\3\2\2\2b\u0221\3\2\2\2d\u0223\3\2\2\2f\u0225\3\2\2\2h\u0229\3"+
		"\2\2\2j\u0231\3\2\2\2l\u0237\3\2\2\2n\u0239\3\2\2\2p\u023b\3\2\2\2r\u023d"+
		"\3\2\2\2t\u023f\3\2\2\2v\u0241\3\2\2\2x\u0247\3\2\2\2z\u0249\3\2\2\2|"+
		"\u024b\3\2\2\2~\u024d\3\2\2\2\u0080\u024f\3\2\2\2\u0082\u0252\3\2\2\2"+
		"\u0084\u025e\3\2\2\2\u0086\u0260\3\2\2\2\u0088\u0263\3\2\2\2\u008a\u026a"+
		"\3\2\2\2\u008c\u026c\3\2\2\2\u008e\u0271\3\2\2\2\u0090\u0276\3\2\2\2\u0092"+
		"\u027a\3\2\2\2\u0094\u027c\3\2\2\2\u0096\u0280\3\2\2\2\u0098\u0283\3\2"+
		"\2\2\u009a\u0285\3\2\2\2\u009c\u0287\3\2\2\2\u009e\u028d\3\2\2\2\u00a0"+
		"\u028f\3\2\2\2\u00a2\u0291\3\2\2\2\u00a4\u0294\3\2\2\2\u00a6\u0297\3\2"+
		"\2\2\u00a8\u029a\3\2\2\2\u00aa\u029e\3\2\2\2\u00ac\u02a1\3\2\2\2\u00ae"+
		"\u02a5\3\2\2\2\u00b0\u02a9\3\2\2\2\u00b2\u02ab\3\2\2\2\u00b4\u02b5\3\2"+
		"\2\2\u00b6\u02b9\3\2\2\2\u00b8\u02bb\3\2\2\2\u00ba\u02bd\3\2\2\2\u00bc"+
		"\u02bf\3\2\2\2\u00be\u02c8\3\2\2\2\u00c0\u00c2\5\6\4\2\u00c1\u00c0\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5\16\b\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cf\3\2\2\2\u00c6\u00c8\7)"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5\4"+
		"\3\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7)"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\5\32\16"+
		"\2\u00d9\u00db\5\b\5\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\5"+
		"\3\2\2\2\u00dc\u00e0\7\5\2\2\u00dd\u00df\7*\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4\7\3\2\2\2\u00e5\u00e6"+
		"\5\n\6\2\u00e6\u00e7\7)\2\2\u00e7\t\3\2\2\2\u00e8\u00ec\7\21\2\2\u00e9"+
		"\u00eb\5\f\7\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\13\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0"+
		"\7*\2\2\u00f0\r\3\2\2\2\u00f1\u00f2\5\20\t\2\u00f2\u00f3\5\26\f\2\u00f3"+
		"\u00f4\5\22\n\2\u00f4\u00f5\5\24\13\2\u00f5\17\3\2\2\2\u00f6\u00fa\7\7"+
		"\2\2\u00f7\u00f9\7)\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\21\3\2\2\2\u00fc\u00fa\3\2\2"+
		"\2\u00fd\u00ff\7)\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7\16\2\2\u0104\u0109\5\30\r\2\u0105\u0106\7\t\2\2\u0106\u0108\5"+
		"\30\r\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7\17"+
		"\2\2\u010d\u010f\7)\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\23\3\2\2\2\u0112\u0110\3\2\2"+
		"\2\u0113\u0115\7)\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7\b\2\2\u011a\25\3\2\2\2\u011b\u011f\7*\2\2\u011c\u011e\7)\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\27\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7)\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\7*\2\2\u0129"+
		"\u012b\7)\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\31\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130"+
		"\5\66\34\2\u0130\u0134\5J&\2\u0131\u0133\7)\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0146\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u013b\5$\23\2\u0138\u013a\7)\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u0146\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0142\5\34\17\2\u013f"+
		"\u0141\7)\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u012f\3\2\2\2\u0145\u0137\3\2\2\2\u0145\u013e\3\2\2\2\u0146\33\3\2\2"+
		"\2\u0147\u0148\5\36\20\2\u0148\u0149\5 \21\2\u0149\u014d\5\"\22\2\u014a"+
		"\u014c\7)\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\35\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151"+
		"\7*\2\2\u0151\37\3\2\2\2\u0152\u0153\7\22\2\2\u0153!\3\2\2\2\u0154\u0155"+
		"\5X-\2\u0155#\3\2\2\2\u0156\u0158\5&\24\2\u0157\u0159\7)\2\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\5(\25\2\u015b"+
		"\u015d\7)\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u0160\5*\26\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\7)"+
		"\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165%\3\2\2\2\u0166\u0167"+
		"\7#\2\2\u0167\u0168\7 \2\2\u0168\u0169\7\26\2\2\u0169\u016a\5H%\2\u016a"+
		"\'\3\2\2\2\u016b\u016c\7#\2\2\u016c\u016e\7\22\2\2\u016d\u016f\7\27\2"+
		"\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f)\3\2\2\2\u0170\u0172"+
		"\5\62\32\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7)\2\2\u0176\u017b"+
		"\3\2\2\2\u0177\u0178\5X-\2\u0178\u0179\7)\2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u0171\3\2\2\2\u017a\u0177\3\2\2\2\u017b+\3\2\2\2\u017c\u0180\5\u00ba"+
		"^\2\u017d\u0180\5.\30\2\u017e\u0180\5\60\31\2\u017f\u017c\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180-\3\2\2\2\u0181\u0183\7\16\2\2"+
		"\u0182\u0184\5,\27\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\17\2\2"+
		"\u0188/\3\2\2\2\u0189\u018a\t\2\2\2\u018a\61\3\2\2\2\u018b\u018c\5\64"+
		"\33\2\u018c\u018d\7!\2\2\u018d\u018e\5X-\2\u018e\63\3\2\2\2\u018f\u0190"+
		"\7*\2\2\u0190\65\3\2\2\2\u0191\u0192\58\35\2\u0192\u0193\7 \2\2\u0193"+
		"\u0194\5:\36\2\u0194\u0198\5B\"\2\u0195\u0197\7)\2\2\u0196\u0195\3\2\2"+
		"\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\67"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7*\2\2\u019c9\3\2\2\2\u019d\u019e"+
		"\5@!\2\u019e\u019f\7\"\2\2\u019f\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3;\3\2\2\2"+
		"\u01a4\u01a2\3\2\2\2\u01a5\u01ab\7\16\2\2\u01a6\u01a7\5D#\2\u01a7\u01a8"+
		"\5> \2\u01a8\u01aa\3\2\2\2\u01a9\u01a6\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01af\5D#\2\u01af\u01b0\7\17\2\2\u01b0=\3\2\2\2\u01b1\u01b2"+
		"\7\"\2\2\u01b2?\3\2\2\2\u01b3\u01b4\5D#\2\u01b4A\3\2\2\2\u01b5\u01b6\5"+
		"D#\2\u01b6C\3\2\2\2\u01b7\u01bb\5F$\2\u01b8\u01bb\5<\37\2\u01b9\u01bb"+
		"\5H%\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"E\3\2\2\2\u01bc\u01bd\7&\2\2\u01bdG\3\2\2\2\u01be\u01bf\7(\2\2\u01bfI"+
		"\3\2\2\2\u01c0\u01c2\5L\'\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4K\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6"+
		"\u01c7\5N(\2\u01c7\u01c8\7\22\2\2\u01c8\u01c9\5X-\2\u01c9\u01ca\7)\2\2"+
		"\u01caM\3\2\2\2\u01cb\u01cd\5P)\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfO\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d7\5T+\2\u01d2\u01d7\5v<\2\u01d3\u01d7\5\u0080A\2\u01d4"+
		"\u01d7\5|?\2\u01d5\u01d7\5R*\2\u01d6\u01d1\3\2\2\2\u01d6\u01d2\3\2\2\2"+
		"\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7Q\3"+
		"\2\2\2\u01d8\u01d9\7*\2\2\u01d9S\3\2\2\2\u01da\u01dc\7\16\2\2\u01db\u01dd"+
		"\5P)\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\17\2\2\u01e1U\3\2\2\2"+
		"\u01e2\u01e3\5|?\2\u01e3W\3\2\2\2\u01e4\u01e6\5Z.\2\u01e5\u01e4\3\2\2"+
		"\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8Y"+
		"\3\2\2\2\u01e9\u01fc\5\u009cO\2\u01ea\u01fc\5h\65\2\u01eb\u01fc\5\u00b2"+
		"Z\2\u01ec\u01fc\5\u00aeX\2\u01ed\u01fc\5\u009eP\2\u01ee\u01fc\5\u00ba"+
		"^\2\u01ef\u01fc\5f\64\2\u01f0\u01fc\5\u00b0Y\2\u01f1\u01fc\5\u00acW\2"+
		"\u01f2\u01fc\5\\/\2\u01f3\u01fc\5\u00a8U\2\u01f4\u01fc\5\u00aaV\2\u01f5"+
		"\u01fc\5v<\2\u01f6\u01fc\5\u0080A\2\u01f7\u01fc\5\u0082B\2\u01f8\u01fc"+
		"\5\u0086D\2\u01f9\u01fc\5\u00bc_\2\u01fa\u01fc\7*\2\2\u01fb\u01e9\3\2"+
		"\2\2\u01fb\u01ea\3\2\2\2\u01fb\u01eb\3\2\2\2\u01fb\u01ec\3\2\2\2\u01fb"+
		"\u01ed\3\2\2\2\u01fb\u01ee\3\2\2\2\u01fb\u01ef\3\2\2\2\u01fb\u01f0\3\2"+
		"\2\2\u01fb\u01f1\3\2\2\2\u01fb\u01f2\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fb"+
		"\u01f4\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb\u01f7\3\2"+
		"\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"[\3\2\2\2\u01fd\u01fe\5`\61\2\u01fe\u01ff\5^\60\2\u01ff\u0200\5b\62\2"+
		"\u0200\u0201\5^\60\2\u0201\u0202\5d\63\2\u0202\u0203\5^\60\2\u0203]\3"+
		"\2\2\2\u0204\u0206\7)\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020e\7\16\2\2\u020b\u020d\7)\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0211\u0215\5X-\2\u0212\u0214\7)\2\2\u0213\u0212"+
		"\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021c\7\17\2\2\u0219\u021b\7"+
		")\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d_\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7\33\2\2"+
		"\u0220a\3\2\2\2\u0221\u0222\7\34\2\2\u0222c\3\2\2\2\u0223\u0224\7\35\2"+
		"\2\u0224e\3\2\2\2\u0225\u0226\5\u00aeX\2\u0226\u0227\5z>\2\u0227\u0228"+
		"\5\u00aeX\2\u0228g\3\2\2\2\u0229\u022a\7\16\2\2\u022a\u022b\7\25\2\2\u022b"+
		"\u022c\5j\66\2\u022c\u022d\5p9\2\u022d\u022e\5X-\2\u022e\u022f\7\17\2"+
		"\2\u022fi\3\2\2\2\u0230\u0232\5l\67\2\u0231\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234k\3\2\2\2\u0235"+
		"\u0238\5n8\2\u0236\u0238\5r:\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2"+
		"\u0238m\3\2\2\2\u0239\u023a\5|?\2\u023ao\3\2\2\2\u023b\u023c\7\"\2\2\u023c"+
		"q\3\2\2\2\u023d\u023e\7*\2\2\u023es\3\2\2\2\u023f\u0240\5X-\2\u0240u\3"+
		"\2\2\2\u0241\u0242\7\16\2\2\u0242\u0243\5x=\2\u0243\u0244\5z>\2\u0244"+
		"\u0245\5~@\2\u0245\u0246\7\17\2\2\u0246w\3\2\2\2\u0247\u0248\5Z.\2\u0248"+
		"y\3\2\2\2\u0249\u024a\7\20\2\2\u024a{\3\2\2\2\u024b\u024c\7\24\2\2\u024c"+
		"}\3\2\2\2\u024d\u024e\5Z.\2\u024e\177\3\2\2\2\u024f\u0250\7\3\2\2\u0250"+
		"\u0251\7\4\2\2\u0251\u0081\3\2\2\2\u0252\u0258\7\3\2\2\u0253\u0254\5\u0084"+
		"C\2\u0254\u0255\7\t\2\2\u0255\u0257\3\2\2\2\u0256\u0253\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025b\u025c\5\u0084C\2\u025c\u025d\7\4\2\2\u025d"+
		"\u0083\3\2\2\2\u025e\u025f\5Z.\2\u025f\u0085\3\2\2\2\u0260\u0261\5\u0088"+
		"E\2\u0261\u0262\5\u008eH\2\u0262\u0087\3\2\2\2\u0263\u0264\5\u008aF\2"+
		"\u0264\u0265\7\16\2\2\u0265\u0266\5\u008cG\2\u0266\u0267\7\17\2\2\u0267"+
		"\u0268\7\32\2\2\u0268\u0269\7)\2\2\u0269\u0089\3\2\2\2\u026a\u026b\7\31"+
		"\2\2\u026b\u008b\3\2\2\2\u026c\u026d\5X-\2\u026d\u008d\3\2\2\2\u026e\u0270"+
		"\5\u0090I\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275"+
		"\5\u0094K\2\u0275\u008f\3\2\2\2\u0276\u0277\5\u0092J\2\u0277\u0278\5\u0098"+
		"M\2\u0278\u0279\5\u0096L\2\u0279\u0091\3\2\2\2\u027a\u027b\5X-\2\u027b"+
		"\u0093\3\2\2\2\u027c\u027d\5\u009aN\2\u027d\u027e\5\u0098M\2\u027e\u027f"+
		"\5\u0096L\2\u027f\u0095\3\2\2\2\u0280\u0281\5X-\2\u0281\u0282\7)\2\2\u0282"+
		"\u0097\3\2\2\2\u0283\u0284\7\"\2\2\u0284\u0099\3\2\2\2\u0285\u0286\7\37"+
		"\2\2\u0286\u009b\3\2\2\2\u0287\u0288\7\23\2\2\u0288\u0289\5X-\2\u0289"+
		"\u009d\3\2\2\2\u028a\u028e\5\u00a2R\2\u028b\u028e\5\u00a4S\2\u028c\u028e"+
		"\5\u00a6T\2\u028d\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2"+
		"\2\u028e\u009f\3\2\2\2\u028f\u0290\7\f\2\2\u0290\u00a1\3\2\2\2\u0291\u0292"+
		"\5\u00a0Q\2\u0292\u0293\5\u009cO\2\u0293\u00a3\3\2\2\2\u0294\u0295\5\u00a0"+
		"Q\2\u0295\u0296\5\u00aeX\2\u0296\u00a5\3\2\2\2\u0297\u0298\5\u00a0Q\2"+
		"\u0298\u0299\5\u00b0Y\2\u0299\u00a7\3\2\2\2\u029a\u029b\7\n\2\2\u029b"+
		"\u029c\7#\2\2\u029c\u029d\7\13\2\2\u029d\u00a9\3\2\2\2\u029e\u029f\7\36"+
		"\2\2\u029f\u02a0\7(\2\2\u02a0\u00ab\3\2\2\2\u02a1\u02a2\7\3\2\2\u02a2"+
		"\u02a3\5X-\2\u02a3\u02a4\7\4\2\2\u02a4\u00ad\3\2\2\2\u02a5\u02a6\7\16"+
		"\2\2\u02a6\u02a7\5X-\2\u02a7\u02a8\7\17\2\2\u02a8\u00af\3\2\2\2\u02a9"+
		"\u02aa\t\3\2\2\u02aa\u00b1\3\2\2\2\u02ab\u02ac\7\n\2\2\u02ac\u02b0\5\u00b6"+
		"\\\2\u02ad\u02af\5\u00b4[\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2"+
		"\2\2\u02b3\u02b4\7\13\2\2\u02b4\u00b3\3\2\2\2\u02b5\u02b6\5Z.\2\u02b6"+
		"\u00b5\3\2\2\2\u02b7\u02ba\5\u00ba^\2\u02b8\u02ba\5\u00b8]\2\u02b9\u02b7"+
		"\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u00b7\3\2\2\2\u02bb\u02bc\7*\2\2\u02bc"+
		"\u00b9\3\2\2\2\u02bd\u02be\7\'\2\2\u02be\u00bb\3\2\2\2\u02bf\u02c3\7\r"+
		"\2\2\u02c0\u02c2\5\u00be`\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2"+
		"\2\2\u02c6\u02c7\7\r\2\2\u02c7\u00bd\3\2\2\2\u02c8\u02c9\7*\2\2\u02c9"+
		"\u00bf\3\2\2\2\66\u00c1\u00c4\u00c9\u00cf\u00d5\u00da\u00e0\u00ec\u00fa"+
		"\u0100\u0109\u0110\u0116\u011f\u0125\u012c\u0134\u013b\u0142\u0145\u014d"+
		"\u0158\u015c\u0161\u0164\u016e\u0173\u017a\u017f\u0185\u0198\u01a2\u01ab"+
		"\u01ba\u01c3\u01ce\u01d6\u01de\u01e7\u01fb\u0207\u020e\u0215\u021c\u0233"+
		"\u0237\u0258\u0271\u028d\u02b0\u02b9\u02c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}