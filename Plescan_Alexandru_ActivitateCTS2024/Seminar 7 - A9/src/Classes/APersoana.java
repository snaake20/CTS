package Classes;

public abstract class APersoana {
    protected String nume;
    protected boolean eAsigurat;

    public APersoana(String nume, boolean eAsigurat) {
        this.nume = nume;
        this.eAsigurat = eAsigurat;
    }

    public abstract void internare();
}
