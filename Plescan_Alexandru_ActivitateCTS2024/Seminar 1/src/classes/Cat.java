package classes;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The pet cat: " + getName() + " of age " + getAge()  + " eats food");
    }
}
