package Seminar02;

public interface Action {
    boolean isEliminated();

    void run(Obstacle runningDistance);

    void jump(Obstacle wall);
}
