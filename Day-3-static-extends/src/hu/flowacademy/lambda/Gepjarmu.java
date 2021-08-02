package hu.flowacademy.lambda;

public class Gepjarmu {

    private int gyartasiEv;
    private String tipus;
    private int kerekekSzama;

    public Gepjarmu() { //Default konstruktor
        this.gyartasiEv = 2000;
        this.kerekekSzama = 4;
        this.tipus = "Feri";
    }

    public Gepjarmu(int gyartasiEv, String tipus, int kerekekSzama) {
        this.gyartasiEv = gyartasiEv;
        this.tipus = tipus;
        this.kerekekSzama = kerekekSzama;
    }

    public void kozlekedik() {
        System.out.println("Közlekedek, gépjármű vagyok!");
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public void setGyartasiEv(int gyartasiEv) {
        this.gyartasiEv = gyartasiEv;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getKerekekSzama() {
        return kerekekSzama;
    }

    public void setKerekekSzama(int kerekekSzama) {
        this.kerekekSzama = kerekekSzama;
    }

    @Override
    public String toString() {
        return "Gepjarmu{" +
                "gyartasiEv=" + gyartasiEv +
                ", tipus='" + tipus + '\'' +
                ", kerekekSzama=" + kerekekSzama +
                '}';
    }
}
