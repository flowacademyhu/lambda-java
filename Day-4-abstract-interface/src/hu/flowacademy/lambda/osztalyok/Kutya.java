package hu.flowacademy.lambda.osztalyok;


public class Kutya extends Allat {
    boolean ugatosE;
    boolean harapE;
    public Kutya(String name, int age, boolean isMale, boolean ugatosE, boolean harapE) {
        super(name, age, isMale);
        this.ugatosE = ugatosE;
        this.harapE = harapE;
    }
    public boolean isUgatosE() {
        return ugatosE;
    }
    public void setUgatosE(boolean ugatosE) {
        this.ugatosE = ugatosE;
    }
    public boolean isHarapE() {
        return harapE;
    }
    public void setHarapE(boolean harapE) {
        this.harapE = harapE;
    }
    @Override
    public String toString() {
        return "Kutya{" +
                "ugatosE=" + ugatosE +
                ", harapE=" + harapE + super.toString() +
                '}';
    }
    public void hangotAd(int number) {
        if (number % 2 == 1 && ugatosE == true) {
            System.out.println("Woof woof");
        } else {
            System.out.println("---");
        }
    }
}

