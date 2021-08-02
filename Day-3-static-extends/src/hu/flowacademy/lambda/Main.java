package hu.flowacademy.lambda;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello Flow");
//        System.out.println(Kutya.kutyaSzamlalo);
//        Kutya k = new Kutya(12, true, 20, "Barna");
//        Kutya.nullaz(); // Static függvény hívása
//        Kutya k1 = new Kutya(13, false, 21, "Szürke");
//        Kutya k2 = new Kutya(14, true, 22, "Fehér");
//        System.out.println(Kutya.kutyaSzamlalo);
        Auto a = new Auto(12,"Jóska", 4, true, 5);
        a.kozlekedik();
        Busz b = new Busz(1980, "Ikarus", 6, 230, true);
        b.kozlekedik();
        System.out.println(a);
    }

}
