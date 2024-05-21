package model;

public class VerificarePersoanaFizica implements Strategy {
    @Override
    public void verificaActe() {
        System.out.println("Se verifica buletin si adeverinta de la munca");
    }
}
