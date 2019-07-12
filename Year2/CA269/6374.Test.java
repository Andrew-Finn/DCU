public class Test
{
   public static int numberPasses(Student [] student)
   {
       int count = 0;
       for(int i = 0; i < student.length; i++){
           if (student[i].getMark() >= 40){
               count += 1;
           }
       }
   return count;
   }
}