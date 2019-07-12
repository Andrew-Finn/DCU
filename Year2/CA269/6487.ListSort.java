import java.util.*;


public class ListSort
{
    public static void main(String[] arg)
{
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<Integer> toSort = new ArrayList<Integer>();
    while(n != -1){
        toSort.add(n);
        n = in.nextInt();
    }
    Collections.sort(toSort);
    System.out.println("Sorted: ");

    for(int i=0; i<toSort.size();i++ )
    {
        System.out.print(toSort.get(i) + " ");
    }
}
}