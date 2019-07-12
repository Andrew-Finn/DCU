package cal;

import calBase.CALBaseVisitor;
import calBase.CALParser;

public class IRGeneratorVisitor extends CALBaseVisitor<String> {
    private int paramIdx = 1;
    private int jmpIdx = 1;
    private final QuadrupleQueue quadQueue = new QuadrupleQueue();

    @Override
    public String visitProgStm(CALParser.ProgStmContext ctx) {
        String code = "";

        if (ctx.decl_list() != null)
            code += visit(ctx.decl_list()) + "\n";
        if (ctx.function_list() != null)
            code += visit(ctx.function_list()) + "\n";
        if (ctx.main() != null)
            code += visit(ctx.main());

        return code;
    }

    @Override
    public String visitDeclListStm(CALParser.DeclListStmContext ctx) {
        String code = "";

        if (ctx.decl() != null)
            code += visit(ctx.decl());
        if (ctx.decl_list() != null)
            code += visit(ctx.decl_list());

        return code;
    }

    @Override
    public String visitType(CALParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitEmptyStm(CALParser.EmptyStmContext ctx) {
        return "";
    }

    @Override
    public String visitVarDeclRef(CALParser.VarDeclRefContext ctx) {
        return "";
    }

    @Override
    public String visitVarDeclStm(CALParser.VarDeclStmContext ctx) {
        return "";
    }

    @Override
    public String visitConstDeclRef(CALParser.ConstDeclRefContext ctx) {
        return visit(ctx.const_decl());
    }

    @Override
    public String visitConstDeclStm(CALParser.ConstDeclStmContext ctx) {
        return "\t" + ctx.ID().getText() + " = " + visit(ctx.expression()) + "\n";
    }

    @Override
    public String visitFuncListStm(CALParser.FuncListStmContext ctx) {
        String code = "";

        if (ctx.function() != null)
            code += visit(ctx.function());
        if (ctx.function_list() != null)
            code += visit(ctx.function_list());

        return code;
    }

    @Override
    public String visitFuncDeclStm(CALParser.FuncDeclStmContext ctx) {
        String code = "";
        this.paramIdx = 1;

        code += ctx.ID().getText() + ":\n";

        if (ctx.parameter_list() != null)
            code += visit(ctx.parameter_list());
        if (ctx.decl_list() != null)
            code += visit(ctx.decl_list());
        if (ctx.statement_block() != null)
            code += visit(ctx.statement_block());
        if (ctx.expression() != null)
            code += "\treturn " + visit(ctx.expression());

        return code;
    }

    @Override
    public String visitNonEmptyParamRef(CALParser.NonEmptyParamRefContext ctx) {
        String code = "";
        if (ctx.nemp_paramerter_list() != null)
            code += visit(ctx.nemp_paramerter_list());
        return code;
    }

    @Override
    public String visitSingleParamStm(CALParser.SingleParamStmContext ctx) {
        String line = "\t" + ctx.ID().getText() + " = getparam " + paramIdx + "\n";
        this.paramIdx++;
        return line;
    }

    @Override
    public String visitMultipleParamStm(CALParser.MultipleParamStmContext ctx) {
        String code = "";
        if (ctx.ID() != null) {
            code += "\t" + ctx.ID().getText() + " = getparam " + paramIdx + "\n";
            paramIdx++;
        } if (ctx.nemp_paramerter_list() != null)
            code += visit(ctx.nemp_paramerter_list());
        return code;
    }

    @Override
    public String visitMainStm(CALParser.MainStmContext ctx) {
        String code = "main:\n";
        if (ctx.decl_list() != null)
            code += visit(ctx.decl_list());
        code += "\n";
        if (ctx.statement_block() != null)
            code += visit(ctx.statement_block());
        code += "\tcall _exit, 0";
        return code;
    }

    @Override
    public String visitStmBlockRef(CALParser.StmBlockRefContext ctx) {
        String code = "";
        if (ctx.statement() != null)
            code += visit(ctx.statement()) + "\n";
        if (ctx.statement_block() != null)
            code += visit(ctx.statement_block());
        return code;
    }

    @Override
    public String visitEmptyStatment(CALParser.EmptyStatmentContext ctx) {
        return "";
    }

    @Override
    public String visitAssignStm(CALParser.AssignStmContext ctx) {
        String code = visit(ctx.expression());
        quadQueue.clear();
        String[] lines = code.split("\n");
        lines[lines.length - 1] = "\t" + ctx.ID().getText() + " = " + lines[lines.length - 1] + "\n";

        if (code.contains("param"))
            return "\n" + String.join("\n", lines);

        code = "";
        quadQueue.add("=", visit(ctx.expression()), ctx.ID().getText());
        code += quadQueue.genIRCode();
        return code;

    }

    @Override
    public String visitFuncCallStm(CALParser.FuncCallStmContext ctx) {
        String code = "";
        if (ctx.argument_list() != null)
            code += visit(ctx.argument_list());
        code += "\tcall " + ctx.ID().getText() + ", " + (paramIdx - 1);
        return code;
    }

    @Override
    public String visitFuncCallExpr(CALParser.FuncCallExprContext ctx) {

        String code = "";

        if (ctx.argument_list() != null)
            code += visit(ctx.argument_list());

        code += "call " + ctx.ID().getText() + ", " + (paramIdx - 1) + "\n";

        return code;
    }

    @Override
    public String visitBeginStm(CALParser.BeginStmContext ctx) {
        return "\t" + visit(ctx.statement_block()) + "\n";
    }

    @Override
    public String visitConditionalStm(CALParser.ConditionalStmContext ctx) {
        String code = "";

        int jmpTo;
        boolean isAnd = false;

        String condition = visit(ctx.condition());
        String[] boolExpressions;

        if (condition.contains("&")) {
            isAnd = true;
            boolExpressions = condition.split("&");
        } else if (condition.contains("||"))
            boolExpressions = condition.split("||");
        else
            boolExpressions = new String[] {condition};

        jmpTo = jmpIdx + boolExpressions.length;

        if (isAnd) {
            for (String _if : boolExpressions) {
                code += "\t" + "ifz " + _if + " goto l" + jmpIdx + "\n";
                code += "\tgoto exit" + jmpTo + "\n";
                code += "l" + jmpIdx + ":\n";
                jmpIdx++;
            }
            jmpIdx = jmpTo;

            if (ctx.statement_block(0) != null)
                code += visit(ctx.statement_block(0));

            code += "\tgoto exit" + (jmpIdx + 1) + "\n";
            code += "exit" + jmpIdx + ":\n";
            jmpIdx++;

        } else {
            for (String _if : boolExpressions) {
                code += "\t" + "if " + _if + " goto l" + jmpIdx + "\n";
                code += "\tgoto exit" + (jmpIdx + 1) + "\n";
                code += "l" + jmpIdx + ":\n";
            }

            jmpIdx++;
            if (ctx.statement_block(0) != null)
                code += visit(ctx.statement_block(0));

            code += "\tgoto exit" + jmpIdx + "\n";
        }

        if (ctx.statement_block(1) != null)
            code += visit(ctx.statement_block(1));

        code += "exit" + jmpIdx + ":\n";

        return code;
    }

    @Override
    public String visitWhileStm(CALParser.WhileStmContext ctx) {
        String code = "l" + jmpIdx + ":\n";
        if (ctx.condition() != null)
            code += "\t" + "ifz " + visit(ctx.condition()) + " goto exit" + jmpIdx + "\n";
        if (ctx.statement_block() != null)
            code += visit(ctx.statement_block());
        code += "\tgoto l" + jmpIdx + "\n";
        code += "exit" + jmpIdx + ":\n";
        jmpIdx++;
        return code;
    }

    @Override
    public String visitSkipStm(CALParser.SkipStmContext ctx) {
        return "";
    }

    @Override
    public String visitFragBinArithStm(CALParser.FragBinArithStmContext ctx) {
        int tmpN = quadQueue.getTmpCounter();
        quadQueue.add(visit(ctx.binary_arith_op()), visit(ctx.expression(0)), visit(ctx.expression(1)), "t" + tmpN);
        return "t" + tmpN;
    }

    @Override
    public String visitParenExpreStm(CALParser.ParenExpreStmContext ctx) {
        return "";
    }

    @Override
    public String visitFragRef(CALParser.FragRefContext ctx) {
        return visit(ctx.fragm());
    }

    @Override
    public String visitBoolNegStm(CALParser.BoolNegStmContext ctx) {
        return ctx.NOT() + " " + visit(ctx.condition());
    }

    @Override
    public String visitParenConditionalStm(CALParser.ParenConditionalStmContext ctx) {
        return visit(ctx.condition());
    }

    @Override
    public String visitBoolEvalStm(CALParser.BoolEvalStmContext ctx) {
        String op;
        if (ctx.AND() != null)
            op = "&&";
        else
            op = "||";

        return visit(ctx.condition(0)) + op + visit(ctx.condition(1));
    }

    @Override
    public String visitBoolArithStm(CALParser.BoolArithStmContext ctx) {
        return visit(ctx.expression(0)) + " " + visit(ctx.comp_operators()) + " " + visit(ctx.expression(1));
    }

    @Override
    public String visitIdFrag(CALParser.IdFragContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitFragUnaArithStm(CALParser.FragUnaArithStmContext ctx) {
        int tmpN = quadQueue.getTmpCounter();
        quadQueue.add(visit(ctx.binary_arith_op()), visit(ctx.fragm()), "t" + tmpN);
        return "t" + tmpN;
    }

    @Override
    public String visitNegationStm(CALParser.NegationStmContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitIntStm(CALParser.IntStmContext ctx) {
        String num = ctx.NUMBER().getText();

        if (Integer.parseInt(num) < 0)
            return "0 - " + num.substring(1);

        return num;
    }

    @Override
    public String visitTrueStm(CALParser.TrueStmContext ctx) {
        return ctx.True().getText();
    }

    @Override
    public String visitFalseStm(CALParser.FalseStmContext ctx) {
        return ctx.False().getText();
    }

    @Override
    public String visitNonEmptyArgListRef(CALParser.NonEmptyArgListRefContext ctx) {
        String code = "";
        if (ctx.nemp_argument_list() != null)
            code += visit(ctx.nemp_argument_list());

        return code;
    }

    @Override
    public String visitIdArgRef(CALParser.IdArgRefContext ctx) {
        String code = "";
        if (ctx.ID() != null)
            code += "\tparam " + ctx.ID().getText() + "\n";
        return code;
    }

    @Override
    public String visitMultIdArgRef(CALParser.MultIdArgRefContext ctx) {
        String code = "";
        if (ctx.ID() != null)
            code += "\tparam " + ctx.ID().getText() + "\n";
        if (ctx.nemp_argument_list() != null)
            code += visit(ctx.nemp_argument_list());
        return code;
    }

    @Override
    public String visitAdditionStm(CALParser.AdditionStmContext ctx) {
        return "+";
    }

    @Override
    public String visitSubtractionStm(CALParser.SubtractionStmContext ctx) {
        return "-";
    }

    @Override
    public String visitLogOr(CALParser.LogOrContext ctx) {
        return ctx.OR().getText();
    }

    @Override
    public String visitLogEq(CALParser.LogEqContext ctx) {
        return ctx.EQUAL().getText();
    }

    @Override
    public String visitLogNEq(CALParser.LogNEqContext ctx) {
        return ctx.NOTEQUAL().getText();
    }

    @Override
    public String visitLogLT(CALParser.LogLTContext ctx) {
        return ctx.LT().getText();
    }

    @Override
    public String visitLogLTE(CALParser.LogLTEContext ctx) {
        return ctx.LTE().getText();
    }

    @Override
    public String visitLogGT(CALParser.LogGTContext ctx) {
        return ctx.GT().getText();
    }

    @Override
    public String visitLogGTE(CALParser.LogGTEContext ctx) {
        return ctx.GTE().getText();
    }
}
