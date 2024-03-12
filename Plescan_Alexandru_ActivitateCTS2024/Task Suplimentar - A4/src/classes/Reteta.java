package classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta {
    private List<Solutie> solutii;

    public Reteta() {
        solutii = new ArrayList<>();
    }

    public void setSolutii(List<Solutie> solutii) {
        this.solutii = solutii;
    }

    @Override
    public IReteta copiaza() {
        Reteta copieReteta = new Reteta();
        List<Solutie> tmpDeepCopy = new ArrayList<>(solutii);
        copieReteta.setSolutii(tmpDeepCopy);
        return copieReteta;
    }
}
