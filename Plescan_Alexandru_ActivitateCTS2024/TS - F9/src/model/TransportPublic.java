package model;

import java.util.HashMap;
import java.util.Map;

public class TransportPublic {
    private static Map<Integer, Flyweight> linii = new HashMap<>();

    public static Flyweight getLinie(int numarLinie, String primaStatie, String ultimaStatie) {
        if (linii.containsKey(numarLinie)) {
            return linii.get(numarLinie);
        }
        Flyweight linieNoua = new Linie(numarLinie, primaStatie, ultimaStatie);
        linii.put(numarLinie, linieNoua);
        return  linieNoua;
    }

}
