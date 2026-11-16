package agh.po.animals;

public abstract class Animal {
    String name;
    int legs;
    public Animal(String x, int y){
        this.name = x;
        this.legs = y;
    }
    public abstract String getDescription();
    public int getLegs(){
     return legs;
    }
}

