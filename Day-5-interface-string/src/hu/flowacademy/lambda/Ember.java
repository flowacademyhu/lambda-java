package hu.flowacademy.lambda;

public class Ember implements HangotAd, Jatek{

    private String vezeteknev;
    private boolean hasKegyelem;

    public Ember(String vezeteknev) {
        this.vezeteknev = vezeteknev;
        this.hasKegyelem = false;
    }

    @Override
    public String toString() {
        return "Ember {" +
                "vezeteknev='" + vezeteknev + '\'' +
                ", hasKegyelem=" + hasKegyelem +
                '}';
    }

    @Override
    public void hang(String s) {
        System.out.println("Beszélek " + s.toUpperCase());
    }

    @Override
    public boolean beszelE() {
        return true;
    }

    @Override
    public void jatszik(Jatek j) {
        System.out.println("Játszok kegyelem:" + this.hasKegyelem + j.kedvencJatek());
    }

    @Override
    public String kedvencJatek() {
        return "Römi";
    }
}
