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
		HEADER_COMMENT_CLOSE=4, LEFT_PAREN=5, RIGHT_PAREN=6, INLINE_COMMENT_SYMBOL=7, 
		EQUAL_SIGN=8, IO=9, DO=10, LET=11, ARG_TYPE_SEPARATOR=12, TYPE_SEPARATOR=13, 
		MAIN_FUNCTION=14, INT_VAL=15, INT_OP=16, TYPE_NAME=17, HASKELL_FUNCTION_NAME=18, 
		UNIT_TYPE=19, NEWLINE=20, NAME=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "LEFT_PAREN", "RIGHT_PAREN", "INLINE_COMMENT_SYMBOL", 
		"EQUAL_SIGN", "IO", "DO", "LET", "ARG_TYPE_SEPARATOR", "TYPE_SEPARATOR", 
		"MAIN_FUNCTION", "INT_VAL", "INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", 
		"UNIT_TYPE", "NEWLINE", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{-'", "'-}'", "'('", "')'", "'--'", "'='", "'IO'", 
		"'do'", "'let'", "'::'", "'->'", "'main'", null, null, null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "LEFT_PAREN", "RIGHT_PAREN", "INLINE_COMMENT_SYMBOL", 
		"EQUAL_SIGN", "IO", "DO", "LET", "ARG_TYPE_SEPARATOR", "TYPE_SEPARATOR", 
		"MAIN_FUNCTION", "INT_VAL", "INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", 
		"UNIT_TYPE", "NEWLINE", "NAME", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\5\20Y\n\20\3\20\6\20\\\n\20\r\20\16\20]\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21j\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0082\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0092\n\23\3\24\3\24\3\24"+
		"\3\25\5\25\u0098\n\25\3\25\3\25\3\26\6\26\u009d\n\26\r\26\16\26\u009e"+
		"\3\27\6\27\u00a2\n\27\r\27\16\27\u00a3\3\27\3\27\2\2\30\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30\3\2\b\3\2//\3\2\62;\4\2,-//\4\2>>@@\7\2))\60\60"+
		"\62;C\\c|\4\2\13\13\"\"\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2"+
		"\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25E\3\2\2"+
		"\2\27H\3\2\2\2\31L\3\2\2\2\33O\3\2\2\2\35R\3\2\2\2\37X\3\2\2\2!i\3\2\2"+
		"\2#\u0081\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0097\3\2\2\2+\u009c"+
		"\3\2\2\2-\u00a1\3\2\2\2/\60\7]\2\2\60\4\3\2\2\2\61\62\7]\2\2\62\6\3\2"+
		"\2\2\63\64\7}\2\2\64\65\7/\2\2\65\b\3\2\2\2\66\67\7/\2\2\678\7\177\2\2"+
		"8\n\3\2\2\29:\7*\2\2:\f\3\2\2\2;<\7+\2\2<\16\3\2\2\2=>\7/\2\2>?\7/\2\2"+
		"?\20\3\2\2\2@A\7?\2\2A\22\3\2\2\2BC\7K\2\2CD\7Q\2\2D\24\3\2\2\2EF\7f\2"+
		"\2FG\7q\2\2G\26\3\2\2\2HI\7n\2\2IJ\7g\2\2JK\7v\2\2K\30\3\2\2\2LM\7<\2"+
		"\2MN\7<\2\2N\32\3\2\2\2OP\7/\2\2PQ\7@\2\2Q\34\3\2\2\2RS\7o\2\2ST\7c\2"+
		"\2TU\7k\2\2UV\7p\2\2V\36\3\2\2\2WY\t\2\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2"+
		"\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^ \3\2\2\2_j\t\4"+
		"\2\2`a\7?\2\2aj\7?\2\2bc\7\61\2\2cj\7?\2\2dj\t\5\2\2ef\7>\2\2fj\7?\2\2"+
		"gh\7@\2\2hj\7?\2\2i_\3\2\2\2i`\3\2\2\2ib\3\2\2\2id\3\2\2\2ie\3\2\2\2i"+
		"g\3\2\2\2j\"\3\2\2\2kl\7]\2\2lm\7K\2\2mn\7p\2\2no\7v\2\2o\u0082\7_\2\2"+
		"pq\7K\2\2qr\7p\2\2r\u0082\7v\2\2st\7]\2\2tu\7E\2\2uv\7j\2\2vw\7c\2\2w"+
		"x\7t\2\2x\u0082\7_\2\2yz\7E\2\2z{\7j\2\2{|\7c\2\2|\u0082\7t\2\2}~\7D\2"+
		"\2~\177\7q\2\2\177\u0080\7q\2\2\u0080\u0082\7n\2\2\u0081k\3\2\2\2\u0081"+
		"p\3\2\2\2\u0081s\3\2\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082$\3\2\2\2"+
		"\u0083\u0084\7r\2\2\u0084\u0085\7w\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7U\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7N\2\2\u008a"+
		"\u0092\7p\2\2\u008b\u008c\7r\2\2\u008c\u008d\7w\2\2\u008d\u008e\7v\2\2"+
		"\u008e\u008f\7U\2\2\u008f\u0090\7v\2\2\u0090\u0092\7t\2\2\u0091\u0083"+
		"\3\2\2\2\u0091\u008b\3\2\2\2\u0092&\3\2\2\2\u0093\u0094\7*\2\2\u0094\u0095"+
		"\7+\2\2\u0095(\3\2\2\2\u0096\u0098\7\17\2\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\f\2\2\u009a*\3\2\2\2"+
		"\u009b\u009d\t\6\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f,\3\2\2\2\u00a0\u00a2\t\7\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\27\2\2\u00a6.\3\2\2\2\13\2X]i\u0081"+
		"\u0091\u0097\u009e\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}