import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        for(int i = num; i >= 0; i--){
            sum += i;
        }
        System.out.println("The sum of the numbers from 1 to " + num +" is " + sum);
    }
}

