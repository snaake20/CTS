package program;

import classes.EPersonalSpital;
import classes.FabricaPersonalSpital;
import classes.PersonalSpital;

public class Program {
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaPersonalSpital = new FabricaPersonalSpital();
        try {
            PersonalSpital asistent = fabricaPersonalSpital.create_type(EPersonalSpital.ASISTENT, "George", 200.5F);
            PersonalSpital brancardier = fabricaPersonalSpital.create_type(EPersonalSpital.BRANCARDIER, "Barney", 500F);
            PersonalSpital medic = fabricaPersonalSpital.create_type(EPersonalSpital.MEDIC, "Hilbert", 5000F);
            asistent.afisare();
            medic.afisare();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
