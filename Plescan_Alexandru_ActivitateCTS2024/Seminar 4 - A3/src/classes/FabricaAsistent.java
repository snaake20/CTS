package classes;

public class FabricaAsistent implements FabricaPersonalSpital {
    @Override
    public PersonalSpital create_personal(String nume, Float salariu) {
        return new Asistent(nume, salariu);
    }
}
