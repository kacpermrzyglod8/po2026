package agh.po.symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja aktualnaPozycja;

    public Samochod() {
        Sprzeglo sprzeglo = new Sprzeglo("Domyslny", "Sprzeglo");
        this.silnik = new Silnik("Domyslny", "Silnik", 6000);
        this.skrzynia = new SkrzyniaBiegow("Domyslny", "Skrzynia", 5, sprzeglo);
        this.aktualnaPozycja = new Pozycja(0, 0);
    }

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = pozycja;
    }

    public void wlacz() {
        silnik.uruchom();
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.zerujBieg();
    }

    @Override
    public String toString() {
        return "Samochód: obroty silnika = " + silnik.getObroty()
                + ", bieg = " + skrzynia.getAktBieg()
                + ", sprzęgło wciśnięte = " + skrzynia.getSprzeglo().StanSprzegla()
                + ", " + aktualnaPozycja.getPozycja();
    }
}