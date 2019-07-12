package ccal_gen;// Generated from /home/andfinn/PycharmProjects/DCU/Year4/CA4003/assigment_2/ccal.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramStatement}
	 * labeled alternative in {@link ccalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStatement(ccalParser.ProgramStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclListStatement}
	 * labeled alternative in {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclListStatement(ccalParser.DeclListStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclListStatementEmpt}
	 * labeled alternative in {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclListStatementEmpt(ccalParser.DeclListStatementEmptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ccalParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ccalParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationStatement}
	 * labeled alternative in {@link ccalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationStatement(ccalParser.VarDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantDeclarationStatement}
	 * labeled alternative in {@link ccalParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarationStatement(ccalParser.ConstantDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionListStatement}
	 * labeled alternative in {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionListStatement(ccalParser.FunctionListStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionListStatementEmpty}
	 * labeled alternative in {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionListStatementEmpty(ccalParser.FunctionListStatementEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#epsilon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon(ccalParser.EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationStatement}
	 * labeled alternative in {@link ccalParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationStatement(ccalParser.FunctionDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ccalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ccalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterListEmpty}
	 * labeled alternative in {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListEmpty(ccalParser.ParameterListEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterStatement}
	 * labeled alternative in {@link ccalParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterStatement(ccalParser.ParameterStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterStatements}
	 * labeled alternative in {@link ccalParser#nemp_paramerter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterStatements(ccalParser.ParameterStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link ccalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(ccalParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(ccalParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBlockEmpty}
	 * labeled alternative in {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlockEmpty(ccalParser.StatementBlockEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(ccalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentStatement(ccalParser.ArgumentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ccalParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ccalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ccalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipStatement}
	 * labeled alternative in {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStatement(ccalParser.SkipStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(ccalParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOperation}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperation(ccalParser.ExpressionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(ccalParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FragmentReference}
	 * labeled alternative in {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentReference(ccalParser.FragmentReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOperator}
	 * labeled alternative in {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOperator(ccalParser.AdditionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionOperator}
	 * labeled alternative in {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionOperator(ccalParser.SubtractionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDFragment(ccalParser.IDFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegatedIDFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedIDFragment(ccalParser.NegatedIDFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerFragent}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFragent(ccalParser.IntegerFragentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFragment(ccalParser.TrueFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseFragment(ccalParser.FalseFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionFragment}
	 * labeled alternative in {@link ccalParser#fragment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionFragment(ccalParser.ExpressionFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonCondition(ccalParser.ComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOrCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrCondition(ccalParser.AndOrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationCondition(ccalParser.NegationConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InnerCondition}
	 * labeled alternative in {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCondition(ccalParser.InnerConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(ccalParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOperator(ccalParser.EqualOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualOperator(ccalParser.NotEqualOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOperator(ccalParser.LessThanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqualOperator(ccalParser.LessThanEqualOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOperator(ccalParser.GreaterThanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanEqualOperator}
	 * labeled alternative in {@link ccalParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqualOperator(ccalParser.GreaterThanEqualOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ccalParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentListEmpty}
	 * labeled alternative in {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListEmpty(ccalParser.ArgumentListEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdArgumentListRef}
	 * labeled alternative in {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArgumentListRef(ccalParser.IdArgumentListRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiArgumentListRef}
	 * labeled alternative in {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgumentListRef(ccalParser.MultiArgumentListRefContext ctx);
}