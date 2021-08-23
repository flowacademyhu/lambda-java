package hu.flowacademy.lambda;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Cica implements Cloneable, Comparable{

    String nev;
    int eletkor;
    CicaAllapot allapot;

    public Cica() {
        this.nev = "Feri";
        this.eletkor = 10;
        allapot = CicaAllapot.ALSZIK;
    }

    public Cica(int eletkor) {
        this.nev = "Feri";
        this.eletkor = eletkor;
        allapot = CicaAllapot.ALSZIK;
    }

    public CicaAllapot getAllapot() {
        return allapot;
    }

    public void setAllapot(CicaAllapot allapot) {
        this.allapot = allapot;
    }

    public Cica clone() {
        try {
            return (Cica)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cica)) return false;
        Cica cica = (Cica) o;
        return eletkor == cica.eletkor && Objects.equals(nev, cica.nev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, eletkor);
    }

    @Override
    public String toString() {
        String dolog = "";
//        switch (allapot) {
//            case ESZIK: dolog = " eszik ";
//            break;
//            case ALSZIK: dolog = " alszik ";
//            break;
//            case JATSZIK: dolog = " játszik ";
//        }
        return "Cica{" +
                "nev='" + nev + '\'' +
                ", eletkor=" + eletkor +
                 allapot.getSzoveg() +'}';
    }

    public int compareTo(Object o) {
        if (!(o instanceof Cica)) return -1;
        Cica cica = (Cica) o;
        if (eletkor < cica.eletkor) return -1;
        else if (eletkor == cica.eletkor) return 0;
        return 1;
    }
}

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        int kezdo = 10;
        int eredmeny = add2(kezdo);
        System.out.println("Kezdő: " + kezdo + " Eredmény " + eredmeny);
        Cica c = new Cica();
        Cica ujCica = cicaIze(c);
        System.out.println("C : " + c);
        System.out.println("UjCica : " + ujCica);
        ujCica.nev= "Géza";
        System.out.println("C : " + c);
        System.out.println("UjCica : " + ujCica);
        List<Cica> cicakok = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Cica ca = new Cica((int) Math.floor(Math.random() * 20));
            cicakok.add(ca);
        }
        System.out.println(cicakok);
        cicakok = cicakok.stream().sorted().collect(Collectors.toList());
        System.out.println(cicakok);
//        JFrame f=new JFrame();//creating instance of JFrame
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                JButton b = new JButton("X");//creating instance of JButton
//                b.setBounds(i * 50,j * 50,50, 50);//x axis, y axis, width, height
//                b.addActionListener((l) -> {
//                    if(b.getBackground() == Color.CYAN) {
//                        b.setBackground(Color.PINK);
//                    } else {
//                        b.setBackground(Color.CYAN);
//                    }
//                });
//                b.setBackground(Color.PINK);
//                f.add(b);//adding button in JFrame
//            }
//        }
//        f.setSize(500,500);//400 width and 500 height
//        f.setResizable(false);
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible
//        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     *
     * @param a
     * @return
     */
    public static int add2(int a) {     //Érték szerinti paraméterátadás
        System.out.println("Paraméter: " + a);
        a = 5;
        return a;
    }

    public static Cica cicaIze(Cica c) {    //Referencia szerinti paraméterátadás
        System.out.println(c);
//        Cica c2 = new Cica();
//        c2.nev = c.nev;
//        c2.eletkor = c.eletkor;
        c.eletkor = 12;
        c.nev = "Feri";
        return c.clone();
    }

}
