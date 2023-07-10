package Seminar02;

public class Cat implements Action {
    final String name;
    final int maxRunningLength = 600;
    final int maxJumpingHeight = 120;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(Obstacle  runningDistance) {
        int length = ((RunningDistance) runningDistance).getLength();
        if (length > maxRunningLength) {
            System.out.println("Киця " + name + " выдохлась и НЕ добежала до конца " + length +
                    " м.");
        } else if (length < 0) {
            System.out.println("Киця " + name + " не смогла развернуться назад и побежать в другую сторону.");
        } else if (length == 0) {
            System.out.println("Киця " + name + " не может стоять на месте, дай ей побегать.");
        } else {
            System.out.println("Киця " + name + " пробежала " + length + " м и даже не выдохлась.");
        }
    }

    @Override
    public void jump(Obstacle wall) {
        int height = ((Wall) wall).getHeight();
        if (height > maxJumpingHeight) {
            System.out.println("Киця " + name + " НЕ смогла прерыгнуть " + height +
                    " см и вдаривлась о препятствие.");
        } else if (height < 0) {
            System.out.println("Киця " + name + " что, вниз закопаться должна?");
        } else if (height == 0) {
            System.out.println("Киця " + name + " не может стоять на месте, дай ей попрыгать.");
        } else {
            System.out.println("Киця " + name + " перепрыгнула " + height + " см и даже ничего не задела.");
        }
    }
}
