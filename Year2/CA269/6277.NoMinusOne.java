import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = in.nextInt();
        int out = num;

            while (num != -1){
            // System.out.print(num + " ");
            out = num;
            num = in.nextInt();
        }
        // System.out.print(num);
        System.out.println(); // Finish with a new line.

        System.out.println("The penultimate number was: " + out);

        // System.out.println(); // Finish with a new line.
    }
}