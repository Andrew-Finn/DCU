package calBase;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CALParser}.
 */
public interface CALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progStm}
	 * labeled alternative in {@link CALParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgStm(CALParser.ProgStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progStm}
	 * labeled alternative in {@link CALParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgStm(CALParser.ProgStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declListStm}
	 * labeled alternative in {@link CALParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclListStm(CALParser.DeclListStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declListStm}
	 * labeled alternative in {@link CALParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclListStm(CALParser.DeclListStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclRef}
	 * labeled alternative in {@link CALParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclRef(CALParser.VarDeclRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclRef}
	 * labeled alternative in {@link CALParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclRef(CALParser.VarDeclRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constDeclRef}
	 * labeled alternative in {@link CALParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclRef(CALParser.ConstDeclRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constDeclRef}
	 * labeled alternative in {@link CALParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclRef(CALParser.ConstDeclRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclStm}
	 * labeled alternative in {@link CALParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStm(CALParser.VarDeclStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclStm}
	 * labeled alternative in {@link CALParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStm(CALParser.VarDeclStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constDeclStm}
	 * labeled alternative in {@link CALParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclStm(CALParser.ConstDeclStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constDeclStm}
	 * labeled alternative in {@link CALParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclStm(CALParser.ConstDeclStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcListStm}
	 * labeled alternative in {@link CALParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFuncListStm(CALParser.FuncListStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcListStm}
	 * labeled alternative in {@link CALParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFuncListStm(CALParser.FuncListStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDeclStm}
	 * labeled alternative in {@link CALParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclStm(CALParser.FuncDeclStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDeclStm}
	 * labeled alternative in {@link CALParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclStm(CALParser.FuncDeclStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CALParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CALParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonEmptyParamRef}
	 * labeled alternative in {@link CALParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyParamRef(CALParser.NonEmptyParamRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonEmptyParamRef}
	 * labeled alternative in {@link CALParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyParamRef(CALParser.NonEmptyParamRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleParamStm}
	 * labeled alternative in {@link CALParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleParamStm(CALParser.SingleParamStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleParamStm}
	 * labeled alternative in {@link CALParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleParamStm(CALParser.SingleParamStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleParamStm}
	 * labeled alternative in {@link CALParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void enterMultipleParamStm(CALParser.MultipleParamStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleParamStm}
	 * labeled alternative in {@link CALParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void exitMultipleParamStm(CALParser.MultipleParamStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainStm}
	 * labeled alternative in {@link CALParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMainStm(CALParser.MainStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainStm}
	 * labeled alternative in {@link CALParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMainStm(CALParser.MainStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmBlockRef}
	 * labeled alternative in {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStmBlockRef(CALParser.StmBlockRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmBlockRef}
	 * labeled alternative in {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStmBlockRef(CALParser.StmBlockRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatment}
	 * labeled alternative in {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatment(CALParser.EmptyStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatment}
	 * labeled alternative in {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatment(CALParser.EmptyStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStm(CALParser.AssignStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStm(CALParser.AssignStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallStm(CALParser.FuncCallStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallStm(CALParser.FuncCallStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeginStm(CALParser.BeginStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeginStm(CALParser.BeginStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStm(CALParser.ConditionalStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStm(CALParser.ConditionalStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStm(CALParser.WhileStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStm(CALParser.WhileStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSkipStm(CALParser.SkipStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipStm}
	 * labeled alternative in {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSkipStm(CALParser.SkipStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpreStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpreStm(CALParser.ParenExpreStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpreStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpreStm(CALParser.ParenExpreStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fragRef}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFragRef(CALParser.FragRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fragRef}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFragRef(CALParser.FragRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fragBinArithStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFragBinArithStm(CALParser.FragBinArithStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fragBinArithStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFragBinArithStm(CALParser.FragBinArithStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fragUnaArithStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFragUnaArithStm(CALParser.FragUnaArithStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fragUnaArithStm}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFragUnaArithStm(CALParser.FragUnaArithStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(CALParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link CALParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(CALParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNegStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBoolNegStm(CALParser.BoolNegStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNegStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBoolNegStm(CALParser.BoolNegStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenConditionalStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenConditionalStm(CALParser.ParenConditionalStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenConditionalStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenConditionalStm(CALParser.ParenConditionalStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolEvalStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBoolEvalStm(CALParser.BoolEvalStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolEvalStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBoolEvalStm(CALParser.BoolEvalStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolArithStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBoolArithStm(CALParser.BoolArithStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolArithStm}
	 * labeled alternative in {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBoolArithStm(CALParser.BoolArithStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idFrag}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void enterIdFrag(CALParser.IdFragContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idFrag}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void exitIdFrag(CALParser.IdFragContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negationStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void enterNegationStm(CALParser.NegationStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negationStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void exitNegationStm(CALParser.NegationStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void enterIntStm(CALParser.IntStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void exitIntStm(CALParser.IntStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void enterTrueStm(CALParser.TrueStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void exitTrueStm(CALParser.TrueStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void enterFalseStm(CALParser.FalseStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseStm}
	 * labeled alternative in {@link CALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void exitFalseStm(CALParser.FalseStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonEmptyArgListRef}
	 * labeled alternative in {@link CALParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyArgListRef(CALParser.NonEmptyArgListRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonEmptyArgListRef}
	 * labeled alternative in {@link CALParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyArgListRef(CALParser.NonEmptyArgListRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idArgRef}
	 * labeled alternative in {@link CALParser#nemp_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterIdArgRef(CALParser.IdArgRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idArgRef}
	 * labeled alternative in {@link CALParser#nemp_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitIdArgRef(CALParser.IdArgRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multIdArgRef}
	 * labeled alternative in {@link CALParser#nemp_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterMultIdArgRef(CALParser.MultIdArgRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multIdArgRef}
	 * labeled alternative in {@link CALParser#nemp_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitMultIdArgRef(CALParser.MultIdArgRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStm}
	 * labeled alternative in {@link CALParser#empty_statment}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStm(CALParser.EmptyStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStm}
	 * labeled alternative in {@link CALParser#empty_statment}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStm(CALParser.EmptyStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionStm}
	 * labeled alternative in {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterAdditionStm(CALParser.AdditionStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionStm}
	 * labeled alternative in {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitAdditionStm(CALParser.AdditionStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionStm}
	 * labeled alternative in {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionStm(CALParser.SubtractionStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionStm}
	 * labeled alternative in {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionStm(CALParser.SubtractionStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logOr}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogOr(CALParser.LogOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logOr}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogOr(CALParser.LogOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logEq}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogEq(CALParser.LogEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logEq}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogEq(CALParser.LogEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logNEq}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogNEq(CALParser.LogNEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logNEq}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogNEq(CALParser.LogNEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logLT}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogLT(CALParser.LogLTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logLT}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogLT(CALParser.LogLTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logLTE}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogLTE(CALParser.LogLTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logLTE}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogLTE(CALParser.LogLTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logGT}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogGT(CALParser.LogGTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logGT}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogGT(CALParser.LogGTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logGTE}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogGTE(CALParser.LogGTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logGTE}
	 * labeled alternative in {@link CALParser#comp_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogGTE(CALParser.LogGTEContext ctx);
}