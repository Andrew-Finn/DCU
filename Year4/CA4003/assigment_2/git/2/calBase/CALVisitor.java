package calBase;

// Generated from cal.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CALParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CALVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code progStm}
	 * labeled alternative in {@link CALParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgStm(CALParser.ProgStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declListStm}
	 * labeled alternative in {@link CALParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclListStm(CALParser.DeclListStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclRef}
	 * labeled alternative in {@link CALParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclRef(CALParser.VarDeclRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constDeclRef}
	 * labeled alternative in {@link CALParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclRef(CALParser.ConstDeclRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStm}
	 * labeled alternative in {@link CALParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStm(CALParser.VarDeclStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constDeclStm}
	 * labeled alternative in {@link CALParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclStm(CALParser.ConstDeclStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcListStm}
	 * labeled alternative in {@link CALParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncListStm(CALParser.FuncListStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDeclStm}
	 * labeled alternative in {@link CALParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclStm(CALParser.FuncDeclStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CALParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonEmptyParamRef}
	 * labeled alternative in {@link CALParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyParamRef(CALParser.NonEmptyParamRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParamStm}
	 * labeled alternative in {@link CALParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParamStm(CALParser.SingleParamStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleParamStm}
	 * labeled alternative in {@link CALParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleParamStm(CALParser.MultipleParamStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainStm}
	 * labeled alternative in {@link CALParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStm(CALParser.MainStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmBlockRef}
	 * labeled alternative in {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmBlockRef(CALParser.StmBlockRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatment}
	 * labeled alternative in {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatment(CALParser.EmptyStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStm(CALParser.AssignStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStm(CALParser.FuncCallStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginStm(CALParser.BeginStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStm(CALParser.ConditionalStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStm(CALParser.WhileStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStm(CALParser.SkipStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpreStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpreStm(CALParser.ParenExpreStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fragRef}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragRef(CALParser.FragRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fragBinArithStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragBinArithStm(CALParser.FragBinArithStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fragUnaArithStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragUnaArithStm(CALParser.FragUnaArithStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(CALParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNegStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNegStm(CALParser.BoolNegStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenConditionalStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenConditionalStm(CALParser.ParenConditionalStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolEvalStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolEvalStm(CALParser.BoolEvalStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolArithStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArithStm(CALParser.BoolArithStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idFrag}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFrag(CALParser.IdFragContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negationStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationStm(CALParser.NegationStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntStm(CALParser.IntStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStm(CALParser.TrueStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStm(CALParser.FalseStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonEmptyArgListRef}
	 * labeled alternative in {@link CALParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyArgListRef(CALParser.NonEmptyArgListRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idArgRef}
	 * labeled alternative in {@link CALParser#nemp_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArgRef(CALParser.IdArgRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multIdArgRef}
	 * labeled alternative in {@link CALParser#nemp_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultIdArgRef(CALParser.MultIdArgRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStm}
	 * labeled alternative in {@link CALParser#empty_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStm(CALParser.EmptyStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionStm}
	 * labeled alternative in {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionStm(CALParser.AdditionStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractionStm}
	 * labeled alternative in {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionStm(CALParser.SubtractionStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logOr}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOr(CALParser.LogOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logEq}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEq(CALParser.LogEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logNEq}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogNEq(CALParser.LogNEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logLT}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogLT(CALParser.LogLTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logLTE}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogLTE(CALParser.LogLTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logGT}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogGT(CALParser.LogGTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logGTE}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogGTE(CALParser.LogGTEContext ctx);
}