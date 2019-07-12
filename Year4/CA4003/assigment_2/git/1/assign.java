package git;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;


public class assign
{
	public static void main (String[] args) throws Exception
	{
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
	    InputStream is = System.in;

       	if (inputFile != null) 
       		is = new FileInputStream(inputFile);
       	try
       	{
       		assignLexer lexer = new assignLexer (CharStreams.fromStream(is));
        	lexer.removeErrorListeners();
        	lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
		
			assignParser parser = new assignParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(ThrowingErrorListener.INSTANCE);
			ParseTree tree = parser.prog();

			System.out.println(inputFile + " has parsed successfully");

			SemanticAsgnVisitor asgnV = new SemanticAsgnVisitor();
			asgnV.visit(tree);

			IRRepVisitor irVis = new IRRepVisitor();
			irVis.visit(tree);
       	}
        catch(Exception e)
        {
        	System.out.println(inputFile + " has not parsed");
        }
	}
}