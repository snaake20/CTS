import classes.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public enum EFeedType {
        OMNIVORE,
        CARNIVORE,
        HERBIVORE,
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("ZOOKEPER");
        Map<Animal, String> animalStringMap = new HashMap<>();
        Zoo zoo = new Zoo("ZOO", zooKeeper, animalStringMap);

        zoo.addAnimal(new Zebra("Marty", 10), "Grass");
        zoo.addAnimal(new Lion("Alex", 20), "Marty");
        zoo.addAnimal(new Cat("Tom", 2), "Fish");
        zoo.feedAllAnimals();

        System.out.println(EFeedType.CARNIVORE);
    }
}
