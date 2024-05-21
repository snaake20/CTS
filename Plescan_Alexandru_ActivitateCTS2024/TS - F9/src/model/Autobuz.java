package model;

public class Autobuz {
    private String model;
    private int an;
    private int nrPasageri;

    public Autobuz(String model, int an, int nrPasageri) {
        this.model = model;
        this.an = an;
        this.nrPasageri = nrPasageri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nrPasageri=" + nrPasageri +
                '}';
    }
}
