package classes;

public class Facade {
    public void creareCont(Persoana p) {
        boolean eMinor = VerificareVarsta.verificareVarsta(p.getVarsta());
        if (eMinor) {
            System.out.println("Persoana este minora, nu se poate face cont");
            return;
        }
        boolean areCazier = Cazier.verificareCazier(p.getNume());
        if (areCazier) {
            System.out.println("Persoana are cazier, nu se poate face cont");
            return;
        }
        boolean areCreante = VerificareCreante.verificareCreante(p.getValoareCreante());
        if (areCreante) {
            System.out.println("Persoana are create la alte banci, nu se poate face cont");
            return;
        }
        System.out.println("S-a facut un cont bancar pentru: \n" + p);
    }
}
