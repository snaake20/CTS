package Main;

import Classes.*;

public class Program {
    public static void main(String[] args) {
        IDiagnostic d1 = new Diagnostic("Raceala", "Rosu in gat", false);
        d1.printare();

        ADecorator d2 = new DAplicatieMobila(d1);
        d2.printare();
        d2.afisareOnline();

        ADecorator d3 = new DWebsite(d1);
        d3.afisareOnline();

        ADecorator d4 = new DWebsite(d2);
        d4.printare();
        d4.afisareOnline();
    }
}
