package hu.flowacademy.lambda;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Szigetke {
    int balPart;
    int jobbPart;
    int szelesseg;

    @Override
    public String toString() {
        return "{" +
                " balPart= " + balPart +
                ", jobbPart= " + jobbPart +
                ", szelesseg= " + szelesseg +
                '}';
    }
}

public class Sziget {

    static List<Integer> magassagok = new ArrayList<>();

    public static void main(String[] args) {
        try {
            readFile("sziget.txt");
            feladat1();
        } catch (Exception e) {
            System.out.println("Ajjaj");
        }
    }

    public static void readFile(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String line = br.readLine();
        while (line != null) {
            magassagok.add(Integer.parseInt(line));
            line = br.readLine();
        }
    }

    public static void feladat1() {
        List<Szigetke> szigetek = new ArrayList<>();
        boolean isSziget = true;
        Szigetke aktualis = new Szigetke();
        aktualis.balPart = magassagok.get(0);
        for(int i = 0; i < magassagok.size(); i++) {
            int aktualisMagassag = magassagok.get(i);
            if(isSziget && aktualisMagassag > 0) {
                aktualis.szelesseg++;
                continue;
            }
            if(isSziget && aktualisMagassag == 0) {
                aktualis.jobbPart = magassagok.get(i - 1);
                szigetek.add(aktualis);
                isSziget = false;
                aktualis = new Szigetke();
                continue;
            }
            if(!isSziget && aktualisMagassag > 0) {
                aktualis.balPart = aktualisMagassag;
                isSziget = true;
                aktualis.szelesseg++;
                continue;
            }
        }
        System.out.println(szigetek);

    }
}
