package main;

import model.*;

public class Program {
    public static void main(String[] args) {
        Handler troleibuz = new Troleibuz();
        Handler autobuz = new Autobuz();
        Handler tramvai = new Tramvai();
        Handler metrou = new Metrou();

        troleibuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        // Calator cu 5km distanta
        troleibuz.calatoreste(5);

        troleibuz.calatoreste(2);

        troleibuz.calatoreste(12);

        troleibuz.calatoreste(9);

        troleibuz.calatoreste(4);
    }
}
