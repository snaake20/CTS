package model;

public class Troleibuz extends Handler {
    @Override
    public void calatoreste(int distanta) {
        if (distanta > 3) {
            super.nextHandler.calatoreste(distanta);
            return;
        }
        System.out.println("Se calatoreste cu Troleibuzul");
    }
}
