public class Main {
  public static void main(String[] args) {
    Ember adam = new Ember("Ádám", 27, false);  // Példányosítás
    adam.koszon();
    adam.setKor(20);
    System.out.println(adam.getKor());
    Ember erik = new Ember("Erik", 27, false);
    erik.koszon();
    System.out.println(erik);
  }  
}