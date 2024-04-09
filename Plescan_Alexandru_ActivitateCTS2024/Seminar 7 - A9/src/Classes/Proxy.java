package Classes;

public class Proxy extends APersoana {

    APersoana persoana;

    public Proxy(String nume, boolean eAsigurat, APersoana persoana) {
        super(nume, eAsigurat);
        this.persoana = persoana;
    }

    @Override
    public void internare() {
        if (!persoana.eAsigurat) {
            System.out.println("Nu poate fi internat, nu are asigurare");
            return;
        }
        persoana.internare();
    }
}
