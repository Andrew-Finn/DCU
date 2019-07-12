import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");

        // Read in the numbers (note that they could be floating point)
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
        // and calculate the average (or calculate the average as you read the numbers => no need for an array)
        
        System.out.println("The average is " + sum / num);
    }
}