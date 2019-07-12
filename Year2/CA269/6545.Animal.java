// An abstract Animal
//
// You will need to add a greeting method.
//
//  Also, the greeting method needs to be able to access its subclasses hello method.
//
// It seems a little messy at first. You will need to think about it

public abstract class Animal{
    public Animal(String name){
        this.name = name;
    }
 
    private String name;
    public abstract String hello();
    public String greeting(){
        return hello() + ", my name is " + name;
    }
}