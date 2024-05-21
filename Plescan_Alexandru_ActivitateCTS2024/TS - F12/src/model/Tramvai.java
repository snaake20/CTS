package model;

public class Tramvai extends Handler {
    @Override
    public void calatoreste(int distanta) {
        if (distanta > 9) {
            super.nextHandler.calatoreste(distanta);
            return;
        }
        System.out.println("Se calatoreste cu Tramvaiul");
    }
}
