package main;

import model.Composite;
import model.Item;
import model.Sectiune;

public class Program {
    public static void main(String[] args) {
        Composite bauturi = new Sectiune("Bauturi");

        Composite sectiuneCafea = new Sectiune("Cafea");
        Composite sectiuneSucuri = new Sectiune("Sucuri");
        Composite sectiuneApa = new Sectiune("Apa");

        bauturi.adaugaSubsectiune(sectiuneCafea);
        bauturi.adaugaSubsectiune(sectiuneSucuri);
//        bauturi.adaugaSubsectiune(sectiuneApa);

        sectiuneCafea.adaugaSubsectiune(sectiuneApa);

        Composite apaMinerala = new Item("Apa Minerala");
        Composite apaPlata = new Item("Apa Plata");

        sectiuneApa.adaugaSubsectiune(apaMinerala);
        sectiuneApa.adaugaSubsectiune(apaPlata);

        bauturi.afisare("");
    }
}
