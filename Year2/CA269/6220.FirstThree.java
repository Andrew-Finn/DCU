import java.util.Scanner;

public class FirstThree
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();
        System.out.println("Your nickname is " + name.substring(0, 3) + ".");
        
        
        // Use the substring() method of the String class.
    }
}