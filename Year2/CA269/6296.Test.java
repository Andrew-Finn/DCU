public class Test
{
    public static int largest(int a, int b, int c)
    {
        if(a > b && a > c){
            return a;
        }
        if(b > a && b > c){
            return b;
    }
        else{
            return c;
        }
}
}