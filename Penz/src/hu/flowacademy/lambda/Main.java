package hu.flowacademy.lambda;

import hu.flowacademy.lambda.penz.Penz;
import hu.flowacademy.lambda.penz.Penztarca;

public class Main {

    public static void main(String[] args) {
        Penztarca pt = new Penztarca();
        Penz tizes = new Penz(false, 10);
        Penz szazas = new Penz(false, 100);
        Penz ezres = new Penz(true, 1000);
        pt.penzBetesz(tizes);
        pt.penzBetesz(tizes);
        pt.penzBetesz(szazas);
        pt.penzBetesz(ezres);
        System.out.println("Tizesek: " + pt.penzSzamol(10));
        System.out.println("Aprók: " + pt.penzSzamol(false));
        //pt.penzSzamol(500);
    }
}
