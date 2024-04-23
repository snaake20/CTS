package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    public Observable(List<Observer> observers) {
        this.observers = observers;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifiyObservers(String message) {
        for (Observer o : getObservers()) {
            o.receiveMessage(message);
        }
    }

    public abstract void notifySoccerMatch();
    public abstract void notifyVolleyMatch();
    public abstract void notifyHandbalMatch();
}
