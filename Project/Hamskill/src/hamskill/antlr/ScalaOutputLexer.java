// Generated from ScalaOutput.g4 by ANTLR 4.5.2
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
public class ScalaOutputLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NONE=1, SOME=2, LEFT_PAREN=3, RIGHT_PAREN=4, COMMA=5, ARRAY_KEYWORD=6, 
		LIST_KEYWORD=7, GENERAL_WORD=8, NEWLINE=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NONE", "SOME", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "ARRAY_KEYWORD", 
		"LIST_KEYWORD", "GENERAL_WORD", "NEWLINE", "WS"
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


	public ScalaOutputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScalaOutput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fC\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t\64\n\t\r\t\16\t\65"+
		"\3\n\5\n9\n\n\3\n\3\n\3\13\6\13>\n\13\r\13\16\13?\3\13\3\13\2\2\f\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\4\b\2))\60\60\62;C\\aa"+
		"c|\4\2\13\13\"\"E\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\3\27\3\2\2\2\5\34\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2"+
		"\2\2\17-\3\2\2\2\21\63\3\2\2\2\238\3\2\2\2\25=\3\2\2\2\27\30\7P\2\2\30"+
		"\31\7q\2\2\31\32\7p\2\2\32\33\7g\2\2\33\4\3\2\2\2\34\35\7U\2\2\35\36\7"+
		"q\2\2\36\37\7o\2\2\37 \7g\2\2 \6\3\2\2\2!\"\7*\2\2\"\b\3\2\2\2#$\7+\2"+
		"\2$\n\3\2\2\2%&\7.\2\2&\f\3\2\2\2\'(\7C\2\2()\7t\2\2)*\7t\2\2*+\7c\2\2"+
		"+,\7{\2\2,\16\3\2\2\2-.\7N\2\2./\7k\2\2/\60\7u\2\2\60\61\7v\2\2\61\20"+
		"\3\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\22\3\2\2\2\679\7\17\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;"+
		"\7\f\2\2;\24\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@A\3\2\2\2AB\b\13\2\2B\26\3\2\2\2\6\2\658?\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}