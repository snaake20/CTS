package classes;

public class FabricaBrancardier implements FabricaPersonalSpital{
    @Override
    public PersonalSpital create_personal(String nume, Float salariu) {
        return new Brancardier(nume, salariu);
    }
}
