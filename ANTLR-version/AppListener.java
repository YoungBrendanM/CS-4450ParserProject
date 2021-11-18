// Generated from App.g4 by ANTLR 4.9.3
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
	 * Enter a parse tree produced by {@link AppParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(AppParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AppParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(AppParser.CommentContext ctx);
}