package main;

import classes.CardContactless;
import classes.DecoratorContactless;
import classes.IPlataCuCardul;
import classes.Card;

public class Program {
    public static void main(String[] args) {
        IPlataCuCardul card = new Card();

        card.platesteOnline();
        card.platesteNormal();

        DecoratorContactless cardContactless = new CardContactless(card);

        cardContactless.platesteNormal();
        cardContactless.platesteOnline();
        cardContactless.platesteContactless();

    }
}
