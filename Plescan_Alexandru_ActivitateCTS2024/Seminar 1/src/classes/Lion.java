package classes;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    public void eat(String food) {
        System.out.println("The Lion: " + getName() + " of age " + getAge()  + " eats food");
    }
}
