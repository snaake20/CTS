package classes;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private Map<Animal, String> animals;

    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    public Map<Animal, String> getAnimals() {
        return animals;
    }

    public void setAnimals(Map<Animal, String> animals) {
        this.animals = animals;
    }

    public void feedAllAnimals() {
        if (animals == null) return;
        animals.entrySet().forEach((entry -> {
            zooKeeper.feedAnimal(entry.getKey(), entry.getValue());
        }));
    }

    public void addAnimal(Animal animal, String food) {
        if (animals == null) {
            animals = new HashMap<>();
        }
        animals.put(animal,food);
    }
}
