package Seminar02;

public class Wall implements Obstacle{
    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
