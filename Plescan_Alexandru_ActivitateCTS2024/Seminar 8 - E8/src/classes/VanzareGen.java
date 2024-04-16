package classes;

public class VanzareGen implements Vanzare{

    private Vanzare vanzare;

    private String genAcceptat;

    public VanzareGen(Vanzare vanzare, String genAcceptat) {
        this.vanzare = vanzare;
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vanzare(Persoana p) {
        if (!p.getGen().equals(genAcceptat)) {
            System.out.printf("Persoana %s nu poate fi acceptata (gen)\n", p.getNume());
            return;
        }
        vanzare.vanzare(p);
    }
}
