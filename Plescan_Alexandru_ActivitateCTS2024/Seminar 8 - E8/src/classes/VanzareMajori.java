package classes;

public class VanzareMajori implements Vanzare {
    private Vanzare vanzare;

    private int varstaMinima;

    public VanzareMajori(Vanzare vanzare, int varstaMinima) {
        this.vanzare = vanzare;
        this.varstaMinima = varstaMinima;
    }


    @Override
    public void vanzare(Persoana p) {
        if (p.getVarsta() < varstaMinima) {
            System.out.printf("Nu se poate vinde un bilet persoanei %s\n", p.getNume());
            return;
        }
        vanzare.vanzare(p);
    }
}
