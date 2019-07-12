import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = in.nextInt();
        int out = 0;

        while (num != -1){
            // System.out.print(num + " ");
            out += 1;
            num = in.nextInt();
        }
        // System.out.print(num);
        System.out.println(); // Finish with a new line.

        System.out.println(out + " numbers were entered.");

        //  System.out.println(); // Finish with a new line.
    }
}