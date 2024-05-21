package model;

public class Linie implements Flyweight {

    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int numarLinie, String primaStatie, String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void anunta(Autobuz autobuz) {
        System.out.printf("Linia %d, circula de la %s la %s, autobuzul in functiune este: %s\n", numarLinie, primaStatie, ultimaStatie, autobuz);
    }
}
