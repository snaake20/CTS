package main;

import model.Autobuz;
import model.Flyweight;
import model.TransportPublic;

public class Program {
    public static void main(String[] args) {
        Flyweight linie1 = TransportPublic.getLinie(1, "prima1", "ultima1");
        Flyweight linie2 = TransportPublic.getLinie(2, "prima2", "ultima2");
        Flyweight linie3 = TransportPublic.getLinie(3, "prima3", "ultima3");

        Autobuz a1 = new Autobuz("MODEL1", 1999, 20);
        Autobuz a2 = new Autobuz("MODEL2", 2000, 22);
        Autobuz a3 = new Autobuz("MODEL3", 2002, 12);

        linie1.anunta(a1);
        linie1.anunta(a2);

        linie2.anunta(a3);

        linie3.anunta(a2);
        linie3.anunta(a3);

    }
}
