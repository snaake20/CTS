package classes;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, Float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.printf("Membru personal spital %s are salariul %f si este brancardier.\n", getNume(), getSalariu());
    }
}
