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
		IO=17, DO=18, LET=19, IF=20, THEN=21, ELSE=22, RETURN=23, ARG_TYPE_SEPARATOR=24, 
		MONAD_ARROW=25, TYPE_SEPARATOR=26, RECURSIVE_MAIN=27, MAIN_FUNCTION=28, 
		INT_VAL=29, INT_OP=30, TYPE_NAME=31, HASKELL_FUNCTION_NAME=32, UNIT_TYPE=33, 
		NEWLINE=34, NAME=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "LEFT_PAREN", 
		"RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"IO", "DO", "LET", "IF", "THEN", "ELSE", "RETURN", "ARG_TYPE_SEPARATOR", 
		"MONAD_ARROW", "TYPE_SEPARATOR", "RECURSIVE_MAIN", "MAIN_FUNCTION", "INT_VAL", 
		"INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", "NEWLINE", 
		"NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{-'", "'-}'", "'module'", "'where'", "','", "'(('", 
		"'))'", null, "'('", "')'", "':'", "'--'", "'='", "'$'", "'IO'", "'do'", 
		"'let'", "'if'", "'then'", "'else'", "'return'", "'::'", "'<-'", "'->'", 
		"'((main))'", "'main'", null, null, null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA", "FUNC_ARGS_OPEN_PAREN", 
		"FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", "LEFT_PAREN", 
		"RIGHT_PAREN", "COLON", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"IO", "DO", "LET", "IF", "THEN", "ELSE", "RETURN", "ARG_TYPE_SEPARATOR", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"u\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u00ba"+
		"\n\36\3\36\6\36\u00bd\n\36\r\36\16\36\u00be\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u00cb\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00e3\n \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00fa\n!\3\"\3\"\3\"\3#"+
		"\5#\u0100\n#\3#\3#\3$\6$\u0105\n$\r$\16$\u0106\3%\6%\u010a\n%\r%\16%\u010b"+
		"\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&\3\2\b\3\2//\3\2\62;\4\2,-//\4\2>>@@\b\2))\60"+
		"\60\62;C\\aac|\4\2\13\13\"\"\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7"+
		"O\3\2\2\2\tR\3\2\2\2\13U\3\2\2\2\r\\\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23"+
		"g\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35|\3\2\2\2"+
		"\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0086\3\2\2\2\'\u0089\3"+
		"\2\2\2)\u008d\3\2\2\2+\u0090\3\2\2\2-\u0095\3\2\2\2/\u009a\3\2\2\2\61"+
		"\u00a1\3\2\2\2\63\u00a4\3\2\2\2\65\u00a7\3\2\2\2\67\u00aa\3\2\2\29\u00b3"+
		"\3\2\2\2;\u00b9\3\2\2\2=\u00ca\3\2\2\2?\u00e2\3\2\2\2A\u00f9\3\2\2\2C"+
		"\u00fb\3\2\2\2E\u00ff\3\2\2\2G\u0104\3\2\2\2I\u0109\3\2\2\2KL\7]\2\2L"+
		"\4\3\2\2\2MN\7_\2\2N\6\3\2\2\2OP\7}\2\2PQ\7/\2\2Q\b\3\2\2\2RS\7/\2\2S"+
		"T\7\177\2\2T\n\3\2\2\2UV\7o\2\2VW\7q\2\2WX\7f\2\2XY\7w\2\2YZ\7n\2\2Z["+
		"\7g\2\2[\f\3\2\2\2\\]\7y\2\2]^\7j\2\2^_\7g\2\2_`\7t\2\2`a\7g\2\2a\16\3"+
		"\2\2\2bc\7.\2\2c\20\3\2\2\2de\7*\2\2ef\7*\2\2f\22\3\2\2\2gh\7+\2\2hi\7"+
		"+\2\2i\24\3\2\2\2jk\7u\2\2kl\7j\2\2lm\7q\2\2mu\7y\2\2no\7n\2\2op\7g\2"+
		"\2pq\7p\2\2qr\7i\2\2rs\7v\2\2su\7j\2\2tj\3\2\2\2tn\3\2\2\2u\26\3\2\2\2"+
		"vw\7*\2\2w\30\3\2\2\2xy\7+\2\2y\32\3\2\2\2z{\7<\2\2{\34\3\2\2\2|}\7/\2"+
		"\2}~\7/\2\2~\36\3\2\2\2\177\u0080\7?\2\2\u0080 \3\2\2\2\u0081\u0082\7"+
		"&\2\2\u0082\"\3\2\2\2\u0083\u0084\7K\2\2\u0084\u0085\7Q\2\2\u0085$\3\2"+
		"\2\2\u0086\u0087\7f\2\2\u0087\u0088\7q\2\2\u0088&\3\2\2\2\u0089\u008a"+
		"\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c\7v\2\2\u008c(\3\2\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7h\2\2\u008f*\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092"+
		"\7j\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094,\3\2\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099"+
		".\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7p\2\2\u00a0\60\3\2\2\2\u00a1"+
		"\u00a2\7<\2\2\u00a2\u00a3\7<\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5"+
		"\u00a6\7/\2\2\u00a6\64\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8\u00a9\7@\2\2\u00a9"+
		"\66\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ad\7o\2\2\u00ad"+
		"\u00ae\7c\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7+\2\2"+
		"\u00b1\u00b2\7+\2\2\u00b28\3\2\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7c\2"+
		"\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7:\3\2\2\2\u00b8\u00ba\t"+
		"\2\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf<\3\2\2\2\u00c0\u00cb\t\4\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\u00cb\7?\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00cb\7?\2\2\u00c5"+
		"\u00cb\t\5\2\2\u00c6\u00c7\7>\2\2\u00c7\u00cb\7?\2\2\u00c8\u00c9\7@\2"+
		"\2\u00c9\u00cb\7?\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c3"+
		"\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		">\3\2\2\2\u00cc\u00cd\7]\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\u00e3\7_\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7p\2\2"+
		"\u00d3\u00e3\7v\2\2\u00d4\u00d5\7]\2\2\u00d5\u00d6\7E\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7t\2\2\u00d9\u00e3\7_\2\2\u00da"+
		"\u00db\7E\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd\7c\2\2\u00dd\u00e3\7t\2\2"+
		"\u00de\u00df\7D\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e3"+
		"\7n\2\2\u00e2\u00cc\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3@\3\2\2\2\u00e4\u00e5\7r\2\2\u00e5"+
		"\u00e6\7w\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7U\2\2\u00e8\u00e9\7v\2\2"+
		"\u00e9\u00ea\7t\2\2\u00ea\u00eb\7N\2\2\u00eb\u00fa\7p\2\2\u00ec\u00ed"+
		"\7r\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7U\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\u00fa\7t\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4\7g\2\2"+
		"\u00f4\u00f5\7v\2\2\u00f5\u00f6\7N\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00fa\7g\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00ec\3\2\2\2\u00f9"+
		"\u00f2\3\2\2\2\u00faB\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc\u00fd\7+\2\2\u00fd"+
		"D\3\2\2\2\u00fe\u0100\7\17\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0102\7\f\2\2\u0102F\3\2\2\2\u0103\u0105\t"+
		"\6\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107H\3\2\2\2\u0108\u010a\t\7\2\2\u0109\u0108\3\2\2\2"+
		"\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\b%\2\2\u010eJ\3\2\2\2\f\2t\u00b9\u00be\u00ca\u00e2"+
		"\u00f9\u00ff\u0106\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}