package Seminar03;

import java.util.ArrayList;
import java.util.List;

public class LetterGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            result.add(String.valueOf(c));
        }
        return result;
    }

    public Integer getCurrentTry() {
        return this.currentTry;
    }
    public Integer getMaxTry() {
        return this.maxTry;
    }
}
