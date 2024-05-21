package classes;

public class ProxyCredit implements ICredit{

    private ICredit credit;

    public ProxyCredit(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void descriere() {
        credit.descriere();
    }

    @Override
    public void acordaCredit() {
        if (!getMoneda().equals("RON")) {
            System.out.println("Nu se acorda credite decat in moneda RON");
            return;
        }
        credit.acordaCredit();
    }

    @Override
    public String getMoneda() {
        return credit.getMoneda();
    }
}
