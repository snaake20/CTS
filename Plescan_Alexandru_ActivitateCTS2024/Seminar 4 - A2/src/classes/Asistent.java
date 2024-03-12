package classes;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, Float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.printf("Membru personal spital %s are salariul %f si este asistent.\n", getNume(), getSalariu());
    }
}
