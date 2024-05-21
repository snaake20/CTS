package model;

public class Banca {
    private Strategy modVerificare;

    public void setModVerificare(Strategy modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaClient() {
        modVerificare.verificaActe();
    }
}
