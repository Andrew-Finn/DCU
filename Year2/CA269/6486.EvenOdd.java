
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EvenOdd
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = in.nextInt();
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        while (n != -1)
        {
            if(n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
            n = in.nextInt();
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < odd.size(); i ++)
            s.append(odd.get(i)).append(", ");
        System.out.println("Odd: " + s.substring(0, s.length() - 2));
        s = new StringBuilder();
        for(int i = 0; i < even.size(); i ++)
            s.append(even.get(i)).append(", ");
        System.out.println("Even: " + s.substring(0, s.length() - 2));
    }
}
