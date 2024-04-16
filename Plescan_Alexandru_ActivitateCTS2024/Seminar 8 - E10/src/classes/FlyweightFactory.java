package classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweights;

    public FlyweightFactory() {
        flyweights = new HashMap<>();
    }

    public Flyweight getCommonFlyweight(int inaltime, int latime) {
        Flyweight f;
        String key = "" + inaltime + latime;
        if (!flyweights.containsKey(key)) {
            f = new FlyweightCommon(inaltime, latime);
            flyweights.put(key, f);
        } else {
            f = flyweights.get(key);
        }
        return f;
    }
}
