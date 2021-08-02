package hu.flowacademy.lambda;

public class Kutya {

    private int eletkor;
    private boolean isHim;
    private double eletero;
    private String szorszin;
    public static int kutyaSzamlalo = 0;
    public static final double PI = 3.1415; // valódi konstans

    public Kutya(int eletkor, boolean isHim, double eletero, String szorszin) {
        this.eletkor = eletkor;
        this.isHim = isHim;
        this.eletero = eletero;
        this.szorszin = szorszin;
        kutyaSzamlalo++;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public boolean isHim() {
        return isHim;
    }

    public void setHim(boolean him) {
        isHim = him;
    }

    public double getEletero() {
        return eletero;
    }

    public void setEletero(double eletero) {
        this.eletero = eletero;
    }

    public String getSzorszin() {
        return szorszin;
    }

    public void setSzorszin(String szorszin) {
        this.szorszin = szorszin;
    }

    @Override
    public String toString() {

        return "Kutya{" +
                "eletkor=" + eletkor +
                ", isHim=" + isHim +
                ", eletero=" + eletero +
                ", szorszin='" + szorszin + '\'' +
                '}';
    }

    public static void nullaz() {
        kutyaSzamlalo = 0;
        //this.eletero = 10; NEM érjük el a példány szintű dolgokat
        System.out.println("Nulláztam");
    }
}
