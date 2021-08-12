package hu.flowacademy.lambda.penz;

public class SzexiPenztarca {

    private int darab;
    private Penz[] penzek;

    public SzexiPenztarca() {
        this.darab = 0;
        this.penzek = new Penz[0];
    }

    public void penzBetesz(Penz p) {
       Penz[] ujPenzek = new Penz[penzek.length + 1];
       for(int i = 0; i < penzek.length; i++) {
           ujPenzek[i] = penzek[i];
       }
       ujPenzek[darab++] = p;
       this.penzek = ujPenzek;
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
