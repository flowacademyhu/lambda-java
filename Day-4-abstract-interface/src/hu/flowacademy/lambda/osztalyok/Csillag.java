package hu.flowacademy.lambda.osztalyok;

public class Csillag extends Egitest{

    private double magnitudo;
    private String szin;

    public Csillag(double tomeg, String nev, double magnitudo, String szin) {
        super(tomeg, nev);
        this.magnitudo = magnitudo;
        this.szin = szin;
    }

    public double getMagnitudo() {
        return magnitudo;
    }

    public void setMagnitudo(double magnitudo) {
        this.magnitudo = magnitudo;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String lefotozom() {
        return "";
    }

    @Override
    public String toString() {
        return "Csillag{" +
                "magnitudo=" + magnitudo +
                ", szin='" + szin + '\'' +
                '}';
    }
}
