import java.util.Scanner;

public class EvenOdd
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        if(i % 2 == 0)
            System.out.println(i + " is even.");
        else
            System.out.println(i + " is odd.");
        
        
        // Use the substring() method of the String class.
    }
}