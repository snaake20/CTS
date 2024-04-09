package Classes;

public class DAplicatieMobila extends ADecorator{
    public DAplicatieMobila(IDiagnostic diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.printf("App: Diagnostic: %s, Simptome: %s, Necesita Spitalizare: %s\n", getDiagnostic().getNume(), getDiagnostic().getSimptome(), getDiagnostic().isNecesitaSpitalizare() ? "da" : "nu");
    }
}
