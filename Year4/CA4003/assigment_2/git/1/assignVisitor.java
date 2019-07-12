package git;// Generated from assign.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link assignParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface assignVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link assignParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(assignParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStm}
	 * labeled alternative in {@link assignParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStm(assignParser.AssignStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgStm}
	 * labeled alternative in {@link assignParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgStm(assignParser.ArgStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStm}
	 * labeled alternative in {@link assignParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStm(assignParser.BlockStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStm}
	 * labeled alternative in {@link assignParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStm(assignParser.IfStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStm}
	 * labeled alternative in {@link assignParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStm(assignParser.WhileStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link assignParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(assignParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link assignParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(assignParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link assignParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(assignParser.ExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgOp}
	 * labeled alternative in {@link assignParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgOp(assignParser.ArgOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FragOp}
	 * labeled alternative in {@link assignParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragOp(assignParser.FragOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link assignParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegCond(assignParser.NegCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrAndCond}
	 * labeled alternative in {@link assignParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAndCond(assignParser.OrAndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpCond}
	 * labeled alternative in {@link assignParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpCond(assignParser.CompOpCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LRCond}
	 * labeled alternative in {@link assignParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLRCond(assignParser.LRCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(assignParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#stmblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmblock(assignParser.StmblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(assignParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(assignParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(assignParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#decl_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_lst(assignParser.Decl_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(assignParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#func_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_lst(assignParser.Func_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#para_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_lst(assignParser.Para_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#nemp_paralst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_paralst(assignParser.Nemp_paralstContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#nemp_arglst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_arglst(assignParser.Nemp_arglstContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#arglst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglst(assignParser.ArglstContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(assignParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(assignParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(assignParser.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link assignParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_arith_op(assignParser.Bin_arith_opContext ctx);
}