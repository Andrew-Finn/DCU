package ccal_gen;// Generated from /home/andfinn/PycharmProjects/DCU/Year4/CA4003/assigment_2/ccal.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccalParser}.
 */
public interface ccalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramStatement}
	 * labeled alternative in {@link ccalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramStatement(ccalParser.ProgramStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramStatement}
	 * labeled alternative in {@link ccalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramStatement(ccalParser.ProgramStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclListStatement}
	 * labeled alternative in {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclListStatement(ccalParser.DeclListStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclListStatement}
	 * labeled alternative in {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclListStatement(ccalParser.DeclListStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclListStatementEmpt}
	 * labeled alternative in {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclListStatementEmpt(ccalParser.DeclListStatementEmptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclListStatementEmpt}
	 * labeled alternative in {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclListStatementEmpt(ccalParser.DeclListStatementEmptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ccalParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ccalParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(ccalParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(ccalParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclarationStatement}
	 * labeled alternative in {@link ccalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(ccalParser.VarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclarationStatement}
	 * labeled alternative in {@link ccalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(ccalParser.VarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantDeclarationStatement}
	 * labeled alternative in {@link ccalParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarationStatement(ccalParser.ConstantDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantDeclarationStatement}
	 * labeled alternative in {@link ccalParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarationStatement(ccalParser.ConstantDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionListStatement}
	 * labeled alternative in {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunctionListStatement(ccalParser.FunctionListStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionListStatement}
	 * labeled alternative in {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunctionListStatement(ccalParser.FunctionListStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionListStatementEmpty}
	 * labeled alternative in {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunctionListStatementEmpty(ccalParser.FunctionListStatementEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionListStatementEmpty}
	 * labeled alternative in {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunctionListStatementEmpty(ccalParser.FunctionListStatementEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#epsilon}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon(ccalParser.EpsilonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#epsilon}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon(ccalParser.EpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationStatement}
	 * labeled alternative in {@link ccalParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationStatement(ccalParser.FunctionDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationStatement}
	 * labeled alternative in {@link ccalParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationStatement(ccalParser.FunctionDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ccalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ccalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ccalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ccalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterListEmpty}
	 * labeled alternative in {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameterListEmpty(ccalParser.ParameterListEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterListEmpty}
	 * labeled alternative in {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameterListEmpty(ccalParser.ParameterListEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterStatement}
	 * labeled alternative in {@link ccalParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameterStatement(ccalParser.ParameterStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterStatement}
	 * labeled alternative in {@link ccalParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameterStatement(ccalParser.ParameterStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterStatements}
	 * labeled alternative in {@link ccalParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameterStatements(ccalParser.ParameterStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterStatements}
	 * labeled alternative in {@link ccalParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameterStatements(ccalParser.ParameterStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link ccalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(ccalParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link ccalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(ccalParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(ccalParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(ccalParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBlockEmpty}
	 * labeled alternative in {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlockEmpty(ccalParser.StatementBlockEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBlockEmpty}
	 * labeled alternative in {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlockEmpty(ccalParser.StatementBlockEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ccalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ccalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArgumentStatement(ccalParser.ArgumentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArgumentStatement(ccalParser.ArgumentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ccalParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ccalParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ccalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ccalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ccalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ccalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSkipStatement(ccalParser.SkipStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSkipStatement(ccalParser.SkipStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(ccalParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(ccalParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOperation}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperation(ccalParser.ExpressionOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOperation}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperation(ccalParser.ExpressionOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(ccalParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(ccalParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FragmentReference}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFragmentReference(ccalParser.FragmentReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FragmentReference}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFragmentReference(ccalParser.FragmentReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionOperator}
	 * labeled alternative in {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOperator(ccalParser.AdditionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionOperator}
	 * labeled alternative in {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOperator(ccalParser.AdditionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionOperator}
	 * labeled alternative in {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionOperator(ccalParser.SubtractionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionOperator}
	 * labeled alternative in {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionOperator(ccalParser.SubtractionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterIDFragment(ccalParser.IDFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitIDFragment(ccalParser.IDFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegatedIDFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterNegatedIDFragment(ccalParser.NegatedIDFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegatedIDFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitNegatedIDFragment(ccalParser.NegatedIDFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerFragent}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterIntegerFragent(ccalParser.IntegerFragentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerFragent}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitIntegerFragent(ccalParser.IntegerFragentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterTrueFragment(ccalParser.TrueFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitTrueFragment(ccalParser.TrueFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterFalseFragment(ccalParser.FalseFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitFalseFragment(ccalParser.FalseFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFragment(ccalParser.ExpressionFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFragment(ccalParser.ExpressionFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterComparisonCondition(ccalParser.ComparisonConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitComparisonCondition(ccalParser.ComparisonConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndOrCondition(ccalParser.AndOrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndOrCondition(ccalParser.AndOrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNegationCondition(ccalParser.NegationConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNegationCondition(ccalParser.NegationConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterInnerCondition(ccalParser.InnerConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitInnerCondition(ccalParser.InnerConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(ccalParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(ccalParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterEqualOperator(ccalParser.EqualOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitEqualOperator(ccalParser.EqualOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualOperator(ccalParser.NotEqualOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualOperator(ccalParser.NotEqualOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOperator(ccalParser.LessThanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOperator(ccalParser.LessThanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqualOperator(ccalParser.LessThanEqualOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqualOperator(ccalParser.LessThanEqualOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOperator(ccalParser.GreaterThanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOperator(ccalParser.GreaterThanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqualOperator(ccalParser.GreaterThanEqualOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqualOperator(ccalParser.GreaterThanEqualOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ccalParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ccalParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListEmpty}
	 * labeled alternative in {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListEmpty(ccalParser.ArgumentListEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListEmpty}
	 * labeled alternative in {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListEmpty(ccalParser.ArgumentListEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdArgumentListRef}
	 * labeled alternative in {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterIdArgumentListRef(ccalParser.IdArgumentListRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdArgumentListRef}
	 * labeled alternative in {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitIdArgumentListRef(ccalParser.IdArgumentListRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiArgumentListRef}
	 * labeled alternative in {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgumentListRef(ccalParser.MultiArgumentListRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiArgumentListRef}
	 * labeled alternative in {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgumentListRef(ccalParser.MultiArgumentListRefContext ctx);
}