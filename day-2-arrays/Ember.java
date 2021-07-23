public class Ember {
  private String nev;   //adattagok
  private int kor;
  private boolean dolgozikE;
  
  public Ember(String nev, int kor, boolean dolgozikE) {  //konstruktor
    this.nev = nev;
    this.kor = kor;
    this.dolgozikE = dolgozikE;
  }

  public void setKor(int kor) { //Setter függvény
    if(kor >= this.kor) {
      this.kor = kor;
    } else {
      System.out.println("Nem lehetek fiatalabb!!!");
    }
  }

  public int getKor() { //Getter függvény
    return this.kor;
  }

  public void koszon(){ 
    System.out.println("Szia, " + nev + " vagyok!"); 
  }

  private void macska() {
    System.out.println("Meow");
  }

  public String toString() {
    return "Ember: név: " + nev + " kor: " + kor + 
      (dolgozikE?" ":" nem ") + "dolgozik";
  }
}