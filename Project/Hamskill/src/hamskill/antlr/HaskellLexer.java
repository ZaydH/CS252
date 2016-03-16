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
		HEADER_COMMENT_CLOSE=4, MODULE_STRING=5, WHERE_STRING=6, COMMA_STRING=7, 
		FUNC_ARGS_OPEN_PAREN=8, FUNC_ARGS_CLOSE_PAREN=9, HASKELL_FUNCTIONS_METHODS_IN_SCALA=10, 
		LEFT_PAREN=11, RIGHT_PAREN=12, INLINE_COMMENT_SYMBOL=13, EQUAL_SIGN=14, 
		RIGHT_ASSOC_DOLLAR_SIGN=15, IO=16, DO=17, LET=18, ARG_TYPE_SEPARATOR=19, 
		TYPE_SEPARATOR=20, MAIN_FUNCTION=21, INT_VAL=22, INT_OP=23, TYPE_NAME=24, 
		HASKELL_FUNCTION_NAME=25, UNIT_TYPE=26, NEWLINE=27, NAME=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA_STRING", 
		"FUNC_ARGS_OPEN_PAREN", "FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", 
		"LEFT_PAREN", "RIGHT_PAREN", "INLINE_COMMENT_SYMBOL", "EQUAL_SIGN", "RIGHT_ASSOC_DOLLAR_SIGN", 
		"IO", "DO", "LET", "ARG_TYPE_SEPARATOR", "TYPE_SEPARATOR", "MAIN_FUNCTION", 
		"INT_VAL", "INT_OP", "TYPE_NAME", "HASKELL_FUNCTION_NAME", "UNIT_TYPE", 
		"NEWLINE", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{-'", "'-}'", "'module'", "'where'", "','", "'(('", 
		"'))'", "'show'", "'('", "')'", "'--'", "'='", "'$'", "'IO'", "'do'", 
		"'let'", "'::'", "'->'", "'main'", null, null, null, null, "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "HEADER_COMMENT_OPEN", 
		"HEADER_COMMENT_CLOSE", "MODULE_STRING", "WHERE_STRING", "COMMA_STRING", 
		"FUNC_ARGS_OPEN_PAREN", "FUNC_ARGS_CLOSE_PAREN", "HASKELL_FUNCTIONS_METHODS_IN_SCALA", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\5\27\u0083\n\27\3\27\6\27\u0086\n\27\r\27\16\27\u0087"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0094\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ac\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00bc\n\32\3\33"+
		"\3\33\3\33\3\34\5\34\u00c2\n\34\3\34\3\34\3\35\6\35\u00c7\n\35\r\35\16"+
		"\35\u00c8\3\36\6\36\u00cc\n\36\r\36\16\36\u00cd\3\36\3\36\2\2\37\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2"+
		"\b\3\2//\3\2\62;\4\2,-//\4\2>>@@\7\2))\60\60\62;C\\c|\4\2\13\13\"\"\u00df"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tD\3\2\2\2\13G\3\2\2\2\rN\3\2"+
		"\2\2\17T\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2\25\\\3\2\2\2\27a\3\2\2\2\31c"+
		"\3\2\2\2\33e\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#o\3\2\2\2%r\3\2"+
		"\2\2\'v\3\2\2\2)y\3\2\2\2+|\3\2\2\2-\u0082\3\2\2\2/\u0093\3\2\2\2\61\u00ab"+
		"\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd\3\2\2\2\67\u00c1\3\2\2\29\u00c6\3\2"+
		"\2\2;\u00cb\3\2\2\2=>\7]\2\2>\4\3\2\2\2?@\7]\2\2@\6\3\2\2\2AB\7}\2\2B"+
		"C\7/\2\2C\b\3\2\2\2DE\7/\2\2EF\7\177\2\2F\n\3\2\2\2GH\7o\2\2HI\7q\2\2"+
		"IJ\7f\2\2JK\7w\2\2KL\7n\2\2LM\7g\2\2M\f\3\2\2\2NO\7y\2\2OP\7j\2\2PQ\7"+
		"g\2\2QR\7t\2\2RS\7g\2\2S\16\3\2\2\2TU\7.\2\2U\20\3\2\2\2VW\7*\2\2WX\7"+
		"*\2\2X\22\3\2\2\2YZ\7+\2\2Z[\7+\2\2[\24\3\2\2\2\\]\7u\2\2]^\7j\2\2^_\7"+
		"q\2\2_`\7y\2\2`\26\3\2\2\2ab\7*\2\2b\30\3\2\2\2cd\7+\2\2d\32\3\2\2\2e"+
		"f\7/\2\2fg\7/\2\2g\34\3\2\2\2hi\7?\2\2i\36\3\2\2\2jk\7&\2\2k \3\2\2\2"+
		"lm\7K\2\2mn\7Q\2\2n\"\3\2\2\2op\7f\2\2pq\7q\2\2q$\3\2\2\2rs\7n\2\2st\7"+
		"g\2\2tu\7v\2\2u&\3\2\2\2vw\7<\2\2wx\7<\2\2x(\3\2\2\2yz\7/\2\2z{\7@\2\2"+
		"{*\3\2\2\2|}\7o\2\2}~\7c\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080,\3\2\2"+
		"\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088.\3\2\2\2\u0089\u0094\t\4\2\2"+
		"\u008a\u008b\7?\2\2\u008b\u0094\7?\2\2\u008c\u008d\7\61\2\2\u008d\u0094"+
		"\7?\2\2\u008e\u0094\t\5\2\2\u008f\u0090\7>\2\2\u0090\u0094\7?\2\2\u0091"+
		"\u0092\7@\2\2\u0092\u0094\7?\2\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2\2"+
		"\2\u0093\u008c\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\60\3\2\2\2\u0095\u0096\7]\2\2\u0096\u0097\7K\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\u00ac\7_\2\2\u009a\u009b\7K\2\2"+
		"\u009b\u009c\7p\2\2\u009c\u00ac\7v\2\2\u009d\u009e\7]\2\2\u009e\u009f"+
		"\7E\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\u00ac\7_\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7c\2\2"+
		"\u00a6\u00ac\7t\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ac\7n\2\2\u00ab\u0095\3\2\2\2\u00ab\u009a\3\2\2\2\u00ab"+
		"\u009d\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\62\3\2\2"+
		"\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7U\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7N\2\2\u00b4"+
		"\u00bc\7p\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7v\2\2"+
		"\u00b8\u00b9\7U\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bc\7t\2\2\u00bb\u00ad"+
		"\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7*\2\2\u00be"+
		"\u00bf\7+\2\2\u00bf\66\3\2\2\2\u00c0\u00c2\7\17\2\2\u00c1\u00c0\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c48"+
		"\3\2\2\2\u00c5\u00c7\t\6\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9:\3\2\2\2\u00ca\u00cc\t\7\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\36\2\2\u00d0<\3\2\2\2\13\2"+
		"\u0082\u0087\u0093\u00ab\u00bb\u00c1\u00c8\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}