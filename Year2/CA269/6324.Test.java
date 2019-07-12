public class Test
{
    // Create a static void method called reverse which takes an array of ints
        public static int [] reverse(int [] num)
{
    // Create a static method called getSum which sums an array of ints
        int i;
        int j = 0;
        for(i=num.length - 1;i > j;i--)
        {
            int tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
            j++;
        }
        return num;
}
}