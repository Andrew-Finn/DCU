import java.util.Scanner;

public class Temp
{
	   public static Double fahr2cels(Double num)
	   {
	      return  (5.0 / 9.0) * (num - 32.0) ;
	   }
	   public static void main(String [] args)
	    {	
	        System.out.println("Give me a Fahrenheit temperature: ");
	        Scanner in = new Scanner(System.in);

	        Double i;
	        i = in.nextDouble();
	        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
	        System.out.println("In Celsius that would be: " + (Temp.fahr2cels(i)));

	        
	    }
	   
}

