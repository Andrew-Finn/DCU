import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read in the numbers
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        int [] numbers;
        numbers = new int [num];
        int i;
        System.out.print("Enter " + num + " numbers: ");
        for(i=0;i < num;i++)
        {
            int x = in.nextInt();
            numbers[i] = x;
        }
        // reverse the numbers
        System.out.print("The numbers reversed are:");
        for(i=numbers.length - 1;i >= 0;i--)
        {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        // print them out
        
        // Use System.out.print(" " + num[i]); and finish with a newline.
    }
}