import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> nummap = new HashMap<String, String>();
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        String str = in.nextLine();
        while (!str.equals("!!")) {
            if (str.substring(str.length() - 2).equals(" ?")) {
                String[] name = str.split(" ");
                if (nummap.containsKey(name[0]))
                    System.out.println(name[0] + " has number " + nummap.get(name[0]));
                else
                    System.out.println("Sorry, there is no " + name[0]);
            } else {
                String[] namenum = str.split(" ");
                nummap.put(namenum[0], namenum[1]);
            }
            str = in.nextLine();
        }
        System.out.println("Bye");
    }
}
