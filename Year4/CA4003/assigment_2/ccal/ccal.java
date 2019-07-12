package ccal;

import ccal_gen.ccalLexer;
import ccal_gen.ccalParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

public class ccal { // General outline of this file is based of Course Website example .. e.g. Args / Filestream
    public static void main(String[] args) throws Exception {
        String inputFile;

        if (args.length > 0) {
            inputFile = args[0];
        } else {
            inputFile = "./test/example_4.txt";
            System.out.println("No command line argument [1] given -> Defaulting to '" + inputFile + "'");
        }

        ccalLexer lexer = new ccalLexer(CharStreams.fromStream(new FileInputStream(inputFile)));
        lexer.addErrorListener(failedRaiseSyntaxError(inputFile));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ccalParser parser = new ccalParser(tokens);
        parser.addErrorListener(failedRaiseSyntaxError(inputFile));
        ParseTree tree = parser.program();
        System.out.println("File '" + inputFile + "' has been parsed successfully");

        try {
            ccalEvalVisitor visitor = new ccalEvalVisitor();
            visitor.visit(tree);
        } catch (Exception exception) {
            System.out.println("File '" + inputFile + "' has NOT been evaluated successfully\nException:\n" + exception);
        }

    }

    private static ANTLRErrorListener failedRaiseSyntaxError(String filename) {
        return new BaseErrorListener() {
            @Override //Ref : https://www.programcreek.com/java-api-examples/?api=org.antlr.v4.runtime.Recognizer
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                    int charPositionInLine, String msg, RecognitionException e) {
                System.out.println("Failed\nFile '" + filename + "' has not been parsed successfully");
                System.exit(1);
            }
        };
    }
}