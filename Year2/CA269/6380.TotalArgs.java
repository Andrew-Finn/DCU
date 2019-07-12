public class TotalArgs {
	public static void main(String [] args)
	{
		int sum = 0;
		for(int i = 0; i < args.length; i++)
		{
			int num = Integer.parseInt(args[i]);
			sum = sum + num;
		}
		System.out.println("The sum of all the args is " + sum + ".");
	}
}