package hu.flowacademy.lambda;

public class Main {

    public static void main(String[] args) {
        Macska m = new Macska("Feri", "zöld");
        Ember e = new Ember("Nagy");
        beszeltet(e);
        beszeltet(m);
        m.jatszik(e);
        e.jatszik(m);
        Eger eg = new Eger(true);
        //beszeltet(eg);
        System.out.println(eg.getClass());
        if(eg instanceof Eger) {
            System.out.println("Tudok hangot adni");
        } else {
            System.out.println("Nem vagyok");
        }
        Object[] dolgok = new Object[3];
        dolgok[0] = m;
        dolgok[1] = e;
        dolgok[2] = eg;
        for(Object o : dolgok) {
            konvertal(o);
        }
        String s = "almafa, körtefa, szilvafa";
        //s = s.toUpperCase();
        String s2 = new String("almafa, körtefa, szilvafa");
        if(s.equals(s2)) {
            System.out.println("Egyenlő");
        }
        String[] fak = s2.split(", ");
        for(String el : fak) {
            System.out.println(el);
        }
        System.out.println(s2.substring(1, 5));
        System.out.println(String.join(", ", fak));

        //s2.toLowerCase().replace("asd", "dd")
    }

    public static void beszeltet(HangotAd h) {
        h.hang("Jóskagyerek");
    }

    public static void konvertal(Object o) {
        if(o instanceof Eger) {
            ((Eger)o).egerezik();
        } else if(o instanceof Macska) {
            ((Macska)o).macskazik();
        }
    }
}
