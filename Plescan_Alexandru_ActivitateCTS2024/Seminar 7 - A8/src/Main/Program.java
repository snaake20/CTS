package Main;

import Classes.Departament;
import Classes.Sectie;
import Classes.Structura;

public class Program {
    public static void main(String[] args) {
        Structura s1 = new Sectie("P", 2, "M");
        Structura s2 = new Departament("MARE", "ALB");
        Structura s3 = new Sectie("ATI", 3, "@");
        Structura s4 = new Departament("MIC", "ROSU");

        s2.adaugaStructura(s1);
        s4.adaugaStructura(s3);
        s2.adaugaStructura(s4);
        s2.afiseazaDescriere("  ");
    }
}
