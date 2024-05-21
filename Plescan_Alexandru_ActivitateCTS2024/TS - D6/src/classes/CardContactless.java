package classes;

public class CardContactless extends DecoratorContactless {
    public CardContactless(IPlataCuCardul plataCuCardul) {
        super(plataCuCardul);
    }

    @Override
    public void platesteContactless() {
        System.out.println("S-a platit cu cardul contactless");
    }
}
