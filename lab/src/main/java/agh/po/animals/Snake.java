package agh.po.animals;

public class Snake extends Animal {
    public Snake(){
        super("Snake", 0);
    }
    @Override
    public String getDescription(){
        return name + " " + legs;
    }
    @Override
    public void makeSound(){
        System.out.println("ssss");
    }
}