import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        System.out.println("Please enter a quantity in inches: ");
        int inches;
        inches = in.nextInt();  
        System.out.println(inches + " inch is " + (inches * 2.54) + " cm");

        
        // prepare the user for the result
        // print out the result (use System.out.println() )
        // :PUT YOUR CODE HERE:
        
    }
}