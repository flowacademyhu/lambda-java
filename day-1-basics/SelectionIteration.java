public class SelectionIteration {

  public static void main(String[] args) {
    int szam = Integer.parseInt(args[0]);
    if (szam > 10) {
      System.out.println("Nagyobb mint tíz");
    } else {
      System.out.println("Kisebb egyenlő tíz");
    }

    for (int i = 0; i < szam; i++) {
     // System.out.println(i + ". cica");   // A println tesz sortörést
      System.out.print(i + ". cica ");      // A sima print nem tesz sortörést
    }

    while(szam > 0) {
      System.out.println(szam);
      szam--;
    }
  }

  

}