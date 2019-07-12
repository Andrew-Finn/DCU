public class Test
{
    public static int getSum(int [] num)
{
    // Create a static method called getSum which sums an array of ints
        int i;
        int sum = 0;
        for(i=0;i < num.length;i++)
        {
            sum += num[i];
        }
        return sum;
}
}