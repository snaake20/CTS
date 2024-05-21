package classes;

public class Persoana {

    private String nume;
    private int varsta;
    private double valoareCreante;

    public Persoana(String nume, int varsta, double valoareCreante) {
        this.nume = nume;
        this.varsta = varsta;
        this.valoareCreante = valoareCreante;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getValoareCreante() {
        return valoareCreante;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", valoareCreante=" + valoareCreante +
                '}';
    }
}
