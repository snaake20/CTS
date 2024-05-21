package model;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends Composite {
    private List<Composite> subItemi = new ArrayList<>();

    public Sectiune(String nume) {
        super(nume);
    }

    @Override
    public void adaugaSubsectiune(Composite sect) {
        subItemi.add(sect);
    }

    @Override
    public void stergeSubsectiune(Composite sect) {
        subItemi.remove(sect);
    }

    @Override
    public Composite getSubsectiune(int index) {
        return subItemi.get(index);
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent + getNume());
        subItemi.forEach((item) -> {
            item.afisare("\t");
        });
    }
}
