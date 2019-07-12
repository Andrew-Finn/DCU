import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter two numbers: ");
        
        int number1;
        number1 = in.nextInt();     
        int number2;
        number2 = in.nextInt();   
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        System.out.println(number1 + " and " + number2 + " is " + (number2 + number1));
        
        // prepare the user for the result
        // print out the result (use System.out.println() )
        // :PUT YOUR CODE HERE:
        
    }
}