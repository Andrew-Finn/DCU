import java.util.Scanner;

public class ReducedString
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");
        int i = in.nextInt();
        String s = in.next();
        System.out.println(s.substring(0, i) + s.substring(i + 1));
        
        
        // Use the substring() method of the String class.
    }
}