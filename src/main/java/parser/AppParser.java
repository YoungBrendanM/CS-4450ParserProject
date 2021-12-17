package parser;
// Generated from App.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, END=5, IF=6, ELIF=7, ELSE=8, WHILE=9, 
		FOR=10, IN=11, BOOLEAN=12, CONJOIN_CONDITION=13, STRING=14, CONDITION=15, 
		ASSIGN_OPERATORS=16, ARITH_OPERATORS=17, COMMENT=18, ID=19, MINUS=20, 
		NUMBER=21, NEWLINE=22, WHITESPACE=23, SPEC_CHAR=24;
	public static final int
		RULE_s = 0, RULE_while_loop = 1, RULE_if_loop = 2, RULE_elif_loop = 3, 
		RULE_else_part = 4, RULE_function = 5, RULE_comment = 6, RULE_definition = 7, 
		RULE_conditional_statement = 8, RULE_value = 9, RULE_equation = 10, RULE_for_loop = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "while_loop", "if_loop", "elif_loop", "else_part", "function", "comment", 
			"definition", "conditional_statement", "value", "equation", "for_loop"
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

	@Override
	public String getGrammarFileName() { return "App.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public If_loopContext if_loop() {
			return getRuleContext(If_loopContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AppParser.NEWLINE, 0); }
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AppParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				comment();
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(25);
					s();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				if_loop();
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(29);
					s();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				definition();
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(33);
					s();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(NEWLINE);
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(37);
					s();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				while_loop();
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(41);
					s();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				function();
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(45);
					s();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				for_loop();
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(49);
					s();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				match(EOF);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AppParser.WHILE, 0); }
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode END() { return getToken(AppParser.END, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(WHILE);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(56);
				match(T__0);
				}
			}

			setState(59);
			conditional_statement();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(60);
				match(T__1);
				}
			}

			setState(63);
			match(T__2);
			setState(64);
			s();
			setState(65);
			match(END);
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

	public static class If_loopContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AppParser.IF, 0); }
		public List<Conditional_statementContext> conditional_statement() {
			return getRuleContexts(Conditional_statementContext.class);
		}
		public Conditional_statementContext conditional_statement(int i) {
			return getRuleContext(Conditional_statementContext.class,i);
		}
		public TerminalNode END() { return getToken(AppParser.END, 0); }
		public List<TerminalNode> CONJOIN_CONDITION() { return getTokens(AppParser.CONJOIN_CONDITION); }
		public TerminalNode CONJOIN_CONDITION(int i) {
			return getToken(AppParser.CONJOIN_CONDITION, i);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AppParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AppParser.NEWLINE, i);
		}
		public List<Elif_loopContext> elif_loop() {
			return getRuleContexts(Elif_loopContext.class);
		}
		public Elif_loopContext elif_loop(int i) {
			return getRuleContext(Elif_loopContext.class,i);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterIf_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitIf_loop(this);
		}
	}

	public final If_loopContext if_loop() throws RecognitionException {
		If_loopContext _localctx = new If_loopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(68);
				match(T__0);
				}
			}

			setState(71);
			conditional_statement();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJOIN_CONDITION) {
				{
				{
				setState(72);
				match(CONJOIN_CONDITION);
				setState(73);
				conditional_statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(79);
				match(T__1);
				}
			}

			setState(82);
			match(T__2);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(83);
				s();
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(86);
				match(T__3);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(89);
				match(NEWLINE);
				}
			}

			setState(92);
			match(END);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(93);
				match(NEWLINE);
				}
				break;
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(96);
				elif_loop();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(102);
				else_part();
				}
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

	public static class Elif_loopContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(AppParser.ELIF, 0); }
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode END() { return getToken(AppParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(AppParser.NEWLINE, 0); }
		public Elif_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterElif_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitElif_loop(this);
		}
	}

	public final Elif_loopContext elif_loop() throws RecognitionException {
		Elif_loopContext _localctx = new Elif_loopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elif_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ELIF);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(106);
				match(T__0);
				}
			}

			setState(109);
			conditional_statement();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(110);
				match(T__1);
				}
			}

			setState(113);
			match(T__2);
			setState(114);
			s();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(115);
				match(T__3);
				}
			}

			setState(118);
			match(END);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(119);
				match(NEWLINE);
				}
				break;
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

	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AppParser.ELSE, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AppParser.NEWLINE, 0); }
		public TerminalNode END() { return getToken(AppParser.END, 0); }
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ELSE);
			setState(123);
			match(T__2);
			setState(124);
			s();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(125);
				match(T__3);
				}
			}

			setState(128);
			match(NEWLINE);
			setState(129);
			match(END);
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
		public TerminalNode ID() { return getToken(AppParser.ID, 0); }
		public List<TerminalNode> SPEC_CHAR() { return getTokens(AppParser.SPEC_CHAR); }
		public TerminalNode SPEC_CHAR(int i) {
			return getToken(AppParser.SPEC_CHAR, i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> ARITH_OPERATORS() { return getTokens(AppParser.ARITH_OPERATORS); }
		public TerminalNode ARITH_OPERATORS(int i) {
			return getToken(AppParser.ARITH_OPERATORS, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(T__0);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(133);
						match(SPEC_CHAR);
						}
						break;
					case 2:
						{
						setState(134);
						equation();
						}
						break;
					case 3:
						{
						setState(135);
						function();
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					match(ARITH_OPERATORS);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(147);
						match(SPEC_CHAR);
						}
						break;
					case 2:
						{
						setState(148);
						equation();
						}
						break;
					case 3:
						{
						setState(149);
						function();
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					match(ARITH_OPERATORS);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUMBER) | (1L << SPEC_CHAR))) != 0)) {
				{
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(161);
					match(SPEC_CHAR);
					}
					break;
				case 2:
					{
					setState(162);
					equation();
					}
					break;
				case 3:
					{
					setState(163);
					function();
					}
					break;
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARITH_OPERATORS) {
				{
				{
				setState(169);
				match(ARITH_OPERATORS);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__1);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(AppParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(COMMENT);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AppParser.ID, 0); }
		public TerminalNode ASSIGN_OPERATORS() { return getToken(AppParser.ASSIGN_OPERATORS, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(ASSIGN_OPERATORS);
			setState(181);
			equation();
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public TerminalNode CONDITION() { return getToken(AppParser.CONDITION, 0); }
		public TerminalNode CONJOIN_CONDITION() { return getToken(AppParser.CONJOIN_CONDITION, 0); }
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			equation();
			setState(184);
			match(CONDITION);
			setState(185);
			equation();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(186);
				match(CONJOIN_CONDITION);
				setState(187);
				conditional_statement();
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AppParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(AppParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AppParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(AppParser.BOOLEAN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class EquationContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ARITH_OPERATORS() { return getToken(AppParser.ARITH_OPERATORS, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equation);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				value();
				setState(194);
				match(ARITH_OPERATORS);
				setState(195);
				equation();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AppParser.FOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IN() { return getToken(AppParser.IN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode END() { return getToken(AppParser.END, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppListener ) ((AppListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(FOR);
			setState(200);
			value();
			setState(201);
			match(IN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(202);
				match(T__0);
				}
			}

			setState(205);
			function();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(206);
				match(T__1);
				}
			}

			setState(209);
			match(T__2);
			setState(210);
			s();
			setState(211);
			match(END);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\2\3\2\5\2!\n\2\3\2\3\2\5\2"+
		"%\n\2\3\2\3\2\5\2)\n\2\3\2\3\2\5\2-\n\2\3\2\3\2\5\2\61\n\2\3\2\3\2\5\2"+
		"\65\n\2\3\2\5\28\n\2\3\3\3\3\5\3<\n\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\5\4S\n\4\3\4"+
		"\3\4\5\4W\n\4\3\4\5\4Z\n\4\3\4\5\4]\n\4\3\4\3\4\5\4a\n\4\3\4\7\4d\n\4"+
		"\f\4\16\4g\13\4\3\4\5\4j\n\4\3\5\3\5\5\5n\n\5\3\5\3\5\5\5r\n\5\3\5\3\5"+
		"\3\5\5\5w\n\5\3\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\7\7\7\u0091"+
		"\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7"+
		"\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\3\7\3\7\7\7\u00a7\n\7\f\7\16"+
		"\7\u00aa\13\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00c8\n\f\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\r\3\r\5\r\u00d2"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\6\2"+
		"\16\16\20\20\25\25\27\27\2\u00f9\2\67\3\2\2\2\49\3\2\2\2\6E\3\2\2\2\b"+
		"k\3\2\2\2\n|\3\2\2\2\f\u0085\3\2\2\2\16\u00b3\3\2\2\2\20\u00b5\3\2\2\2"+
		"\22\u00b9\3\2\2\2\24\u00c0\3\2\2\2\26\u00c7\3\2\2\2\30\u00c9\3\2\2\2\32"+
		"\34\5\16\b\2\33\35\5\2\2\2\34\33\3\2\2\2\34\35\3\2\2\2\358\3\2\2\2\36"+
		" \5\6\4\2\37!\5\2\2\2 \37\3\2\2\2 !\3\2\2\2!8\3\2\2\2\"$\5\20\t\2#%\5"+
		"\2\2\2$#\3\2\2\2$%\3\2\2\2%8\3\2\2\2&(\7\30\2\2\')\5\2\2\2(\'\3\2\2\2"+
		"()\3\2\2\2)8\3\2\2\2*,\5\4\3\2+-\5\2\2\2,+\3\2\2\2,-\3\2\2\2-8\3\2\2\2"+
		".\60\5\f\7\2/\61\5\2\2\2\60/\3\2\2\2\60\61\3\2\2\2\618\3\2\2\2\62\64\5"+
		"\30\r\2\63\65\5\2\2\2\64\63\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\668\7\2"+
		"\2\3\67\32\3\2\2\2\67\36\3\2\2\2\67\"\3\2\2\2\67&\3\2\2\2\67*\3\2\2\2"+
		"\67.\3\2\2\2\67\62\3\2\2\2\67\66\3\2\2\28\3\3\2\2\29;\7\13\2\2:<\7\3\2"+
		"\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5\22\n\2>@\7\4\2\2?>\3\2\2\2?@\3\2"+
		"\2\2@A\3\2\2\2AB\7\5\2\2BC\5\2\2\2CD\7\7\2\2D\5\3\2\2\2EG\7\b\2\2FH\7"+
		"\3\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IN\5\22\n\2JK\7\17\2\2KM\5\22\n\2"+
		"LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\7\4\2\2"+
		"RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\5\2\2UW\5\2\2\2VU\3\2\2\2VW\3\2\2\2"+
		"WY\3\2\2\2XZ\7\6\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\7\30\2\2\\[\3\2"+
		"\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\7\2\2_a\7\30\2\2`_\3\2\2\2`a\3\2\2\2ae\3"+
		"\2\2\2bd\5\b\5\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2hj\5\n\6\2ih\3\2\2\2ij\3\2\2\2j\7\3\2\2\2km\7\t\2\2ln\7\3\2\2ml"+
		"\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\5\22\n\2pr\7\4\2\2qp\3\2\2\2qr\3\2\2\2"+
		"rs\3\2\2\2st\7\5\2\2tv\5\2\2\2uw\7\6\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2"+
		"xz\7\7\2\2y{\7\30\2\2zy\3\2\2\2z{\3\2\2\2{\t\3\2\2\2|}\7\n\2\2}~\7\5\2"+
		"\2~\u0080\5\2\2\2\177\u0081\7\6\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\30\2\2\u0083\u0084\7\7\2\2\u0084"+
		"\13\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u008c\7\3\2\2\u0087\u008b\7\32"+
		"\2\2\u0088\u008b\5\26\f\2\u0089\u008b\5\f\7\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\7\23\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u009a\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0099\7\32\2\2\u0096\u0099\5\26\f\2\u0097\u0099\5\f\7\2\u0098\u0095\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\7\23\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a8\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a7\7\32\2\2\u00a4\u00a7\5\26\f\2\u00a5\u00a7\5\f\7\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\7\23\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2\r\3\2\2\2\u00b3\u00b4\7\24\2"+
		"\2\u00b4\17\3\2\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00b7\7\22\2\2\u00b7\u00b8"+
		"\5\26\f\2\u00b8\21\3\2\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7\21\2\2\u00bb"+
		"\u00be\5\26\f\2\u00bc\u00bd\7\17\2\2\u00bd\u00bf\5\22\n\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1"+
		"\25\3\2\2\2\u00c2\u00c8\5\24\13\2\u00c3\u00c4\5\24\13\2\u00c4\u00c5\7"+
		"\23\2\2\u00c5\u00c6\5\26\f\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\5\24\13"+
		"\2\u00cb\u00cd\7\r\2\2\u00cc\u00ce\7\3\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\5\f\7\2\u00d0\u00d2\7\4\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\5"+
		"\2\2\u00d4\u00d5\5\2\2\2\u00d5\u00d6\7\7\2\2\u00d6\31\3\2\2\2\'\34 $("+
		",\60\64\67;?GNRVY\\`eimqvz\u0080\u008a\u008c\u0092\u0098\u009a\u00a0\u00a6"+
		"\u00a8\u00ae\u00be\u00c7\u00cd\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}