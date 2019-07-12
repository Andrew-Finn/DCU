package calBase;

// Generated from cal.g4 by ANTLR 4.5
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CALLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Constant=2, Return=3, Integer=4, Boolean=5, Void=6, Main=7, 
		If=8, Else=9, True=10, False=11, While=12, Begin=13, End=14, Is=15, Skip=16, 
		SemiColon=17, Colon=18, Comma=19, ID=20, NUMBER=21, REAL_N=22, O_Brace=23, 
		C_Brace=24, O_Bracket=25, C_Bracket=26, O_Paren=27, C_Paren=28, MINUS=29, 
		PLUS=30, ASSIGNMENT=31, NOT=32, OR=33, AND=34, EQUAL=35, NOTEQUAL=36, 
		LT=37, LTE=38, GT=39, GTE=40, COMMENT_ML=41, COMMENT_SL=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Variable", "Constant", "Return", "Integer", "Boolean", "Void", "Main", 
		"If", "Else", "True", "False", "While", "Begin", "End", "Is", "Skip", 
		"SemiColon", "Colon", "Comma", "ID", "NUMBER", "REAL_N", "O_Brace", "C_Brace", 
		"O_Bracket", "C_Bracket", "O_Paren", "C_Paren", "MINUS", "PLUS", "ASSIGNMENT", 
		"NOT", "OR", "AND", "EQUAL", "NOTEQUAL", "LT", "LTE", "GT", "GTE", "A", 
		"B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", 
		"R", "S", "T", "U", "V", "W", "Letter", "Digit", "NonZero", "UnderScore", 
		"Dot", "COMMENT_ML", "COMMENT_SL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "';'", "':'", "','", null, null, null, "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "'-'", "'+'", "':='", "'~'", "'|'", 
		"'&'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Variable", "Constant", "Return", "Integer", "Boolean", "Void", 
		"Main", "If", "Else", "True", "False", "While", "Begin", "End", "Is", 
		"Skip", "SemiColon", "Colon", "Comma", "ID", "NUMBER", "REAL_N", "O_Brace", 
		"C_Brace", "O_Bracket", "C_Bracket", "O_Paren", "C_Paren", "MINUS", "PLUS", 
		"ASSIGNMENT", "NOT", "OR", "AND", "EQUAL", "NOTEQUAL", "LT", "LTE", "GT", 
		"GTE", "COMMENT_ML", "COMMENT_SL", "WS"
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


	public CALLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0189\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\7\25\u00f6\n\25\f\25\16\25\u00f9\13\25\3\26\5\26\u00fc"+
		"\n\26\3\26\3\26\3\26\6\26\u0101\n\26\r\26\16\26\u0102\5\26\u0105\n\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\7D\u016c\nD\fD\16D\u016f\13D\3D\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\7E\u017a\nE\fE\16E\u017d\13E\3E\3E\3E\3E\3F\6F\u0184"+
		"\nF\rF\16F\u0185\3F\3F\4\u016d\u017b\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2"+
		"W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081"+
		"\2\u0083\2\u0085\2\u0087+\u0089,\u008b-\3\2\33\4\2CCcc\4\2DDdd\4\2EEe"+
		"e\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2C\\c|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\u0178\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2"+
		"\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0096\3\2\2\2\7\u009f\3\2\2\2\t"+
		"\u00a6\3\2\2\2\13\u00ae\3\2\2\2\r\u00b6\3\2\2\2\17\u00bb\3\2\2\2\21\u00c0"+
		"\3\2\2\2\23\u00c3\3\2\2\2\25\u00c8\3\2\2\2\27\u00cd\3\2\2\2\31\u00d3\3"+
		"\2\2\2\33\u00d9\3\2\2\2\35\u00df\3\2\2\2\37\u00e3\3\2\2\2!\u00e6\3\2\2"+
		"\2#\u00eb\3\2\2\2%\u00ed\3\2\2\2\'\u00ef\3\2\2\2)\u00f1\3\2\2\2+\u00fb"+
		"\3\2\2\2-\u0106\3\2\2\2/\u010a\3\2\2\2\61\u010c\3\2\2\2\63\u010e\3\2\2"+
		"\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2\2=\u0118"+
		"\3\2\2\2?\u011a\3\2\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E\u0121\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0125\3\2\2\2K\u0128\3\2\2\2M\u012a\3\2\2\2O\u012d\3\2"+
		"\2\2Q\u012f\3\2\2\2S\u0132\3\2\2\2U\u0134\3\2\2\2W\u0136\3\2\2\2Y\u0138"+
		"\3\2\2\2[\u013a\3\2\2\2]\u013c\3\2\2\2_\u013e\3\2\2\2a\u0140\3\2\2\2c"+
		"\u0142\3\2\2\2e\u0144\3\2\2\2g\u0146\3\2\2\2i\u0148\3\2\2\2k\u014a\3\2"+
		"\2\2m\u014c\3\2\2\2o\u014e\3\2\2\2q\u0150\3\2\2\2s\u0152\3\2\2\2u\u0154"+
		"\3\2\2\2w\u0156\3\2\2\2y\u0158\3\2\2\2{\u015a\3\2\2\2}\u015c\3\2\2\2\177"+
		"\u015e\3\2\2\2\u0081\u0160\3\2\2\2\u0083\u0162\3\2\2\2\u0085\u0164\3\2"+
		"\2\2\u0087\u0166\3\2\2\2\u0089\u0175\3\2\2\2\u008b\u0183\3\2\2\2\u008d"+
		"\u008e\5y=\2\u008e\u008f\5S*\2\u008f\u0090\5q9\2\u0090\u0091\5c\62\2\u0091"+
		"\u0092\5S*\2\u0092\u0093\5U+\2\u0093\u0094\5g\64\2\u0094\u0095\5[.\2\u0095"+
		"\4\3\2\2\2\u0096\u0097\5W,\2\u0097\u0098\5m\67\2\u0098\u0099\5k\66\2\u0099"+
		"\u009a\5s:\2\u009a\u009b\5u;\2\u009b\u009c\5S*\2\u009c\u009d\5k\66\2\u009d"+
		"\u009e\5u;\2\u009e\6\3\2\2\2\u009f\u00a0\5q9\2\u00a0\u00a1\5[.\2\u00a1"+
		"\u00a2\5u;\2\u00a2\u00a3\5w<\2\u00a3\u00a4\5q9\2\u00a4\u00a5\5k\66\2\u00a5"+
		"\b\3\2\2\2\u00a6\u00a7\5c\62\2\u00a7\u00a8\5k\66\2\u00a8\u00a9\5u;\2\u00a9"+
		"\u00aa\5[.\2\u00aa\u00ab\5_\60\2\u00ab\u00ac\5[.\2\u00ac\u00ad\5q9\2\u00ad"+
		"\n\3\2\2\2\u00ae\u00af\5U+\2\u00af\u00b0\5m\67\2\u00b0\u00b1\5m\67\2\u00b1"+
		"\u00b2\5g\64\2\u00b2\u00b3\5[.\2\u00b3\u00b4\5S*\2\u00b4\u00b5\5k\66\2"+
		"\u00b5\f\3\2\2\2\u00b6\u00b7\5y=\2\u00b7\u00b8\5m\67\2\u00b8\u00b9\5c"+
		"\62\2\u00b9\u00ba\5Y-\2\u00ba\16\3\2\2\2\u00bb\u00bc\5i\65\2\u00bc\u00bd"+
		"\5S*\2\u00bd\u00be\5c\62\2\u00be\u00bf\5k\66\2\u00bf\20\3\2\2\2\u00c0"+
		"\u00c1\5c\62\2\u00c1\u00c2\5]/\2\u00c2\22\3\2\2\2\u00c3\u00c4\5[.\2\u00c4"+
		"\u00c5\5g\64\2\u00c5\u00c6\5s:\2\u00c6\u00c7\5[.\2\u00c7\24\3\2\2\2\u00c8"+
		"\u00c9\5u;\2\u00c9\u00ca\5q9\2\u00ca\u00cb\5w<\2\u00cb\u00cc\5[.\2\u00cc"+
		"\26\3\2\2\2\u00cd\u00ce\5]/\2\u00ce\u00cf\5S*\2\u00cf\u00d0\5g\64\2\u00d0"+
		"\u00d1\5s:\2\u00d1\u00d2\5[.\2\u00d2\30\3\2\2\2\u00d3\u00d4\5{>\2\u00d4"+
		"\u00d5\5a\61\2\u00d5\u00d6\5c\62\2\u00d6\u00d7\5g\64\2\u00d7\u00d8\5["+
		".\2\u00d8\32\3\2\2\2\u00d9\u00da\5U+\2\u00da\u00db\5[.\2\u00db\u00dc\5"+
		"_\60\2\u00dc\u00dd\5c\62\2\u00dd\u00de\5k\66\2\u00de\34\3\2\2\2\u00df"+
		"\u00e0\5[.\2\u00e0\u00e1\5k\66\2\u00e1\u00e2\5Y-\2\u00e2\36\3\2\2\2\u00e3"+
		"\u00e4\5c\62\2\u00e4\u00e5\5s:\2\u00e5 \3\2\2\2\u00e6\u00e7\5s:\2\u00e7"+
		"\u00e8\5e\63\2\u00e8\u00e9\5c\62\2\u00e9\u00ea\5o8\2\u00ea\"\3\2\2\2\u00eb"+
		"\u00ec\7=\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee&\3\2\2\2\u00ef\u00f0"+
		"\7.\2\2\u00f0(\3\2\2\2\u00f1\u00f7\5}?\2\u00f2\u00f6\5}?\2\u00f3\u00f6"+
		"\5\177@\2\u00f4\u00f6\5\u0083B\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8*\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5;\36\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0104\3\2\2\2\u00fd\u0105\5\177"+
		"@\2\u00fe\u0100\5\u0081A\2\u00ff\u0101\5\177@\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe\3\2\2\2\u0105,\3\2\2\2\u0106\u0107"+
		"\5+\26\2\u0107\u0108\5\u0085C\2\u0108\u0109\5+\26\2\u0109.\3\2\2\2\u010a"+
		"\u010b\7}\2\2\u010b\60\3\2\2\2\u010c\u010d\7\177\2\2\u010d\62\3\2\2\2"+
		"\u010e\u010f\7]\2\2\u010f\64\3\2\2\2\u0110\u0111\7_\2\2\u0111\66\3\2\2"+
		"\2\u0112\u0113\7*\2\2\u01138\3\2\2\2\u0114\u0115\7+\2\2\u0115:\3\2\2\2"+
		"\u0116\u0117\7/\2\2\u0117<\3\2\2\2\u0118\u0119\7-\2\2\u0119>\3\2\2\2\u011a"+
		"\u011b\7<\2\2\u011b\u011c\7?\2\2\u011c@\3\2\2\2\u011d\u011e\7\u0080\2"+
		"\2\u011eB\3\2\2\2\u011f\u0120\7~\2\2\u0120D\3\2\2\2\u0121\u0122\7(\2\2"+
		"\u0122F\3\2\2\2\u0123\u0124\7?\2\2\u0124H\3\2\2\2\u0125\u0126\7#\2\2\u0126"+
		"\u0127\7?\2\2\u0127J\3\2\2\2\u0128\u0129\7>\2\2\u0129L\3\2\2\2\u012a\u012b"+
		"\7>\2\2\u012b\u012c\7?\2\2\u012cN\3\2\2\2\u012d\u012e\7@\2\2\u012eP\3"+
		"\2\2\2\u012f\u0130\7@\2\2\u0130\u0131\7?\2\2\u0131R\3\2\2\2\u0132\u0133"+
		"\t\2\2\2\u0133T\3\2\2\2\u0134\u0135\t\3\2\2\u0135V\3\2\2\2\u0136\u0137"+
		"\t\4\2\2\u0137X\3\2\2\2\u0138\u0139\t\5\2\2\u0139Z\3\2\2\2\u013a\u013b"+
		"\t\6\2\2\u013b\\\3\2\2\2\u013c\u013d\t\7\2\2\u013d^\3\2\2\2\u013e\u013f"+
		"\t\b\2\2\u013f`\3\2\2\2\u0140\u0141\t\t\2\2\u0141b\3\2\2\2\u0142\u0143"+
		"\t\n\2\2\u0143d\3\2\2\2\u0144\u0145\t\13\2\2\u0145f\3\2\2\2\u0146\u0147"+
		"\t\f\2\2\u0147h\3\2\2\2\u0148\u0149\t\r\2\2\u0149j\3\2\2\2\u014a\u014b"+
		"\t\16\2\2\u014bl\3\2\2\2\u014c\u014d\t\17\2\2\u014dn\3\2\2\2\u014e\u014f"+
		"\t\20\2\2\u014fp\3\2\2\2\u0150\u0151\t\21\2\2\u0151r\3\2\2\2\u0152\u0153"+
		"\t\22\2\2\u0153t\3\2\2\2\u0154\u0155\t\23\2\2\u0155v\3\2\2\2\u0156\u0157"+
		"\t\24\2\2\u0157x\3\2\2\2\u0158\u0159\t\25\2\2\u0159z\3\2\2\2\u015a\u015b"+
		"\t\26\2\2\u015b|\3\2\2\2\u015c\u015d\t\27\2\2\u015d~\3\2\2\2\u015e\u015f"+
		"\t\30\2\2\u015f\u0080\3\2\2\2\u0160\u0161\t\31\2\2\u0161\u0082\3\2\2\2"+
		"\u0162\u0163\7a\2\2\u0163\u0084\3\2\2\2\u0164\u0165\7\60\2\2\u0165\u0086"+
		"\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168\7,\2\2\u0168\u016d\3\2\2\2\u0169"+
		"\u016c\5\u0087D\2\u016a\u016c\13\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7,\2\2\u0171\u0172\7\61"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0174\bD\2\2\u0174\u0088\3\2\2\2\u0175"+
		"\u0176\7\61\2\2\u0176\u0177\7\61\2\2\u0177\u017b\3\2\2\2\u0178\u017a\13"+
		"\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u017c\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\f"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\bE\2\2\u0181\u008a\3\2\2\2\u0182"+
		"\u0184\t\32\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3"+
		"\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\bF\2\2\u0188"+
		"\u008c\3\2\2\2\f\2\u00f5\u00f7\u00fb\u0102\u0104\u016b\u016d\u017b\u0185"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}