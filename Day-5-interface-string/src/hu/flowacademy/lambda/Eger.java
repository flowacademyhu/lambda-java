package hu.flowacademy.lambda;

public class Eger {

    private boolean cincogE;

    public Eger(boolean cincogE) {
        this.cincogE = cincogE;
    }

    public void egerezik() {
        System.out.println("asd");
    }
    @Override
    public String toString() {
        return "Eger{" +
                "cincogE=" + cincogE +
                '}';
    }
}
