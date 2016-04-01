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
		BIND_OPERATOR=40, JUST=41, NOTHING=42, NEWLINE=43, TRUE=44, FALSE=45, 
		NAME=46, WS=47;
	public static final int
		RULE_program = 0, RULE_codeBlock = 1, RULE_headerComment = 2, RULE_headerCommentNewLine = 3, 
		RULE_lineComment = 4, RULE_generalComment = 5, RULE_commentWord = 6, RULE_moduleDefinition = 7, 
		RULE_moduleOpen = 8, RULE_moduleFunctionList = 9, RULE_moduleClose = 10, 
		RULE_moduleName = 11, RULE_moduleFunctionName = 12, RULE_func = 13, RULE_singleLinePartiallyAppliedFunction = 14, 
		RULE_partiallyAppliedFunctionName = 15, RULE_assignmentOperator = 16, 
		RULE_assignmentExpression = 17, RULE_mainFunction = 18, RULE_mainPrototype = 19, 
		RULE_mainHeader = 20, RULE_mainStatement = 21, RULE_mainWords = 22, RULE_parenMainWord = 23, 
		RULE_generalMainWord = 24, RULE_monadExpression = 25, RULE_immutableValueName = 26, 
		RULE_funcPrototype = 27, RULE_functionName = 28, RULE_typeSignature = 29, 
		RULE_typeMaybeMonad = 30, RULE_typeFunction = 31, RULE_typeFunctionSeparator = 32, 
		RULE_inputType = 33, RULE_returnType = 34, RULE_type = 35, RULE_primitiveTypeName = 36, 
		RULE_unitType = 37, RULE_funcbody = 38, RULE_funcStatement = 39, RULE_patternMatchingArguments = 40, 
		RULE_patternMatchingArgument = 41, RULE_generalMatchingArgument = 42, 
		RULE_patternMatchParentheses = 43, RULE_underScoreArgument = 44, RULE_justArgument = 45, 
		RULE_nothingArgument = 46, RULE_patternMatchingExpression = 47, RULE_patternMatchingTerm = 48, 
		RULE_ifStatementPattern = 49, RULE_ifStatementExpression = 50, RULE_ifTerm = 51, 
		RULE_thenTerm = 52, RULE_elseTerm = 53, RULE_prependTerm = 54, RULE_lambdaFunction = 55, 
		RULE_allLambdaArguments = 56, RULE_singleLamdaArgument = 57, RULE_underscoreLambdaArgument = 58, 
		RULE_lamdaArgumentsBodySeparator = 59, RULE_typedLamdaArgument = 60, RULE_lambdaBody = 61, 
		RULE_concatenatedList = 62, RULE_headList = 63, RULE_colonTerm = 64, RULE_underScoreTerm = 65, 
		RULE_tailList = 66, RULE_emptyList = 67, RULE_populatedList = 68, RULE_listElement = 69, 
		RULE_caseTerm = 70, RULE_caseStatementAndVariable = 71, RULE_caseStatement = 72, 
		RULE_caseVariable = 73, RULE_caseConditions = 74, RULE_caseGeneralStatement = 75, 
		RULE_caseValueCompare = 76, RULE_caseOtherwiseStatement = 77, RULE_caseImplementation = 78, 
		RULE_caseValueImplementationSeparator = 79, RULE_otherwiseTerm = 80, RULE_dollarSignTerm = 81, 
		RULE_functionToMethod = 82, RULE_haskellFunctionToScalaMethodName = 83, 
		RULE_functionToMethodDollarSign = 84, RULE_functionToMethodParen = 85, 
		RULE_functionToMethodTerm = 86, RULE_recursiveMain = 87, RULE_returnUnitType = 88, 
		RULE_booleanTrueFalse = 89, RULE_patternMatchArray = 90, RULE_patternMatchParen = 91, 
		RULE_generalPatternMatchingTerm = 92, RULE_generalFunctionCall = 93, RULE_functionArgument = 94, 
		RULE_functionCallFunctionName = 95, RULE_nonHaskellReservedFunctionName = 96, 
		RULE_haskellFunctionName = 97, RULE_stringTerm = 98, RULE_word = 99, RULE_doBlock = 100, 
		RULE_doWord = 101, RULE_doBlockUnboxings = 102, RULE_monadUnboxing = 103, 
		RULE_monadVariableName = 104, RULE_monadUnboxOperator = 105, RULE_monadEvaluationExpression = 106, 
		RULE_justStatement = 107, RULE_returnStatement = 108, RULE_reservedKeywords = 109, 
		RULE_reservedSymbols = 110;
	public static final String[] ruleNames = {
		"program", "codeBlock", "headerComment", "headerCommentNewLine", "lineComment", 
		"generalComment", "commentWord", "moduleDefinition", "moduleOpen", "moduleFunctionList", 
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
		"recursiveMain", "returnUnitType", "booleanTrueFalse", "patternMatchArray", 
		"patternMatchParen", "generalPatternMatchingTerm", "generalFunctionCall", 
		"functionArgument", "functionCallFunctionName", "nonHaskellReservedFunctionName", 
		"haskellFunctionName", "stringTerm", "word", "doBlock", "doWord", "doBlockUnboxings", 
		"monadUnboxing", "monadVariableName", "monadUnboxOperator", "monadEvaluationExpression", 
		"justStatement", "returnStatement", "reservedKeywords", "reservedSymbols"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{-'", "'-}'", "'module'", "'where'", "','", "'((('", 
		"')))'", null, "'\"'", "'('", "')'", "':'", "'--'", "'='", "'$'", "'_'", 
		"'\\'", "'IO'", "'do'", "'let'", "'case'", "'of'", "'if'", "'then'", "'else'", 
		"'return'", "'otherwise'", "'Maybe'", "'::'", "'<-'", "'->'", "'main'", 
		null, null, null, null, "'()'", "'>>='", "'Just'", "'Nothing'", null, 
		"'True'", "'False'"
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
		"NOTHING", "NEWLINE", "TRUE", "FALSE", "NAME", "WS"
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
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
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
			setState(223);
			_la = _input.LA(1);
			if (_la==HEADER_COMMENT_OPEN) {
				{
				setState(222);
				headerComment();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(NEWLINE);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(232);
			_la = _input.LA(1);
			if (_la==MODULE_STRING) {
				{
				setState(231);
				moduleDefinition();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(234);
						match(NEWLINE);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(240);
					codeBlock();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(246);
				match(NEWLINE);
				}
				}
				setState(251);
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
			setState(254);
			switch (_input.LA(1)) {
			case MAIN_FUNCTION:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				func();
				}
				break;
			case INLINE_COMMENT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<HeaderCommentNewLineContext> headerCommentNewLine() {
			return getRuleContexts(HeaderCommentNewLineContext.class);
		}
		public HeaderCommentNewLineContext headerCommentNewLine(int i) {
			return getRuleContext(HeaderCommentNewLineContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(HEADER_COMMENT_OPEN);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << COLON) | (1L << EQUAL_SIGN) | (1L << IO) | (1L << DO) | (1L << LET) | (1L << CASE) | (1L << OF) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << RETURN) | (1L << OTHERWISE) | (1L << MAYBE) | (1L << MONAD_ARROW) | (1L << TYPE_SEPARATOR) | (1L << MAIN_FUNCTION) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << UNIT_TYPE) | (1L << BIND_OPERATOR) | (1L << JUST) | (1L << NOTHING) | (1L << NEWLINE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME))) != 0)) {
				{
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(257);
					headerCommentNewLine();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				word();
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						headerCommentNewLine();
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
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

	public static class HeaderCommentNewLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public HeaderCommentNewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerCommentNewLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterHeaderCommentNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitHeaderCommentNewLine(this);
		}
	}

	public final HeaderCommentNewLineContext headerCommentNewLine() throws RecognitionException {
		HeaderCommentNewLineContext _localctx = new HeaderCommentNewLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_headerCommentNewLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 8, RULE_lineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			generalComment();
			setState(280);
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
		enterRule(_localctx, 10, RULE_generalComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(INLINE_COMMENT_SYMBOL);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(283);
				commentWord();
				}
				}
				setState(288);
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
		enterRule(_localctx, 12, RULE_commentWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 14, RULE_moduleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			moduleOpen();
			setState(292);
			moduleName();
			setState(293);
			moduleFunctionList();
			setState(294);
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
		enterRule(_localctx, 16, RULE_moduleOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(MODULE_STRING);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(297);
				match(NEWLINE);
				}
				}
				setState(302);
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
		enterRule(_localctx, 18, RULE_moduleFunctionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(303);
				match(NEWLINE);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(LEFT_PAREN);
			setState(310);
			moduleFunctionName();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311);
				match(COMMA);
				setState(312);
				moduleFunctionName();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(RIGHT_PAREN);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					match(NEWLINE);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 20, RULE_moduleClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(325);
				match(NEWLINE);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
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
		enterRule(_localctx, 22, RULE_moduleName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(NAME);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(334);
					match(NEWLINE);
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 24, RULE_moduleFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(340);
				match(NEWLINE);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(NAME);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(347);
				match(NEWLINE);
				}
				}
				setState(352);
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
		enterRule(_localctx, 26, RULE_func);
		try {
			int _alt;
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				funcPrototype();
				setState(354);
				funcbody();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						match(NEWLINE);
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				mainFunction();
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						match(NEWLINE);
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				singleLinePartiallyAppliedFunction();
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(369);
						match(NEWLINE);
						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 28, RULE_singleLinePartiallyAppliedFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			partiallyAppliedFunctionName();
			setState(378);
			assignmentOperator();
			setState(379);
			assignmentExpression();
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					match(NEWLINE);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 30, RULE_partiallyAppliedFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 32, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 34, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 36, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			mainPrototype();
			setState(394);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(393);
				match(NEWLINE);
				}
			}

			setState(396);
			mainHeader();
			setState(398);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(397);
				match(NEWLINE);
				}
			}

			setState(401); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(400);
					mainStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(403); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(405);
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
		enterRule(_localctx, 38, RULE_mainPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(MAIN_FUNCTION);
			setState(409);
			match(ARG_TYPE_SEPARATOR);
			setState(410);
			match(IO);
			setState(411);
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
		enterRule(_localctx, 40, RULE_mainHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(MAIN_FUNCTION);
			setState(414);
			match(EQUAL_SIGN);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(415);
				match(DO);
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
		enterRule(_localctx, 42, RULE_mainStatement);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(418);
					monadExpression();
					}
					}
					setState(421); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(423);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				patternMatchingExpression();
				setState(426);
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
		enterRule(_localctx, 44, RULE_mainWords);
		try {
			setState(433);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				haskellFunctionName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				parenMainWord();
				}
				break;
			case INT_VAL:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
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
		enterRule(_localctx, 46, RULE_parenMainWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LEFT_PAREN);
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436);
				mainWords();
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << INT_VAL) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0) );
			setState(441);
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
		enterRule(_localctx, 48, RULE_generalMainWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 50, RULE_monadExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			immutableValueName();
			setState(446);
			match(MONAD_ARROW);
			setState(447);
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
		enterRule(_localctx, 52, RULE_immutableValueName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 54, RULE_funcPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			functionName();
			setState(452);
			match(ARG_TYPE_SEPARATOR);
			setState(453);
			typeSignature();
			setState(454);
			returnType();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(455);
				match(NEWLINE);
				}
				}
				setState(460);
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
		enterRule(_localctx, 56, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		enterRule(_localctx, 58, RULE_typeSignature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463);
					inputType();
					setState(464);
					match(TYPE_SEPARATOR);
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 60, RULE_typeMaybeMonad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(LEFT_PAREN);
			setState(472);
			match(MAYBE);
			setState(473);
			type();
			setState(474);
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
		enterRule(_localctx, 62, RULE_typeFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LEFT_PAREN);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(477);
					type();
					setState(478);
					typeFunctionSeparator();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(485);
			type();
			setState(486);
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
		enterRule(_localctx, 64, RULE_typeFunctionSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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
		enterRule(_localctx, 66, RULE_inputType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		enterRule(_localctx, 68, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 70, RULE_type);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				typeMaybeMonad();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				primitiveTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				typeFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
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
		enterRule(_localctx, 72, RULE_primitiveTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 74, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 76, RULE_funcbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(504);
					funcStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(507); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 78, RULE_funcStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(NAME);
			setState(510);
			patternMatchingArguments();
			setState(511);
			match(EQUAL_SIGN);
			setState(512);
			patternMatchingExpression();
			setState(513);
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
		enterRule(_localctx, 80, RULE_patternMatchingArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << JUST) | (1L << NOTHING) | (1L << NAME))) != 0)) {
				{
				{
				setState(515);
				patternMatchingArgument();
				}
				}
				setState(520);
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
		enterRule(_localctx, 82, RULE_patternMatchingArgument);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				patternMatchParentheses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				concatenatedList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				emptyList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				underScoreTerm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				justArgument();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(526);
				nothingArgument();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(527);
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
		enterRule(_localctx, 84, RULE_generalMatchingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 86, RULE_patternMatchParentheses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(LEFT_PAREN);
			setState(534); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(533);
				patternMatchingArgument();
				}
				}
				setState(536); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << JUST) | (1L << NOTHING) | (1L << NAME))) != 0) );
			setState(538);
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
		enterRule(_localctx, 88, RULE_underScoreArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		enterRule(_localctx, 90, RULE_justArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(JUST);
			setState(543);
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
		enterRule(_localctx, 92, RULE_nothingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		enterRule(_localctx, 94, RULE_patternMatchingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(547);
					patternMatchingTerm();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(550); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public DoBlockContext doBlock() {
			return getRuleContext(DoBlockContext.class,0);
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
		public JustStatementContext justStatement() {
			return getRuleContext(JustStatementContext.class,0);
		}
		public BooleanTrueFalseContext booleanTrueFalse() {
			return getRuleContext(BooleanTrueFalseContext.class,0);
		}
		public GeneralPatternMatchingTermContext generalPatternMatchingTerm() {
			return getRuleContext(GeneralPatternMatchingTermContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_patternMatchingTerm);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				dollarSignTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				lambdaFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				doBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				generalFunctionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(556);
				patternMatchParen();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(557);
				functionToMethod();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(558);
				haskellFunctionName();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(559);
				prependTerm();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(560);
				patternMatchArray();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(561);
				ifStatementPattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(562);
				recursiveMain();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(563);
				returnUnitType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(564);
				concatenatedList();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(565);
				emptyList();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(566);
				populatedList();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(567);
				caseTerm();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(568);
				stringTerm();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(569);
				returnStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(570);
				justStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(571);
				booleanTrueFalse();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(572);
				generalPatternMatchingTerm();
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
		enterRule(_localctx, 98, RULE_ifStatementPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			ifTerm();
			setState(576);
			ifStatementExpression();
			setState(577);
			thenTerm();
			setState(578);
			ifStatementExpression();
			setState(579);
			elseTerm();
			setState(580);
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
		enterRule(_localctx, 100, RULE_ifStatementExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(582);
				match(NEWLINE);
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			match(LEFT_PAREN);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(589);
				match(NEWLINE);
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			patternMatchingExpression();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(596);
				match(NEWLINE);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(RIGHT_PAREN);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					match(NEWLINE);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 102, RULE_ifTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
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
		enterRule(_localctx, 104, RULE_thenTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
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
		enterRule(_localctx, 106, RULE_elseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
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
		enterRule(_localctx, 108, RULE_prependTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			patternMatchParen();
			setState(616);
			colonTerm();
			setState(617);
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
		enterRule(_localctx, 110, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(LEFT_PAREN);
			setState(620);
			match(BACKSLASH);
			setState(621);
			allLambdaArguments();
			setState(622);
			lamdaArgumentsBodySeparator();
			setState(623);
			patternMatchingExpression();
			setState(624);
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
		enterRule(_localctx, 112, RULE_allLambdaArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(626);
				singleLamdaArgument();
				}
				}
				setState(629); 
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
		enterRule(_localctx, 114, RULE_singleLamdaArgument);
		try {
			setState(633);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				underscoreLambdaArgument();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
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
		enterRule(_localctx, 116, RULE_underscoreLambdaArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		enterRule(_localctx, 118, RULE_lamdaArgumentsBodySeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
		enterRule(_localctx, 120, RULE_typedLamdaArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
		enterRule(_localctx, 122, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		enterRule(_localctx, 124, RULE_concatenatedList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(LEFT_PAREN);
			setState(644);
			headList();
			setState(645);
			colonTerm();
			setState(646);
			tailList();
			setState(647);
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
		enterRule(_localctx, 126, RULE_headList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		enterRule(_localctx, 128, RULE_colonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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
		enterRule(_localctx, 130, RULE_underScoreTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		enterRule(_localctx, 132, RULE_tailList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
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
		enterRule(_localctx, 134, RULE_emptyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(LEFT_SQUARE_BRACKET);
			setState(658);
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
		enterRule(_localctx, 136, RULE_populatedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(LEFT_SQUARE_BRACKET);
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					listElement();
					setState(662);
					match(COMMA);
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(669);
			listElement();
			setState(670);
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
		enterRule(_localctx, 138, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		enterRule(_localctx, 140, RULE_caseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			caseStatementAndVariable();
			setState(675);
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
		enterRule(_localctx, 142, RULE_caseStatementAndVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			caseStatement();
			setState(678);
			match(LEFT_PAREN);
			setState(679);
			caseVariable();
			setState(680);
			match(RIGHT_PAREN);
			setState(681);
			match(OF);
			setState(682);
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
		enterRule(_localctx, 144, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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
		enterRule(_localctx, 146, RULE_caseVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		enterRule(_localctx, 148, RULE_caseConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << DO) | (1L << CASE) | (1L << IF) | (1L << RETURN) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << JUST) | (1L << TRUE) | (1L << FALSE) | (1L << NAME))) != 0)) {
				{
				{
				setState(688);
				caseGeneralStatement();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
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
		enterRule(_localctx, 150, RULE_caseGeneralStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			caseValueCompare();
			setState(697);
			caseValueImplementationSeparator();
			setState(698);
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
		enterRule(_localctx, 152, RULE_caseValueCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		enterRule(_localctx, 154, RULE_caseOtherwiseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			otherwiseTerm();
			setState(703);
			caseValueImplementationSeparator();
			setState(704);
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
		enterRule(_localctx, 156, RULE_caseImplementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			patternMatchingExpression();
			setState(707);
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
		enterRule(_localctx, 158, RULE_caseValueImplementationSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
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
		enterRule(_localctx, 160, RULE_otherwiseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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
		enterRule(_localctx, 162, RULE_dollarSignTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(RIGHT_ASSOC_DOLLAR_SIGN);
			setState(714);
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
		enterRule(_localctx, 164, RULE_functionToMethod);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				functionToMethodDollarSign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				functionToMethodParen();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
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
		enterRule(_localctx, 166, RULE_haskellFunctionToScalaMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		enterRule(_localctx, 168, RULE_functionToMethodDollarSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			haskellFunctionToScalaMethodName();
			setState(724);
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
		enterRule(_localctx, 170, RULE_functionToMethodParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			haskellFunctionToScalaMethodName();
			setState(727);
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
		enterRule(_localctx, 172, RULE_functionToMethodTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			haskellFunctionToScalaMethodName();
			setState(730);
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
		enterRule(_localctx, 174, RULE_recursiveMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(733);
			match(MAIN_FUNCTION);
			setState(734);
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
		enterRule(_localctx, 176, RULE_returnUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(RETURN);
			setState(737);
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

	public static class BooleanTrueFalseContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HaskellParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HaskellParser.FALSE, 0); }
		public BooleanTrueFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTrueFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterBooleanTrueFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitBooleanTrueFalse(this);
		}
	}

	public final BooleanTrueFalseContext booleanTrueFalse() throws RecognitionException {
		BooleanTrueFalseContext _localctx = new BooleanTrueFalseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_booleanTrueFalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		enterRule(_localctx, 180, RULE_patternMatchArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(LEFT_SQUARE_BRACKET);
			setState(742);
			patternMatchingExpression();
			setState(743);
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
		enterRule(_localctx, 182, RULE_patternMatchParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(LEFT_PAREN);
			setState(746);
			patternMatchingExpression();
			setState(747);
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
		enterRule(_localctx, 184, RULE_generalPatternMatchingTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		enterRule(_localctx, 186, RULE_generalFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(752);
			functionCallFunctionName();
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << QUOTATION_MARK) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << DO) | (1L << CASE) | (1L << IF) | (1L << RETURN) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << JUST) | (1L << TRUE) | (1L << FALSE) | (1L << NAME))) != 0)) {
				{
				{
				setState(753);
				functionArgument();
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(759);
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
		enterRule(_localctx, 188, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		enterRule(_localctx, 190, RULE_functionCallFunctionName);
		try {
			setState(765);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				haskellFunctionName();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
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
		enterRule(_localctx, 192, RULE_nonHaskellReservedFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		enterRule(_localctx, 194, RULE_haskellFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		enterRule(_localctx, 196, RULE_stringTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(QUOTATION_MARK);
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					word();
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(778);
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
		public TerminalNode INT_VAL() { return getToken(HaskellParser.INT_VAL, 0); }
		public ReservedKeywordsContext reservedKeywords() {
			return getRuleContext(ReservedKeywordsContext.class,0);
		}
		public ReservedSymbolsContext reservedSymbols() {
			return getRuleContext(ReservedSymbolsContext.class,0);
		}
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
		enterRule(_localctx, 198, RULE_word);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(INT_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				reservedKeywords();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				reservedSymbols();
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

	public static class DoBlockContext extends ParserRuleContext {
		public DoWordContext doWord() {
			return getRuleContext(DoWordContext.class,0);
		}
		public DoBlockUnboxingsContext doBlockUnboxings() {
			return getRuleContext(DoBlockUnboxingsContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public DoBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDoBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDoBlock(this);
		}
	}

	public final DoBlockContext doBlock() throws RecognitionException {
		DoBlockContext _localctx = new DoBlockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_doBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			doWord();
			setState(787);
			doBlockUnboxings();
			setState(788);
			returnStatement();
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

	public static class DoWordContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
		public DoWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDoWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDoWord(this);
		}
	}

	public final DoWordContext doWord() throws RecognitionException {
		DoWordContext _localctx = new DoWordContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_doWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(DO);
			setState(792);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(791);
				match(NEWLINE);
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

	public static class DoBlockUnboxingsContext extends ParserRuleContext {
		public List<MonadUnboxingContext> monadUnboxing() {
			return getRuleContexts(MonadUnboxingContext.class);
		}
		public MonadUnboxingContext monadUnboxing(int i) {
			return getRuleContext(MonadUnboxingContext.class,i);
		}
		public DoBlockUnboxingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doBlockUnboxings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDoBlockUnboxings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDoBlockUnboxings(this);
		}
	}

	public final DoBlockUnboxingsContext doBlockUnboxings() throws RecognitionException {
		DoBlockUnboxingsContext _localctx = new DoBlockUnboxingsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_doBlockUnboxings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(794);
				monadUnboxing();
				}
				}
				setState(797); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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
		public TerminalNode NEWLINE() { return getToken(HaskellParser.NEWLINE, 0); }
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
		enterRule(_localctx, 206, RULE_monadUnboxing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			monadVariableName();
			setState(800);
			monadUnboxOperator();
			setState(801);
			monadEvaluationExpression();
			setState(802);
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
		enterRule(_localctx, 208, RULE_monadVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
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
		enterRule(_localctx, 210, RULE_monadUnboxOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
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
		enterRule(_localctx, 212, RULE_monadEvaluationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
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
		enterRule(_localctx, 214, RULE_justStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(JUST);
			setState(811);
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
		enterRule(_localctx, 216, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(RETURN);
			setState(814);
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

	public static class ReservedKeywordsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HaskellParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HaskellParser.FALSE, 0); }
		public TerminalNode NOTHING() { return getToken(HaskellParser.NOTHING, 0); }
		public TerminalNode JUST() { return getToken(HaskellParser.JUST, 0); }
		public TerminalNode BIND_OPERATOR() { return getToken(HaskellParser.BIND_OPERATOR, 0); }
		public TerminalNode UNIT_TYPE() { return getToken(HaskellParser.UNIT_TYPE, 0); }
		public TerminalNode HASKELL_FUNCTION_NAME() { return getToken(HaskellParser.HASKELL_FUNCTION_NAME, 0); }
		public TerminalNode INT_OP() { return getToken(HaskellParser.INT_OP, 0); }
		public TerminalNode MAIN_FUNCTION() { return getToken(HaskellParser.MAIN_FUNCTION, 0); }
		public TerminalNode MAYBE() { return getToken(HaskellParser.MAYBE, 0); }
		public TerminalNode OTHERWISE() { return getToken(HaskellParser.OTHERWISE, 0); }
		public TerminalNode RETURN() { return getToken(HaskellParser.RETURN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public TerminalNode OF() { return getToken(HaskellParser.OF, 0); }
		public TerminalNode CASE() { return getToken(HaskellParser.CASE, 0); }
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public TerminalNode IO() { return getToken(HaskellParser.IO, 0); }
		public TerminalNode HASKELL_FUNCTIONS_METHODS_IN_SCALA() { return getToken(HaskellParser.HASKELL_FUNCTIONS_METHODS_IN_SCALA, 0); }
		public ReservedKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterReservedKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitReservedKeywords(this);
		}
	}

	public final ReservedKeywordsContext reservedKeywords() throws RecognitionException {
		ReservedKeywordsContext _localctx = new ReservedKeywordsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_reservedKeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << IO) | (1L << DO) | (1L << LET) | (1L << CASE) | (1L << OF) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << RETURN) | (1L << OTHERWISE) | (1L << MAYBE) | (1L << MAIN_FUNCTION) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << UNIT_TYPE) | (1L << BIND_OPERATOR) | (1L << JUST) | (1L << NOTHING) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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

	public static class ReservedSymbolsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(HaskellParser.COMMA, 0); }
		public TerminalNode QUOTATION_MARK() { return getToken(HaskellParser.QUOTATION_MARK, 0); }
		public TerminalNode COLON() { return getToken(HaskellParser.COLON, 0); }
		public TerminalNode INT_OP() { return getToken(HaskellParser.INT_OP, 0); }
		public TerminalNode EQUAL_SIGN() { return getToken(HaskellParser.EQUAL_SIGN, 0); }
		public TerminalNode MONAD_ARROW() { return getToken(HaskellParser.MONAD_ARROW, 0); }
		public TerminalNode TYPE_SEPARATOR() { return getToken(HaskellParser.TYPE_SEPARATOR, 0); }
		public ReservedSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterReservedSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitReservedSymbols(this);
		}
	}

	public final ReservedSymbolsContext reservedSymbols() throws RecognitionException {
		ReservedSymbolsContext _localctx = new ReservedSymbolsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_reservedSymbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << QUOTATION_MARK) | (1L << COLON) | (1L << EQUAL_SIGN) | (1L << MONAD_ARROW) | (1L << TYPE_SEPARATOR) | (1L << INT_OP))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0337\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\5\2\u00e2\n\2\3\2\7\2\u00e5\n\2\f"+
		"\2\16\2\u00e8\13\2\3\2\5\2\u00eb\n\2\3\2\7\2\u00ee\n\2\f\2\16\2\u00f1"+
		"\13\2\3\2\7\2\u00f4\n\2\f\2\16\2\u00f7\13\2\3\2\7\2\u00fa\n\2\f\2\16\2"+
		"\u00fd\13\2\3\3\3\3\5\3\u0101\n\3\3\4\3\4\7\4\u0105\n\4\f\4\16\4\u0108"+
		"\13\4\3\4\3\4\7\4\u010c\n\4\f\4\16\4\u010f\13\4\7\4\u0111\n\4\f\4\16\4"+
		"\u0114\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7\u011f\n\7\f\7\16\7"+
		"\u0122\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u012d\n\n\f\n\16\n"+
		"\u0130\13\n\3\13\7\13\u0133\n\13\f\13\16\13\u0136\13\13\3\13\3\13\3\13"+
		"\3\13\7\13\u013c\n\13\f\13\16\13\u013f\13\13\3\13\3\13\7\13\u0143\n\13"+
		"\f\13\16\13\u0146\13\13\3\f\7\f\u0149\n\f\f\f\16\f\u014c\13\f\3\f\3\f"+
		"\3\r\3\r\7\r\u0152\n\r\f\r\16\r\u0155\13\r\3\16\7\16\u0158\n\16\f\16\16"+
		"\16\u015b\13\16\3\16\3\16\7\16\u015f\n\16\f\16\16\16\u0162\13\16\3\17"+
		"\3\17\3\17\7\17\u0167\n\17\f\17\16\17\u016a\13\17\3\17\3\17\7\17\u016e"+
		"\n\17\f\17\16\17\u0171\13\17\3\17\3\17\7\17\u0175\n\17\f\17\16\17\u0178"+
		"\13\17\5\17\u017a\n\17\3\20\3\20\3\20\3\20\7\20\u0180\n\20\f\20\16\20"+
		"\u0183\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u018d\n\24\3"+
		"\24\3\24\5\24\u0191\n\24\3\24\6\24\u0194\n\24\r\24\16\24\u0195\3\24\5"+
		"\24\u0199\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u01a3\n\26"+
		"\3\27\6\27\u01a6\n\27\r\27\16\27\u01a7\3\27\3\27\3\27\3\27\3\27\5\27\u01af"+
		"\n\27\3\30\3\30\3\30\5\30\u01b4\n\30\3\31\3\31\6\31\u01b8\n\31\r\31\16"+
		"\31\u01b9\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u01cb\n\35\f\35\16\35\u01ce\13\35\3\36\3\36\3\37"+
		"\3\37\3\37\7\37\u01d5\n\37\f\37\16\37\u01d8\13\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\7!\u01e3\n!\f!\16!\u01e6\13!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3%\5%\u01f5\n%\3&\3&\3\'\3\'\3(\6(\u01fc\n(\r(\16(\u01fd\3)\3)\3"+
		")\3)\3)\3)\3*\7*\u0207\n*\f*\16*\u020a\13*\3+\3+\3+\3+\3+\3+\3+\5+\u0213"+
		"\n+\3,\3,\3-\3-\6-\u0219\n-\r-\16-\u021a\3-\3-\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\61\6\61\u0227\n\61\r\61\16\61\u0228\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\5\62\u0240\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\7\64\u024a"+
		"\n\64\f\64\16\64\u024d\13\64\3\64\3\64\7\64\u0251\n\64\f\64\16\64\u0254"+
		"\13\64\3\64\3\64\7\64\u0258\n\64\f\64\16\64\u025b\13\64\3\64\3\64\7\64"+
		"\u025f\n\64\f\64\16\64\u0262\13\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\38\38\39\39\39\39\39\39\39\3:\6:\u0276\n:\r:\16:\u0277\3;\3;\5;\u027c"+
		"\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3E\3F\3F\3F\3F\7F\u029b\nF\fF\16F\u029e\13F\3F\3F\3F\3G\3G\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3K\3K\3L\7L\u02b4\nL\fL\16L\u02b7\13L"+
		"\3L\3L\3M\3M\3M\3M\3N\3N\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3T"+
		"\3T\3T\5T\u02d2\nT\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z"+
		"\3Z\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3_\3_\3_\7_\u02f5\n_\f_\16"+
		"_\u02f8\13_\3_\3_\3`\3`\3a\3a\5a\u0300\na\3b\3b\3c\3c\3d\3d\7d\u0308\n"+
		"d\fd\16d\u030b\13d\3d\3d\3e\3e\3e\3e\5e\u0313\ne\3f\3f\3f\3f\3g\3g\5g"+
		"\u031b\ng\3h\6h\u031e\nh\rh\16h\u031f\3i\3i\3i\3i\3i\3j\3j\3k\3k\3l\3"+
		"l\3m\3m\3m\3n\3n\3n\3o\3o\3p\3p\3p\2\2q\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\2\7"+
		"\4\2%%\60\60\3\2./\4\2%&\60\60\b\2\f\f\26 $$&&(,./\b\2\t\t\r\r\20\20\22"+
		"\22\"#&&\u0320\2\u00e1\3\2\2\2\4\u0100\3\2\2\2\6\u0102\3\2\2\2\b\u0117"+
		"\3\2\2\2\n\u0119\3\2\2\2\f\u011c\3\2\2\2\16\u0123\3\2\2\2\20\u0125\3\2"+
		"\2\2\22\u012a\3\2\2\2\24\u0134\3\2\2\2\26\u014a\3\2\2\2\30\u014f\3\2\2"+
		"\2\32\u0159\3\2\2\2\34\u0179\3\2\2\2\36\u017b\3\2\2\2 \u0184\3\2\2\2\""+
		"\u0186\3\2\2\2$\u0188\3\2\2\2&\u018a\3\2\2\2(\u019a\3\2\2\2*\u019f\3\2"+
		"\2\2,\u01ae\3\2\2\2.\u01b3\3\2\2\2\60\u01b5\3\2\2\2\62\u01bd\3\2\2\2\64"+
		"\u01bf\3\2\2\2\66\u01c3\3\2\2\28\u01c5\3\2\2\2:\u01cf\3\2\2\2<\u01d6\3"+
		"\2\2\2>\u01d9\3\2\2\2@\u01de\3\2\2\2B\u01ea\3\2\2\2D\u01ec\3\2\2\2F\u01ee"+
		"\3\2\2\2H\u01f4\3\2\2\2J\u01f6\3\2\2\2L\u01f8\3\2\2\2N\u01fb\3\2\2\2P"+
		"\u01ff\3\2\2\2R\u0208\3\2\2\2T\u0212\3\2\2\2V\u0214\3\2\2\2X\u0216\3\2"+
		"\2\2Z\u021e\3\2\2\2\\\u0220\3\2\2\2^\u0223\3\2\2\2`\u0226\3\2\2\2b\u023f"+
		"\3\2\2\2d\u0241\3\2\2\2f\u024b\3\2\2\2h\u0263\3\2\2\2j\u0265\3\2\2\2l"+
		"\u0267\3\2\2\2n\u0269\3\2\2\2p\u026d\3\2\2\2r\u0275\3\2\2\2t\u027b\3\2"+
		"\2\2v\u027d\3\2\2\2x\u027f\3\2\2\2z\u0281\3\2\2\2|\u0283\3\2\2\2~\u0285"+
		"\3\2\2\2\u0080\u028b\3\2\2\2\u0082\u028d\3\2\2\2\u0084\u028f\3\2\2\2\u0086"+
		"\u0291\3\2\2\2\u0088\u0293\3\2\2\2\u008a\u0296\3\2\2\2\u008c\u02a2\3\2"+
		"\2\2\u008e\u02a4\3\2\2\2\u0090\u02a7\3\2\2\2\u0092\u02ae\3\2\2\2\u0094"+
		"\u02b0\3\2\2\2\u0096\u02b5\3\2\2\2\u0098\u02ba\3\2\2\2\u009a\u02be\3\2"+
		"\2\2\u009c\u02c0\3\2\2\2\u009e\u02c4\3\2\2\2\u00a0\u02c7\3\2\2\2\u00a2"+
		"\u02c9\3\2\2\2\u00a4\u02cb\3\2\2\2\u00a6\u02d1\3\2\2\2\u00a8\u02d3\3\2"+
		"\2\2\u00aa\u02d5\3\2\2\2\u00ac\u02d8\3\2\2\2\u00ae\u02db\3\2\2\2\u00b0"+
		"\u02de\3\2\2\2\u00b2\u02e2\3\2\2\2\u00b4\u02e5\3\2\2\2\u00b6\u02e7\3\2"+
		"\2\2\u00b8\u02eb\3\2\2\2\u00ba\u02ef\3\2\2\2\u00bc\u02f1\3\2\2\2\u00be"+
		"\u02fb\3\2\2\2\u00c0\u02ff\3\2\2\2\u00c2\u0301\3\2\2\2\u00c4\u0303\3\2"+
		"\2\2\u00c6\u0305\3\2\2\2\u00c8\u0312\3\2\2\2\u00ca\u0314\3\2\2\2\u00cc"+
		"\u0318\3\2\2\2\u00ce\u031d\3\2\2\2\u00d0\u0321\3\2\2\2\u00d2\u0326\3\2"+
		"\2\2\u00d4\u0328\3\2\2\2\u00d6\u032a\3\2\2\2\u00d8\u032c\3\2\2\2\u00da"+
		"\u032f\3\2\2\2\u00dc\u0332\3\2\2\2\u00de\u0334\3\2\2\2\u00e0\u00e2\5\6"+
		"\4\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\3\2\2\2\u00e3"+
		"\u00e5\7-\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\5\20\t\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f5\3"+
		"\2\2\2\u00ec\u00ee\7-\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f4\5\4\3\2\u00f3\u00ef\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\7-\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\3\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fe\u0101\5\34\17\2\u00ff\u0101\5\n\6\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\5\3\2\2\2\u0102\u0112\7\5\2\2\u0103\u0105\5\b\5\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010d\5\u00c8e\2\u010a"+
		"\u010c\5\b\5\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0106\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\6\2\2\u0116"+
		"\7\3\2\2\2\u0117\u0118\7-\2\2\u0118\t\3\2\2\2\u0119\u011a\5\f\7\2\u011a"+
		"\u011b\7-\2\2\u011b\13\3\2\2\2\u011c\u0120\7\21\2\2\u011d\u011f\5\16\b"+
		"\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\r\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\60\2\2\u0124"+
		"\17\3\2\2\2\u0125\u0126\5\22\n\2\u0126\u0127\5\30\r\2\u0127\u0128\5\24"+
		"\13\2\u0128\u0129\5\26\f\2\u0129\21\3\2\2\2\u012a\u012e\7\7\2\2\u012b"+
		"\u012d\7-\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\23\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133"+
		"\7-\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\16"+
		"\2\2\u0138\u013d\5\32\16\2\u0139\u013a\7\t\2\2\u013a\u013c\5\32\16\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\7\17\2\2\u0141"+
		"\u0143\7-\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\25\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149"+
		"\7-\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\b"+
		"\2\2\u014e\27\3\2\2\2\u014f\u0153\7\60\2\2\u0150\u0152\7-\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\31\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\7-\2\2\u0157\u0156\3\2\2\2"+
		"\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0160\7\60\2\2\u015d\u015f\7-\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\33\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\58\35\2\u0164\u0168"+
		"\5N(\2\u0165\u0167\7-\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u017a\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b\u016f\5&\24\2\u016c\u016e\7-\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u017a\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0176\5\36\20\2\u0173\u0175\7-\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u0163\3\2\2\2\u0179"+
		"\u016b\3\2\2\2\u0179\u0172\3\2\2\2\u017a\35\3\2\2\2\u017b\u017c\5 \21"+
		"\2\u017c\u017d\5\"\22\2\u017d\u0181\5$\23\2\u017e\u0180\7-\2\2\u017f\u017e"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\37\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7\60\2\2\u0185!\3\2\2\2\u0186"+
		"\u0187\7\22\2\2\u0187#\3\2\2\2\u0188\u0189\5`\61\2\u0189%\3\2\2\2\u018a"+
		"\u018c\5(\25\2\u018b\u018d\7-\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0190\5*\26\2\u018f\u0191\7-\2\2\u0190"+
		"\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0194\5,"+
		"\27\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0199\7-\2\2\u0198\u0197\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\'\3\2\2\2\u019a\u019b\7$\2\2\u019b\u019c"+
		"\7!\2\2\u019c\u019d\7\26\2\2\u019d\u019e\5L\'\2\u019e)\3\2\2\2\u019f\u01a0"+
		"\7$\2\2\u01a0\u01a2\7\22\2\2\u01a1\u01a3\7\27\2\2\u01a2\u01a1\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3+\3\2\2\2\u01a4\u01a6\5\64\33\2\u01a5\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\7-\2\2\u01aa\u01af\3\2\2\2\u01ab\u01ac\5`\61"+
		"\2\u01ac\u01ad\7-\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01ab"+
		"\3\2\2\2\u01af-\3\2\2\2\u01b0\u01b4\5\u00c4c\2\u01b1\u01b4\5\60\31\2\u01b2"+
		"\u01b4\5\62\32\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3"+
		"\2\2\2\u01b4/\3\2\2\2\u01b5\u01b7\7\16\2\2\u01b6\u01b8\5.\30\2\u01b7\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\7\17\2\2\u01bc\61\3\2\2\2\u01bd\u01be\t\2\2"+
		"\2\u01be\63\3\2\2\2\u01bf\u01c0\5\66\34\2\u01c0\u01c1\7\"\2\2\u01c1\u01c2"+
		"\5`\61\2\u01c2\65\3\2\2\2\u01c3\u01c4\7\60\2\2\u01c4\67\3\2\2\2\u01c5"+
		"\u01c6\5:\36\2\u01c6\u01c7\7!\2\2\u01c7\u01c8\5<\37\2\u01c8\u01cc\5F$"+
		"\2\u01c9\u01cb\7-\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd9\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d0\7\60\2\2\u01d0;\3\2\2\2\u01d1\u01d2\5D#\2\u01d2\u01d3\7#\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7=\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\7\16\2\2\u01da\u01db\7 \2\2\u01db\u01dc\5H%\2\u01dc\u01dd\7\17\2\2\u01dd"+
		"?\3\2\2\2\u01de\u01e4\7\16\2\2\u01df\u01e0\5H%\2\u01e0\u01e1\5B\"\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01df\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01e8\5H%\2\u01e8\u01e9\7\17\2\2\u01e9A\3\2\2\2\u01ea\u01eb\7#\2\2\u01eb"+
		"C\3\2\2\2\u01ec\u01ed\5H%\2\u01edE\3\2\2\2\u01ee\u01ef\5H%\2\u01efG\3"+
		"\2\2\2\u01f0\u01f5\5> \2\u01f1\u01f5\5J&\2\u01f2\u01f5\5@!\2\u01f3\u01f5"+
		"\5L\'\2\u01f4\u01f0\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f5I\3\2\2\2\u01f6\u01f7\7\'\2\2\u01f7K\3\2\2\2\u01f8"+
		"\u01f9\7)\2\2\u01f9M\3\2\2\2\u01fa\u01fc\5P)\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01feO\3\2\2\2"+
		"\u01ff\u0200\7\60\2\2\u0200\u0201\5R*\2\u0201\u0202\7\22\2\2\u0202\u0203"+
		"\5`\61\2\u0203\u0204\7-\2\2\u0204Q\3\2\2\2\u0205\u0207\5T+\2\u0206\u0205"+
		"\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"S\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u0213\5X-\2\u020c\u0213\5~@\2\u020d"+
		"\u0213\5\u0088E\2\u020e\u0213\5\u0084C\2\u020f\u0213\5\\/\2\u0210\u0213"+
		"\5^\60\2\u0211\u0213\5V,\2\u0212\u020b\3\2\2\2\u0212\u020c\3\2\2\2\u0212"+
		"\u020d\3\2\2\2\u0212\u020e\3\2\2\2\u0212\u020f\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0211\3\2\2\2\u0213U\3\2\2\2\u0214\u0215\7\60\2\2\u0215W\3"+
		"\2\2\2\u0216\u0218\7\16\2\2\u0217\u0219\5T+\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021d\7\17\2\2\u021dY\3\2\2\2\u021e\u021f\5\u0084C\2\u021f"+
		"[\3\2\2\2\u0220\u0221\7+\2\2\u0221\u0222\5T+\2\u0222]\3\2\2\2\u0223\u0224"+
		"\7,\2\2\u0224_\3\2\2\2\u0225\u0227\5b\62\2\u0226\u0225\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229a\3\2\2\2\u022a"+
		"\u0240\5\u00a4S\2\u022b\u0240\5p9\2\u022c\u0240\5\u00caf\2\u022d\u0240"+
		"\5\u00bc_\2\u022e\u0240\5\u00b8]\2\u022f\u0240\5\u00a6T\2\u0230\u0240"+
		"\5\u00c4c\2\u0231\u0240\5n8\2\u0232\u0240\5\u00b6\\\2\u0233\u0240\5d\63"+
		"\2\u0234\u0240\5\u00b0Y\2\u0235\u0240\5\u00b2Z\2\u0236\u0240\5~@\2\u0237"+
		"\u0240\5\u0088E\2\u0238\u0240\5\u008aF\2\u0239\u0240\5\u008eH\2\u023a"+
		"\u0240\5\u00c6d\2\u023b\u0240\5\u00dan\2\u023c\u0240\5\u00d8m\2\u023d"+
		"\u0240\5\u00b4[\2\u023e\u0240\5\u00ba^\2\u023f\u022a\3\2\2\2\u023f\u022b"+
		"\3\2\2\2\u023f\u022c\3\2\2\2\u023f\u022d\3\2\2\2\u023f\u022e\3\2\2\2\u023f"+
		"\u022f\3\2\2\2\u023f\u0230\3\2\2\2\u023f\u0231\3\2\2\2\u023f\u0232\3\2"+
		"\2\2\u023f\u0233\3\2\2\2\u023f\u0234\3\2\2\2\u023f\u0235\3\2\2\2\u023f"+
		"\u0236\3\2\2\2\u023f\u0237\3\2\2\2\u023f\u0238\3\2\2\2\u023f\u0239\3\2"+
		"\2\2\u023f\u023a\3\2\2\2\u023f\u023b\3\2\2\2\u023f\u023c\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240c\3\2\2\2\u0241\u0242\5h\65\2"+
		"\u0242\u0243\5f\64\2\u0243\u0244\5j\66\2\u0244\u0245\5f\64\2\u0245\u0246"+
		"\5l\67\2\u0246\u0247\5f\64\2\u0247e\3\2\2\2\u0248\u024a\7-\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0252\7\16\2\2\u024f\u0251\7"+
		"-\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0259\5`"+
		"\61\2\u0256\u0258\7-\2\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u0260\7\17\2\2\u025d\u025f\7-\2\2\u025e\u025d\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261g\3\2\2\2"+
		"\u0262\u0260\3\2\2\2\u0263\u0264\7\33\2\2\u0264i\3\2\2\2\u0265\u0266\7"+
		"\34\2\2\u0266k\3\2\2\2\u0267\u0268\7\35\2\2\u0268m\3\2\2\2\u0269\u026a"+
		"\5\u00b8]\2\u026a\u026b\5\u0082B\2\u026b\u026c\5\u00b8]\2\u026co\3\2\2"+
		"\2\u026d\u026e\7\16\2\2\u026e\u026f\7\25\2\2\u026f\u0270\5r:\2\u0270\u0271"+
		"\5x=\2\u0271\u0272\5`\61\2\u0272\u0273\7\17\2\2\u0273q\3\2\2\2\u0274\u0276"+
		"\5t;\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278s\3\2\2\2\u0279\u027c\5v<\2\u027a\u027c\5z>\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027cu\3\2\2\2\u027d\u027e\5\u0084"+
		"C\2\u027ew\3\2\2\2\u027f\u0280\7#\2\2\u0280y\3\2\2\2\u0281\u0282\7\60"+
		"\2\2\u0282{\3\2\2\2\u0283\u0284\5`\61\2\u0284}\3\2\2\2\u0285\u0286\7\16"+
		"\2\2\u0286\u0287\5\u0080A\2\u0287\u0288\5\u0082B\2\u0288\u0289\5\u0086"+
		"D\2\u0289\u028a\7\17\2\2\u028a\177\3\2\2\2\u028b\u028c\5b\62\2\u028c\u0081"+
		"\3\2\2\2\u028d\u028e\7\20\2\2\u028e\u0083\3\2\2\2\u028f\u0290\7\24\2\2"+
		"\u0290\u0085\3\2\2\2\u0291\u0292\5b\62\2\u0292\u0087\3\2\2\2\u0293\u0294"+
		"\7\3\2\2\u0294\u0295\7\4\2\2\u0295\u0089\3\2\2\2\u0296\u029c\7\3\2\2\u0297"+
		"\u0298\5\u008cG\2\u0298\u0299\7\t\2\2\u0299\u029b\3\2\2\2\u029a\u0297"+
		"\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029f\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\5\u008cG\2\u02a0\u02a1"+
		"\7\4\2\2\u02a1\u008b\3\2\2\2\u02a2\u02a3\5b\62\2\u02a3\u008d\3\2\2\2\u02a4"+
		"\u02a5\5\u0090I\2\u02a5\u02a6\5\u0096L\2\u02a6\u008f\3\2\2\2\u02a7\u02a8"+
		"\5\u0092J\2\u02a8\u02a9\7\16\2\2\u02a9\u02aa\5\u0094K\2\u02aa\u02ab\7"+
		"\17\2\2\u02ab\u02ac\7\32\2\2\u02ac\u02ad\7-\2\2\u02ad\u0091\3\2\2\2\u02ae"+
		"\u02af\7\31\2\2\u02af\u0093\3\2\2\2\u02b0\u02b1\5`\61\2\u02b1\u0095\3"+
		"\2\2\2\u02b2\u02b4\5\u0098M\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2"+
		"\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02b9\5\u009cO\2\u02b9\u0097\3\2\2\2\u02ba\u02bb\5\u009a"+
		"N\2\u02bb\u02bc\5\u00a0Q\2\u02bc\u02bd\5\u009eP\2\u02bd\u0099\3\2\2\2"+
		"\u02be\u02bf\5`\61\2\u02bf\u009b\3\2\2\2\u02c0\u02c1\5\u00a2R\2\u02c1"+
		"\u02c2\5\u00a0Q\2\u02c2\u02c3\5\u009eP\2\u02c3\u009d\3\2\2\2\u02c4\u02c5"+
		"\5`\61\2\u02c5\u02c6\7-\2\2\u02c6\u009f\3\2\2\2\u02c7\u02c8\7#\2\2\u02c8"+
		"\u00a1\3\2\2\2\u02c9\u02ca\7\37\2\2\u02ca\u00a3\3\2\2\2\u02cb\u02cc\7"+
		"\23\2\2\u02cc\u02cd\5`\61\2\u02cd\u00a5\3\2\2\2\u02ce\u02d2\5\u00aaV\2"+
		"\u02cf\u02d2\5\u00acW\2\u02d0\u02d2\5\u00aeX\2\u02d1\u02ce\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u00a7\3\2\2\2\u02d3\u02d4\7\f"+
		"\2\2\u02d4\u00a9\3\2\2\2\u02d5\u02d6\5\u00a8U\2\u02d6\u02d7\5\u00a4S\2"+
		"\u02d7\u00ab\3\2\2\2\u02d8\u02d9\5\u00a8U\2\u02d9\u02da\5\u00b8]\2\u02da"+
		"\u00ad\3\2\2\2\u02db\u02dc\5\u00a8U\2\u02dc\u02dd\5\u00ba^\2\u02dd\u00af"+
		"\3\2\2\2\u02de\u02df\7\n\2\2\u02df\u02e0\7$\2\2\u02e0\u02e1\7\13\2\2\u02e1"+
		"\u00b1\3\2\2\2\u02e2\u02e3\7\36\2\2\u02e3\u02e4\7)\2\2\u02e4\u00b3\3\2"+
		"\2\2\u02e5\u02e6\t\3\2\2\u02e6\u00b5\3\2\2\2\u02e7\u02e8\7\3\2\2\u02e8"+
		"\u02e9\5`\61\2\u02e9\u02ea\7\4\2\2\u02ea\u00b7\3\2\2\2\u02eb\u02ec\7\16"+
		"\2\2\u02ec\u02ed\5`\61\2\u02ed\u02ee\7\17\2\2\u02ee\u00b9\3\2\2\2\u02ef"+
		"\u02f0\t\4\2\2\u02f0\u00bb\3\2\2\2\u02f1\u02f2\7\n\2\2\u02f2\u02f6\5\u00c0"+
		"a\2\u02f3\u02f5\5\u00be`\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6"+
		"\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6\3\2"+
		"\2\2\u02f9\u02fa\7\13\2\2\u02fa\u00bd\3\2\2\2\u02fb\u02fc\5b\62\2\u02fc"+
		"\u00bf\3\2\2\2\u02fd\u0300\5\u00c4c\2\u02fe\u0300\5\u00c2b\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u00c1\3\2\2\2\u0301\u0302\7\60\2\2"+
		"\u0302\u00c3\3\2\2\2\u0303\u0304\7(\2\2\u0304\u00c5\3\2\2\2\u0305\u0309"+
		"\7\r\2\2\u0306\u0308\5\u00c8e\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2"+
		"\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309"+
		"\3\2\2\2\u030c\u030d\7\r\2\2\u030d\u00c7\3\2\2\2\u030e\u0313\7\60\2\2"+
		"\u030f\u0313\7%\2\2\u0310\u0313\5\u00dco\2\u0311\u0313\5\u00dep\2\u0312"+
		"\u030e\3\2\2\2\u0312\u030f\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2"+
		"\2\2\u0313\u00c9\3\2\2\2\u0314\u0315\5\u00ccg\2\u0315\u0316\5\u00ceh\2"+
		"\u0316\u0317\5\u00dan\2\u0317\u00cb\3\2\2\2\u0318\u031a\7\27\2\2\u0319"+
		"\u031b\7-\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u00cd\3\2"+
		"\2\2\u031c\u031e\5\u00d0i\2\u031d\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u00cf\3\2\2\2\u0321\u0322\5\u00d2"+
		"j\2\u0322\u0323\5\u00d4k\2\u0323\u0324\5\u00d6l\2\u0324\u0325\7-\2\2\u0325"+
		"\u00d1\3\2\2\2\u0326\u0327\7\60\2\2\u0327\u00d3\3\2\2\2\u0328\u0329\7"+
		"\"\2\2\u0329\u00d5\3\2\2\2\u032a\u032b\5`\61\2\u032b\u00d7\3\2\2\2\u032c"+
		"\u032d\7+\2\2\u032d\u032e\5`\61\2\u032e\u00d9\3\2\2\2\u032f\u0330\7\36"+
		"\2\2\u0330\u0331\5`\61\2\u0331\u00db\3\2\2\2\u0332\u0333\t\5\2\2\u0333"+
		"\u00dd\3\2\2\2\u0334\u0335\t\6\2\2\u0335\u00df\3\2\2\2<\u00e1\u00e6\u00ea"+
		"\u00ef\u00f5\u00fb\u0100\u0106\u010d\u0112\u0120\u012e\u0134\u013d\u0144"+
		"\u014a\u0153\u0159\u0160\u0168\u016f\u0176\u0179\u0181\u018c\u0190\u0195"+
		"\u0198\u01a2\u01a7\u01ae\u01b3\u01b9\u01cc\u01d6\u01e4\u01f4\u01fd\u0208"+
		"\u0212\u021a\u0228\u023f\u024b\u0252\u0259\u0260\u0277\u027b\u029c\u02b5"+
		"\u02d1\u02f6\u02ff\u0309\u0312\u031a\u031f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}