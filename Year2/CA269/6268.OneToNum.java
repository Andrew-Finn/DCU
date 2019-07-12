import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int num = in.nextInt();
        int i = 1; // Starting value
        while(i <= num) // Keep looping as long as some condition is true
        {
            System.out.print(i + " ");
            i++; // Modify i
        }
       
        System.out.println(); // Finish with a new line.
    }
}