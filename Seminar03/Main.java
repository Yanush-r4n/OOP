package Seminar03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gameMode;
        do {
            System.out.println("Выберите режим игры:");
            System.out.println("1. Числа");
            System.out.println("2. Буквы");
            System.out.println("0. Выход");
            gameMode = scanner.nextLine();
            switch (gameMode) {
                case "1" -> playNumberGame(scanner);
                case "2" -> playLetterGame(scanner);
                case "0" -> System.out.println("До свидания!");
                default -> System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        } while (!gameMode.equals("0"));
    }

    private static void playNumberGame(Scanner scanner) {
        NumberGame numberGame = new NumberGame();
        System.out.println("Введите длину загадываемого числа:");
        Integer sizeWord = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите максимальное количество попыток:");
        Integer maxTry = Integer.parseInt(scanner.nextLine());
        numberGame.start(sizeWord, maxTry);
        while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
            if (numberGame.getCurrentTry() < numberGame.maxTry) {
                System.out.println("Введите число:");
                String value = scanner.nextLine();
                Answer answer = numberGame.inputValue(value);
                System.out.println(answer);
            } else {
                numberGame.inputValue("");
            }
        }
    }

    private static void playLetterGame(Scanner scanner) {
        LetterGame letterGame = new LetterGame();
        System.out.println("Введите длину загадываемого слова:");
        Integer sizeWord = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите максимальное количество попыток:");
        Integer maxTry = Integer.parseInt(scanner.nextLine());
        letterGame.start(sizeWord, maxTry);
        while (!letterGame.getGameStatus().equals(GameStatus.FINISH)) {
            if (letterGame.getCurrentTry() < letterGame.maxTry) {
                System.out.println("Введите букву:");
                String value = scanner.nextLine();
                Answer answer = letterGame.inputValue(value);
                System.out.println(answer);
            } else {
                letterGame.inputValue("");
            }
        }
    }
}



