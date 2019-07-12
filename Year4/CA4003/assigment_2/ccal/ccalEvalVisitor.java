package ccal;

import ccal_gen.ccalBaseVisitor;
import ccal_gen.ccalParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;


public class ccalEvalVisitor extends ccalBaseVisitor<String> {
    private SymbolTable st;

    public void EvalVisitor() {
        st = new SymbolTable();
    }

    @Override
    public String visitProgramStatement(ccalParser.ProgramStatementContext ctx) {
        st.put("$START_BLOCK", null);
        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        if (ctx.function_list() != null)
            visit(ctx.function_list());
        if (ctx.MAIN() != null)
            visit(ctx.MAIN());
        st.put("$END_BLOCK", null);
        return null;
    }



    @Override
    public String visitDeclListStatement(ccalParser.DeclListStatementContext ctx) {
        if (ctx.decl() != null)
            visit(ctx.decl());
        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        return null;
    }

    @Override
    public String visitVarDeclaration(ccalParser.VarDeclarationContext ctx) {
        return visit(ctx.var_decl());
    }

    @Override
    public String visitConstDeclaration(ccalParser.ConstDeclarationContext ctx) {
        return visit(ctx.const_decl());
    }


    @Override
    public String visitVarDeclarationStatement(ccalParser.VarDeclarationStatementContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        st.put(id, type);
        return id;
    }

    @Override
    public String visitConstantDeclarationStatement(ccalParser.ConstantDeclarationStatementContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        st.put(id, type);
        return ctx.ID().getText();
    }

    @Override
    public String visitFunctionListStatement(ccalParser.FunctionListStatementContext ctx) {
        if (ctx.function() != null)
            visit(ctx.function());
        if (ctx.function_list() != null)
            visit(ctx.function_list());
        return null;
    }

    @Override
    public String visitFunctionDeclarationStatement(ccalParser.FunctionDeclarationStatementContext ctx) {

        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        st.put(id, type);
        st.put("$START_BLOCK", "NULL");

        type = type + "_" + visit(ctx.parameter_list());

        st.set(id, type);

        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        if (ctx.statement_block() != null)
            visit(ctx.statement_block());

        st.put("$END_BLOCK", "NULL");

        return id;
    }

    @Override
    public String visitParameterList(ccalParser.ParameterListContext ctx) {
        if (ctx.nemp_paramerter_list() != null)
            return visit(ctx.nemp_paramerter_list());
        return null;
    }

    @Override
    public String visitParameterStatement(ccalParser.ParameterStatementContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        st.put(id, type);
        return "_" + type;
    }

    @Override
    public String visitParameterStatements(ccalParser.ParameterStatementsContext ctx) {
        if (ctx.ID() != null && ctx.type() != null) {
            st.put(ctx.ID().getText(), ctx.type().getText());
            return ctx.type().getText() + visit(ctx.nemp_paramerter_list());
        }
        if (ctx.nemp_paramerter_list() != null)
            return visit(ctx.nemp_paramerter_list());
        return null;
    }

    @Override
    public String visitMultIdArgRef(ccalParser.MultIdArgRefContext ctx) {
        String type = "";
        if (ctx.ID() != null)
            type += st.get(ctx.ID().getText()) + "_";
        if (ctx.nemp_argument_list() != null)
            return type + visit(ctx.nemp_argument_list());
        return type;
    }

    @Override
    public String visitIdArgRef(ccalParser.IdArgRefContext ctx) {
        if (ctx.ID() != null)
            if (!st.contains(ctx.ID().getText())) {
                System.out.println("ERROR @ " + ctx.start.getLine());
                System.out.println("Variable \"" + ctx.ID() + "\" has not been instantiated.");
            }
        return st.get(ctx.ID().getText());
    }

    @Override
    public String visitMainStatement(ccalParser.MainStatementContext ctx) {
        st.put("$START_BLOCK", null);

        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        if (ctx.statement_block() != null)
            visit(ctx.statement_block());
        st.put("$END_BLOCK", null);
        return null;
    }

    @Override
    public String visitStatementBlock(ccalParser.StatementBlockContext ctx) {
        if (ctx.statement() != null)
            visit(ctx.statement());
        if (ctx.statement_block() != null)
            visitChildren(ctx.statement_block());
        return null;
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
    public String visitBlockStatement(ccalParser.BlockStatementContext ctx) {
        st.put("$BEGIN_STATEMENT", null);
        visit(ctx.statement_block());
        st.put("$END_STATEMENT", null);
        return null;
    }

    @Override
    public String visitIfStatement(ccalParser.IfStatementContext ctx) {
        if (ctx.condition() != null)
            visit(ctx.condition());
        if (ctx.statement_block() != null)
            visit(ctx.statement_block(0));
        if (ctx.statement_block() != null)
            visit(ctx.statement_block(1));
        return null;
    }

    @Override
    public String visitWhileStatement(ccalParser.WhileStatementContext ctx) {
        if (ctx.condition() != null)
            visit(ctx.condition());
        if (ctx.statement_block() != null)
            visit(ctx.statement_block());
        return null;
    }

    @Override
    public String visitCallFunctionStatement(ccalParser.CallFunctionStatementContext ctx) {
        return callFunction(ctx.ID(), ctx.argument_list(), ctx);
    }

    @Override
    public String visitCallFunction(ccalParser.CallFunctionContext ctx) {
        return callFunction(ctx.ID(), (ccalParser.ArgumentListContext) ctx.arg_list(), ctx);
    }

    private String callFunction(TerminalNode id2, ccalParser.ArgumentListContext argument_listContext, ParserRuleContext ctx) {
        String id = id2.getText();

        if (!st.contains(id)) {
            System.out.println("Error @ Line " + ctx.start.getLine());
            System.out.println("Function: \"" + id + "\" has not been defined.");
            System.exit(0);
        }

        String compositeType = st.get(id);
        String[] argTypesArray = compositeType.split("_");

        if (argTypesArray.length == 1)
            return st.get(id);

        String argTypes = String.join("_", Arrays.copyOfRange(argTypesArray, 1 , argTypesArray.length));

        if (!argTypes.equals(visit(argument_listContext))) {
            System.out.println("Error @ Line " + ctx.start.getLine());
            System.out.print("Function: \"" + id + "\" requires " + (argTypesArray.length - 1) + " arguments of types ");
            for (String arg : Arrays.copyOfRange(argTypesArray, 1 , argTypesArray.length))
                System.out.print(arg + ", ");
            System.out.println();
            System.exit(0);
        }

        return st.get(id);
    }

    @Override
    public String visitIDFragment(ccalParser.IDFragmentContext ctx) {
        String id = ctx.ID().getText();
        String type = st.get(id);

        if (type == null) {
            System.out.println("Error @ Line " + ctx.start.getLine());
            System.out.println("Variable \"" + id + "\" has not been declared");
            System.exit(0);
        }
        return type;
    }

    @Override
    public String visitIntegerFragent(ccalParser.IntegerFragentContext ctx) {
        return "integer";
    }

    @Override
    public String visitNegatedIDFragment(ccalParser.NegatedIDFragmentContext ctx) {
        return "integer";
    }

    @Override
    public String visitType(ccalParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTrueFragment(ccalParser.TrueFragmentContext ctx) {
        return ctx.TRUE().getText();
    }

    @Override
    public String visitFalseFragment(ccalParser.FalseFragmentContext ctx) {
        return ctx.FALSE().getText();
    }
}