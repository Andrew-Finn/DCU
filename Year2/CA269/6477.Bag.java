@SuppressWarnings("unchecked")
public class Bag<T>
{
   private T[] bag = (T[])(new Object[100]);
   private int numElements = 0;
   
   public void add(T x)
   { // put x in bag
      bag[numElements] = x;
      numElements++;
   }
   
   public void remove(T item)
   {
	   int i = 0;
	   while(i < bag.length && bag[i] != item)
		   i += 1;
	   if(i < numElements)
	   {
		   for(int l = i; l <= numElements; l ++)
		   {
			   bag[l] = bag[l + 1];
		   }
		   numElements -= 1;
	   }
   }
   
   public int count(T x)
   {
      int count = 0;
      for (int i=0; i<numElements; i++)
         if (bag[i].equals(x)) // .equals because T a class 
            count++;
      return count;
   }

   public int length()
   {
      return numElements;
   }
}