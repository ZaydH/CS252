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
		FUNC_ARGS_CLOSE_PAREN=9, HASKELL_FUNCTIONS_METHODS_IN_SCALA=10, QUOTATION_MARK=11, 
		LEFT_PAREN=12, RIGHT_PAREN=13, COLON=14, INLINE_COMMENT_SYMBOL=15, EQUAL_SIGN=16, 
		RIGHT_ASSOC_DOLLAR_SIGN=17, UNDERSCORE=18, BACKSLASH=19, IO=20, DO=21, 
		LET=22, CASE=23, OF=24, IF=25, THEN=26, ELSE=27, RETURN=28, OTHERWISE=29, 
		ARG_TYPE_SEPARATOR=30, MONAD_ARROW=31, TYPE_SEPARATOR=32, MAIN_FUNCTION=33, 
		INT_VAL=34, INT_OP=35, TYPE_NAME=36, HASKELL_FUNCTION_NAME=37, UNIT_TYPE=38, 
		NEWLINE=39, NAME=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "QUOTATION_MARK", 
		"LEFT_PAREN", "RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", 
		"RIGHT_ASSOC_DOLLAR_SIGN", "UNDERSCORE", "BACKSLASH", "IO", "DO", "LET", 
		"CASE", "OF", "IF", "THEN", "ELSE", "RETURN", "OTHERWISE", "ARG_TYPE_SEPARATOR", 
		"MONAD_ARROW", "TYPE_SEPARATOR", "MAIN_FUNCTION", "INT_VAL", "INT_OP", 
		"TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", "NEWLINE", "NAME", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\5#\u00d5\n#\3#\6#\u00d8\n#\r#\16#\u00d9\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u00e6\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00fe\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u011a\n&\3\'\3\'"+
		"\3\'\3(\5(\u0120\n(\3(\3(\3)\6)\u0125\n)\r)\16)\u0126\3*\6*\u012a\n*\r"+
		"*\16*\u012b\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\b\3\2//\3\2\62;\4\2"+
		",-//\4\2>>@@\b\2))\60\60\62;C\\aac|\4\2\13\13\"\"\u0140\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3"+
		"\2\2\2\7Y\3\2\2\2\t\\\3\2\2\2\13_\3\2\2\2\rf\3\2\2\2\17l\3\2\2\2\21n\3"+
		"\2\2\2\23r\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2"+
		"\33\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008d\3\2\2\2#\u008f"+
		"\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0098\3\2\2\2"+
		"-\u009b\3\2\2\2/\u009f\3\2\2\2\61\u00a4\3\2\2\2\63\u00a7\3\2\2\2\65\u00aa"+
		"\3\2\2\2\67\u00af\3\2\2\29\u00b4\3\2\2\2;\u00bb\3\2\2\2=\u00c5\3\2\2\2"+
		"?\u00c8\3\2\2\2A\u00cb\3\2\2\2C\u00ce\3\2\2\2E\u00d4\3\2\2\2G\u00e5\3"+
		"\2\2\2I\u00fd\3\2\2\2K\u0119\3\2\2\2M\u011b\3\2\2\2O\u011f\3\2\2\2Q\u0124"+
		"\3\2\2\2S\u0129\3\2\2\2UV\7]\2\2V\4\3\2\2\2WX\7_\2\2X\6\3\2\2\2YZ\7}\2"+
		"\2Z[\7/\2\2[\b\3\2\2\2\\]\7/\2\2]^\7\177\2\2^\n\3\2\2\2_`\7o\2\2`a\7q"+
		"\2\2ab\7f\2\2bc\7w\2\2cd\7n\2\2de\7g\2\2e\f\3\2\2\2fg\7y\2\2gh\7j\2\2"+
		"hi\7g\2\2ij\7t\2\2jk\7g\2\2k\16\3\2\2\2lm\7.\2\2m\20\3\2\2\2no\7*\2\2"+
		"op\7*\2\2pq\7*\2\2q\22\3\2\2\2rs\7+\2\2st\7+\2\2tu\7+\2\2u\24\3\2\2\2"+
		"vw\7u\2\2wx\7j\2\2xy\7q\2\2y\u0081\7y\2\2z{\7n\2\2{|\7g\2\2|}\7p\2\2}"+
		"~\7i\2\2~\177\7v\2\2\177\u0081\7j\2\2\u0080v\3\2\2\2\u0080z\3\2\2\2\u0081"+
		"\26\3\2\2\2\u0082\u0083\7$\2\2\u0083\30\3\2\2\2\u0084\u0085\7*\2\2\u0085"+
		"\32\3\2\2\2\u0086\u0087\7+\2\2\u0087\34\3\2\2\2\u0088\u0089\7<\2\2\u0089"+
		"\36\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c\7/\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\7?\2\2\u008e\"\3\2\2\2\u008f\u0090\7&\2\2\u0090$\3\2\2\2\u0091"+
		"\u0092\7a\2\2\u0092&\3\2\2\2\u0093\u0094\7^\2\2\u0094(\3\2\2\2\u0095\u0096"+
		"\7K\2\2\u0096\u0097\7Q\2\2\u0097*\3\2\2\2\u0098\u0099\7f\2\2\u0099\u009a"+
		"\7q\2\2\u009a,\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7v\2\2\u009e.\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2"+
		"\7u\2\2\u00a2\u00a3\7g\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9\64"+
		"\3\2\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b38\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2"+
		"\u00b9\u00ba\7p\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7v\2"+
		"\2\u00bd\u00be\7j\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7y\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"<\3\2\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c7\7<\2\2\u00c7>\3\2\2\2\u00c8\u00c9"+
		"\7>\2\2\u00c9\u00ca\7/\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd"+
		"\7@\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1"+
		"\7k\2\2\u00d1\u00d2\7p\2\2\u00d2D\3\2\2\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\t\3\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00daF\3\2\2\2\u00db\u00e6\t\4\2\2\u00dc\u00dd\7?\2\2\u00dd\u00e6"+
		"\7?\2\2\u00de\u00df\7\61\2\2\u00df\u00e6\7?\2\2\u00e0\u00e6\t\5\2\2\u00e1"+
		"\u00e2\7>\2\2\u00e2\u00e6\7?\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e6\7?\2\2"+
		"\u00e5\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e0"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6H\3\2\2\2\u00e7"+
		"\u00e8\7]\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00fe\7_\2\2\u00ec\u00ed\7K\2\2\u00ed\u00ee\7p\2\2\u00ee\u00fe"+
		"\7v\2\2\u00ef\u00f0\7]\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f2\7j\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4\u00fe\7_\2\2\u00f5\u00f6\7E\2\2"+
		"\u00f6\u00f7\7j\2\2\u00f7\u00f8\7c\2\2\u00f8\u00fe\7t\2\2\u00f9\u00fa"+
		"\7D\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fe\7n\2\2\u00fd"+
		"\u00e7\3\2\2\2\u00fd\u00ec\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f5\3\2"+
		"\2\2\u00fd\u00f9\3\2\2\2\u00feJ\3\2\2\2\u00ff\u0100\7r\2\2\u0100\u0101"+
		"\7w\2\2\u0101\u0102\7v\2\2\u0102\u0103\7U\2\2\u0103\u0104\7v\2\2\u0104"+
		"\u0105\7t\2\2\u0105\u0106\7N\2\2\u0106\u011a\7p\2\2\u0107\u0108\7g\2\2"+
		"\u0108\u0109\7t\2\2\u0109\u010a\7t\2\2\u010a\u010b\7q\2\2\u010b\u011a"+
		"\7t\2\2\u010c\u010d\7r\2\2\u010d\u010e\7w\2\2\u010e\u010f\7v\2\2\u010f"+
		"\u0110\7U\2\2\u0110\u0111\7v\2\2\u0111\u011a\7t\2\2\u0112\u0113\7i\2\2"+
		"\u0113\u0114\7g\2\2\u0114\u0115\7v\2\2\u0115\u0116\7N\2\2\u0116\u0117"+
		"\7k\2\2\u0117\u0118\7p\2\2\u0118\u011a\7g\2\2\u0119\u00ff\3\2\2\2\u0119"+
		"\u0107\3\2\2\2\u0119\u010c\3\2\2\2\u0119\u0112\3\2\2\2\u011aL\3\2\2\2"+
		"\u011b\u011c\7*\2\2\u011c\u011d\7+\2\2\u011dN\3\2\2\2\u011e\u0120\7\17"+
		"\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\f\2\2\u0122P\3\2\2\2\u0123\u0125\t\6\2\2\u0124\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127R\3"+
		"\2\2\2\u0128\u012a\t\7\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b*"+
		"\2\2\u012eT\3\2\2\2\f\2\u0080\u00d4\u00d9\u00e5\u00fd\u0119\u011f\u0126"+
		"\u012b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}