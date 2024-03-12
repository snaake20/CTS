package program;

import classes.Reteta;
import classes.Solutie;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Reteta r1 = new Reteta();
        List<Solutie> solutii = new ArrayList<Solutie> (){{
            add(new Solutie("s1", 2.5f));
            add(new Solutie("s2", 3.4f));
        }};
        r1.setSolutii(solutii);
        Reteta r2 = (Reteta) r1.copiaza();
    }
}
