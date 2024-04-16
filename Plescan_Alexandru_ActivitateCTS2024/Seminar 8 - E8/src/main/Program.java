package main;

import classes.*;

public class Program {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Minor", 13, "M");
        Persoana p2 = new Persoana("Majoar", 18, "F");
        Persoana p3 = new Persoana("Major M", 18, "M");
        Vanzare vanzareNormala = new VanzareBilet("Rapid - FCSB", 50);

//        vanzareNormala.vanzare(p1);

        Vanzare vanzareProxy = new VanzareMajori(vanzareNormala, 14);

        vanzareProxy.vanzare(p1);
        vanzareProxy.vanzare(p2);

        Vanzare vanzare2 = new VanzareBilet("Jake Paul vs Mike Tyson", 100);
        Vanzare vanzareProxyGen = new VanzareGen(new VanzareMajori(vanzare2, 18), "M");

        vanzareProxyGen.vanzare(p1);
        vanzareProxyGen.vanzare(p2);
        vanzareProxyGen.vanzare(p3);
    }
}
