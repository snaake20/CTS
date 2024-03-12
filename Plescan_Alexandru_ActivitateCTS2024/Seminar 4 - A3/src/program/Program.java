package program;

import classes.*;

public class Program {
    public static void process(FabricaPersonalSpital fabrica) {
        PersonalSpital ps = fabrica.create_personal("Gigel", 200F);
        ps.afisare();
    }
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaAsistent = new FabricaAsistent();
        FabricaPersonalSpital fabricaBrancardier = new FabricaBrancardier();
        FabricaPersonalSpital fabricaMedic = new FabricaMedic();

        process(fabricaAsistent);
        process(fabricaBrancardier);
        process(fabricaMedic);
    }
}
