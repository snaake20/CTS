package classes;

public class FlyweightDetails {
    private int posX;
    private int posY;
    private String color;

    public FlyweightDetails(int posX, int posY, String color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FlyweightDetails{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", color='" + color + '\'' +
                '}';
    }
}
