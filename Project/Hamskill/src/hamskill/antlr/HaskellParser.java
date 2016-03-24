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
		FUNC_ARGS_CLOSE_PAREN=9, HASKELL_FUNCTIONS_METHODS_IN_SCALA=10, LEFT_PAREN=11, 
		RIGHT_PAREN=12, COLON=13, INLINE_COMMENT_SYMBOL=14, EQUAL_SIGN=15, RIGHT_ASSOC_DOLLAR_SIGN=16, 
		UNDERSCORE=17, IO=18, DO=19, LET=20, IF=21, THEN=22, ELSE=23, RETURN=24, 
		ARG_TYPE_SEPARATOR=25, MONAD_ARROW=26, TYPE_SEPARATOR=27, RECURSIVE_MAIN=28, 
		MAIN_FUNCTION=29, INT_VAL=30, INT_OP=31, TYPE_NAME=32, HASKELL_FUNCTION_NAME=33, 
		UNIT_TYPE=34, NEWLINE=35, NAME=36, WS=37;
	public static final int
		RULE_program = 0, RULE_codeBlock = 1, RULE_headerComment = 2, RULE_lineComment = 3, 
		RULE_generalComment = 4, RULE_commentWord = 5, RULE_moduleDefinition = 6, 
		RULE_moduleOpen = 7, RULE_moduleFunctionList = 8, RULE_moduleClose = 9, 
		RULE_moduleName = 10, RULE_moduleFunctionName = 11, RULE_func = 12, RULE_mainFunction = 13, 
		RULE_mainPrototype = 14, RULE_mainHeader = 15, RULE_mainStatement = 16, 
		RULE_mainWords = 17, RULE_parenMainWord = 18, RULE_generalMainWord = 19, 
		RULE_monadExpression = 20, RULE_immutableValueName = 21, RULE_funcPrototype = 22, 
		RULE_functionName = 23, RULE_typeSignature = 24, RULE_typeFunction = 25, 
		RULE_typeFunctionSeparator = 26, RULE_inputType = 27, RULE_returnType = 28, 
		RULE_type = 29, RULE_primitiveTypeName = 30, RULE_unitType = 31, RULE_funcbody = 32, 
		RULE_funcStatement = 33, RULE_patternMatchingArguments = 34, RULE_patternMatchingArgument = 35, 
		RULE_generalMatchingArgument = 36, RULE_patternMatchParentheses = 37, 
		RULE_underScoreArgument = 38, RULE_patternMatchingExpression = 39, RULE_patternMatchingTerm = 40, 
		RULE_ifStatementPattern = 41, RULE_ifStatementExpression = 42, RULE_ifTerm = 43, 
		RULE_thenTerm = 44, RULE_elseTerm = 45, RULE_prependTerm = 46, RULE_concatenatedList = 47, 
		RULE_headList = 48, RULE_colonTerm = 49, RULE_underScoreTerm = 50, RULE_tailList = 51, 
		RULE_emptyList = 52, RULE_populatedList = 53, RULE_listElement = 54, RULE_dollarSignTerm = 55, 
		RULE_functionToMethod = 56, RULE_haskellFunctionToScalaMethodName = 57, 
		RULE_functionToMethodDollarSign = 58, RULE_functionToMethodParen = 59, 
		RULE_functionToMethodTerm = 60, RULE_recursiveMain = 61, RULE_returnUnitType = 62, 
		RULE_patternMatchArray = 63, RULE_patternMatchParen = 64, RULE_generalPatternMatchingTerm = 65, 
		RULE_generalFunctionCall = 66, RULE_functionArgument = 67, RULE_functionCallFunctionName = 68, 
		RULE_haskellFunctionName = 69;
	public static final String[] ruleNames = {
		"program", "codeBlock", "headerComment", "lineComment", "generalComment", 
		"commentWord", "moduleDefinition", "moduleOpen", "moduleFunctionList", 
		"moduleClose", "moduleName", "moduleFunctionName", "func", "mainFunction", 
		"mainPrototype", "mainHeader", "mainStatement", "mainWords", "parenMainWord", 
		"generalMainWord", "monadExpression", "immutableValueName", "funcPrototype", 
		"functionName", "typeSignature", "typeFunction", "typeFunctionSeparator", 
		"inputType", "returnType", "type", "primitiveTypeName", "unitType", "funcbody", 
		"funcStatement", "patternMatchingArguments", "patternMatchingArgument", 
		"generalMatchingArgument", "patternMatchParentheses", "underScoreArgument", 
		"patternMatchingExpression", "patternMatchingTerm", "ifStatementPattern", 
		"ifStatementExpression", "ifTerm", "thenTerm", "elseTerm", "prependTerm", 
		"concatenatedList", "headList", "colonTerm", "underScoreTerm", "tailList", 
		"emptyList", "populatedList", "listElement", "dollarSignTerm", "functionToMethod", 
		"haskellFunctionToScalaMethodName", "functionToMethodDollarSign", "functionToMethodParen", 
		"functionToMethodTerm", "recursiveMain", "returnUnitType", "patternMatchArray", 
		"patternMatchParen", "generalPatternMatchingTerm", "generalFunctionCall", 
		"functionArgument", "functionCallFunctionName", "haskellFunctionName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{-'", "'-}'", "'module'", "'where'", "','", "'(('", 
		"'))'", null, "'('", "')'", "':'", "'--'", "'='", "'$'", "'_'", "'IO'", 
		"'do'", "'let'", "'if'", "'then'", "'else'", "'return'", "'::'", "'<-'", 
		"'->'", "'((main))'", "'main'", null, null, null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "LEFT_PAREN", 
		"RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"UNDERSCORE", "IO", "DO", "LET", "IF", "THEN", "ELSE", "RETURN", "ARG_TYPE_SEPARATOR", 
		"MONAD_ARROW", "TYPE_SEPARATOR", "RECURSIVE_MAIN", "MAIN_FUNCTION", "INT_VAL", 
		"INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", "NEWLINE", 
		"NAME", "WS"
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
			setState(141);
			_la = _input.LA(1);
			if (_la==HEADER_COMMENT_OPEN) {
				{
				setState(140);
				headerComment();
				}
			}

			setState(144);
			_la = _input.LA(1);
			if (_la==MODULE_STRING) {
				{
				setState(143);
				moduleDefinition();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(146);
						match(NEWLINE);
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(152);
					codeBlock();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(158);
				match(NEWLINE);
				}
				}
				setState(163);
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
			setState(166);
			switch (_input.LA(1)) {
			case MAIN_FUNCTION:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				func();
				}
				break;
			case INLINE_COMMENT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
			setState(168);
			match(HEADER_COMMENT_OPEN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(169);
				match(NAME);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
			setState(177);
			generalComment();
			setState(178);
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
			setState(180);
			match(INLINE_COMMENT_SYMBOL);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(181);
				commentWord();
				}
				}
				setState(186);
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
			setState(187);
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
			setState(189);
			moduleOpen();
			setState(190);
			moduleName();
			setState(191);
			moduleFunctionList();
			setState(192);
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
			setState(194);
			match(MODULE_STRING);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(195);
				match(NEWLINE);
				}
				}
				setState(200);
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(201);
				match(NEWLINE);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(LEFT_PAREN);
			setState(208);
			moduleFunctionName();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				moduleFunctionName();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RIGHT_PAREN);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(NEWLINE);
					}
					} 
				}
				setState(222);
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
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(223);
				match(NEWLINE);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
			setState(231);
			match(NAME);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(NEWLINE);
					}
					} 
				}
				setState(237);
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
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(238);
				match(NEWLINE);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(NAME);
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
			setState(266);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				funcPrototype();
				setState(252);
				funcbody();
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						match(NEWLINE);
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case MAIN_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				mainFunction();
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(NEWLINE);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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
		enterRule(_localctx, 26, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			mainPrototype();
			setState(270);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(269);
				match(NEWLINE);
				}
			}

			setState(272);
			mainHeader();
			setState(274);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(273);
				match(NEWLINE);
				}
			}

			setState(277); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(276);
					mainStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(279); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(281);
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
		enterRule(_localctx, 28, RULE_mainPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(MAIN_FUNCTION);
			setState(285);
			match(ARG_TYPE_SEPARATOR);
			setState(286);
			match(IO);
			setState(287);
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
		enterRule(_localctx, 30, RULE_mainHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(MAIN_FUNCTION);
			setState(290);
			match(EQUAL_SIGN);
			setState(292);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(291);
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
		public List<PatternMatchingTermContext> patternMatchingTerm() {
			return getRuleContexts(PatternMatchingTermContext.class);
		}
		public PatternMatchingTermContext patternMatchingTerm(int i) {
			return getRuleContext(PatternMatchingTermContext.class,i);
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
		enterRule(_localctx, 32, RULE_mainStatement);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					monadExpression();
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(299);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(301);
					patternMatchingTerm();
					}
					}
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << IF) | (1L << RETURN) | (1L << RECURSIVE_MAIN) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0) );
				setState(306);
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
		enterRule(_localctx, 34, RULE_mainWords);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case HASKELL_FUNCTION_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				haskellFunctionName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				parenMainWord();
				}
				break;
			case INT_VAL:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
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
		enterRule(_localctx, 36, RULE_parenMainWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LEFT_PAREN);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				mainWords();
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << INT_VAL) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0) );
			setState(321);
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
		enterRule(_localctx, 38, RULE_generalMainWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 40, RULE_monadExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			immutableValueName();
			setState(326);
			match(MONAD_ARROW);
			setState(327);
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
		enterRule(_localctx, 42, RULE_immutableValueName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 44, RULE_funcPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			functionName();
			setState(332);
			match(ARG_TYPE_SEPARATOR);
			setState(333);
			typeSignature();
			setState(334);
			returnType();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(335);
				match(NEWLINE);
				}
				}
				setState(340);
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
		enterRule(_localctx, 46, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 48, RULE_typeSignature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					inputType();
					setState(344);
					match(TYPE_SEPARATOR);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 50, RULE_typeFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LEFT_PAREN);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					type();
					setState(353);
					typeFunctionSeparator();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(360);
			type();
			setState(361);
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
		enterRule(_localctx, 52, RULE_typeFunctionSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 54, RULE_inputType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 56, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(372);
			switch (_input.LA(1)) {
			case TYPE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				primitiveTypeName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				typeFunction();
				}
				break;
			case UNIT_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
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
		enterRule(_localctx, 60, RULE_primitiveTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		enterRule(_localctx, 62, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		enterRule(_localctx, 64, RULE_funcbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(378);
					funcStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(381); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 66, RULE_funcStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(NAME);
			setState(384);
			patternMatchingArguments();
			setState(385);
			match(EQUAL_SIGN);
			setState(386);
			patternMatchingExpression();
			setState(387);
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
		enterRule(_localctx, 68, RULE_patternMatchingArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << NAME))) != 0)) {
				{
				{
				setState(389);
				patternMatchingArgument();
				}
				}
				setState(394);
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
		enterRule(_localctx, 70, RULE_patternMatchingArgument);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				patternMatchParentheses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				concatenatedList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				emptyList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				underScoreTerm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
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
		enterRule(_localctx, 72, RULE_generalMatchingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
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
		enterRule(_localctx, 74, RULE_patternMatchParentheses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LEFT_PAREN);
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				patternMatchingArgument();
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << LEFT_PAREN) | (1L << UNDERSCORE) | (1L << NAME))) != 0) );
			setState(410);
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
		enterRule(_localctx, 76, RULE_underScoreArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 78, RULE_patternMatchingExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(414);
					patternMatchingTerm();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(417); 
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

	public static class PatternMatchingTermContext extends ParserRuleContext {
		public DollarSignTermContext dollarSignTerm() {
			return getRuleContext(DollarSignTermContext.class,0);
		}
		public GeneralFunctionCallContext generalFunctionCall() {
			return getRuleContext(GeneralFunctionCallContext.class,0);
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
		public PatternMatchParenContext patternMatchParen() {
			return getRuleContext(PatternMatchParenContext.class,0);
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
		enterRule(_localctx, 80, RULE_patternMatchingTerm);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				dollarSignTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				generalFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				functionToMethod();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				haskellFunctionName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				prependTerm();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424);
				generalPatternMatchingTerm();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425);
				patternMatchArray();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426);
				patternMatchParen();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(427);
				ifStatementPattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(428);
				recursiveMain();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(429);
				returnUnitType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(430);
				concatenatedList();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(431);
				emptyList();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(432);
				populatedList();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(433);
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
		enterRule(_localctx, 82, RULE_ifStatementPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			ifTerm();
			setState(437);
			ifStatementExpression();
			setState(438);
			thenTerm();
			setState(439);
			ifStatementExpression();
			setState(440);
			elseTerm();
			setState(441);
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
		enterRule(_localctx, 84, RULE_ifStatementExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(443);
				match(NEWLINE);
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(LEFT_PAREN);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(450);
				match(NEWLINE);
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			patternMatchingExpression();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(457);
				match(NEWLINE);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(RIGHT_PAREN);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					match(NEWLINE);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 86, RULE_ifTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		enterRule(_localctx, 88, RULE_thenTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
		enterRule(_localctx, 90, RULE_elseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		enterRule(_localctx, 92, RULE_prependTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			patternMatchParen();
			setState(477);
			colonTerm();
			setState(478);
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
		enterRule(_localctx, 94, RULE_concatenatedList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LEFT_PAREN);
			setState(481);
			headList();
			setState(482);
			colonTerm();
			setState(483);
			tailList();
			setState(484);
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
		enterRule(_localctx, 96, RULE_headList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		enterRule(_localctx, 98, RULE_colonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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
		enterRule(_localctx, 100, RULE_underScoreTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		enterRule(_localctx, 102, RULE_tailList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 104, RULE_emptyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(LEFT_SQUARE_BRACKET);
			setState(495);
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
		enterRule(_localctx, 106, RULE_populatedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(LEFT_SQUARE_BRACKET);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					listElement();
					setState(499);
					match(COMMA);
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(506);
			listElement();
			setState(507);
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
		enterRule(_localctx, 108, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		enterRule(_localctx, 110, RULE_dollarSignTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(RIGHT_ASSOC_DOLLAR_SIGN);
			setState(512);
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
		enterRule(_localctx, 112, RULE_functionToMethod);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				functionToMethodDollarSign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				functionToMethodParen();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
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
		enterRule(_localctx, 114, RULE_haskellFunctionToScalaMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 116, RULE_functionToMethodDollarSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			haskellFunctionToScalaMethodName();
			setState(522);
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
		enterRule(_localctx, 118, RULE_functionToMethodParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			haskellFunctionToScalaMethodName();
			setState(525);
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
		enterRule(_localctx, 120, RULE_functionToMethodTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			haskellFunctionToScalaMethodName();
			setState(528);
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
		public TerminalNode RECURSIVE_MAIN() { return getToken(HaskellParser.RECURSIVE_MAIN, 0); }
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
		enterRule(_localctx, 122, RULE_recursiveMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(RECURSIVE_MAIN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_returnUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(RETURN);
			setState(533);
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
		enterRule(_localctx, 126, RULE_patternMatchArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(LEFT_SQUARE_BRACKET);
			setState(536);
			patternMatchingExpression();
			setState(537);
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
		enterRule(_localctx, 128, RULE_patternMatchParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(LEFT_PAREN);
			setState(540);
			patternMatchingExpression();
			setState(541);
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
		enterRule(_localctx, 130, RULE_generalPatternMatchingTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 132, RULE_generalFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(FUNC_ARGS_OPEN_PAREN);
			setState(546);
			functionCallFunctionName();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SQUARE_BRACKET) | (1L << FUNC_ARGS_OPEN_PAREN) | (1L << HASKELL_FUNCTIONS_METHODS_IN_SCALA) | (1L << LEFT_PAREN) | (1L << RIGHT_ASSOC_DOLLAR_SIGN) | (1L << IF) | (1L << RETURN) | (1L << RECURSIVE_MAIN) | (1L << INT_VAL) | (1L << INT_OP) | (1L << HASKELL_FUNCTION_NAME) | (1L << NAME))) != 0)) {
				{
				{
				setState(547);
				functionArgument();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
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
		enterRule(_localctx, 134, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public TerminalNode HASKELL_FUNCTION_NAME() { return getToken(HaskellParser.HASKELL_FUNCTION_NAME, 0); }
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
		enterRule(_localctx, 136, RULE_functionCallFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(_la==HASKELL_FUNCTION_NAME || _la==NAME) ) {
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
		enterRule(_localctx, 138, RULE_haskellFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0234\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\5\2\u0090"+
		"\n\2\3\2\5\2\u0093\n\2\3\2\7\2\u0096\n\2\f\2\16\2\u0099\13\2\3\2\7\2\u009c"+
		"\n\2\f\2\16\2\u009f\13\2\3\2\7\2\u00a2\n\2\f\2\16\2\u00a5\13\2\3\3\3\3"+
		"\5\3\u00a9\n\3\3\4\3\4\7\4\u00ad\n\4\f\4\16\4\u00b0\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\7\6\u00b9\n\6\f\6\16\6\u00bc\13\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\7\t\u00c7\n\t\f\t\16\t\u00ca\13\t\3\n\7\n\u00cd\n\n\f\n"+
		"\16\n\u00d0\13\n\3\n\3\n\3\n\3\n\7\n\u00d6\n\n\f\n\16\n\u00d9\13\n\3\n"+
		"\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\13\7\13\u00e3\n\13\f\13\16\13"+
		"\u00e6\13\13\3\13\3\13\3\f\3\f\7\f\u00ec\n\f\f\f\16\f\u00ef\13\f\3\r\7"+
		"\r\u00f2\n\r\f\r\16\r\u00f5\13\r\3\r\3\r\7\r\u00f9\n\r\f\r\16\r\u00fc"+
		"\13\r\3\16\3\16\3\16\7\16\u0101\n\16\f\16\16\16\u0104\13\16\3\16\3\16"+
		"\7\16\u0108\n\16\f\16\16\16\u010b\13\16\5\16\u010d\n\16\3\17\3\17\5\17"+
		"\u0111\n\17\3\17\3\17\5\17\u0115\n\17\3\17\6\17\u0118\n\17\r\17\16\17"+
		"\u0119\3\17\5\17\u011d\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5"+
		"\21\u0127\n\21\3\22\6\22\u012a\n\22\r\22\16\22\u012b\3\22\3\22\3\22\6"+
		"\22\u0131\n\22\r\22\16\22\u0132\3\22\3\22\5\22\u0137\n\22\3\23\3\23\3"+
		"\23\5\23\u013c\n\23\3\24\3\24\6\24\u0140\n\24\r\24\16\24\u0141\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7"+
		"\30\u0153\n\30\f\30\16\30\u0156\13\30\3\31\3\31\3\32\3\32\3\32\7\32\u015d"+
		"\n\32\f\32\16\32\u0160\13\32\3\33\3\33\3\33\3\33\7\33\u0166\n\33\f\33"+
		"\16\33\u0169\13\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\5\37\u0177\n\37\3 \3 \3!\3!\3\"\6\"\u017e\n\"\r\"\16\"\u017f"+
		"\3#\3#\3#\3#\3#\3#\3$\7$\u0189\n$\f$\16$\u018c\13$\3%\3%\3%\3%\3%\5%\u0193"+
		"\n%\3&\3&\3\'\3\'\6\'\u0199\n\'\r\'\16\'\u019a\3\'\3\'\3(\3(\3)\6)\u01a2"+
		"\n)\r)\16)\u01a3\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01b5"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3,\7,\u01bf\n,\f,\16,\u01c2\13,\3,\3,\7,\u01c6"+
		"\n,\f,\16,\u01c9\13,\3,\3,\7,\u01cd\n,\f,\16,\u01d0\13,\3,\3,\7,\u01d4"+
		"\n,\f,\16,\u01d7\13,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\7\67\u01f8\n\67\f\67\16\67\u01fb\13\67\3\67\3"+
		"\67\3\67\38\38\39\39\39\3:\3:\3:\5:\u0208\n:\3;\3;\3<\3<\3<\3=\3=\3=\3"+
		">\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3D\3D\3D\7D\u0227"+
		"\nD\fD\16D\u022a\13D\3D\3D\3E\3E\3F\3F\3G\3G\3G\2\2H\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\5\4\2  &&\4\2 "+
		"!&&\4\2##&&\u022e\2\u008f\3\2\2\2\4\u00a8\3\2\2\2\6\u00aa\3\2\2\2\b\u00b3"+
		"\3\2\2\2\n\u00b6\3\2\2\2\f\u00bd\3\2\2\2\16\u00bf\3\2\2\2\20\u00c4\3\2"+
		"\2\2\22\u00ce\3\2\2\2\24\u00e4\3\2\2\2\26\u00e9\3\2\2\2\30\u00f3\3\2\2"+
		"\2\32\u010c\3\2\2\2\34\u010e\3\2\2\2\36\u011e\3\2\2\2 \u0123\3\2\2\2\""+
		"\u0136\3\2\2\2$\u013b\3\2\2\2&\u013d\3\2\2\2(\u0145\3\2\2\2*\u0147\3\2"+
		"\2\2,\u014b\3\2\2\2.\u014d\3\2\2\2\60\u0157\3\2\2\2\62\u015e\3\2\2\2\64"+
		"\u0161\3\2\2\2\66\u016d\3\2\2\28\u016f\3\2\2\2:\u0171\3\2\2\2<\u0176\3"+
		"\2\2\2>\u0178\3\2\2\2@\u017a\3\2\2\2B\u017d\3\2\2\2D\u0181\3\2\2\2F\u018a"+
		"\3\2\2\2H\u0192\3\2\2\2J\u0194\3\2\2\2L\u0196\3\2\2\2N\u019e\3\2\2\2P"+
		"\u01a1\3\2\2\2R\u01b4\3\2\2\2T\u01b6\3\2\2\2V\u01c0\3\2\2\2X\u01d8\3\2"+
		"\2\2Z\u01da\3\2\2\2\\\u01dc\3\2\2\2^\u01de\3\2\2\2`\u01e2\3\2\2\2b\u01e8"+
		"\3\2\2\2d\u01ea\3\2\2\2f\u01ec\3\2\2\2h\u01ee\3\2\2\2j\u01f0\3\2\2\2l"+
		"\u01f3\3\2\2\2n\u01ff\3\2\2\2p\u0201\3\2\2\2r\u0207\3\2\2\2t\u0209\3\2"+
		"\2\2v\u020b\3\2\2\2x\u020e\3\2\2\2z\u0211\3\2\2\2|\u0214\3\2\2\2~\u0216"+
		"\3\2\2\2\u0080\u0219\3\2\2\2\u0082\u021d\3\2\2\2\u0084\u0221\3\2\2\2\u0086"+
		"\u0223\3\2\2\2\u0088\u022d\3\2\2\2\u008a\u022f\3\2\2\2\u008c\u0231\3\2"+
		"\2\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0093\5\16\b\2\u0092\u0091\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u009d\3\2\2\2\u0094\u0096\7%\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009c\5\4\3\2\u009b\u0097\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a3\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7%\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\3\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a9\5\32\16\2\u00a7\u00a9\5\b\5\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\5\3\2\2\2\u00aa\u00ae\7\5\2\2\u00ab"+
		"\u00ad\7&\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7\6\2\2\u00b2\7\3\2\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\7%\2\2"+
		"\u00b5\t\3\2\2\2\u00b6\u00ba\7\20\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\13\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7&\2\2\u00be\r\3\2\2\2\u00bf"+
		"\u00c0\5\20\t\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3"+
		"\5\24\13\2\u00c3\17\3\2\2\2\u00c4\u00c8\7\7\2\2\u00c5\u00c7\7%\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\21\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7%\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\r\2\2\u00d2\u00d7\5\30"+
		"\r\2\u00d3\u00d4\7\t\2\2\u00d4\u00d6\5\30\r\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\7\16\2\2\u00db\u00dd\7%\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\23\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7%\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\b\2\2\u00e8\25\3\2\2"+
		"\2\u00e9\u00ed\7&\2\2\u00ea\u00ec\7%\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\27\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f2\7%\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00fa\7&\2\2\u00f7\u00f9\7%\2\2\u00f8\u00f7\3\2\2"+
		"\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\31"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5.\30\2\u00fe\u0102\5B\"\2\u00ff"+
		"\u0101\7%\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u010d\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0109\5\34\17\2\u0106\u0108\7%\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0105\3\2\2\2\u010d\33\3\2\2"+
		"\2\u010e\u0110\5\36\20\2\u010f\u0111\7%\2\2\u0110\u010f\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\5 \21\2\u0113\u0115\7%"+
		"\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0118\5\"\22\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u011d\7%\2\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\35\3\2\2\2\u011e\u011f\7\37\2"+
		"\2\u011f\u0120\7\33\2\2\u0120\u0121\7\24\2\2\u0121\u0122\5@!\2\u0122\37"+
		"\3\2\2\2\u0123\u0124\7\37\2\2\u0124\u0126\7\21\2\2\u0125\u0127\7\25\2"+
		"\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127!\3\2\2\2\u0128\u012a"+
		"\5*\26\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7%\2\2\u012e\u0137\3\2"+
		"\2\2\u012f\u0131\5R*\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7%\2\2\u0135"+
		"\u0137\3\2\2\2\u0136\u0129\3\2\2\2\u0136\u0130\3\2\2\2\u0137#\3\2\2\2"+
		"\u0138\u013c\5\u008cG\2\u0139\u013c\5&\24\2\u013a\u013c\5(\25\2\u013b"+
		"\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c%\3\2\2\2"+
		"\u013d\u013f\7\r\2\2\u013e\u0140\5$\23\2\u013f\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\7\16\2\2\u0144\'\3\2\2\2\u0145\u0146\t\2\2\2\u0146)\3\2\2\2\u0147"+
		"\u0148\5,\27\2\u0148\u0149\7\34\2\2\u0149\u014a\5P)\2\u014a+\3\2\2\2\u014b"+
		"\u014c\7&\2\2\u014c-\3\2\2\2\u014d\u014e\5\60\31\2\u014e\u014f\7\33\2"+
		"\2\u014f\u0150\5\62\32\2\u0150\u0154\5:\36\2\u0151\u0153\7%\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155/\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7&\2\2\u0158\61\3"+
		"\2\2\2\u0159\u015a\58\35\2\u015a\u015b\7\35\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\63\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0167\7\r\2\2\u0162\u0163"+
		"\5<\37\2\u0163\u0164\5\66\34\2\u0164\u0166\3\2\2\2\u0165\u0162\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5<\37\2\u016b\u016c\7\16\2\2"+
		"\u016c\65\3\2\2\2\u016d\u016e\7\35\2\2\u016e\67\3\2\2\2\u016f\u0170\5"+
		"<\37\2\u01709\3\2\2\2\u0171\u0172\5<\37\2\u0172;\3\2\2\2\u0173\u0177\5"+
		"> \2\u0174\u0177\5\64\33\2\u0175\u0177\5@!\2\u0176\u0173\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177=\3\2\2\2\u0178\u0179\7\"\2\2"+
		"\u0179?\3\2\2\2\u017a\u017b\7$\2\2\u017bA\3\2\2\2\u017c\u017e\5D#\2\u017d"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180C\3\2\2\2\u0181\u0182\7&\2\2\u0182\u0183\5F$\2\u0183\u0184\7"+
		"\21\2\2\u0184\u0185\5P)\2\u0185\u0186\7%\2\2\u0186E\3\2\2\2\u0187\u0189"+
		"\5H%\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018bG\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0193\5L\'\2\u018e"+
		"\u0193\5`\61\2\u018f\u0193\5j\66\2\u0190\u0193\5f\64\2\u0191\u0193\5J"+
		"&\2\u0192\u018d\3\2\2\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193I\3\2\2\2\u0194\u0195\7&\2\2\u0195"+
		"K\3\2\2\2\u0196\u0198\7\r\2\2\u0197\u0199\5H%\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\7\16\2\2\u019dM\3\2\2\2\u019e\u019f\5f\64\2\u019fO\3"+
		"\2\2\2\u01a0\u01a2\5R*\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4Q\3\2\2\2\u01a5\u01b5\5p9\2\u01a6"+
		"\u01b5\5\u0086D\2\u01a7\u01b5\5r:\2\u01a8\u01b5\5\u008cG\2\u01a9\u01b5"+
		"\5^\60\2\u01aa\u01b5\5\u0084C\2\u01ab\u01b5\5\u0080A\2\u01ac\u01b5\5\u0082"+
		"B\2\u01ad\u01b5\5T+\2\u01ae\u01b5\5|?\2\u01af\u01b5\5~@\2\u01b0\u01b5"+
		"\5`\61\2\u01b1\u01b5\5j\66\2\u01b2\u01b5\5l\67\2\u01b3\u01b5\7&\2\2\u01b4"+
		"\u01a5\3\2\2\2\u01b4\u01a6\3\2\2\2\u01b4\u01a7\3\2\2\2\u01b4\u01a8\3\2"+
		"\2\2\u01b4\u01a9\3\2\2\2\u01b4\u01aa\3\2\2\2\u01b4\u01ab\3\2\2\2\u01b4"+
		"\u01ac\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2"+
		"\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5S\3\2\2\2\u01b6\u01b7\5X-\2\u01b7\u01b8\5V,\2\u01b8"+
		"\u01b9\5Z.\2\u01b9\u01ba\5V,\2\u01ba\u01bb\5\\/\2\u01bb\u01bc\5V,\2\u01bc"+
		"U\3\2\2\2\u01bd\u01bf\7%\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c3\u01c7\7\r\2\2\u01c4\u01c6\7%\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01ce\5P)\2\u01cb\u01cd\7%\2\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\7\16\2\2\u01d2\u01d4\7"+
		"%\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6W\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\27\2\2"+
		"\u01d9Y\3\2\2\2\u01da\u01db\7\30\2\2\u01db[\3\2\2\2\u01dc\u01dd\7\31\2"+
		"\2\u01dd]\3\2\2\2\u01de\u01df\5\u0082B\2\u01df\u01e0\5d\63\2\u01e0\u01e1"+
		"\5\u0082B\2\u01e1_\3\2\2\2\u01e2\u01e3\7\r\2\2\u01e3\u01e4\5b\62\2\u01e4"+
		"\u01e5\5d\63\2\u01e5\u01e6\5h\65\2\u01e6\u01e7\7\16\2\2\u01e7a\3\2\2\2"+
		"\u01e8\u01e9\5R*\2\u01e9c\3\2\2\2\u01ea\u01eb\7\17\2\2\u01ebe\3\2\2\2"+
		"\u01ec\u01ed\7\23\2\2\u01edg\3\2\2\2\u01ee\u01ef\5R*\2\u01efi\3\2\2\2"+
		"\u01f0\u01f1\7\3\2\2\u01f1\u01f2\7\4\2\2\u01f2k\3\2\2\2\u01f3\u01f9\7"+
		"\3\2\2\u01f4\u01f5\5n8\2\u01f5\u01f6\7\t\2\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01f4\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5n8\2\u01fd\u01fe"+
		"\7\4\2\2\u01fem\3\2\2\2\u01ff\u0200\5R*\2\u0200o\3\2\2\2\u0201\u0202\7"+
		"\22\2\2\u0202\u0203\5P)\2\u0203q\3\2\2\2\u0204\u0208\5v<\2\u0205\u0208"+
		"\5x=\2\u0206\u0208\5z>\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0206\3\2\2\2\u0208s\3\2\2\2\u0209\u020a\7\f\2\2\u020au\3\2\2\2\u020b"+
		"\u020c\5t;\2\u020c\u020d\5p9\2\u020dw\3\2\2\2\u020e\u020f\5t;\2\u020f"+
		"\u0210\5\u0082B\2\u0210y\3\2\2\2\u0211\u0212\5t;\2\u0212\u0213\5\u0084"+
		"C\2\u0213{\3\2\2\2\u0214\u0215\7\36\2\2\u0215}\3\2\2\2\u0216\u0217\7\32"+
		"\2\2\u0217\u0218\7$\2\2\u0218\177\3\2\2\2\u0219\u021a\7\3\2\2\u021a\u021b"+
		"\5P)\2\u021b\u021c\7\4\2\2\u021c\u0081\3\2\2\2\u021d\u021e\7\r\2\2\u021e"+
		"\u021f\5P)\2\u021f\u0220\7\16\2\2\u0220\u0083\3\2\2\2\u0221\u0222\t\3"+
		"\2\2\u0222\u0085\3\2\2\2\u0223\u0224\7\n\2\2\u0224\u0228\5\u008aF\2\u0225"+
		"\u0227\5\u0088E\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\7\13\2\2\u022c\u0087\3\2\2\2\u022d\u022e\5R*\2\u022e\u0089\3\2"+
		"\2\2\u022f\u0230\t\4\2\2\u0230\u008b\3\2\2\2\u0231\u0232\7#\2\2\u0232"+
		"\u008d\3\2\2\2\60\u008f\u0092\u0097\u009d\u00a3\u00a8\u00ae\u00ba\u00c8"+
		"\u00ce\u00d7\u00de\u00e4\u00ed\u00f3\u00fa\u0102\u0109\u010c\u0110\u0114"+
		"\u0119\u011c\u0126\u012b\u0132\u0136\u013b\u0141\u0154\u015e\u0167\u0176"+
		"\u017f\u018a\u0192\u019a\u01a3\u01b4\u01c0\u01c7\u01ce\u01d5\u01f9\u0207"+
		"\u0228";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}