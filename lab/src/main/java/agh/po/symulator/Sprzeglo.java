package agh.po.symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;

    public Sprzeglo(String producent, String model) {
        super(producent, model);
        this.stanSprzegla = false;
    }
    public void wcisnij() {
        this.stanSprzegla = true;
    }
    public void zwolnij() {
        this.stanSprzegla = false;
    }
    public boolean StanSprzegla() {
        return stanSprzegla;
    }
}
