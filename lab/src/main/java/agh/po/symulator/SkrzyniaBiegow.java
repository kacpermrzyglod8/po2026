package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String producent, String model, int iloscBiegow, Sprzeglo sprzeglo) {
        super(producent, model);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
    }

    public void zwiekszBieg() {
        if (this.aktualnyBieg < this.iloscBiegow) this.aktualnyBieg++;

    }
    public void zmniejszBieg() {
        if (this.aktualnyBieg > 0) this.aktualnyBieg--;
    }

    public void zerujBieg() {
        this.aktualnyBieg = 0;
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}
