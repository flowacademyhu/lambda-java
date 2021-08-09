import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincs bemenet");
            System.exit(0);
        }
        int a;
        try {   // Megpróbálja lefuttatni
            a = Integer.parseInt(args[0]);
            System.out.println(a);
//            int[] tomb = new int[1];
//            tomb[2] = 10;
            a /= 0;
            System.out.println("minden oké");
        } catch (NumberFormatException n) {
            System.out.println("Ez nem szám!");
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Tömb túlindexelés vagy bármi" + e);
        } finally { // Lefut mindig
            a = -1;
            System.out.println("Finally");
        }
        System.out.println("Almafa" + a);
        try {
            doSomeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ez kellemetlen");
        }

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Nincs meg a fájl");
        }
       // throw new RuntimeException("Cica");
        try {
            int b = sumPositiveNumbers(10, -20);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e);
        }
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(40);
        //list.remove(new Integer(10));
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) % 20 == 0) {
//                list.remove(i);
//                //i--;
//            }
//        }
        for(int num : list) {
            if(num % 20 == 0) {
                list.remove(new Integer(num));
                //i--;
            }
        }
        System.out.println(list);
    }

    public static void doSomeException() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[1];
        arr[2] = 10;
        System.out.println("OK");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("cica.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            System.out.println(row);
        }
    }

    public static int sumPositiveNumbers(int a, int b) throws Exception {
        if(a < 0 || b < 0) {
            //throw new IllegalArgumentException("Negative number");
            //throw new Exception("Cica");
            throw new NincsKegyelemException("Lenn az utszán");
        }
        System.out.println("Sum:" + (a + b));
        return a + b;
    }
}
