public class Average{
    public static double averageArea(Shape [] shape){
        double aver = 0;
        for (Shape value : shape) {
            aver += value.area();
        }
        return aver/shape.length;
    }
}