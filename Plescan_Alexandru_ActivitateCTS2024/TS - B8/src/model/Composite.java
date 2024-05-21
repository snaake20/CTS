package model;

public abstract class Composite {

    private String nume;

    public Composite(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    abstract public void adaugaSubsectiune(Composite sect);
    abstract public void stergeSubsectiune(Composite sect);
    abstract public Composite getSubsectiune(int index);
    abstract public void afisare(String indent);
}
