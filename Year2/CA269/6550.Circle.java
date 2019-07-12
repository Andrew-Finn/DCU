public class Circle extends Shape{
    private double radius;
    public Circle(String name, Double r){
        super(name);
        radius = r;
    }
    public double area(){
        return (Math.PI * radius) * radius;
    }
}