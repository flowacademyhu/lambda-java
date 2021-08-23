package hu.flowacademy.lambda;

public enum CicaAllapot{
    ESZIK("eszik"),
    ALSZIK("alszik"),
    JATSZIK("játszik");

    private final String szoveg;

    CicaAllapot(String szoveg) {
        this.szoveg = szoveg;
    }

    public String getSzoveg() {
        return szoveg;
    }

}
