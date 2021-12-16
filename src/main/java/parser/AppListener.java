package parser;
// Generated from App.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AppParser}.
 */
public interface AppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AppParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(AppParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(AppParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(AppParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(AppParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#if_loop}.
	 * @param ctx the parse tree
	 */
	void enterIf_loop(AppParser.If_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#if_loop}.
	 * @param ctx the parse tree
	 */
	void exitIf_loop(AppParser.If_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#elif_loop}.
	 * @param ctx the parse tree
	 */
	void enterElif_loop(AppParser.Elif_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#elif_loop}.
	 * @param ctx the parse tree
	 */
	void exitElif_loop(AppParser.Elif_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(AppParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(AppParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AppParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AppParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(AppParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(AppParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(AppParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(AppParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(AppParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(AppParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AppParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AppParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(AppParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(AppParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AppParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(AppParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(AppParser.For_loopContext ctx);
}