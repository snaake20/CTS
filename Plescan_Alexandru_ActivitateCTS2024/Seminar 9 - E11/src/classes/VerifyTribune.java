package classes;

public class VerifyTribune implements Strategy {
    @Override
    public void verify(String name) {
        System.out.printf("Verifying baggages for %s", name);
    }
}
