//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        double [] numbers;
        numbers = new double [num];
        double sum = 0;
        int i;
        for(i=0;i < num;i++)
        {
            double x = in.nextDouble();
            numbers[i] = x;
            sum += numbers[i];
        }
        double avg = sum/num;
        // Print out the numbers greater than the average
        System.out.println("The above average numbers are:");
        for(i=0;i < num;i++)
        {
            if(numbers[i] > avg)
            {
                System.out.print(" " + numbers[i]); // You may want to put this in a loop.
            }
        }
        // You can use the following code to print out one number

        System.out.println(); // Should finish with a new line
    }
}