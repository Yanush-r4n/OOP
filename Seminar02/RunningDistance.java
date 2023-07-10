package Seminar02;

public class RunningDistance implements Obstacle{
    protected int length;

    public RunningDistance (int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
