package hu.flowacademy.lambda;

public class Macska implements HangotAd, Jatek{

    private String nev;
    private String szorszin;

    public Macska(String nev, String szorszin) {
        this.nev = nev;
        this.szorszin = szorszin;
        double szam = PI;
    }

    @Override
    public String toString() {
        return "Macska{" +
                "nev='" + nev + '\'' +
                ", szorszin='" + szorszin + '\'' +
                '}';
    }

    @Override
    public void hang(String s) {
        System.out.println("Macska meow " + s.toLowerCase());
    }

    @Override
    public boolean beszelE() {
        return false;
    }

    @Override
    public void jatszik(Jatek j) {
        System.out.println("Macska vagyok, játszok");
    }

    @Override
    public String kedvencJatek() {
        return "Labdázás";
    }

    public void macskazik() {
        System.out.println("Macskázok");
    }
}
