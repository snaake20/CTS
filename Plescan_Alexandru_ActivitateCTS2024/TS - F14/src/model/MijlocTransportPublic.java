package model;

public abstract class MijlocTransportPublic {
    public abstract void statia1();
    public abstract void statia2();
    public abstract void statia3();
    public abstract void statia4();
    public abstract void statia5();
    public abstract void statia6();

    public final void parcurge(boolean tur) {
        if (tur) {
            statia1();
            statia2();
            statia3();
            statia4();
            statia5();
            statia6();
            return;
        }
        statia6();
        statia5();
        statia4();
        statia3();
        statia2();
        statia1();
    }
}
