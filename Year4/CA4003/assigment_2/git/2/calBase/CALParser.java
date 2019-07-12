package calBase;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
// Generated from cal.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CALParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_const_decl = 4, 
		RULE_function_list = 5, RULE_function = 6, RULE_type = 7, RULE_parameter_list = 8, 
		RULE_nemp_paramerter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_condition = 14, RULE_fragm = 15, 
		RULE_argument_list = 16, RULE_nemp_argument_list = 17, RULE_empty_statment = 18, 
		RULE_binary_arith_op = 19, RULE_comp_operators = 20;
	public static final String[] ruleNames = {
		"prog", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
		"function", "type", "parameter_list", "nemp_paramerter_list", "main", 
		"statement_block", "statement", "expression", "condition", "fragm", "argument_list", 
		"nemp_argument_list", "empty_statment", "binary_arith_op", "comp_operators"
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

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgStmContext extends ProgContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgStmContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterProgStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitProgStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitProgStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new ProgStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			decl_list();
			setState(43);
			function_list();
			setState(44);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_listContext extends ParserRuleContext {
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	 
		public Decl_listContext() { }
		public void copyFrom(Decl_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclListStmContext extends Decl_listContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(CALParser.SemiColon, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public DeclListStmContext(Decl_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterDeclListStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitDeclListStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitDeclListStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			_localctx = new DeclListStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			switch (_input.LA(1)) {
			case Variable:
			case Constant:
				{
				setState(46);
				decl();
				setState(47);
				match(SemiColon);
				setState(48);
				decl_list();
				}
				break;
			case Integer:
			case Boolean:
			case Void:
			case Main:
			case If:
			case While:
			case Begin:
			case End:
			case Skip:
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclRefContext extends DeclContext {
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public ConstDeclRefContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterConstDeclRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitConstDeclRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitConstDeclRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclRefContext extends DeclContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public VarDeclRefContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterVarDeclRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitVarDeclRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitVarDeclRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case Variable:
				_localctx = new VarDeclRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				var_decl();
				}
				break;
			case Constant:
				_localctx = new ConstDeclRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				const_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclStmContext extends Var_declContext {
		public TerminalNode Variable() { return getToken(CALParser.Variable, 0); }
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Colon() { return getToken(CALParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclStmContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterVarDeclStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitVarDeclStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitVarDeclStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			_localctx = new VarDeclStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Variable);
			setState(58);
			match(ID);
			setState(59);
			match(Colon);
			setState(60);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declContext extends ParserRuleContext {
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
	 
		public Const_declContext() { }
		public void copyFrom(Const_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclStmContext extends Const_declContext {
		public TerminalNode Constant() { return getToken(CALParser.Constant, 0); }
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Colon() { return getToken(CALParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CALParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclStmContext(Const_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterConstDeclStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitConstDeclStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitConstDeclStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			_localctx = new ConstDeclStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Constant);
			setState(63);
			match(ID);
			setState(64);
			match(Colon);
			setState(65);
			type();
			setState(66);
			match(ASSIGNMENT);
			setState(67);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_listContext extends ParserRuleContext {
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
	 
		public Function_listContext() { }
		public void copyFrom(Function_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncListStmContext extends Function_listContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public FuncListStmContext(Function_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFuncListStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFuncListStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFuncListStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		try {
			_localctx = new FuncListStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			switch (_input.LA(1)) {
			case Integer:
			case Boolean:
			case Void:
				{
				setState(69);
				function();
				setState(70);
				function_list();
				}
				break;
			case Main:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDeclStmContext extends FunctionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public List<TerminalNode> O_Paren() { return getTokens(CALParser.O_Paren); }
		public TerminalNode O_Paren(int i) {
			return getToken(CALParser.O_Paren, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> C_Paren() { return getTokens(CALParser.C_Paren); }
		public TerminalNode C_Paren(int i) {
			return getToken(CALParser.C_Paren, i);
		}
		public TerminalNode Is() { return getToken(CALParser.Is, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode Begin() { return getToken(CALParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(CALParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(CALParser.SemiColon, 0); }
		public TerminalNode End() { return getToken(CALParser.End, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Empty_statmentContext empty_statment() {
			return getRuleContext(Empty_statmentContext.class,0);
		}
		public FuncDeclStmContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFuncDeclStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFuncDeclStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFuncDeclStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			_localctx = new FuncDeclStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(ID);
			setState(77);
			match(O_Paren);
			setState(78);
			parameter_list();
			setState(79);
			match(C_Paren);
			setState(80);
			match(Is);
			setState(81);
			decl_list();
			setState(82);
			match(Begin);
			setState(83);
			statement_block();
			setState(84);
			match(Return);
			setState(85);
			match(O_Paren);
			setState(88);
			switch (_input.LA(1)) {
			case True:
			case False:
			case ID:
			case NUMBER:
			case O_Paren:
			case MINUS:
			case PLUS:
				{
				setState(86);
				expression(0);
				}
				break;
			case C_Paren:
				{
				setState(87);
				empty_statment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			match(C_Paren);
			setState(91);
			match(SemiColon);
			setState(92);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(CALParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(CALParser.Boolean, 0); }
		public TerminalNode Void() { return getToken(CALParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Boolean) | (1L << Void))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	 
		public Parameter_listContext() { }
		public void copyFrom(Parameter_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonEmptyParamRefContext extends Parameter_listContext {
		public Nemp_paramerter_listContext nemp_paramerter_list() {
			return getRuleContext(Nemp_paramerter_listContext.class,0);
		}
		public NonEmptyParamRefContext(Parameter_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterNonEmptyParamRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitNonEmptyParamRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitNonEmptyParamRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			_localctx = new NonEmptyParamRefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(96);
				nemp_paramerter_list();
				}
				break;
			case C_Paren:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nemp_paramerter_listContext extends ParserRuleContext {
		public Nemp_paramerter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_paramerter_list; }
	 
		public Nemp_paramerter_listContext() { }
		public void copyFrom(Nemp_paramerter_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleParamStmContext extends Nemp_paramerter_listContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Colon() { return getToken(CALParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SingleParamStmContext(Nemp_paramerter_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterSingleParamStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitSingleParamStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitSingleParamStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleParamStmContext extends Nemp_paramerter_listContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Colon() { return getToken(CALParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CALParser.Comma, 0); }
		public Nemp_paramerter_listContext nemp_paramerter_list() {
			return getRuleContext(Nemp_paramerter_listContext.class,0);
		}
		public MultipleParamStmContext(Nemp_paramerter_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterMultipleParamStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitMultipleParamStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitMultipleParamStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_paramerter_listContext nemp_paramerter_list() throws RecognitionException {
		Nemp_paramerter_listContext _localctx = new Nemp_paramerter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_paramerter_list);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SingleParamStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(ID);
				setState(101);
				match(Colon);
				setState(102);
				type();
				}
				break;
			case 2:
				_localctx = new MultipleParamStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ID);
				setState(104);
				match(Colon);
				setState(105);
				type();
				setState(106);
				match(Comma);
				setState(107);
				nemp_paramerter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainStmContext extends MainContext {
		public TerminalNode Main() { return getToken(CALParser.Main, 0); }
		public TerminalNode Begin() { return getToken(CALParser.Begin, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(CALParser.End, 0); }
		public MainStmContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterMainStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitMainStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitMainStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			_localctx = new MainStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Main);
			setState(112);
			match(Begin);
			setState(113);
			decl_list();
			setState(114);
			statement_block();
			setState(115);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
	 
		public Statement_blockContext() { }
		public void copyFrom(Statement_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmBlockRefContext extends Statement_blockContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public StmBlockRefContext(Statement_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterStmBlockRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitStmBlockRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitStmBlockRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatmentContext extends Statement_blockContext {
		public Empty_statmentContext empty_statment() {
			return getRuleContext(Empty_statmentContext.class,0);
		}
		public EmptyStatmentContext(Statement_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterEmptyStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitEmptyStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitEmptyStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case If:
			case While:
			case Begin:
			case Skip:
			case ID:
				_localctx = new StmBlockRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				statement();
				setState(118);
				statement_block();
				}
				break;
			case Return:
			case End:
				_localctx = new EmptyStatmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				empty_statment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStmContext extends StatementContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CALParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(CALParser.SemiColon, 0); }
		public AssignStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterAssignStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitAssignStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitAssignStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipStmContext extends StatementContext {
		public TerminalNode Skip() { return getToken(CALParser.Skip, 0); }
		public TerminalNode SemiColon() { return getToken(CALParser.SemiColon, 0); }
		public SkipStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterSkipStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitSkipStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitSkipStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeginStmContext extends StatementContext {
		public TerminalNode Begin() { return getToken(CALParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(CALParser.End, 0); }
		public BeginStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterBeginStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitBeginStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitBeginStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalStmContext extends StatementContext {
		public TerminalNode If() { return getToken(CALParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> Begin() { return getTokens(CALParser.Begin); }
		public TerminalNode Begin(int i) {
			return getToken(CALParser.Begin, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> End() { return getTokens(CALParser.End); }
		public TerminalNode End(int i) {
			return getToken(CALParser.End, i);
		}
		public TerminalNode Else() { return getToken(CALParser.Else, 0); }
		public ConditionalStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterConditionalStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitConditionalStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitConditionalStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmContext extends StatementContext {
		public TerminalNode While() { return getToken(CALParser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Begin() { return getToken(CALParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(CALParser.End, 0); }
		public WhileStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterWhileStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitWhileStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitWhileStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallStmContext extends StatementContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode O_Paren() { return getToken(CALParser.O_Paren, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode C_Paren() { return getToken(CALParser.C_Paren, 0); }
		public TerminalNode SemiColon() { return getToken(CALParser.SemiColon, 0); }
		public FuncCallStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFuncCallStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFuncCallStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFuncCallStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ID);
				setState(124);
				match(ASSIGNMENT);
				setState(125);
				expression(0);
				setState(126);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new FuncCallStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				match(O_Paren);
				setState(130);
				argument_list();
				setState(131);
				match(C_Paren);
				setState(132);
				match(SemiColon);
				}
				break;
			case 3:
				_localctx = new BeginStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(Begin);
				setState(135);
				statement_block();
				setState(136);
				match(End);
				}
				break;
			case 4:
				_localctx = new ConditionalStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(If);
				setState(139);
				condition(0);
				setState(140);
				match(Begin);
				setState(141);
				statement_block();
				setState(142);
				match(End);
				setState(143);
				match(Else);
				setState(144);
				match(Begin);
				setState(145);
				statement_block();
				setState(146);
				match(End);
				}
				break;
			case 5:
				_localctx = new WhileStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(While);
				setState(149);
				condition(0);
				setState(150);
				match(Begin);
				setState(151);
				statement_block();
				setState(152);
				match(End);
				}
				break;
			case 6:
				_localctx = new SkipStmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(Skip);
				setState(155);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenExpreStmContext extends ExpressionContext {
		public TerminalNode O_Paren() { return getToken(CALParser.O_Paren, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_Paren() { return getToken(CALParser.C_Paren, 0); }
		public ParenExpreStmContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterParenExpreStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitParenExpreStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitParenExpreStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FragRefContext extends ExpressionContext {
		public FragmContext fragm() {
			return getRuleContext(FragmContext.class,0);
		}
		public FragRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFragRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFragRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFragRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FragBinArithStmContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public FragBinArithStmContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFragBinArithStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFragBinArithStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFragBinArithStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FragUnaArithStmContext extends ExpressionContext {
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public FragmContext fragm() {
			return getRuleContext(FragmContext.class,0);
		}
		public FragUnaArithStmContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFragUnaArithStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFragUnaArithStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFragUnaArithStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode O_Paren() { return getToken(CALParser.O_Paren, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode C_Paren() { return getToken(CALParser.C_Paren, 0); }
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new FragUnaArithStmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				binary_arith_op();
				setState(160);
				fragm();
				}
				break;
			case 2:
				{
				_localctx = new ParenExpreStmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(O_Paren);
				setState(163);
				expression(0);
				setState(164);
				match(C_Paren);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(ID);
				setState(167);
				match(O_Paren);
				setState(168);
				argument_list();
				setState(169);
				match(C_Paren);
				}
				break;
			case 4:
				{
				_localctx = new FragRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				fragm();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FragBinArithStmContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(174);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(175);
					binary_arith_op();
					setState(176);
					expression(6);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolNegStmContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(CALParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BoolNegStmContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterBoolNegStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitBoolNegStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitBoolNegStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenConditionalStmContext extends ConditionContext {
		public TerminalNode O_Paren() { return getToken(CALParser.O_Paren, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode C_Paren() { return getToken(CALParser.C_Paren, 0); }
		public ParenConditionalStmContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterParenConditionalStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitParenConditionalStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitParenConditionalStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolEvalStmContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CALParser.OR, 0); }
		public TerminalNode AND() { return getToken(CALParser.AND, 0); }
		public BoolEvalStmContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterBoolEvalStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitBoolEvalStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitBoolEvalStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArithStmContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_operatorsContext comp_operators() {
			return getRuleContext(Comp_operatorsContext.class,0);
		}
		public BoolArithStmContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterBoolArithStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitBoolArithStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitBoolArithStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BoolNegStmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				match(NOT);
				setState(185);
				condition(4);
				}
				break;
			case 2:
				{
				_localctx = new ParenConditionalStmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(O_Paren);
				setState(187);
				condition(0);
				setState(188);
				match(C_Paren);
				}
				break;
			case 3:
				{
				_localctx = new BoolArithStmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				expression(0);
				setState(191);
				comp_operators();
				setState(192);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolEvalStmContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(198);
					condition(2);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FragmContext extends ParserRuleContext {
		public FragmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragm; }
	 
		public FragmContext() { }
		public void copyFrom(FragmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdFragContext extends FragmContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public IdFragContext(FragmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterIdFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitIdFrag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitIdFrag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueStmContext extends FragmContext {
		public TerminalNode True() { return getToken(CALParser.True, 0); }
		public TrueStmContext(FragmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterTrueStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitTrueStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitTrueStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseStmContext extends FragmContext {
		public TerminalNode False() { return getToken(CALParser.False, 0); }
		public FalseStmContext(FragmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFalseStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFalseStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitFalseStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntStmContext extends FragmContext {
		public TerminalNode NUMBER() { return getToken(CALParser.NUMBER, 0); }
		public IntStmContext(FragmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterIntStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitIntStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitIntStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationStmContext extends FragmContext {
		public TerminalNode MINUS() { return getToken(CALParser.MINUS, 0); }
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public NegationStmContext(FragmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterNegationStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitNegationStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitNegationStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmContext fragm() throws RecognitionException {
		FragmContext _localctx = new FragmContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fragm);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdFragContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				}
				break;
			case MINUS:
				_localctx = new NegationStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(MINUS);
				setState(206);
				match(ID);
				}
				break;
			case NUMBER:
				_localctx = new IntStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(NUMBER);
				}
				break;
			case True:
				_localctx = new TrueStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(True);
				}
				break;
			case False:
				_localctx = new FalseStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(False);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	 
		public Argument_listContext() { }
		public void copyFrom(Argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonEmptyArgListRefContext extends Argument_listContext {
		public Nemp_argument_listContext nemp_argument_list() {
			return getRuleContext(Nemp_argument_listContext.class,0);
		}
		public NonEmptyArgListRefContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterNonEmptyArgListRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitNonEmptyArgListRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitNonEmptyArgListRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument_list);
		try {
			_localctx = new NonEmptyArgListRefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(212);
				nemp_argument_list();
				}
				break;
			case C_Paren:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nemp_argument_listContext extends ParserRuleContext {
		public Nemp_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_argument_list; }
	 
		public Nemp_argument_listContext() { }
		public void copyFrom(Nemp_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdArgRefContext extends Nemp_argument_listContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public IdArgRefContext(Nemp_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterIdArgRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitIdArgRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitIdArgRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultIdArgRefContext extends Nemp_argument_listContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Comma() { return getToken(CALParser.Comma, 0); }
		public Nemp_argument_listContext nemp_argument_list() {
			return getRuleContext(Nemp_argument_listContext.class,0);
		}
		public MultIdArgRefContext(Nemp_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterMultIdArgRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitMultIdArgRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitMultIdArgRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_argument_listContext nemp_argument_list() throws RecognitionException {
		Nemp_argument_listContext _localctx = new Nemp_argument_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nemp_argument_list);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IdArgRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(ID);
				}
				break;
			case 2:
				_localctx = new MultIdArgRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ID);
				setState(218);
				match(Comma);
				setState(219);
				nemp_argument_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_statmentContext extends ParserRuleContext {
		public Empty_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_statment; }
	 
		public Empty_statmentContext() { }
		public void copyFrom(Empty_statmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStmContext extends Empty_statmentContext {
		public EmptyStmContext(Empty_statmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterEmptyStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitEmptyStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitEmptyStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_statmentContext empty_statment() throws RecognitionException {
		Empty_statmentContext _localctx = new Empty_statmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_empty_statment);
		try {
			_localctx = new EmptyStmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_arith_opContext extends ParserRuleContext {
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
	 
		public Binary_arith_opContext() { }
		public void copyFrom(Binary_arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtractionStmContext extends Binary_arith_opContext {
		public TerminalNode MINUS() { return getToken(CALParser.MINUS, 0); }
		public SubtractionStmContext(Binary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterSubtractionStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitSubtractionStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitSubtractionStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionStmContext extends Binary_arith_opContext {
		public TerminalNode PLUS() { return getToken(CALParser.PLUS, 0); }
		public AdditionStmContext(Binary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterAdditionStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitAdditionStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitAdditionStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binary_arith_op);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AdditionStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new SubtractionStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(MINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_operatorsContext extends ParserRuleContext {
		public Comp_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operators; }
	 
		public Comp_operatorsContext() { }
		public void copyFrom(Comp_operatorsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogNEqContext extends Comp_operatorsContext {
		public TerminalNode NOTEQUAL() { return getToken(CALParser.NOTEQUAL, 0); }
		public LogNEqContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogNEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogNEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogNEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogOrContext extends Comp_operatorsContext {
		public TerminalNode OR() { return getToken(CALParser.OR, 0); }
		public LogOrContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogGTEContext extends Comp_operatorsContext {
		public TerminalNode GTE() { return getToken(CALParser.GTE, 0); }
		public LogGTEContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogGTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogGTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogGTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogGTContext extends Comp_operatorsContext {
		public TerminalNode GT() { return getToken(CALParser.GT, 0); }
		public LogGTContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogGT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogEqContext extends Comp_operatorsContext {
		public TerminalNode EQUAL() { return getToken(CALParser.EQUAL, 0); }
		public LogEqContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogLTContext extends Comp_operatorsContext {
		public TerminalNode LT() { return getToken(CALParser.LT, 0); }
		public LogLTContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogLT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogLTEContext extends Comp_operatorsContext {
		public TerminalNode LTE() { return getToken(CALParser.LTE, 0); }
		public LogLTEContext(Comp_operatorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterLogLTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitLogLTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CALVisitor ) return ((CALVisitor<? extends T>)visitor).visitLogLTE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operatorsContext comp_operators() throws RecognitionException {
		Comp_operatorsContext _localctx = new Comp_operatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comp_operators);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case OR:
				_localctx = new LogOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(OR);
				}
				break;
			case EQUAL:
				_localctx = new LogEqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new LogNEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(NOTEQUAL);
				}
				break;
			case LT:
				_localctx = new LogLTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(LT);
				}
				break;
			case LTE:
				_localctx = new LogLTEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(LTE);
				}
				break;
			case GT:
				_localctx = new LogGTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(GT);
				}
				break;
			case GTE:
				_localctx = new LogGTEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				match(GTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\ne\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009f"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00af\n\17\3\17\3\17\3\17\3\17\7\17\u00b5\n\17\f\17\16\17\u00b8"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c5"+
		"\n\20\3\20\3\20\3\20\7\20\u00ca\n\20\f\20\16\20\u00cd\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d5\n\21\3\22\3\22\5\22\u00d9\n\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00df\n\23\3\24\3\24\3\25\3\25\5\25\u00e5\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ee\n\26\3\26\2\4\34\36\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\3\2\6\b\3\2#$\u00fa\2,\3"+
		"\2\2\2\4\65\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16M\3"+
		"\2\2\2\20`\3\2\2\2\22d\3\2\2\2\24o\3\2\2\2\26q\3\2\2\2\30{\3\2\2\2\32"+
		"\u009e\3\2\2\2\34\u00ae\3\2\2\2\36\u00c4\3\2\2\2 \u00d4\3\2\2\2\"\u00d8"+
		"\3\2\2\2$\u00de\3\2\2\2&\u00e0\3\2\2\2(\u00e4\3\2\2\2*\u00ed\3\2\2\2,"+
		"-\5\4\3\2-.\5\f\7\2./\5\26\f\2/\3\3\2\2\2\60\61\5\6\4\2\61\62\7\23\2\2"+
		"\62\63\5\4\3\2\63\66\3\2\2\2\64\66\3\2\2\2\65\60\3\2\2\2\65\64\3\2\2\2"+
		"\66\5\3\2\2\2\67:\5\b\5\28:\5\n\6\29\67\3\2\2\298\3\2\2\2:\7\3\2\2\2;"+
		"<\7\3\2\2<=\7\26\2\2=>\7\24\2\2>?\5\20\t\2?\t\3\2\2\2@A\7\4\2\2AB\7\26"+
		"\2\2BC\7\24\2\2CD\5\20\t\2DE\7!\2\2EF\5\34\17\2F\13\3\2\2\2GH\5\16\b\2"+
		"HI\5\f\7\2IL\3\2\2\2JL\3\2\2\2KG\3\2\2\2KJ\3\2\2\2L\r\3\2\2\2MN\5\20\t"+
		"\2NO\7\26\2\2OP\7\35\2\2PQ\5\22\n\2QR\7\36\2\2RS\7\21\2\2ST\5\4\3\2TU"+
		"\7\17\2\2UV\5\30\r\2VW\7\5\2\2WZ\7\35\2\2X[\5\34\17\2Y[\5&\24\2ZX\3\2"+
		"\2\2ZY\3\2\2\2[\\\3\2\2\2\\]\7\36\2\2]^\7\23\2\2^_\7\20\2\2_\17\3\2\2"+
		"\2`a\t\2\2\2a\21\3\2\2\2be\5\24\13\2ce\3\2\2\2db\3\2\2\2dc\3\2\2\2e\23"+
		"\3\2\2\2fg\7\26\2\2gh\7\24\2\2hp\5\20\t\2ij\7\26\2\2jk\7\24\2\2kl\5\20"+
		"\t\2lm\7\25\2\2mn\5\24\13\2np\3\2\2\2of\3\2\2\2oi\3\2\2\2p\25\3\2\2\2"+
		"qr\7\t\2\2rs\7\17\2\2st\5\4\3\2tu\5\30\r\2uv\7\20\2\2v\27\3\2\2\2wx\5"+
		"\32\16\2xy\5\30\r\2y|\3\2\2\2z|\5&\24\2{w\3\2\2\2{z\3\2\2\2|\31\3\2\2"+
		"\2}~\7\26\2\2~\177\7!\2\2\177\u0080\5\34\17\2\u0080\u0081\7\23\2\2\u0081"+
		"\u009f\3\2\2\2\u0082\u0083\7\26\2\2\u0083\u0084\7\35\2\2\u0084\u0085\5"+
		"\"\22\2\u0085\u0086\7\36\2\2\u0086\u0087\7\23\2\2\u0087\u009f\3\2\2\2"+
		"\u0088\u0089\7\17\2\2\u0089\u008a\5\30\r\2\u008a\u008b\7\20\2\2\u008b"+
		"\u009f\3\2\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7"+
		"\17\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\20\2\2\u0091\u0092\7\13\2\2"+
		"\u0092\u0093\7\17\2\2\u0093\u0094\5\30\r\2\u0094\u0095\7\20\2\2\u0095"+
		"\u009f\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098\5\36\20\2\u0098\u0099"+
		"\7\17\2\2\u0099\u009a\5\30\r\2\u009a\u009b\7\20\2\2\u009b\u009f\3\2\2"+
		"\2\u009c\u009d\7\22\2\2\u009d\u009f\7\23\2\2\u009e}\3\2\2\2\u009e\u0082"+
		"\3\2\2\2\u009e\u0088\3\2\2\2\u009e\u008c\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a1\b\17\1\2\u00a1\u00a2\5(\25"+
		"\2\u00a2\u00a3\5 \21\2\u00a3\u00af\3\2\2\2\u00a4\u00a5\7\35\2\2\u00a5"+
		"\u00a6\5\34\17\2\u00a6\u00a7\7\36\2\2\u00a7\u00af\3\2\2\2\u00a8\u00a9"+
		"\7\26\2\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7\36\2"+
		"\2\u00ac\u00af\3\2\2\2\u00ad\u00af\5 \21\2\u00ae\u00a0\3\2\2\2\u00ae\u00a4"+
		"\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b6\3\2\2\2\u00b0"+
		"\u00b1\f\7\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\5\34\17\b\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\35\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\20\1"+
		"\2\u00ba\u00bb\7\"\2\2\u00bb\u00c5\5\36\20\6\u00bc\u00bd\7\35\2\2\u00bd"+
		"\u00be\5\36\20\2\u00be\u00bf\7\36\2\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1"+
		"\5\34\17\2\u00c1\u00c2\5*\26\2\u00c2\u00c3\5\34\17\2\u00c3\u00c5\3\2\2"+
		"\2\u00c4\u00b9\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00cb"+
		"\3\2\2\2\u00c6\u00c7\f\3\2\2\u00c7\u00c8\t\3\2\2\u00c8\u00ca\5\36\20\4"+
		"\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d5\7\26\2\2\u00cf"+
		"\u00d0\7\37\2\2\u00d0\u00d5\7\26\2\2\u00d1\u00d5\7\27\2\2\u00d2\u00d5"+
		"\7\f\2\2\u00d3\u00d5\7\r\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5!\3\2\2\2"+
		"\u00d6\u00d9\5$\23\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9#\3\2\2\2\u00da\u00df\7\26\2\2\u00db\u00dc\7\26\2\2\u00dc"+
		"\u00dd\7\25\2\2\u00dd\u00df\5$\23\2\u00de\u00da\3\2\2\2\u00de\u00db\3"+
		"\2\2\2\u00df%\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2\u00e2\u00e5"+
		"\7 \2\2\u00e3\u00e5\7\37\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		")\3\2\2\2\u00e6\u00ee\7#\2\2\u00e7\u00ee\7%\2\2\u00e8\u00ee\7&\2\2\u00e9"+
		"\u00ee\7\'\2\2\u00ea\u00ee\7(\2\2\u00eb\u00ee\7)\2\2\u00ec\u00ee\7*\2"+
		"\2\u00ed\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9"+
		"\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"+\3\2\2\2\23\659KZdo{\u009e\u00ae\u00b6\u00c4\u00cb\u00d4\u00d8\u00de"+
		"\u00e4\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}