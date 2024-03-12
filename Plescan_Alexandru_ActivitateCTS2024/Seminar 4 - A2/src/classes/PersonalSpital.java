package classes;

public abstract class PersonalSpital {
    private String nume;

    private Float salariu;

    public PersonalSpital(String nume, Float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Float getSalariu() {
        return salariu;
    }

    public void setSalariu(Float salariu) {
        this.salariu = salariu;
    }

    public abstract void afisare();
}
