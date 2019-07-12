import java.util.*;


public class Previous
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers (-1 to end)");
        int n = in.nextInt();
        List<Integer> seenList = new ArrayList<Integer>();
        Set<Integer> seenSet = new HashSet<Integer>();
        while(n != -1)
        {
            if(seenSet.contains(n))
                seenList.add(n);
            seenSet.add(n);
            n = in.nextInt();
        }
        System.out.println("Previous:");
        for (Integer integer : seenList) System.out.println(integer);
    }
}

