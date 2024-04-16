package main;

import classes.Flyweight;
import classes.FlyweightDetails;
import classes.FlyweightFactory;

public class Program {
    public static void main(String[] args) {
        FlyweightDetails d1 = new FlyweightDetails(5, 6, "Rosu");
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getCommonFlyweight(180, 50);
        flyweight.deseneaza(d1);
        FlyweightDetails d2 = new FlyweightDetails(10, 20, "Albastru");
        flyweight.deseneaza(d2);
        Flyweight f2 = flyweightFactory.getCommonFlyweight(180, 100);
        f2.deseneaza(d2);
    }
}
