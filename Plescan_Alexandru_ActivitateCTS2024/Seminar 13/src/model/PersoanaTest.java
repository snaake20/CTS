package model;

import java.util.Locale;

import static org.junit.Assert.*;

public class PersoanaTest {
    @org.junit.Test
    public void getSexF() {
        Persoana persoana = new Persoana("Simona", "4020123145123");
        assertEquals(persoana.getSex(), "F");
    }
    @org.junit.Test
    public void getSexM() {
        Persoana persoana = new Persoana("Simon", "3020123145123");
        assertEquals(persoana.getSex(), "M");
    }
    @org.junit.Test
    public void getSexLowerBoundary() {
        Persoana persoana = new Persoana("Simon", "1020123145123");
        assertEquals(persoana.getSex(), "M");
    }
    @org.junit.Test
    public void getSexUpperBoundary() {
        Persoana persoana = new Persoana("Simona", "6020123145123");
        assertEquals(persoana.getSex(), "F");
    }
    @org.junit.Test
    public void getSexCrossCheck() {
        String cnp = "6020123145123";
        Persoana persoana = new Persoana("Simona", cnp);
        String sex;
        if (Integer.valueOf(cnp.charAt(0)) % 2 == 0) {
            sex = "F";
        } else {
            sex = "M";
        }
        assertEquals(persoana.getSex(), sex);
    }
    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorNoString() {
        Persoana persoana = new Persoana("Simona", null);
        persoana.getSex();
    }
    @org.junit.Test(expected = StringIndexOutOfBoundsException.class)
    public void getSexErrorEmptyString() {
        Persoana persoana = new Persoana("Simona", "");
        persoana.getSex();
    }
    @org.junit.Test(timeout = 10)
    public void getSexPerformance() {
        Persoana persoana = new Persoana("Simona", "6020123145123");
        persoana.getSex();
    }
    @org.junit.Test
    public void getSexConformance() {
        Persoana persoana = new Persoana("Simona", "6020123145123");
        assertEquals(1,persoana.getSex().length());
    }
    @org.junit.Test
    public void getSexConformanceByLetter() {
        Persoana persoana = new Persoana("Simona", "6020123145123");
        String sex = persoana.getSex().toLowerCase();
        assertTrue(sex.equals("m") || sex.equals("f"));
    }
    @org.junit.Test
    public void getSexOrder() {
        Persoana persoana1 = new Persoana("Simona", "6020123145123");
        Persoana persoana2 = new Persoana("Simon", "5020123145123");

        assertTrue(persoana2.getSex().compareTo(persoana1.getSex()) > 0);
    }
    @org.junit.Test
    public void getSexRange() {
        Persoana persoana1 = new Persoana("Simona", "7020123145123");
        assertEquals(persoana1.getSex(), "N/A");
    }
    @org.junit.Test
    public void getSexCardinality() {
        Persoana persoana1 = new Persoana("Simona", "0020123145123");
        assertEquals(persoana1.getSex(), "N/A");
    }

    @org.junit.Test
    public void checkCNP() {
    }
}
