package Seminar02;

public class Robot implements Action {
    final String name;
    final int maxRunningLength = 10_000;
    final int maxJumpingHeight = 180;

    public boolean isEliminated = false;

    public Robot(String name) {
        this.name = name;
    }

    public boolean isEliminated() {
        return isEliminated;
    }

    @Override
    public void run(Obstacle runningDistance) {
        int length = ((RunningDistance) runningDistance).getLength();
        if (length > maxRunningLength) {
            System.out.println("Консерва " + name + " выдохлась и НЕ добежала до конца " + length +
                    " м.");
            isEliminated = true;
        } else if (length < 0) {
            System.out.println("Консерва " + name + " не смогла развернуться назад и побежать в другую сторону.");
        } else if (length == 0) {
            System.out.println("Консерва " + name + " не может стоять на месте, дай ей побегать.");
        } else {
            System.out.println("Консерва " + name + " пробежала " + length + " м и даже не выдохлась.");
        }
    }

    @Override
    public void jump(Obstacle wall) {
        int height = ((Wall) wall).getHeight();
        if (height > maxJumpingHeight) {
            System.out.println("Консерва " + name + " НЕ смогла прерыгнуть " + height +
                    " см и вдаривлась о препятствие.");
            isEliminated = true;
        } else if (height < 0) {
            System.out.println("Консерва " + name + " что, вниз закопаться должна?");
        } else if (height == 0) {
            System.out.println("Консерва " + name + " не может стоять на месте, дай ей попрыгать.");
        } else {
            System.out.println("Консерва " + name + " перепрыгнула " + height + " см и даже ничего не задела.");
        }
    }
}
