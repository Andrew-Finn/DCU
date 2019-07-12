public class Test
{
    // Create a static method called countFives which returns the number of fives in the array
        public static int countFives(int [] num)
{
    // Create a static method called getSum which sums an array of ints
        int i;
        int total = 0;
        for(i=0;i < num.length;i++)
        {
        	if(num[i] == 5) {
        		total += 1;
        	}
        }
        return total;
}
}