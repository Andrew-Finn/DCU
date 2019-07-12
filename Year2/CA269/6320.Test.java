public class Test
{
    // Create a static method called countEven which returns the number of even numbers in the array
            public static int countEven(int [] num)
{
    // Create a static method called getSum which sums an array of ints
        int i;
        int total = 0;
        for(i=0;i < num.length;i++)
        {
        	if(num[i] % 2 == 0) {
        		total += 1;
        	}
        }
        return total;
}
}