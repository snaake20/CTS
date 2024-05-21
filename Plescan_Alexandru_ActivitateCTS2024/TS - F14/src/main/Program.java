package main;

import model.Autobuz;
import model.MijlocTransportPublic;
import model.Tramvai;

public class Program {
    public static void main(String[] args) {
        MijlocTransportPublic tramvai = new Tramvai();
        tramvai.parcurge(true);
        tramvai.parcurge(false);

        MijlocTransportPublic autobuz = new Autobuz();
        autobuz.parcurge(true);
        autobuz.parcurge(false);
    }
}
