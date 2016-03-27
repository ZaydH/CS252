// Generated from ScalaOutput.g4 by ANTLR 4.5.2
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
public class ScalaOutputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NONE=1, SOME=2, LEFT_PAREN=3, RIGHT_PAREN=4, COMMA=5, ARRAY_KEYWORD=6, 
		LIST_KEYWORD=7, GENERAL_WORD=8, NEWLINE=9, WS=10;
	public static final int
		RULE_reformat = 0, RULE_spaceSeparatedTerm = 1, RULE_singleTerm = 2, RULE_newLineTerm = 3, 
		RULE_parenthesesTerm = 4, RULE_monadReformatter = 5, RULE_none = 6, RULE_somePhrase = 7, 
		RULE_list = 8, RULE_listTerm = 9, RULE_normalWord = 10;
	public static final String[] ruleNames = {
		"reformat", "spaceSeparatedTerm", "singleTerm", "newLineTerm", "parenthesesTerm", 
		"monadReformatter", "none", "somePhrase", "list", "listTerm", "normalWord"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'None'", "'Some'", "'('", "')'", "','", "'Array'", "'List'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NONE", "SOME", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "ARRAY_KEYWORD", 
		"LIST_KEYWORD", "GENERAL_WORD", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "ScalaOutput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScalaOutputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReformatContext extends ParserRuleContext {
		public List<SpaceSeparatedTermContext> spaceSeparatedTerm() {
			return getRuleContexts(SpaceSeparatedTermContext.class);
		}
		public SpaceSeparatedTermContext spaceSeparatedTerm(int i) {
			return getRuleContext(SpaceSeparatedTermContext.class,i);
		}
		public ReformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterReformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitReformat(this);
		}
	}

	public final ReformatContext reformat() throws RecognitionException {
		ReformatContext _localctx = new ReformatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reformat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << SOME) | (1L << LEFT_PAREN) | (1L << ARRAY_KEYWORD) | (1L << LIST_KEYWORD) | (1L << GENERAL_WORD) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(22);
				spaceSeparatedTerm();
				}
				}
				setState(27);
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

	public static class SpaceSeparatedTermContext extends ParserRuleContext {
		public SingleTermContext singleTerm() {
			return getRuleContext(SingleTermContext.class,0);
		}
		public SpaceSeparatedTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceSeparatedTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterSpaceSeparatedTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitSpaceSeparatedTerm(this);
		}
	}

	public final SpaceSeparatedTermContext spaceSeparatedTerm() throws RecognitionException {
		SpaceSeparatedTermContext _localctx = new SpaceSeparatedTermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_spaceSeparatedTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			singleTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTermContext extends ParserRuleContext {
		public ParenthesesTermContext parenthesesTerm() {
			return getRuleContext(ParenthesesTermContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public NormalWordContext normalWord() {
			return getRuleContext(NormalWordContext.class,0);
		}
		public MonadReformatterContext monadReformatter() {
			return getRuleContext(MonadReformatterContext.class,0);
		}
		public NewLineTermContext newLineTerm() {
			return getRuleContext(NewLineTermContext.class,0);
		}
		public SingleTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterSingleTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitSingleTerm(this);
		}
	}

	public final SingleTermContext singleTerm() throws RecognitionException {
		SingleTermContext _localctx = new SingleTermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTerm);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				parenthesesTerm();
				}
				break;
			case ARRAY_KEYWORD:
			case LIST_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				list();
				}
				break;
			case GENERAL_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				normalWord();
				}
				break;
			case NONE:
			case SOME:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				monadReformatter();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				newLineTerm();
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

	public static class NewLineTermContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ScalaOutputParser.NEWLINE, 0); }
		public NewLineTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLineTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterNewLineTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitNewLineTerm(this);
		}
	}

	public final NewLineTermContext newLineTerm() throws RecognitionException {
		NewLineTermContext _localctx = new NewLineTermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newLineTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
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

	public static class ParenthesesTermContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(ScalaOutputParser.LEFT_PAREN, 0); }
		public ReformatContext reformat() {
			return getRuleContext(ReformatContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ScalaOutputParser.RIGHT_PAREN, 0); }
		public ParenthesesTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesesTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterParenthesesTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitParenthesesTerm(this);
		}
	}

	public final ParenthesesTermContext parenthesesTerm() throws RecognitionException {
		ParenthesesTermContext _localctx = new ParenthesesTermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parenthesesTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(LEFT_PAREN);
			setState(40);
			reformat();
			setState(41);
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

	public static class MonadReformatterContext extends ParserRuleContext {
		public NoneContext none() {
			return getRuleContext(NoneContext.class,0);
		}
		public SomePhraseContext somePhrase() {
			return getRuleContext(SomePhraseContext.class,0);
		}
		public MonadReformatterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadReformatter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterMonadReformatter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitMonadReformatter(this);
		}
	}

	public final MonadReformatterContext monadReformatter() throws RecognitionException {
		MonadReformatterContext _localctx = new MonadReformatterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_monadReformatter);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				none();
				}
				break;
			case SOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				somePhrase();
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

	public static class NoneContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(ScalaOutputParser.NONE, 0); }
		public NoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_none; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitNone(this);
		}
	}

	public final NoneContext none() throws RecognitionException {
		NoneContext _localctx = new NoneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_none);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(NONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomePhraseContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(ScalaOutputParser.SOME, 0); }
		public List<SingleTermContext> singleTerm() {
			return getRuleContexts(SingleTermContext.class);
		}
		public SingleTermContext singleTerm(int i) {
			return getRuleContext(SingleTermContext.class,i);
		}
		public SomePhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_somePhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterSomePhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitSomePhrase(this);
		}
	}

	public final SomePhraseContext somePhrase() throws RecognitionException {
		SomePhraseContext _localctx = new SomePhraseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_somePhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SOME);
			setState(50);
			match(LEFT_PAREN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << SOME) | (1L << LEFT_PAREN) | (1L << ARRAY_KEYWORD) | (1L << LIST_KEYWORD) | (1L << GENERAL_WORD) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(51);
				singleTerm();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST_KEYWORD() { return getToken(ScalaOutputParser.LIST_KEYWORD, 0); }
		public TerminalNode ARRAY_KEYWORD() { return getToken(ScalaOutputParser.ARRAY_KEYWORD, 0); }
		public List<ListTermContext> listTerm() {
			return getRuleContexts(ListTermContext.class);
		}
		public ListTermContext listTerm(int i) {
			return getRuleContext(ListTermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScalaOutputParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScalaOutputParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_KEYWORD || _la==LIST_KEYWORD) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(60);
			match(LEFT_PAREN);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					listTerm();
					setState(62);
					match(COMMA);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(70);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << SOME) | (1L << LEFT_PAREN) | (1L << ARRAY_KEYWORD) | (1L << LIST_KEYWORD) | (1L << GENERAL_WORD) | (1L << NEWLINE))) != 0)) {
				{
				setState(69);
				listTerm();
				}
			}

			setState(72);
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

	public static class ListTermContext extends ParserRuleContext {
		public SingleTermContext singleTerm() {
			return getRuleContext(SingleTermContext.class,0);
		}
		public ListTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterListTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitListTerm(this);
		}
	}

	public final ListTermContext listTerm() throws RecognitionException {
		ListTermContext _localctx = new ListTermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			singleTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalWordContext extends ParserRuleContext {
		public TerminalNode GENERAL_WORD() { return getToken(ScalaOutputParser.GENERAL_WORD, 0); }
		public NormalWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).enterNormalWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaOutputListener ) ((ScalaOutputListener)listener).exitNormalWord(this);
		}
	}

	public final NormalWordContext normalWord() throws RecognitionException {
		NormalWordContext _localctx = new NormalWordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_normalWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(GENERAL_WORD);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fQ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"&\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7\60\n\7\3\b\3\b\3\t\3\t\3\t\7"+
		"\t\67\n\t\f\t\16\t:\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nC\n\n\f\n\16\n"+
		"F\13\n\3\n\5\nI\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\3\3\2\b\tN\2\33\3\2\2\2\4\36\3\2\2\2\6%\3\2\2\2\b\'\3\2"+
		"\2\2\n)\3\2\2\2\f/\3\2\2\2\16\61\3\2\2\2\20\63\3\2\2\2\22=\3\2\2\2\24"+
		"L\3\2\2\2\26N\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37\5\6\4\2\37\5\3"+
		"\2\2\2 &\5\n\6\2!&\5\22\n\2\"&\5\26\f\2#&\5\f\7\2$&\5\b\5\2% \3\2\2\2"+
		"%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\'(\7\13\2\2(\t\3"+
		"\2\2\2)*\7\5\2\2*+\5\2\2\2+,\7\6\2\2,\13\3\2\2\2-\60\5\16\b\2.\60\5\20"+
		"\t\2/-\3\2\2\2/.\3\2\2\2\60\r\3\2\2\2\61\62\7\3\2\2\62\17\3\2\2\2\63\64"+
		"\7\4\2\2\648\7\5\2\2\65\67\5\6\4\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\6\2\2<\21\3\2\2\2=>\t\2\2\2>D\7\5"+
		"\2\2?@\5\24\13\2@A\7\7\2\2AC\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2EH\3\2\2\2FD\3\2\2\2GI\5\24\13\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J"+
		"K\7\6\2\2K\23\3\2\2\2LM\5\6\4\2M\25\3\2\2\2NO\7\n\2\2O\27\3\2\2\2\b\33"+
		"%/8DH";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}