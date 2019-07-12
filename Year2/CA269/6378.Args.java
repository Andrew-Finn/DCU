public class Args {
    public static void main (String[] args) {
        int i = 0;
        for (String s: args) {
            System.out.println("args[" + i + "] = " + s);
            i += 1;
        }
    }
}
