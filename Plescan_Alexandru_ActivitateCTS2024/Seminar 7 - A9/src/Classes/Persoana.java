package Classes;

public class Persoana extends APersoana {

    public Persoana(String nume, boolean eAsigurat) {
        super(nume, eAsigurat);
    }

    @Override
    public void internare() {
        System.out.printf("Persoana %s a fost internata\n", nume);
    }
}
