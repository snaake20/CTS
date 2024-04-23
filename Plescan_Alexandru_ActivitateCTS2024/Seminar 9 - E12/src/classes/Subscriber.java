package classes;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.printf("%s has received the following message: %s\n", name, message);
    }
}
