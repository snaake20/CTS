package Classes;

public class Diagnostic implements IDiagnostic {
    private String nume;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String nume, String simptome, boolean necesitaSpitalizare) {
        this.nume = nume;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public void printare() {
        System.out.printf("Nume diagnostic: %s, simptome: %s, necesita spitalizare: %s\n", nume, simptome, necesitaSpitalizare ? "da" : "nu");
    }

    public String getNume() {
        return nume;
    }

    public String getSimptome() {
        return simptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }
}
