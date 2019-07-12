// This class should contain a single method called max.

public class Test{
    public static <T extends Order > T max(T a, T b){
        if(a.greaterThan(b))
            return a;
        return b;
    }
}