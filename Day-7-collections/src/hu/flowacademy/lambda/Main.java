package hu.flowacademy.lambda;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long timeSum = 0;
//        int count = 50;
//        for(int j = 0; j < count; j++) {
//            List<Integer> al = new ArrayList<>();
//            for (int i = 0; i < 1000000; i++) {
//                al.add((int) Math.round(Math.random() * 100));
//            }
//            long startTimeAdd = System.nanoTime();
//            al.get(950000);
//            timeSum += System.nanoTime() - startTimeAdd;
//        }
//        System.out.println("Avg " + timeSum / (double)count);

//        testListAdd(true);
//        testListAdd(true);
//        testListAdd(false);
//        testListGet(true);
//        testListGet(false);
        Set<Double> halmazom = new TreeSet<>();
        halmazom.add(10.0);
        halmazom.add(2.5);
        halmazom.add(1.3);
        if(halmazom.contains(1.3)){
            System.out.println("Benne");
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Alma");
        map.put(20, "Kukac");
        map.get(10);
        String adat = "Egy alma ami alma de nem ma";
        Map<String, Integer> szoSzam = new HashMap<>();
        String[] szavak = adat.split(" ");
        for(String szo : szavak) {
            if(szoSzam.containsKey(szo)) {
                szoSzam.replace(szo, szoSzam.get(szo) + 1);
            } else {
                szoSzam.put(szo, 1);
            }
        }

        for (Map.Entry<String, Integer> elem : szoSzam.entrySet()) {
            System.out.println(elem.getKey() + "\t" + elem.getValue());
        }
    }

    public static void testListAdd(boolean isArrayList) {
        long timeSum = 0;
        int count = 50;
        for(int j = 0; j < count; j++) {
            List<Integer> al;
            if(isArrayList) {
                al = new ArrayList<>(1000000000);
            } else {
                al = new LinkedList<>();
            }
            long startTimeAdd = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                al.add((int) Math.round(Math.random() * 100));
            }
            timeSum += System.currentTimeMillis() - startTimeAdd;
        }
        System.out.println((isArrayList?"ArrayList": "LinkedList")+" ADD Avg " + timeSum / (double)count);
    }

    public static void testListGet(boolean isArrayList) {
        long timeSum = 0;
        int count = 50;
        for(int j = 0; j < count; j++) {
            List<Integer> al;
            if(isArrayList) {
                al = new ArrayList<>(100000);
            } else {
                al = new LinkedList<>();
            }
            for (int i = 0; i < 1000000; i++) {
                al.add((int) Math.round(Math.random() * 100));
            }
            long startTimeAdd = System.nanoTime();
            al.get(950000);
            timeSum += System.nanoTime() - startTimeAdd;
        }
        System.out.println((isArrayList?"ArrayList": "LinkedList")+ " Avg GET " + timeSum / (double)count);
    }
}
