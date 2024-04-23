package classes;

public class Neighbours implements Observer {
    private float distance;

    public Neighbours() {

    }

    public Neighbours(float distance) {
        this.distance = distance;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.printf("There is going to be an event: %s, at a distance of: %.2f\n", message, distance);
    }
}
