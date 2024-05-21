package model;

public class Autobuz extends Handler {
    @Override
    public void calatoreste(int distanta) {
        if (distanta > 4) {
            super.nextHandler.calatoreste(distanta);
            return;
        }
        System.out.println("Se calatoreste cu Autobuzul");
    }
}
