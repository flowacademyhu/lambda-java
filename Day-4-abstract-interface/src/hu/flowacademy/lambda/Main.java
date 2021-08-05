package hu.flowacademy.lambda;

import hu.flowacademy.lambda.osztalyok.*;

public class Main {

    public static void main(String[] args) {
        Macska m = new Macska("Frici", 12, true, true, false);
        m.hangotAd(11);
        m.doMacskaThings();
        Allat a = new Macska("Feri", 20, true, false, false);
        a.hangotAd(11);
        hangotAdat(m);
        Kutya k = new Kutya("Géza", 5, true, true, true);
        hangotAdat(k);
        new Allat("232", 12, true);
        Egitest e = new Bolygo(1, "Föld", true, true);
        System.out.println(e.lefotozom());
    }

    public static void hangotAdat(Allat a) {
        a.hangotAd(10);
    }

//    public static void hangotAdat(Macska m){
//        m.hangotAd(10);
//    }
//
//    public static void hangotAdat(Kutya k) {
//        k.hangotAd(10);
//    }
}
