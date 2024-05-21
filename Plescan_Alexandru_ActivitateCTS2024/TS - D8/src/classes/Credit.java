package classes;

public class Credit implements ICredit {

    private String moneda;
    private double valoare;

    public Credit(String moneda, double valoare) {
        this.moneda = moneda;
        this.valoare = valoare;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public void descriere() {
        System.out.printf("Credit moneda: %s in valoare de: %f\n", moneda, valoare);
    }

    @Override
    public void acordaCredit() {
        System.out.printf("Se acorda un credit cu moneda: %s in valoare de: %f\n", moneda, valoare);
    }
}
