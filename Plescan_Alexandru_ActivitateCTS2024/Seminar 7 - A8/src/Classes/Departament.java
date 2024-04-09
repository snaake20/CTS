package Classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends Structura {
    private List<Structura> structuri;

    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.structuri = new ArrayList<>();
        this.directorDepartament = directorDepartament;
    }

    @Override
    public void adaugaStructura(Structura sa) {
        structuri.add(sa);
    }

    @Override
    public void stergeStructura(Structura sa) {
        structuri.remove(sa);
    }

    @Override
    public Structura getStructura(int index) {
        if (index < 0 || index > structuri.size()) throw new IndexOutOfBoundsException();
        return structuri.get(index);
    }

    @Override
    public void afiseazaDescriere(String indent) {
        System.out.printf("%sDepartamentul %s are directorul: %s si are urmatoarea componenta:\n", indent, nume, directorDepartament);
        for (Structura s : structuri) {
            s.afiseazaDescriere(indent + indent);
        }
    }
}
