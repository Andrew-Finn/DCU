import java.util.Scanner;

public class IsTeenager
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int i = in.nextInt();

        if(i > 12 && i < 20)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are not a teenager.");
        
        
        // Use the substring() method of the String class.
    }
}