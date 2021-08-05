package hu.flowacademy.lambda.osztalyok;

public abstract class Egitest extends Galaxis {

    private double tomeg;
    private String nev;

    public Egitest(double tomeg, String nev) {
        this.tomeg = tomeg;
        this.nev = nev;
    }

    public double getTomeg() {
        return tomeg;
    }

    public void setTomeg(double tomeg) {
        this.tomeg = tomeg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public abstract String lefotozom();

    @Override
    public String toString() {
        return "Egitest{" +
                "tomeg=" + tomeg +
                ", nev='" + nev + '\'' +
                '}';
    }
}
