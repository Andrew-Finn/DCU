package cal;

/**
 * Object representation of a single line of arithmetic in Intermediate Code.
 * TODO: Implement QuadrupleInterface and separate binary and unary arithmetic into different implementations.
 * @author Alan
 *
 */
public class Quadruple {
    private final String op;
    private final String arg1;
    private final String arg2;
    private final String result;

    /**
     * Constructor for binary operations, i.e. addition, subtraction, multiplication
     * @param op Binary operator.
     * @param arg1 left-hand value.
     * @param arg2 right-hand value.
     * @param result Assignment variable.
     */
    public Quadruple(String op, String arg1, String arg2, String result) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }

    /**
     * Constructor for unary operations, i.e. assignment and negation.
     * @param op Unary operator
     * @param arg1 Value
     * @param result Assignment variable
     */
    public Quadruple(String op, String arg1, String result) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = (op.equals("-")) ? "0" : null;
        this.result = result;
    }

    public String toIRCode() {
        if (this.op.equals("="))
            return String.format("\t%s %s %s", this.result, this.op, this.arg1);

        if (arg2 != null)
            return String.format("\t%s = %s %s %s", this.result, this.arg2, this.op, this.arg1);
        
        return String.format("\t%s = %s %s", this.result, this.op, this.arg1);
    }

    @Override
    public String toString() {
        return "Quadruple{" +
                "op='" + op + '\'' +
                ", arg1='" + arg1 + '\'' +
                ", arg2='" + arg2 + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Quadruple quad1 = new Quadruple("-", "a", "b", "x");
        Quadruple quad2 = new Quadruple("-", "a", "x");
        System.out.println(quad1.toIRCode());
        System.out.println(quad2.toIRCode());
    }
}
