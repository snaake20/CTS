package main;

import model.Banca;
import model.Strategy;
import model.VerificarePersoanaFizica;
import model.VerificarePersoanaJuridica;

public class Program {
    public static void main(String[] args) {
        Banca b = new Banca();

        Strategy verifPersFiz = new VerificarePersoanaFizica();
        Strategy verifPersJur = new VerificarePersoanaJuridica();

        // vine un client pers fizica
        b.setModVerificare(verifPersFiz);
        b.verificaClient();

        b.verificaClient();

        // vine un client pers juridica
        b.setModVerificare(verifPersJur);
        b.verificaClient();
    }
}
