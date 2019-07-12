import java.util.Scanner;

public class Absolute
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        if(i < 0)
        	i *= -1;
        System.out.println("The absolute value is " + i + ".");
        
        
        // Use the substring() method of the String class.
    }
}