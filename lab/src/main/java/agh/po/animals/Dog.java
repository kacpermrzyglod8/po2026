package agh.po.animals;

public class Dog extends Animal {
    public Dog(){
        super("Dog", 4);
    }
    @Override
    public String getDescription(){
        return name + " " + legs;
    }
    @Override
    public void makeSound(){
        System.out.println("bark");
    }
}