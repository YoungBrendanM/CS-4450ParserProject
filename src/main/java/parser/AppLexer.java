package parser;
// Generated from App.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AppLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, END=5, IF=6, ELIF=7, ELSE=8, WHILE=9, 
		FOR=10, IN=11, BOOLEAN=12, CONJOIN_CONDITION=13, STRING=14, CONDITION=15, 
		ASSIGN_OPERATORS=16, ARITH_OPERATORS=17, COMMENT=18, ID=19, MINUS=20, 
		NUMBER=21, NEWLINE=22, WHITESPACE=23, SPEC_CHAR=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "END", "IF", "ELIF", "ELSE", "WHILE", 
			"FOR", "IN", "BOOLEAN", "CONJOIN_CONDITION", "STRING", "CONDITION", "ASSIGN_OPERATORS", 
			"ARITH_OPERATORS", "COMMENT", "ID", "MINUS", "NUMBER", "NEWLINE", "WHITESPACE", 
			"SPEC_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'break'", "'END'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'in'", null, null, null, null, null, null, null, 
			null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "END", "IF", "ELIF", "ELSE", "WHILE", "FOR", 
			"IN", "BOOLEAN", "CONJOIN_CONDITION", "STRING", "CONDITION", "ASSIGN_OPERATORS", 
			"ARITH_OPERATORS", "COMMENT", "ID", "MINUS", "NUMBER", "NEWLINE", "WHITESPACE", 
			"SPEC_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public AppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "App.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\rg\n\r\3\16\3\16\3\16\3\16\3\16\5\16n\n\16\3\17\3\17\7\17r\n\17"+
		"\f\17\16\17u\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0083\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0092\n\21\3\22\3\22\3\23\3\23\7\23\u0098\n"+
		"\23\f\23\16\23\u009b\13\23\3\24\3\24\7\24\u009f\n\24\f\24\16\24\u00a2"+
		"\13\24\3\25\3\25\3\26\5\26\u00a7\n\26\3\26\6\26\u00aa\n\26\r\26\16\26"+
		"\u00ab\3\27\5\27\u00af\n\27\3\27\6\27\u00b2\n\27\r\27\16\27\u00b3\3\27"+
		"\5\27\u00b7\n\27\3\30\6\30\u00ba\n\30\r\30\16\30\u00bb\3\30\3\30\3\31"+
		"\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\t\3\2$$"+
		"\7\2\'\',-//\61\61``\3\2\f\f\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\7\2##&\')+..BB\2\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7"+
		"\67\3\2\2\2\t9\3\2\2\2\13?\3\2\2\2\rC\3\2\2\2\17F\3\2\2\2\21K\3\2\2\2"+
		"\23P\3\2\2\2\25V\3\2\2\2\27Z\3\2\2\2\31f\3\2\2\2\33m\3\2\2\2\35o\3\2\2"+
		"\2\37\u0082\3\2\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u009c"+
		"\3\2\2\2)\u00a3\3\2\2\2+\u00a6\3\2\2\2-\u00b6\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\u00bf\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65\66\7+\2\2\66\6\3\2\2\2\67"+
		"8\7<\2\28\b\3\2\2\29:\7d\2\2:;\7t\2\2;<\7g\2\2<=\7c\2\2=>\7m\2\2>\n\3"+
		"\2\2\2?@\7G\2\2@A\7P\2\2AB\7F\2\2B\f\3\2\2\2CD\7k\2\2DE\7h\2\2E\16\3\2"+
		"\2\2FG\7g\2\2GH\7n\2\2HI\7k\2\2IJ\7h\2\2J\20\3\2\2\2KL\7g\2\2LM\7n\2\2"+
		"MN\7u\2\2NO\7g\2\2O\22\3\2\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2TU\7"+
		"g\2\2U\24\3\2\2\2VW\7h\2\2WX\7q\2\2XY\7t\2\2Y\26\3\2\2\2Z[\7k\2\2[\\\7"+
		"p\2\2\\\30\3\2\2\2]^\7V\2\2^_\7t\2\2_`\7w\2\2`g\7g\2\2ab\7H\2\2bc\7c\2"+
		"\2cd\7n\2\2de\7u\2\2eg\7g\2\2f]\3\2\2\2fa\3\2\2\2g\32\3\2\2\2hi\7c\2\2"+
		"ij\7p\2\2jn\7f\2\2kl\7q\2\2ln\7t\2\2mh\3\2\2\2mk\3\2\2\2n\34\3\2\2\2o"+
		"s\7$\2\2pr\n\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2u"+
		"s\3\2\2\2vw\7$\2\2w\36\3\2\2\2x\u0083\7>\2\2yz\7>\2\2z\u0083\7?\2\2{\u0083"+
		"\7@\2\2|}\7@\2\2}\u0083\7?\2\2~\177\7?\2\2\177\u0083\7?\2\2\u0080\u0081"+
		"\7#\2\2\u0081\u0083\7?\2\2\u0082x\3\2\2\2\u0082y\3\2\2\2\u0082{\3\2\2"+
		"\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0083 \3\2\2\2\u0084"+
		"\u0092\7?\2\2\u0085\u0086\7-\2\2\u0086\u0092\7?\2\2\u0087\u0088\7/\2\2"+
		"\u0088\u0092\7?\2\2\u0089\u008a\7,\2\2\u008a\u0092\7?\2\2\u008b\u008c"+
		"\7\61\2\2\u008c\u0092\7?\2\2\u008d\u008e\7`\2\2\u008e\u0092\7?\2\2\u008f"+
		"\u0090\7\'\2\2\u0090\u0092\7?\2\2\u0091\u0084\3\2\2\2\u0091\u0085\3\2"+
		"\2\2\u0091\u0087\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008d\3\2\2\2\u0091\u008f\3\2\2\2\u0092\"\3\2\2\2\u0093\u0094\t\3\2\2"+
		"\u0094$\3\2\2\2\u0095\u0099\7%\2\2\u0096\u0098\n\4\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"&\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\t\5\2\2\u009d\u009f\t\6\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1(\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4*"+
		"\3\2\2\2\u00a5\u00a7\5)\25\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00aa\4\62;\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac,\3\2\2\2\u00ad\u00af"+
		"\7\17\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b2\7\f\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\7\17\2\2"+
		"\u00b6\u00b1\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7.\3\2\2\2\u00b8\u00ba\t"+
		"\7\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\30\2\2\u00be\60\3\2\2"+
		"\2\u00bf\u00c0\t\b\2\2\u00c0\62\3\2\2\2\20\2fms\u0082\u0091\u0099\u00a0"+
		"\u00a6\u00ab\u00ae\u00b3\u00b6\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}