package agh.po.zadania;
import agh.po.animals.Animal;
import agh.po.animals.Parrot;
import agh.po.animals.Dog;
import agh.po.animals.Snake;

public class Zoo {
    Animal[] animals = new Animal[100];
    public int rand(){
        int rand = (int)(Math.random() * 3) + 1;
        return rand;
    }
    public void fill(){
        for (int i = 0; i < animals.length; i++) {
            int los = rand();

            if (los == 1) {
                animals[i] = new Parrot();
            } else if (los == 2) {
                animals[i] = new Dog();
            } else {
                animals[i] = new Snake();
            }
        }
    }
    public int sumLegs(){
        int suma = 0;
        for(int i = 0; i < animals.length; i++){
            suma += animals[i].getLegs();
        }
        return suma;
    }
}
