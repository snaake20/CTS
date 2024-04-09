package Classes;

public abstract class Structura {
    protected String nume;

    public Structura(String nume) {
        this.nume = nume;
    }

    public abstract void adaugaStructura(Structura sa);
    public abstract void stergeStructura(Structura sa);
    public abstract Structura getStructura(int index);
    public abstract void afiseazaDescriere(String indent);
}
