// A Pig is an animal which has a name and says "Oink".
// It likes to polymorph in an array.


public class Pig extends Animal{
    public Pig(String name){
        super(name);
    }
    public String hello(){
        return "Oink";
    }
}