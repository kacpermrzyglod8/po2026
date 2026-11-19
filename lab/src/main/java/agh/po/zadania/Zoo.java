package agh.po.zadania;
import agh.po.animals.Animal;
import agh.po.animals.Parrot;
import agh.po.animals.Dog;
import agh.po.animals.Snake;

public class Zoo {
    Animal[] animals = new Animal[100];

    public int rand() {
        int wynik = (int) (Math.random() * 3) + 1;
        return wynik;
    }

    public void fillAnimals() {
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

    public int sumLegs() {
        int suma = 0;
        for (int i = 0; i < animals.length; i++) {
            suma += animals[i].getLegs();
        }
        return suma;
    }

    public void printDescriptions() {
        for (int i = 0; i < animals.length; i++) {
            int legs = animals[i].getLegs();
            String opis = animals[i].getDescription();
            System.out.println(opis);
        }
    }

    public void makeSounds() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillAnimals();
        zoo.printDescriptions();
        zoo.makeSounds();
        System.out.println("Suma nóg: " + zoo.sumLegs());
    }
}