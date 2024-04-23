package classes;

public class VerifyVIP implements Strategy {
    @Override
    public void verify(String name) {
        System.out.printf("Verifying ticket for %s", name);
    }
}
