package agh.po.animals;

public class Snake extends Animal {
    public Snake(){
        super("Snake", 0);
    }
    @Override
    public String getDescription(){
        return name + " " + legs;
    }
}