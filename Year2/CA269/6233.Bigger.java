import java.util.Scanner;

public class Bigger
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int i1 = in.nextInt();
        int i2 = in.nextInt();

        if(i1 > i2)
            System.out.println(i1 + " is the biggest.");
        else
            System.out.println(i2 + " is the biggest.");
        
        
        // Use the substring() method of the String class.
    }
}