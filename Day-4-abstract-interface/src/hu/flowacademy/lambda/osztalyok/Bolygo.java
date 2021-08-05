package hu.flowacademy.lambda.osztalyok;

public class Bolygo extends Egitest {

    private boolean vanLegkore;
    private boolean vanElet;

    public Bolygo(double tomeg, String nev, boolean vanLegkore, boolean vanElet) {
        super(tomeg, nev);
        this.vanLegkore = vanLegkore;
        this.vanElet = vanElet;
    }

    public boolean isVanLegkore() {
        return vanLegkore;
    }

    public void setVanLegkore(boolean vanLegkore) {
        this.vanLegkore = vanLegkore;
    }

    public boolean isVanElet() {
        return vanElet;
    }

    public void setVanElet(boolean vanElet) {
        this.vanElet = vanElet;
    }

    @Override
    public String lefotozom() {
        return "Szép bolygó vagyok" + (this.vanElet?" van ": " nincs ") + "élet rajtam!";
    }

    @Override
    public String toString() {
        return "Bolygo{" +
                "vanLegkore=" + vanLegkore +
                ", vanElet=" + vanElet +
                '}';
    }
}
