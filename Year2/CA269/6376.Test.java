public class Test
{
   public static double getPassingAverage(Student [] student)
   {
      double count=0;
      double total=0;
      for(int i = 0; i < student.length; i++){
      if (student[i].getMark() >= 40){
         count += 1.0;
         total += student[i].getMark();
      }
   }
   return total/count;
}
}