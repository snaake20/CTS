package classes;

public class Field extends Observable {

    @Override
    public void notifySoccerMatch() {
        super.notifiyObservers("Soccer Match");
    }

    @Override
    public void notifyVolleyMatch() {
        super.notifiyObservers("Volley Match");
    }

    @Override
    public void notifyHandbalMatch() {
        super.notifiyObservers("Handbal Match");
    }
}
