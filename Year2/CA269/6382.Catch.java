public class Catch
{
   public static void main(String [] args)
   {
      Broken broke = new Broken();

      System.out.println("Testing");
      try
      {
         broke.cracked();
      }
      catch (Exception e)
      {
    	  System.out.println("Caught the exception.");
      }
   }
}