package hu.flowacademy.lambda.penz;

public class Penz {

    private int nevertek;
    private boolean isPapirpenz;

    public Penz(boolean isPapirpenz, int nevertek) {
        this.nevertek = nevertek;
        this.isPapirpenz = isPapirpenz;
    }

    public int getNevertek() {
        return this.nevertek;
    }

    public boolean isPapirpenz() {
        return this.isPapirpenz;
    }

    public String toString() {
        return this.nevertek + " Ft - " +
                (isPapirpenz?"papír":"apró") + "pénz";
    }

}
