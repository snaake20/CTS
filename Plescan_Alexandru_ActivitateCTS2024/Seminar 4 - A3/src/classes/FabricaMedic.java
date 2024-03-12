package classes;

public class FabricaMedic implements FabricaPersonalSpital {
    @Override
    public PersonalSpital create_personal(String nume, Float salariu) {
        return new Medic(nume, salariu);
    }
}
