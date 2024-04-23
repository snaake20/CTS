package main;

import classes.*;

public class Program {
    public static void main(String[] args) {
        Observer neighbours = new Neighbours(200);
        Observer s1 = new Subscriber("1");
        Observer s2 = new Subscriber("2");
        Observer s3 = new Subscriber("3");

        Observable field = new Field();
        field.addObserver(neighbours);
        field.addObserver(s1);
        field.addObserver(s2);

        field.notifyHandbalMatch();

        field.addObserver(s3);

        field.notifySoccerMatch();

        field.removeObserver(neighbours);

        field.notifyVolleyMatch();

    }
}
