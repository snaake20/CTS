package main;

import classes.Credit;
import classes.ICredit;
import classes.ProxyCredit;

public class Program {
    public static void main(String[] args) {
        ICredit creditE = new Credit("EUR", 20000);
        ICredit creditR = new Credit("RON", 20000);

        creditE.acordaCredit();
        creditR.acordaCredit();

        ICredit proxyCreditE = new ProxyCredit(creditE);
        ICredit proxyCreditR = new ProxyCredit(creditR);

        proxyCreditE.acordaCredit();
        proxyCreditR.acordaCredit();

    }
}
