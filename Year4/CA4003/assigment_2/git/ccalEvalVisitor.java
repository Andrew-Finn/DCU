package ccal;

import ccal_gen.ccalBaseVisitor;
import ccal_gen.ccalParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Iterator;
import java.util.List;

public class ccalEvalVisitor extends ccalBaseVisitor<String> {
    private final cal.SymbolTable st;

    public ccalEvalVisitor() {
        st = new cal.SymbolTable();
    }

    @Override
    public String visitProgram(ccalParser.ProgramContext ctx) {
        st.put("BEGINBLOCK", "NULL");
        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        if (ctx.function_list() != null)
            visit(ctx.function_list());
        if (ctx.MAIN() != null)
            visit(ctx.MAIN());
        st.put("ENDBLOCK", "NULL");
        return "";
    }


    @Override
    public String visitAssignmentStatement(ccalParser.AssignmentStatementContext ctx) {
        String id = ctx.ID().getText();
        String exp_type = visit(ctx.expression());

        boolean instantiated;
        instantiated = st.contains(id);

        if (!instantiated) {
            System.out.println("Error @ Line: " + ctx.start.getLine());
            System.out.println("Variable: \"" + id + "\" has not been instantiated.");
            System.exit(0);
        }

        if (exp_type != null && exp_type.contains("_")) {
            String returnType = exp_type.split("_")[0];
            String type = st.get(id);
            if (!type.equals(returnType)) {
                System.out.println("Error @ Line: " + ctx.start.getLine());
                System.out.println("The return value assigned to \"" + id + "\" does not match the defined type \"" + type + "\".");
                System.exit(0);
            }
        }

        return id;
    }

    @Override
    public String visitMain(ccalParser.MainContext ctx) {
        scope = "main";
        return visitChildren(ctx);
    }

    @Override
    public String visitConst_decl(ccalParser.Const_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        st.put(id, type);
        return ctx.ID().getText();
    }

    @Override
    public String visitVar_decl(ccalParser.Var_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        st.put(id, type);
        return id;
    }


    @Override
    public String visitFunction(ccalParser.FunctionContext ctx) {
        if (ctx.() != null)
            visit(ctx.function());
        if (ctx.function_list() != null)
            visit(ctx.function_list());
        return "";
    }

    @Override
    public String visitDecl(ccalParser.DeclContext ctx) {
        return null;
    }

    @Override
    public String visitType(ccalParser.TypeContext ctx) {
        return null;
    }

    @Override
    public String visitComparison_op(ccalParser.Comparison_opContext ctx) {
        return null;
    }

    @Override
    public String visitFragment_(ccalParser.Fragment_Context ctx) {
        return null;
    }

    @Override
    public String visitBinary_arith_op(ccalParser.Binary_arith_opContext ctx) {
        return null;
    }

    @Override
    public String visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }

    @Override
    public String visitArgumentStatement(ccalParser.ArgumentStatementContext ctx) {
        return null;
    }

    @Override
    public String visitBlockStatement(ccalParser.BlockStatementContext ctx) {
        return null;
    }

    @Override
    public String visitIfStatement(ccalParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public String visitWhileStatement(ccalParser.WhileStatementContext ctx) {
        return null;
    }

    @Override
    public String visitSkipStatement(ccalParser.SkipStatementContext ctx) {
        return null;
    }

    @Override
    public String visitBinaryOperation(ccalParser.BinaryOperationContext ctx) {
        boolean isInt = true;

        if (ctx.fragment_(0) != null)
            isInt = isInt && visit(ctx.fragment_(0)).equals("integer");

        if (ctx.fragment_(1) != null)
            isInt = isInt && visit(ctx.fragment_(1)).equals("integer");

        if (!isInt) {
            System.out.println("Error @ Line " + ctx.start.getLine());
            System.out.println("You are trying to preform an arithmetic operation using one or more non-integer values.");
            System.exit(0);
        }
        return "integer";
    }

    @Override
    public String visitExpressionOperation(ccalParser.ExpressionOperationContext ctx) {
        return null;
    }

    @Override
    public String visitArgumentOperation(ccalParser.ArgumentOperationContext ctx) {
        return null;
    }

    @Override
    public String visitFragmentOperation(ccalParser.FragmentOperationContext ctx) {
        return null;
    }

    @Override
    public String visitNegationCondition(ccalParser.NegationConditionContext ctx) {
        return null;
    }

    @Override
    public String visitAndOrCondition(ccalParser.AndOrConditionContext ctx) {
        return null;
    }

    @Override
    public String visitComparisonCondition(ccalParser.ComparisonConditionContext ctx) {
        return null;
    }

    @Override
    public String visitInnerCondition(ccalParser.InnerConditionContext ctx) {
        return null;
    }

}