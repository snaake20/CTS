package Classes;

public class DWebsite extends ADecorator {

    public DWebsite(IDiagnostic diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.printf("Website: Diagnostic: %s, Simptome: %s, Necesita Spitalizare: %s\n", getDiagnostic().getNume(), getDiagnostic().getSimptome(), getDiagnostic().isNecesitaSpitalizare() ? "da" : "nu");
    }
}
