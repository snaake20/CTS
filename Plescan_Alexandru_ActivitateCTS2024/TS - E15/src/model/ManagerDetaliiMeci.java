package model;

import java.util.ArrayList;
import java.util.List;

public class ManagerDetaliiMeci {
    private List<DetaliiMeci> mementoDetaliiMeci = new ArrayList<>();

    public void pushMemento(DetaliiMeci dm) {
        mementoDetaliiMeci.add(dm);
    }

    public DetaliiMeci getMemento(int index) {
        return mementoDetaliiMeci.get(index);
    }

    public DetaliiMeci popMemento() throws Exception {
        if (mementoDetaliiMeci.isEmpty()) {
            throw new Exception("Empty list");
        }
        DetaliiMeci dm = mementoDetaliiMeci.get(mementoDetaliiMeci.size() - 1);
        mementoDetaliiMeci.remove(dm);
        return dm;
    }

}
