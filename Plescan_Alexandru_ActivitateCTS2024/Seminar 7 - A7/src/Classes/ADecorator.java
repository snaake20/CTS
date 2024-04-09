package Classes;

public abstract class ADecorator implements IDiagnostic {
    private IDiagnostic diagnostic;

    public ADecorator(IDiagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printare() {
        this.diagnostic.printare();
        System.out.println("Puteti gasi rezultatul si pe platforma");
    }

    public abstract void afisareOnline();

    public IDiagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(IDiagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String getNume() {
        return diagnostic.getNume();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }
}
