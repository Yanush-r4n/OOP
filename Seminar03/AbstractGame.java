package Seminar03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;
    List<Answer> history = new ArrayList<>();

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("comp:  " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
        this.history.clear();
    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry == maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы проиграли по количеству попыток");
            printHistory();
            return null;
        }
        int bull = 0;
        int cow = 0;
        value = value.toLowerCase();
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        Answer answer = new Answer(bull, cow, currentTry);
        history.add(answer);
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы победили!!");
            printHistory();
            return null;
        }
        return answer;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }

    private void printHistory() {
        System.out.println("История игры:");
        for (Answer answer : history) {
            System.out.println(answer);
        }
        System.out.println("--------------------------------");
    }
}