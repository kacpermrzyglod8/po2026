package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "S1");
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "Z5", 5, sprzeglo);
        Silnik silnik = new Silnik("Toyota", "T2000", 6500);
        Pozycja pozycja = new Pozycja(0, 0);

        Samochod samochod = new Samochod(silnik, skrzynia, pozycja);
        Samochod samochod1 = new Samochod();

        samochod.wlacz();
        System.out.println(samochod);

        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        sprzeglo.zwolnij();
        System.out.println(samochod);

        skrzynia.zmniejszBieg();
        pozycja.aktualizujPozycje(10, 5);
        System.out.println(samochod);

        samochod.wylacz();
        System.out.println(samochod);
    }
}