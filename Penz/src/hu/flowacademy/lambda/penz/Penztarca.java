package hu.flowacademy.lambda.penz;

public class Penztarca {

    private int darab;
    private Penz[] penzek;

    public Penztarca() {
        this.darab = 0;
        this.penzek = new Penz[50];
    }

    public void penzBetesz(Penz p) {
        if(darab < penzek.length - 1) {
            penzek[darab++] = p;
        } else {
            System.out.println("Tele van a tárcád, te kulák!");
        }
    }

    public int penzSzamol(int cimlet) {
        if(cimlet != 10 && cimlet != 100 && cimlet != 1000) {
            throw new IllegalArgumentException("Bad cimlet");
        }
        int darab = 0;
        for (int i = 0; i < this.darab; i++) {
            Penz p = penzek[i];
            if(p.getNevertek() == cimlet) {
                darab++;
            }
        }
        return darab;
    }

    public int penzSzamol(boolean isPapirpenz) {
        int darab = 0;
        for (int i = 0; i < this.darab; i++) {
            Penz p = penzek[i];
            if (p.isPapirpenz() == isPapirpenz) {
                darab++;
            }
        }
        return darab;
    }

}
