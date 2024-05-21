package model;

public class Item extends Composite {

    public Item(String nume) {
        super(nume);
    }

    @Override
    public void adaugaSubsectiune(Composite sect) {
        throw new UnsupportedOperationException("Item-ul nu suporta adaugarea unor subsectiuni");
    }

    @Override
    public void stergeSubsectiune(Composite sect) {
        throw new UnsupportedOperationException("Item-ul nu suporta stergerea unor subsectiuni");
    }

    @Override
    public Composite getSubsectiune(int index) {
        throw new UnsupportedOperationException("Item-ul nu suporta returnarea unei subsectiuni");
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent + indent + getNume());
    }
}
