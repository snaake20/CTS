package classes;
public class VanzareBilet implements Vanzare {

    private String meci;

    private int pret;

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }

    public String getMeci() {
        return meci;
    }

    public void setMeci(String meci) {
        this.meci = meci;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public void vanzare(Persoana p) {
        System.out.printf("Persoana %s a cumparat un bilet la meciul %s platind %d\n", p.getNume(), meci, pret);
    }
}
