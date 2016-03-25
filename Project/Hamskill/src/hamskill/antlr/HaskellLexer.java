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
		UNDERSCORE=17, BACKSLASH=18, IO=19, DO=20, LET=21, IF=22, THEN=23, ELSE=24, 
		RETURN=25, ARG_TYPE_SEPARATOR=26, MONAD_ARROW=27, TYPE_SEPARATOR=28, RECURSIVE_MAIN=29, 
		MAIN_FUNCTION=30, INT_VAL=31, INT_OP=32, TYPE_NAME=33, HASKELL_FUNCTION_NAME=34, 
		UNIT_TYPE=35, NEWLINE=36, NAME=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "LEFT_PAREN", 
		"RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"UNDERSCORE", "BACKSLASH", "IO", "DO", "LET", "IF", "THEN", "ELSE", "RETURN", 
		"ARG_TYPE_SEPARATOR", "MONAD_ARROW", "TYPE_SEPARATOR", "RECURSIVE_MAIN", 
		"MAIN_FUNCTION", "INT_VAL", "INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", 
		"UNIT_TYPE", "NEWLINE", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{-'", "'-}'", "'module'", "'where'", "','", "'(('", 
		"'))'", null, "'('", "')'", "':'", "'--'", "'='", "'$'", "'_'", "'\\'", 
		"'IO'", "'do'", "'let'", "'if'", "'then'", "'else'", "'return'", "'::'", 
		"'<-'", "'->'", "'((main))'", "'main'", null, null, null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "LEFT_PAREN", 
		"RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"UNDERSCORE", "BACKSLASH", "IO", "DO", "LET", "IF", "THEN", "ELSE", "RETURN", 
		"ARG_TYPE_SEPARATOR", "MONAD_ARROW", "TYPE_SEPARATOR", "RECURSIVE_MAIN", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13y\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \5 \u00c2\n \3 \6 \u00c5\n \r \16 \u00c6\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u00d3\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00eb\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0102\n"+
		"#\3$\3$\3$\3%\5%\u0108\n%\3%\3%\3&\6&\u010d\n&\r&\16&\u010e\3\'\6\'\u0112"+
		"\n\'\r\'\16\'\u0113\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\b\3\2//\3\2\62"+
		";\4\2,-//\4\2>>@@\b\2))\60\60\62;C\\aac|\4\2\13\13\"\"\u0127\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tV\3\2\2\2\13"+
		"Y\3\2\2\2\r`\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25x\3\2\2\2\27"+
		"z\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0083\3\2\2\2!\u0085"+
		"\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2"+
		"+\u0091\3\2\2\2-\u0095\3\2\2\2/\u0098\3\2\2\2\61\u009d\3\2\2\2\63\u00a2"+
		"\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00af\3\2\2\2;\u00b2\3\2\2"+
		"\2=\u00bb\3\2\2\2?\u00c1\3\2\2\2A\u00d2\3\2\2\2C\u00ea\3\2\2\2E\u0101"+
		"\3\2\2\2G\u0103\3\2\2\2I\u0107\3\2\2\2K\u010c\3\2\2\2M\u0111\3\2\2\2O"+
		"P\7]\2\2P\4\3\2\2\2QR\7_\2\2R\6\3\2\2\2ST\7}\2\2TU\7/\2\2U\b\3\2\2\2V"+
		"W\7/\2\2WX\7\177\2\2X\n\3\2\2\2YZ\7o\2\2Z[\7q\2\2[\\\7f\2\2\\]\7w\2\2"+
		"]^\7n\2\2^_\7g\2\2_\f\3\2\2\2`a\7y\2\2ab\7j\2\2bc\7g\2\2cd\7t\2\2de\7"+
		"g\2\2e\16\3\2\2\2fg\7.\2\2g\20\3\2\2\2hi\7*\2\2ij\7*\2\2j\22\3\2\2\2k"+
		"l\7+\2\2lm\7+\2\2m\24\3\2\2\2no\7u\2\2op\7j\2\2pq\7q\2\2qy\7y\2\2rs\7"+
		"n\2\2st\7g\2\2tu\7p\2\2uv\7i\2\2vw\7v\2\2wy\7j\2\2xn\3\2\2\2xr\3\2\2\2"+
		"y\26\3\2\2\2z{\7*\2\2{\30\3\2\2\2|}\7+\2\2}\32\3\2\2\2~\177\7<\2\2\177"+
		"\34\3\2\2\2\u0080\u0081\7/\2\2\u0081\u0082\7/\2\2\u0082\36\3\2\2\2\u0083"+
		"\u0084\7?\2\2\u0084 \3\2\2\2\u0085\u0086\7&\2\2\u0086\"\3\2\2\2\u0087"+
		"\u0088\7a\2\2\u0088$\3\2\2\2\u0089\u008a\7^\2\2\u008a&\3\2\2\2\u008b\u008c"+
		"\7K\2\2\u008c\u008d\7Q\2\2\u008d(\3\2\2\2\u008e\u008f\7f\2\2\u008f\u0090"+
		"\7q\2\2\u0090*\3\2\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7v\2\2\u0094,\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097.\3"+
		"\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7j\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7p\2\2\u009c\60\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2"+
		"\u00a7\u00a8\7p\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\u00ab\7"+
		"<\2\2\u00ab\66\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7/\2\2\u00ae8\3"+
		"\2\2\2\u00af\u00b0\7/\2\2\u00b0\u00b1\7@\2\2\u00b1:\3\2\2\2\u00b2\u00b3"+
		"\7*\2\2\u00b3\u00b4\7*\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7+\2\2\u00b9\u00ba\7+\2\2"+
		"\u00ba<\3\2\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7k\2"+
		"\2\u00be\u00bf\7p\2\2\u00bf>\3\2\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\t\3\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7@\3\2\2\2\u00c8\u00d3\t\4\2\2\u00c9\u00ca\7?\2\2\u00ca\u00d3"+
		"\7?\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00d3\7?\2\2\u00cd\u00d3\t\5\2\2\u00ce"+
		"\u00cf\7>\2\2\u00cf\u00d3\7?\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d3\7?\2\2"+
		"\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cd"+
		"\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3B\3\2\2\2\u00d4"+
		"\u00d5\7]\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00eb\7_\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7p\2\2\u00db\u00eb"+
		"\7v\2\2\u00dc\u00dd\7]\2\2\u00dd\u00de\7E\2\2\u00de\u00df\7j\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\u00eb\7_\2\2\u00e2\u00e3\7E\2\2"+
		"\u00e3\u00e4\7j\2\2\u00e4\u00e5\7c\2\2\u00e5\u00eb\7t\2\2\u00e6\u00e7"+
		"\7D\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7q\2\2\u00e9\u00eb\7n\2\2\u00ea"+
		"\u00d4\3\2\2\2\u00ea\u00d9\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00e2\3\2"+
		"\2\2\u00ea\u00e6\3\2\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee"+
		"\7w\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7U\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\u00f3\7N\2\2\u00f3\u0102\7p\2\2\u00f4\u00f5\7r\2\2"+
		"\u00f5\u00f6\7w\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7U\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u0102\7t\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7N\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2"+
		"\u0100\u0102\7g\2\2\u0101\u00ec\3\2\2\2\u0101\u00f4\3\2\2\2\u0101\u00fa"+
		"\3\2\2\2\u0102F\3\2\2\2\u0103\u0104\7*\2\2\u0104\u0105\7+\2\2\u0105H\3"+
		"\2\2\2\u0106\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\f\2\2\u010aJ\3\2\2\2\u010b\u010d\t\6\2\2"+
		"\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010fL\3\2\2\2\u0110\u0112\t\7\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\b\'\2\2\u0116N\3\2\2\2\f\2x\u00c1\u00c6\u00d2\u00ea\u0101"+
		"\u0107\u010e\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}