import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        while(i <= 20) // Keep looping as long as some condition is true
        {
            System.out.print(i + " ");
            i++; // Modify i
        }
       
        System.out.println(); // Finish with a new line.
    }
}