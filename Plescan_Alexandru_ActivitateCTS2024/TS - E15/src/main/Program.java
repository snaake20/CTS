package main;

import model.ManagerDetaliiMeci;
import model.Meci;

public class Program {
    public static void main(String[] args) throws Exception {
        ManagerDetaliiMeci managerDetaliiMeci = new ManagerDetaliiMeci();

        Meci m1 = new Meci("20.02.2023", "FCSB - RAPID", 200, 190, 100, 20, 10);
        managerDetaliiMeci.pushMemento(m1.salveazaStarea());

        m1.setData("23.02.2023");
        managerDetaliiMeci.pushMemento(m1.salveazaStarea());

        m1.setEchipeleCareAuJucat("DINAMO - VOLUNTARI");

        System.out.println(m1);

        System.out.println(managerDetaliiMeci.getMemento(0));

        m1.revinoLaStarea(managerDetaliiMeci.popMemento());

        System.out.println(m1);
    }
}
