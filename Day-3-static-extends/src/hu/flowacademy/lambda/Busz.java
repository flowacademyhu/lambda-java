package hu.flowacademy.lambda;

public class Busz extends Gepjarmu{

    private int jegyAr;
    private boolean hasGyokerUtas;

    public Busz(int gyartasiEv, String tipus, int kerekekSzama, int jegyAr, boolean hasGyokerUtas) {
        super(gyartasiEv, tipus, kerekekSzama);
        this.jegyAr = jegyAr;
        this.hasGyokerUtas = hasGyokerUtas;
    }

    public void kozlekedik() {
        System.out.println("Busz vagyok, közlekedgetek");
    }
}
