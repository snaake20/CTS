package classes;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age);
    }

    public void eat(String s) {
        System.out.println("The Zebra: " + getName() + " of age " + getAge()  + " eats food");
    }
}
