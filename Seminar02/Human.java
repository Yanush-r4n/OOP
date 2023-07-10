package Seminar02;

public class Human implements Action {
    final String name;
    final int maxRunningLength = 4_000;
    final int maxJumpingHeight = 60;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(Obstacle runningDistance) {
        int length = ((RunningDistance) runningDistance).getLength();
        if (length > maxRunningLength) {
            System.out.println("Чел " + name + " выдохся и НЕ добежал до конца " + length +
                    " м.");
        } else if (length < 0) {
            System.out.println("Чел " + name + " не смог развернуться назад и побежать в другую сторону.");
        } else if (length == 0) {
            System.out.println("Чел " + name + " не может стоять на месте, дай ему побегать.");
        } else {
            System.out.println("Чел " + name + " пробежал " + length + " м и даже не выдохся.");
        }
    }

    @Override
    public void jump(Obstacle wall) {
        int height = ((Wall) wall).getHeight();
        if (height > maxJumpingHeight) {
            System.out.println("Чел " + name + " НЕ смог прерыгнуть " + height +
                " см и вдаривсь о препятствие.");
        } else if (height < 0) {
            System.out.println("Чел " + name + " что, вниз закопаться должен?");
        } else if (height == 0) {
            System.out.println("Чел " + name + " не может стоять на месте, дай ему попрыгать.");
        } else {
            System.out.println("Чел " + name + " перепрыгнул " + height + " см и даже ничего не задел.");
        }
    }
}
