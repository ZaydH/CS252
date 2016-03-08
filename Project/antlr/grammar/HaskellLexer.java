// Generated from Haskell.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_SQUARE_BRACKET=1, RIGHT_SQUARE_BRACKET=2, HEADER_COMMENT_OPEN=3, 
		HEADER_COMMENT_CLOSE=4, FUNC_ARGS_OPEN_PAREN=5, FUNC_ARGS_CLOSE_PAREN=6, 
		LEFT_PAREN=7, RIGHT_PAREN=8, INLINE_COMMENT_SYMBOL=9, EQUAL_SIGN=10, RIGHT_ASSOC_DOLLAR_SIGN=11, 
		IO=12, DO=13, LET=14, ARG_TYPE_SEPARATOR=15, TYPE_SEPARATOR=16, MAIN_FUNCTION=17, 
		INT_VAL=18, INT_OP=19, TYPE_NAME=20, HASKELL_FUNCTION_NAME=21, UNIT_TYPE=22, 
		NEWLINE=23, NAME=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "FUNC_ARGS_OPEN_PAREN", "FUNC_ARGS_CLOSE_PAREN", 
		"LEFT_PAREN", "RIGHT_PAREN", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"IO", "DO", "LET", "ARG_TYPE_SEPARATOR", "TYPE_SEPARATOR", "MAIN_FUNCTION", 
		"INT_VAL", "INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", 
		"NEWLINE", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{-'", "'-}'", "'(('", "'))'", "'('", "')'", "'--'", 
		"'='", "'$'", "'IO'", "'do'", "'let'", "'::'", "'->'", "'main'", null, 
		null, null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "FUNC_ARGS_OPEN_PAREN", "FUNC_ARGS_CLOSE_PAREN", 
		"LEFT_PAREN", "RIGHT_PAREN", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"IO", "DO", "LET", "ARG_TYPE_SEPARATOR", "TYPE_SEPARATOR", "MAIN_FUNCTION", 
		"INT_VAL", "INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", 
		"NEWLINE", "NAME", "WS"
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


	public HaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\5\23g\n\23\3\23\6\23j\n\23\r\23\16\23k\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24x\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0090\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a0\n\26\3\27\3\27\3\27"+
		"\3\30\5\30\u00a6\n\30\3\30\3\30\3\31\6\31\u00ab\n\31\r\31\16\31\u00ac"+
		"\3\32\6\32\u00b0\n\32\r\32\16\32\u00b1\3\32\3\32\2\2\33\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\b\3\2//\3\2\62;\4\2,-//\4\2"+
		">>@@\7\2))\60\60\62;C\\c|\4\2\13\13\"\"\u00c3\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13?\3\2\2\2\rB\3"+
		"\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31"+
		"P\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37Z\3\2\2\2!]\3\2\2\2#`\3\2\2\2%f\3"+
		"\2\2\2\'w\3\2\2\2)\u008f\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a5"+
		"\3\2\2\2\61\u00aa\3\2\2\2\63\u00af\3\2\2\2\65\66\7]\2\2\66\4\3\2\2\2\67"+
		"8\7]\2\28\6\3\2\2\29:\7}\2\2:;\7/\2\2;\b\3\2\2\2<=\7/\2\2=>\7\177\2\2"+
		">\n\3\2\2\2?@\7*\2\2@A\7*\2\2A\f\3\2\2\2BC\7+\2\2CD\7+\2\2D\16\3\2\2\2"+
		"EF\7*\2\2F\20\3\2\2\2GH\7+\2\2H\22\3\2\2\2IJ\7/\2\2JK\7/\2\2K\24\3\2\2"+
		"\2LM\7?\2\2M\26\3\2\2\2NO\7&\2\2O\30\3\2\2\2PQ\7K\2\2QR\7Q\2\2R\32\3\2"+
		"\2\2ST\7f\2\2TU\7q\2\2U\34\3\2\2\2VW\7n\2\2WX\7g\2\2XY\7v\2\2Y\36\3\2"+
		"\2\2Z[\7<\2\2[\\\7<\2\2\\ \3\2\2\2]^\7/\2\2^_\7@\2\2_\"\3\2\2\2`a\7o\2"+
		"\2ab\7c\2\2bc\7k\2\2cd\7p\2\2d$\3\2\2\2eg\t\2\2\2fe\3\2\2\2fg\3\2\2\2"+
		"gi\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l&\3\2\2\2"+
		"mx\t\4\2\2no\7?\2\2ox\7?\2\2pq\7\61\2\2qx\7?\2\2rx\t\5\2\2st\7>\2\2tx"+
		"\7?\2\2uv\7@\2\2vx\7?\2\2wm\3\2\2\2wn\3\2\2\2wp\3\2\2\2wr\3\2\2\2ws\3"+
		"\2\2\2wu\3\2\2\2x(\3\2\2\2yz\7]\2\2z{\7K\2\2{|\7p\2\2|}\7v\2\2}\u0090"+
		"\7_\2\2~\177\7K\2\2\177\u0080\7p\2\2\u0080\u0090\7v\2\2\u0081\u0082\7"+
		"]\2\2\u0082\u0083\7E\2\2\u0083\u0084\7j\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0090\7_\2\2\u0087\u0088\7E\2\2\u0088\u0089\7j\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u0090\7t\2\2\u008b\u008c\7D\2\2\u008c\u008d\7q\2\2"+
		"\u008d\u008e\7q\2\2\u008e\u0090\7n\2\2\u008fy\3\2\2\2\u008f~\3\2\2\2\u008f"+
		"\u0081\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090*\3\2\2\2"+
		"\u0091\u0092\7r\2\2\u0092\u0093\7w\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7U\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7N\2\2\u0098"+
		"\u00a0\7p\2\2\u0099\u009a\7r\2\2\u009a\u009b\7w\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7U\2\2\u009d\u009e\7v\2\2\u009e\u00a0\7t\2\2\u009f\u0091"+
		"\3\2\2\2\u009f\u0099\3\2\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3"+
		"\7+\2\2\u00a3.\3\2\2\2\u00a4\u00a6\7\17\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\60\3\2\2"+
		"\2\u00a9\u00ab\t\6\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\62\3\2\2\2\u00ae\u00b0\t\7\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\32\2\2\u00b4\64\3\2\2\2\13\2fk"+
		"w\u008f\u009f\u00a5\u00ac\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}