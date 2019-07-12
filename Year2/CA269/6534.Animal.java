public class Animal {
    String name;

    public Animal(String n) {
        name = n;
    }

    public String greeting() {
        String str = "Hello, my name is "  + name;
        return str;
    }
}