package model;

public class DetaliiMeci {
    private String data;
    private String echipeleCareAuJucat;
    private int numarSpectatori;

    public DetaliiMeci(String data, String echipeleCareAuJucat, int numarSpectatori) {
        this.data = data;
        this.echipeleCareAuJucat = echipeleCareAuJucat;
        this.numarSpectatori = numarSpectatori;
    }

    public String getData() {
        return data;
    }

    public String getEchipeleCareAuJucat() {
        return echipeleCareAuJucat;
    }

    public int getNumarSpectatori() {
        return numarSpectatori;
    }

    @Override
    public String toString() {
        return "DetaliiMeci{" +
                "data='" + data + '\'' +
                ", echipeleCareAuJucat='" + echipeleCareAuJucat + '\'' +
                ", numarSpectatori=" + numarSpectatori +
                '}';
    }
}
