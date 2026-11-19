package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(){
        super("Parrot", 2);
    }
    @Override
    public String getDescription(){
        return name + " " + legs;
    }
    @Override
    public void makeSound(){
        System.out.println("kra");
    }
}