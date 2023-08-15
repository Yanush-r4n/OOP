package Final.model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorMemory {
    List<String> sessionMemory = new ArrayList<>();

    public void addSessionMemory(String userInput) {
        sessionMemory.add(userInput);
    }

    public void getSessionMemory(String result) {
        String combined = String.join(" ", sessionMemory);
        System.out.println(combined + " " + result);
    }
}
