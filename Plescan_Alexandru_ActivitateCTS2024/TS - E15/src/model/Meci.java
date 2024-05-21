package model;

public class Meci {
    private String data;
    private String echipeleCareAuJucat;
    private int numarBileteVandute;
    private int numarSpectatori;
    private int numarSticleDeApaVandute;
    private int numarJandarmiAngajati;
    private int numarStewarzi;

    public Meci(String data, String echipeleCareAuJucat, int numarBileteVandute, int numarSpectatori, int numarSticleDeApaVandute, int numarJandarmiAngajati, int numarStewarzi) {
        this.data = data;
        this.echipeleCareAuJucat = echipeleCareAuJucat;
        this.numarBileteVandute = numarBileteVandute;
        this.numarSpectatori = numarSpectatori;
        this.numarSticleDeApaVandute = numarSticleDeApaVandute;
        this.numarJandarmiAngajati = numarJandarmiAngajati;
        this.numarStewarzi = numarStewarzi;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEchipeleCareAuJucat(String echipeleCareAuJucat) {
        this.echipeleCareAuJucat = echipeleCareAuJucat;
    }

    public void setNumarBileteVandute(int numarBileteVandute) {
        this.numarBileteVandute = numarBileteVandute;
    }

    public void setNumarSpectatori(int numarSpectatori) {
        this.numarSpectatori = numarSpectatori;
    }

    public void setNumarSticleDeApaVandute(int numarSticleDeApaVandute) {
        this.numarSticleDeApaVandute = numarSticleDeApaVandute;
    }

    public void setNumarJandarmiAngajati(int numarJandarmiAngajati) {
        this.numarJandarmiAngajati = numarJandarmiAngajati;
    }

    public void setNumarStewarzi(int numarStewarzi) {
        this.numarStewarzi = numarStewarzi;
    }

    public DetaliiMeci salveazaStarea() {
        return new DetaliiMeci(data, echipeleCareAuJucat, numarSpectatori);
    }

    public void revinoLaStarea(DetaliiMeci detaliiMeci) {
        this.data = detaliiMeci.getData();
        this.echipeleCareAuJucat = detaliiMeci.getEchipeleCareAuJucat();
        this.numarSpectatori = detaliiMeci.getNumarSpectatori();
    }

    @Override
    public String toString() {
        return "Meci{" +
                "data='" + data + '\'' +
                ", echipeleCareAuJucat='" + echipeleCareAuJucat + '\'' +
                ", numarBileteVandute=" + numarBileteVandute +
                ", numarSpectatori=" + numarSpectatori +
                ", numarSticleDeApaVandute=" + numarSticleDeApaVandute +
                ", numarJandarmiAngajati=" + numarJandarmiAngajati +
                ", numarStewarzi=" + numarStewarzi +
                '}';
    }
}
