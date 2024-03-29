package ccal_gen;// Generated from /home/andfinn/PycharmProjects/DCU/Year4/CA4003/assigment_2/ccal.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, CONSTANT=2, RETURN=3, INTEGER=4, BOOLEAN=5, VOID=6, MAIN=7, 
		IF=8, ELSE=9, TRUE=10, FALSE=11, WHILE=12, SKIP_=13, StartParen=14, EndParen=15, 
		StartBrace=16, EndBrace=17, SemiColon=18, Comma=19, Colon=20, ASSIGNMENT=21, 
		MINUS=22, PLUS=23, TILDE=24, OR=25, AND=26, EQUAL=27, NEQUAL=28, GT=29, 
		LT=30, LE=31, GE=32, INT=33, ID=34, WHITESPACE=35, LINE_COMMENT=36, INLINE_COMMENT=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Digit", "Letter", "Underscore", "A", "B", "C", "D", "E", "F", "G", "H", 
			"I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "W", "VARIABLE", 
			"CONSTANT", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", "IF", "ELSE", 
			"TRUE", "FALSE", "WHILE", "SKIP_", "StartParen", "EndParen", "StartBrace", 
			"EndBrace", "SemiColon", "Comma", "Colon", "ASSIGNMENT", "MINUS", "PLUS", 
			"TILDE", "OR", "AND", "EQUAL", "NEQUAL", "GT", "LT", "LE", "GE", "INT", 
			"ID", "WHITESPACE", "LINE_COMMENT", "INLINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'='", "'-'", 
			"'+'", "'~'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE", "CONSTANT", "RETURN", "INTEGER", "BOOLEAN", "VOID", 
			"MAIN", "IF", "ELSE", "TRUE", "FALSE", "WHILE", "SKIP_", "StartParen", 
			"EndParen", "StartBrace", "EndBrace", "SemiColon", "Comma", "Colon", 
			"ASSIGNMENT", "MINUS", "PLUS", "TILDE", "OR", "AND", "EQUAL", "NEQUAL", 
			"GT", "LT", "LE", "GE", "INT", "ID", "WHITESPACE", "LINE_COMMENT", "INLINE_COMMENT"
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


	public ccalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ccal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\3"+
		"9\3:\3:\5:\u0125\n:\3:\3:\7:\u0129\n:\f:\16:\u012c\13:\5:\u012e\n:\3;"+
		"\3;\3;\3;\7;\u0134\n;\f;\16;\u0137\13;\3<\6<\u013a\n<\r<\16<\u013b\3<"+
		"\3<\3=\3=\3=\3=\7=\u0144\n=\f=\16=\u0147\13=\3=\3=\3>\3>\3>\3>\7>\u014f"+
		"\n>\f>\16>\u0152\13>\3>\3>\7>\u0156\n>\f>\16>\u0159\13>\3>\7>\u015c\n"+
		">\f>\16>\u015f\13>\5>\u0161\n>\3>\7>\u0164\n>\f>\16>\u0167\13>\3>\7>\u016a"+
		"\n>\f>\16>\u016d\13>\3>\3>\3>\3>\3>\5\u0150\u0165\u016b\2?\3\2\5\2\7\2"+
		"\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'"+
		"\2)\2+\2-\2/\2\61\2\63\3\65\4\67\59\6;\7=\b?\tA\nC\13E\fG\rI\16K\17M\20"+
		"O\21Q\22S\23U\24W\25Y\26[\27]\30_\31a\32c\33e\34g\35i\36k\37m o!q\"s#"+
		"u$w%y&{\'\3\2\35\3\2\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\3\2\63"+
		";\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2,,\61\61\2\u0169\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3"+
		"\2\2\2\7\u0081\3\2\2\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0087\3\2\2"+
		"\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2"+
		"\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2\2\2\37"+
		"\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3"+
		"\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00b1\3\2\2\2\67\u00b7\3\2\2\29\u00be"+
		"\3\2\2\2;\u00c6\3\2\2\2=\u00ce\3\2\2\2?\u00d3\3\2\2\2A\u00d8\3\2\2\2C"+
		"\u00db\3\2\2\2E\u00e0\3\2\2\2G\u00e5\3\2\2\2I\u00eb\3\2\2\2K\u00f1\3\2"+
		"\2\2M\u00f6\3\2\2\2O\u00f8\3\2\2\2Q\u00fa\3\2\2\2S\u00fc\3\2\2\2U\u00fe"+
		"\3\2\2\2W\u0100\3\2\2\2Y\u0102\3\2\2\2[\u0104\3\2\2\2]\u0106\3\2\2\2_"+
		"\u0108\3\2\2\2a\u010a\3\2\2\2c\u010c\3\2\2\2e\u010f\3\2\2\2g\u0112\3\2"+
		"\2\2i\u0115\3\2\2\2k\u0118\3\2\2\2m\u011a\3\2\2\2o\u011c\3\2\2\2q\u011f"+
		"\3\2\2\2s\u012d\3\2\2\2u\u012f\3\2\2\2w\u0139\3\2\2\2y\u013f\3\2\2\2{"+
		"\u014a\3\2\2\2}~\t\2\2\2~\4\3\2\2\2\177\u0080\t\3\2\2\u0080\6\3\2\2\2"+
		"\u0081\u0082\7a\2\2\u0082\b\3\2\2\2\u0083\u0084\t\4\2\2\u0084\n\3\2\2"+
		"\2\u0085\u0086\t\5\2\2\u0086\f\3\2\2\2\u0087\u0088\t\6\2\2\u0088\16\3"+
		"\2\2\2\u0089\u008a\t\7\2\2\u008a\20\3\2\2\2\u008b\u008c\t\b\2\2\u008c"+
		"\22\3\2\2\2\u008d\u008e\t\t\2\2\u008e\24\3\2\2\2\u008f\u0090\t\n\2\2\u0090"+
		"\26\3\2\2\2\u0091\u0092\t\13\2\2\u0092\30\3\2\2\2\u0093\u0094\t\f\2\2"+
		"\u0094\32\3\2\2\2\u0095\u0096\t\r\2\2\u0096\34\3\2\2\2\u0097\u0098\t\16"+
		"\2\2\u0098\36\3\2\2\2\u0099\u009a\t\17\2\2\u009a \3\2\2\2\u009b\u009c"+
		"\t\20\2\2\u009c\"\3\2\2\2\u009d\u009e\t\21\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\t\22\2\2\u00a0&\3\2\2\2\u00a1\u00a2\t\23\2\2\u00a2(\3\2\2\2\u00a3\u00a4"+
		"\t\24\2\2\u00a4*\3\2\2\2\u00a5\u00a6\t\25\2\2\u00a6,\3\2\2\2\u00a7\u00a8"+
		"\t\26\2\2\u00a8.\3\2\2\2\u00a9\u00aa\t\27\2\2\u00aa\60\3\2\2\2\u00ab\u00ac"+
		"\t\30\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\5/\30\2\u00ae\u00af\5\t\5\2\u00af"+
		"\u00b0\5\'\24\2\u00b0\64\3\2\2\2\u00b1\u00b2\5\r\7\2\u00b2\u00b3\5#\22"+
		"\2\u00b3\u00b4\5!\21\2\u00b4\u00b5\5)\25\2\u00b5\u00b6\5+\26\2\u00b6\66"+
		"\3\2\2\2\u00b7\u00b8\5\'\24\2\u00b8\u00b9\5\21\t\2\u00b9\u00ba\5+\26\2"+
		"\u00ba\u00bb\5-\27\2\u00bb\u00bc\5\'\24\2\u00bc\u00bd\5!\21\2\u00bd8\3"+
		"\2\2\2\u00be\u00bf\5\31\r\2\u00bf\u00c0\5!\21\2\u00c0\u00c1\5+\26\2\u00c1"+
		"\u00c2\5\21\t\2\u00c2\u00c3\5\25\13\2\u00c3\u00c4\5\21\t\2\u00c4\u00c5"+
		"\5\'\24\2\u00c5:\3\2\2\2\u00c6\u00c7\5\13\6\2\u00c7\u00c8\5#\22\2\u00c8"+
		"\u00c9\5#\22\2\u00c9\u00ca\5\35\17\2\u00ca\u00cb\5\21\t\2\u00cb\u00cc"+
		"\5\t\5\2\u00cc\u00cd\5!\21\2\u00cd<\3\2\2\2\u00ce\u00cf\5/\30\2\u00cf"+
		"\u00d0\5#\22\2\u00d0\u00d1\5\31\r\2\u00d1\u00d2\5\17\b\2\u00d2>\3\2\2"+
		"\2\u00d3\u00d4\5\37\20\2\u00d4\u00d5\5\t\5\2\u00d5\u00d6\5\31\r\2\u00d6"+
		"\u00d7\5!\21\2\u00d7@\3\2\2\2\u00d8\u00d9\5\31\r\2\u00d9\u00da\5\23\n"+
		"\2\u00daB\3\2\2\2\u00db\u00dc\5\21\t\2\u00dc\u00dd\5\35\17\2\u00dd\u00de"+
		"\5)\25\2\u00de\u00df\5\21\t\2\u00dfD\3\2\2\2\u00e0\u00e1\5+\26\2\u00e1"+
		"\u00e2\5\'\24\2\u00e2\u00e3\5-\27\2\u00e3\u00e4\5\21\t\2\u00e4F\3\2\2"+
		"\2\u00e5\u00e6\5\23\n\2\u00e6\u00e7\5\t\5\2\u00e7\u00e8\5\35\17\2\u00e8"+
		"\u00e9\5)\25\2\u00e9\u00ea\5\21\t\2\u00eaH\3\2\2\2\u00eb\u00ec\5\61\31"+
		"\2\u00ec\u00ed\5\27\f\2\u00ed\u00ee\5\31\r\2\u00ee\u00ef\5\35\17\2\u00ef"+
		"\u00f0\5\21\t\2\u00f0J\3\2\2\2\u00f1\u00f2\5)\25\2\u00f2\u00f3\5\33\16"+
		"\2\u00f3\u00f4\5\31\r\2\u00f4\u00f5\5%\23\2\u00f5L\3\2\2\2\u00f6\u00f7"+
		"\7*\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7"+
		"}\2\2\u00fbR\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fdT\3\2\2\2\u00fe\u00ff"+
		"\7=\2\2\u00ffV\3\2\2\2\u0100\u0101\7.\2\2\u0101X\3\2\2\2\u0102\u0103\7"+
		"<\2\2\u0103Z\3\2\2\2\u0104\u0105\7?\2\2\u0105\\\3\2\2\2\u0106\u0107\7"+
		"/\2\2\u0107^\3\2\2\2\u0108\u0109\7-\2\2\u0109`\3\2\2\2\u010a\u010b\7\u0080"+
		"\2\2\u010bb\3\2\2\2\u010c\u010d\7~\2\2\u010d\u010e\7~\2\2\u010ed\3\2\2"+
		"\2\u010f\u0110\7(\2\2\u0110\u0111\7(\2\2\u0111f\3\2\2\2\u0112\u0113\7"+
		"?\2\2\u0113\u0114\7?\2\2\u0114h\3\2\2\2\u0115\u0116\7#\2\2\u0116\u0117"+
		"\7?\2\2\u0117j\3\2\2\2\u0118\u0119\7@\2\2\u0119l\3\2\2\2\u011a\u011b\7"+
		">\2\2\u011bn\3\2\2\2\u011c\u011d\7>\2\2\u011d\u011e\7?\2\2\u011ep\3\2"+
		"\2\2\u011f\u0120\7@\2\2\u0120\u0121\7?\2\2\u0121r\3\2\2\2\u0122\u012e"+
		"\7\62\2\2\u0123\u0125\5]/\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u012a\t\31\2\2\u0127\u0129\5\3\2\2\u0128\u0127\3"+
		"\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0122\3\2\2\2\u012d\u0124\3\2"+
		"\2\2\u012et\3\2\2\2\u012f\u0135\5\5\3\2\u0130\u0134\5\5\3\2\u0131\u0134"+
		"\5\3\2\2\u0132\u0134\5\7\4\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136v\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\t\32\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\b<\2\2\u013ex\3\2\2\2\u013f\u0140\7\61\2\2"+
		"\u0140\u0141\7\61\2\2\u0141\u0145\3\2\2\2\u0142\u0144\n\33\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\b=\2\2\u0149z\3\2\2\2\u014a"+
		"\u014b\7\61\2\2\u014b\u014c\7,\2\2\u014c\u0165\3\2\2\2\u014d\u014f\7\61"+
		"\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0164\5{"+
		">\2\u0154\u0156\7\61\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0161\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\7,\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0157\3\2\2\2\u0160\u015d\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\n\34\2\2\u0163\u0150\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016b\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016a\7,\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\7\61\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\b>\2\2\u0172|\3\2\2\2\21\2\u0124\u012a\u012d\u0133\u0135"+
		"\u013b\u0145\u0150\u0157\u015d\u0160\u0163\u0165\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}