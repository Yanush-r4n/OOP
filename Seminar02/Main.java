package Seminar02;

public class Main {
    public static void main(String[] args) {
        Action[] participants = {
                new Human("Marianna"),
                new Cat("Gato"),
                new Robot("Ludo")
        };
        Obstacle[] obstacles = {
                new RunningDistance(0),
                new RunningDistance(-4),
                new RunningDistance(100_000),
                new RunningDistance(3_000),
                new Wall(0),
                new Wall(-10),
                new Wall(200),
                new Wall(70),
        };

        for (Action participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof RunningDistance) {
                    participant.run(obstacle);
                } else {
                    participant.jump(obstacle);
                }
            }
            System.out.println("---");
        }
    }
}
