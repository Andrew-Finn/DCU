package git;

import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class IRRepVisitor extends assignBaseVisitor<Boolean>
{
	SymbolTable symbolTable = new SymbolTable();
	private int tmp = 1;
    private int labels = 1;

    @Override
    public Boolean visitProg(assignParser.ProgContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitVar_decl(assignParser.Var_declContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitConst_decl(assignParser.Const_declContext ctx) 
    {
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitFunc(assignParser.FuncContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitType(assignParser.TypeContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitNemp_paralst(assignParser.Nemp_paralstContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitNemp_arglst(assignParser.Nemp_arglstContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitAssignStm(assignParser.AssignStmContext ctx) 
    { 
    	return visitChildren(ctx); 
    }

    @Override 
    public Boolean visitArglst(assignParser.ArglstContext ctx) 
    { 
    	return visitChildren(ctx); 
    }
}