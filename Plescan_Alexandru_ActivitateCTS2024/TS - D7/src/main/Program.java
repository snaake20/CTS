package main;

import classes.Facade;
import classes.Persoana;

public class Program {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Andrei", 19, 0);
        Persoana p2 = new Persoana("Alin", 16, 0);
        Persoana p3 = new Persoana("Gigel", 21, -10);
        Persoana p4 = new Persoana("Dragos", 20, 0);

        Facade facade = new Facade();

        facade.creareCont(p1);
        facade.creareCont(p2);
        facade.creareCont(p3);
        facade.creareCont(p4);
    }
}
