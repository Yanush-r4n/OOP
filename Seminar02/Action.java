package Seminar02;

public interface Action {
    void run(Obstacle runningDistance);

    void jump(Obstacle wall);
}
