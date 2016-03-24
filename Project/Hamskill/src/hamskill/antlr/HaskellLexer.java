// Generated from Haskell.g4 by ANTLR 4.5.2
package hamskill.antlr;
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
		HEADER_COMMENT_CLOSE=4, MODULE_STRING=5, WHERE_STRING=6, COMMA=7, FUNC_ARGS_OPEN_PAREN=8, 
		FUNC_ARGS_CLOSE_PAREN=9, HASKELL_FUNCTIONS_METHODS_IN_SCALA=10, LEFT_PAREN=11, 
		RIGHT_PAREN=12, COLON=13, INLINE_COMMENT_SYMBOL=14, EQUAL_SIGN=15, RIGHT_ASSOC_DOLLAR_SIGN=16, 
		UNDERSCORE=17, IO=18, DO=19, LET=20, IF=21, THEN=22, ELSE=23, RETURN=24, 
		ARG_TYPE_SEPARATOR=25, MONAD_ARROW=26, TYPE_SEPARATOR=27, RECURSIVE_MAIN=28, 
		MAIN_FUNCTION=29, INT_VAL=30, INT_OP=31, TYPE_NAME=32, HASKELL_FUNCTION_NAME=33, 
		UNIT_TYPE=34, NEWLINE=35, NAME=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "LEFT_PAREN", 
		"RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"UNDERSCORE", "IO", "DO", "LET", "IF", "THEN", "ELSE", "RETURN", "ARG_TYPE_SEPARATOR", 
		"MONAD_ARROW", "TYPE_SEPARATOR", "RECURSIVE_MAIN", "MAIN_FUNCTION", "INT_VAL", 
		"INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", "NEWLINE", 
		"NAME", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13w\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\5\37\u00be\n\37\3\37\6\37\u00c1\n\37\r\37\16\37\u00c2\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u00cf\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00e7\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00fe\n\"\3"+
		"#\3#\3#\3$\5$\u0104\n$\3$\3$\3%\6%\u0109\n%\r%\16%\u010a\3&\6&\u010e\n"+
		"&\r&\16&\u010f\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\b\3\2//\3\2\62;\4\2,"+
		"-//\4\2>>@@\b\2))\60\60\62;C\\aac|\4\2\13\13\"\"\u0123\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tT\3\2\2\2\13W\3\2\2\2\r^\3"+
		"\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23i\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31"+
		"z\3\2\2\2\33|\3\2\2\2\35~\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085"+
		"\3\2\2\2%\u0087\3\2\2\2\'\u008a\3\2\2\2)\u008d\3\2\2\2+\u0091\3\2\2\2"+
		"-\u0094\3\2\2\2/\u0099\3\2\2\2\61\u009e\3\2\2\2\63\u00a5\3\2\2\2\65\u00a8"+
		"\3\2\2\2\67\u00ab\3\2\2\29\u00ae\3\2\2\2;\u00b7\3\2\2\2=\u00bd\3\2\2\2"+
		"?\u00ce\3\2\2\2A\u00e6\3\2\2\2C\u00fd\3\2\2\2E\u00ff\3\2\2\2G\u0103\3"+
		"\2\2\2I\u0108\3\2\2\2K\u010d\3\2\2\2MN\7]\2\2N\4\3\2\2\2OP\7_\2\2P\6\3"+
		"\2\2\2QR\7}\2\2RS\7/\2\2S\b\3\2\2\2TU\7/\2\2UV\7\177\2\2V\n\3\2\2\2WX"+
		"\7o\2\2XY\7q\2\2YZ\7f\2\2Z[\7w\2\2[\\\7n\2\2\\]\7g\2\2]\f\3\2\2\2^_\7"+
		"y\2\2_`\7j\2\2`a\7g\2\2ab\7t\2\2bc\7g\2\2c\16\3\2\2\2de\7.\2\2e\20\3\2"+
		"\2\2fg\7*\2\2gh\7*\2\2h\22\3\2\2\2ij\7+\2\2jk\7+\2\2k\24\3\2\2\2lm\7u"+
		"\2\2mn\7j\2\2no\7q\2\2ow\7y\2\2pq\7n\2\2qr\7g\2\2rs\7p\2\2st\7i\2\2tu"+
		"\7v\2\2uw\7j\2\2vl\3\2\2\2vp\3\2\2\2w\26\3\2\2\2xy\7*\2\2y\30\3\2\2\2"+
		"z{\7+\2\2{\32\3\2\2\2|}\7<\2\2}\34\3\2\2\2~\177\7/\2\2\177\u0080\7/\2"+
		"\2\u0080\36\3\2\2\2\u0081\u0082\7?\2\2\u0082 \3\2\2\2\u0083\u0084\7&\2"+
		"\2\u0084\"\3\2\2\2\u0085\u0086\7a\2\2\u0086$\3\2\2\2\u0087\u0088\7K\2"+
		"\2\u0088\u0089\7Q\2\2\u0089&\3\2\2\2\u008a\u008b\7f\2\2\u008b\u008c\7"+
		"q\2\2\u008c(\3\2\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7v\2\2\u0090*\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7h\2\2\u0093,\3"+
		"\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7j\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7p\2\2\u0098.\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\60\3\2\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6\u00a7\7"+
		"<\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7/\2\2\u00aa\66"+
		"\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\7@\2\2\u00ad8\3\2\2\2\u00ae\u00af"+
		"\7*\2\2\u00af\u00b0\7*\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7+\2\2\u00b5\u00b6\7+\2\2"+
		"\u00b6:\3\2\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7k\2"+
		"\2\u00ba\u00bb\7p\2\2\u00bb<\3\2\2\2\u00bc\u00be\t\2\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3>\3\2\2\2\u00c4\u00cf\t\4\2\2\u00c5\u00c6\7?\2\2\u00c6\u00cf"+
		"\7?\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00cf\7?\2\2\u00c9\u00cf\t\5\2\2\u00ca"+
		"\u00cb\7>\2\2\u00cb\u00cf\7?\2\2\u00cc\u00cd\7@\2\2\u00cd\u00cf\7?\2\2"+
		"\u00ce\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c9"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf@\3\2\2\2\u00d0"+
		"\u00d1\7]\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2"+
		"\u00d4\u00e7\7_\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7p\2\2\u00d7\u00e7"+
		"\7v\2\2\u00d8\u00d9\7]\2\2\u00d9\u00da\7E\2\2\u00da\u00db\7j\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\u00e7\7_\2\2\u00de\u00df\7E\2\2"+
		"\u00df\u00e0\7j\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e7\7t\2\2\u00e2\u00e3"+
		"\7D\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e7\7n\2\2\u00e6"+
		"\u00d0\3\2\2\2\u00e6\u00d5\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00de\3\2"+
		"\2\2\u00e6\u00e2\3\2\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea"+
		"\7w\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7t\2\2\u00ee\u00ef\7N\2\2\u00ef\u00fe\7p\2\2\u00f0\u00f1\7r\2\2"+
		"\u00f1\u00f2\7w\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5"+
		"\7v\2\2\u00f5\u00fe\7t\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7N\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2"+
		"\u00fc\u00fe\7g\2\2\u00fd\u00e8\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd\u00f6"+
		"\3\2\2\2\u00feD\3\2\2\2\u00ff\u0100\7*\2\2\u0100\u0101\7+\2\2\u0101F\3"+
		"\2\2\2\u0102\u0104\7\17\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\7\f\2\2\u0106H\3\2\2\2\u0107\u0109\t\6\2\2"+
		"\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010bJ\3\2\2\2\u010c\u010e\t\7\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\b&\2\2\u0112L\3\2\2\2\f\2v\u00bd\u00c2\u00ce\u00e6\u00fd"+
		"\u0103\u010a\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}