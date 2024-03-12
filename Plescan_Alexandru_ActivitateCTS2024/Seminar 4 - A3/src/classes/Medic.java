package classes;

public class Medic extends PersonalSpital {
    public Medic(String nume, Float salariu) {
        super(nume, salariu);
    }
    @Override
    public void afisare() {
        System.out.printf("Membru personal spital %s are salariul %f si este medic.\n", getNume(), getSalariu());
    }
}
