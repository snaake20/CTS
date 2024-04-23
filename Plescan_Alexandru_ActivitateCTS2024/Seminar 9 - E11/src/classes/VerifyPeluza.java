package classes;

public class VerifyPeluza implements Strategy {
    @Override
    public void verify(String name) {
        System.out.printf("Verifying baggages and clothes for %s", name);
    }
}
