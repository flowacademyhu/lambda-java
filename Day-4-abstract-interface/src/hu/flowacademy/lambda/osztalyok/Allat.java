package hu.flowacademy.lambda.osztalyok;

public class Allat {
    String name;
    int age;
    boolean isMale;

    public Allat() {
        this("Józsi", 12, true);    // Paraméteres konstruktor hívása
    }

    public Allat(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void hangotAd (int number) {
        if (number % 2 == 0) {
            System.out.println("Nem adok hangot");
        } else {
            System.out.println("Állati hang");
        }
    }

    @Override
    public String toString() {
        return "Állat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
