package git;

import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class SemanticAsgnVisitor implements assignVisitor<Boolean> {
	private static String scope;
  	SymbolTable symbolTable = new SymbolTable();
  	private ArrayList<String> uncalledFunc = new ArrayList<>();
  	String[] types = {"Assign", "Boolean", "Integer"};

  	@Override 
  	public Boolean visitProg(assignParser.ProgContext ctx) 
  	{ 
  		scope = "global";
  		if (uncalledFunc.size() > 0)
  		{
  			//if uncalled functions added to list
  			System.out.println("Error: Not all functions called");
  		}
  	 	return visitChildren(ctx); 
  	}

	@Override
  	public Boolean visitAssignStm(assignParser.AssignStmContext ctx)
  	{
  	 	String id = ctx.ID().getText();

  	 	//check for existing assignment with id
  	 	SymbolTableEntry entry = (SymbolTableEntry) symbolTable.get(id);
  	 	if(!id.equalsIgnoreCase(entry.id))
  	 	{
  	 		//if id hasn't been declared
  	 		System.out.println("Error: " + id + " not declared before use");
  	 	}
  	 	return visitChildren(ctx); 
  	}

	@Override
	public Boolean visitArgStm(assignParser.ArgStmContext ctx) {
		return null;
	}

	@Override
	public Boolean visitBlockStm(assignParser.BlockStmContext ctx) {
		return null;
	}

	@Override
	public Boolean visitIfStm(assignParser.IfStmContext ctx) {
		return null;
	}

	@Override
	public Boolean visitWhileStm(assignParser.WhileStmContext ctx) {
		return null;
	}

	@Override
	public Boolean visitSkip(assignParser.SkipContext ctx) {
		return null;
	}

	@Override
	public Boolean visitBinOp(assignParser.BinOpContext ctx) {
		return null;
	}

	@Override
	public Boolean visitExprOp(assignParser.ExprOpContext ctx) {
		return null;
	}

	@Override
	public Boolean visitArgOp(assignParser.ArgOpContext ctx) {
		return null;
	}

	@Override
	public Boolean visitFragOp(assignParser.FragOpContext ctx) {
		return null;
	}

	@Override
	public Boolean visitNegCond(assignParser.NegCondContext ctx) {
		return null;
	}

	@Override
	public Boolean visitOrAndCond(assignParser.OrAndCondContext ctx) {
		return null;
	}

	@Override
	public Boolean visitCompOpCond(assignParser.CompOpCondContext ctx) {
		return null;
	}

	@Override
	public Boolean visitLRCond(assignParser.LRCondContext ctx) {
		return null;
	}

	@Override
  	public Boolean visitDecl_lst(assignParser.Decl_lstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitFunc_lst(assignParser.Func_lstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitPara_lst(assignParser.Para_lstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitNemp_paralst(assignParser.Nemp_paralstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitMain(assignParser.MainContext ctx) 
  	{ 
  		scope = "main";
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitConst_decl(assignParser.Const_declContext ctx) 
  	{ 
  		String id = ctx.ID().getText();
  		String type = ctx.type().getText();

  		//check for existing constant with id
  		SymbolTableEntry entry = (SymbolTableEntry) symbolTable.get(id);
  		if (id.equals(entry.id) && scope.equals(entry.scope))
  		{
  			//if it exists already
  			System.out.println("Error: " + id + " already declared in scope");
  		}
  		else 
  		{
  			//if no existing constant exists
  			symbolTable.put(id,type,scope);
  		}
  		return visitChildren(ctx);
  	}

	@Override
	public Boolean visitDecl(assignParser.DeclContext ctx) {
		return null;
	}

	@Override
  	public Boolean visitVar_decl(assignParser.Var_declContext ctx) 
  	{ 
  		String id = ctx.ID().getText();
  		String type = ctx.type().getText();

  		//check for existing variable with id
  		SymbolTableEntry variable = (SymbolTableEntry) symbolTable.get(id);
  		if (id.equals(variable.id) && scope.equals(variable.scope))
  		{
  			//if it exists already
  			System.out.println("Error: " + id + " already declared in scope");
  		} else {
  			//if no existing variable exists
  			symbolTable.put(id,type,scope);
  		}
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitFunc(assignParser.FuncContext ctx) 
  	{ 
  		symbolTable.openScope();

  		if(ctx.para_lst().nemp_paralst() != null)
  		{
  			List<TerminalNode> lstIds = ctx.para_lst().nemp_paralst().ID();
  			List<assignParser.TypeContext> lstTypes = ctx.para_lst().nemp_paralst().type();
  			//Iterate through both lists
  			Iterator<TerminalNode> iterID = lstIds.iterator();
  			Iterator<assignParser.TypeContext> iterTypes = lstTypes.iterator();

  			while(iterID.hasNext() && iterTypes.hasNext())
  			{
  				symbolTable.put(String.valueOf(iterID.next()), iterTypes.next().getText(), "function_param: " + ctx.ID().getText());
  			}
  		}
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitArglst(assignParser.ArglstContext ctx) 
  	{ 
  		return visitChildren(ctx);
   	}

	@Override
	public Boolean visitType(assignParser.TypeContext ctx) {
		return null;
	}

	@Override
	public Boolean visitComp_op(assignParser.Comp_opContext ctx) {
		return null;
	}

	@Override
	public Boolean visitFrag(assignParser.FragContext ctx) {
		return null;
	}

	@Override
	public Boolean visitBin_arith_op(assignParser.Bin_arith_opContext ctx) {
		return null;
	}

	@Override
  	public Boolean visitNemp_arglst(assignParser.Nemp_arglstContext ctx) 
  	{ 
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitStmblock(assignParser.StmblockContext ctx) 
  	{ 
  		return visitChildren(ctx); 
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
}