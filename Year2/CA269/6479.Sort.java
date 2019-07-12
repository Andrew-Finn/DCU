public class Sort
{
   private static <Type extends Comparable<Type>> void swap(Type []s, int i, int j) // CHANGE This
   {
      Type tmp = s[i]; // CHANGE This
      s[i] = s[j];
      s[j] = tmp;
   }

   public static <Type extends Comparable<Type>> void sort(Type [] items) // CHANGE This
   {
      // Use selection sort
      for(int i = 0; i < items.length - 1; i++)
      {
         int minIndex = i;
         for(int j = i + 1; j < items.length; j++)
            if(items[j].compareTo(items[minIndex]) < 0) // items[j] < items[minIndex] ... so update minIndex
               minIndex = j;

         swap(items, i, minIndex);
      }
   }
}