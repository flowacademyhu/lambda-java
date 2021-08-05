package hu.flowacademy.lambda.osztalyok;

public class Macska extends Allat {
    boolean motivaltCicaE;
    boolean dorombolE;

    public Macska(String name, int age, boolean isMale, boolean motivaltCicaE, boolean dorombolE) {
        super(name, age, isMale);
        this.motivaltCicaE = motivaltCicaE;
        this.dorombolE = dorombolE;
    }

    public boolean isMotivaltCicaE() {
        return motivaltCicaE;
    }

    public void setMotivaltCicaE(boolean motivaltCicaE) {
        this.motivaltCicaE = motivaltCicaE;
    }

    public boolean isDorombolE() {
        return dorombolE;
    }

    public void setDorombolE(boolean dorombolE) {
        this.dorombolE = dorombolE;
    }

    @Override
    public String toString() {
        return "Macska{" +
                "motivaltCicaE=" + motivaltCicaE +
                ", dorombolE=" + dorombolE + super.toString() +
                '}';
    }

    public void hangotAd(int number) {
        if (number > 10 && motivaltCicaE == true) {
            System.out.println("Meow");
        } else {
            System.out.println("Zzzz");
        }
    }

    public void doMacskaThings() {
        System.out.println("I'm doing macska things");
    }
}