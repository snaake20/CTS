package classes;

public class FabricaPersonalSpital {
    public PersonalSpital create_type(EPersonalSpital type, String nume, Float salariu) {
        return switch (type) {
            case ASISTENT -> new Asistent(nume, salariu);
            case BRANCARDIER -> new Brancardier(nume, salariu);
            case MEDIC -> new Medic(nume, salariu);
        };
    }
}
