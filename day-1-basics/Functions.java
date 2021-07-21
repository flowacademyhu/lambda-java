public class Functions {

  public static void main(String[] args) {
    int n = 10;
    System.out.println(sum(5, 10));
    double d = divide(n, 3);
  }

  public static int sum(int a, int b) { // A függvénynek mindig van típusa, vagy void
    int eredmeny = a + b;
    System.out.println(eredmeny);
    return eredmeny;  // Kötelező a visszatérési érték, ha van visszatérési típusa a függvénynek
  } 

  public static double divide(double a, int b) {
    double eredmeny = (double)a / b;
    return eredmeny;
  }

}