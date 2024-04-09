package Classes;

public class Sectie extends Structura{
    private int nrAngajati;
    private String sefSectie;

    public Sectie(String nume, int nrAngajati, String sefSectie) {
        super(nume);
        this.nrAngajati = nrAngajati;
        this.sefSectie = sefSectie;
    }

    @Override
    public void adaugaStructura(Structura sa) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void stergeStructura(Structura sa) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Structura getStructura(int index) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void afiseazaDescriere(String indent) {
        System.out.printf("%sSectia %s este condusa de %s si are %d angajati\n", indent, nume, sefSectie, nrAngajati);
    }
}
