import org.antlr.v4.runtime.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ccal { // General outline of this file is based of Course Website example .. e.g. Args / Filestream
    public static void main(String[] args) throws Exception {
        String inputFile = null;

        if (args.length > 0)
            inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null)
            is = new FileInputStream(inputFile);

        ccalLexer lexer = new ccalLexer(CharStreams.fromStream(is));
        lexer.addErrorListener(failedRaiseSyntaxError(args[0]));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ccalParser parser = new ccalParser(tokens);
        parser.addErrorListener(failedRaiseSyntaxError(args[0]));
        parser.program();

        // As the addErrorListener will raise an exception on parse failure we know the below code will only execute
        // when the parsing succeeds.
        System.out.println("Passed\nFile '" + args[0] + "' has been parsed successfully");
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