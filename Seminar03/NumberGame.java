package Seminar03;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            result.add(String.valueOf(i));
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
