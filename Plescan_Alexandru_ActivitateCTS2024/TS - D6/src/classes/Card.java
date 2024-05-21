package classes;

public class Card implements IPlataCuCardul {

    @Override
    public void platesteNormal() {
        System.out.println("S-a platit normal cu cardul");

    }

    @Override
    public void platesteOnline() {
        System.out.println("S-a platit online cu cardul");
    }
}
