public class Binary {
  public static void main(String[] args) {
    if (args.length >= 2) {
      int a = Integer.parseInt(args[0], 2);
      int b = Integer.parseInt(args[1], 2);
      System.out.println(a + " " + b);
      int eredmeny = a + b;
      String binary = Integer.toBinaryString(eredmeny);
      System.out.println(binary);
    } else {
      System.out.println("Nincs elég bemenet!");
    }
  }
}