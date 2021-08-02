package hu.flowacademy.lambda;

public class Auto extends Gepjarmu {

    private boolean hasTurbo;
    private int ulesek;

    public Auto(int gyartasiEv, String tipus, int kerekekSzama, boolean hasTurbo, int ulesek) {
        super(gyartasiEv, tipus, kerekekSzama);   // Meghívja az ősosztály konstruktorát !!!!
        this.hasTurbo = hasTurbo;
        this.ulesek = ulesek;
    }

    public String toString() {
        return "Autó " + (hasTurbo?"turbó":"nemturbó") + " " + ulesek + " " + super.toString();
    }

    public void kozlekedik() {
        System.out.println("Autó vagyok wrumm wrumm");
    }
}
