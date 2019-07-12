package ccal;

import ccal_gen.ccalBaseVisitor;
import ccal_gen.ccalParser;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ccalSemanticVisitor extends ccalBaseVisitor<Boolean> {
    private static String scope;
    SymbolTable symbolTable = new SymbolTable();
    private final ArrayList<String> uncalledFunctions = new ArrayList<>();

    @Override
    public Boolean visitProgram(ccalParser.ProgramContext ctx) {
        scope = "global";
        if (uncalledFunctions.size() > 0) {
            System.out.println("Error: Not all functions called");
        }
        return visitChildren(ctx);
    }

    @Override
    public Boolean visitAssignmentStatement(ccalParser.AssignmentStatementContext ctx) {
        String id = ctx.ID().getText();

        SymbolTableEntry entry = symbolTable.get(id);
        if (!id.equalsIgnoreCase(entry.id)) {
            System.out.println("Error: " + id + " not declared before use");
        }
        return visitChildren(ctx);
    }

    @Override
    public Boolean visitMain(ccalParser.MainContext ctx) {
        scope = "main";
        return visitChildren(ctx);
    }

    @Override
    public Boolean visitConst_decl(ccalParser.Const_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        SymbolTableEntry entry = symbolTable.get(id);
        if (id.equals(entry.id) && scope.equals(entry.scope)) {
            System.out.println("Error: " + id + " already declared in scope");
        }
        else { symbolTable.put(id, type, scope);}
        return visitChildren(ctx);
    }

    @Override
    public Boolean visitVar_decl(ccalParser.Var_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        SymbolTableEntry variable = symbolTable.get(id);
        if (id.equals(variable.id) && scope.equals(variable.scope)) {
            System.out.println("Error: " + id + " already declared in scope");
        } else {
            symbolTable.put(id, type, scope);
        }
        return visitChildren(ctx);
    }

    @Override
    public Boolean visitFunction(ccalParser.FunctionContext ctx) {
        symbolTable.openScope();

        if (ctx.parameter_list().nemp_paramerter_list() != null) {
            List<TerminalNode> lstIds = (List<TerminalNode>) ctx.parameter_list().nemp_paramerter_list().nemp_paramerter_list().ID();
            List<ccalParser.TypeContext> lstTypes = (List<ccalParser.TypeContext>) ctx.parameter_list().nemp_paramerter_list().type();
            Iterator<TerminalNode> iterID = lstIds.iterator();
            Iterator<ccalParser.TypeContext> iterTypes = lstTypes.iterator();

            while (iterID.hasNext() && iterTypes.hasNext()) {
                symbolTable.put(String.valueOf(iterID.next()), iterTypes.next().getText(), "function_param: " + ctx.ID().getText());
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Boolean visitDecl(ccalParser.DeclContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType(ccalParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComparison_op(ccalParser.Comparison_opContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFragment_(ccalParser.Fragment_Context ctx) {
        return null;
    }

    @Override
    public Boolean visitBinary_arith_op(ccalParser.Binary_arith_opContext ctx) {
        return null;
    }

    @Override
    public Boolean visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Boolean visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Boolean visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Boolean visitErrorNode(ErrorNode errorNode) {
        return null;
    }

    @Override
    public Boolean visitArgumentStatement(ccalParser.ArgumentStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBlockStatement(ccalParser.BlockStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfStatement(ccalParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWhileStatement(ccalParser.WhileStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSkipStatement(ccalParser.SkipStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinaryOperation(ccalParser.BinaryOperationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionOperation(ccalParser.ExpressionOperationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitArgumentOperation(ccalParser.ArgumentOperationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFragmentOperation(ccalParser.FragmentOperationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNegationCondition(ccalParser.NegationConditionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAndOrCondition(ccalParser.AndOrConditionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComparisonCondition(ccalParser.ComparisonConditionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInnerCondition(ccalParser.InnerConditionContext ctx) {
        return null;
    }

}