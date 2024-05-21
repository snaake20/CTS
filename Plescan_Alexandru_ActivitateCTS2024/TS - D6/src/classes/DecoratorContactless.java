package classes;

public abstract class DecoratorContactless implements IPlataCuCardul {

    IPlataCuCardul plataCuCardul;

    public DecoratorContactless(IPlataCuCardul plataCuCardul) {
        this.plataCuCardul = plataCuCardul;
    }

    @Override
    public void platesteNormal() {
        plataCuCardul.platesteNormal();
    }

    @Override
    public void platesteOnline() {
        plataCuCardul.platesteOnline();
    }

    abstract public void platesteContactless();
}
