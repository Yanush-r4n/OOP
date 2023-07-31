package Seminar05.model;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    private List<String> sessionHistory = new ArrayList<>();
    private List<String> generalHistory = new ArrayList<>();

    public void addSessionHistory(String expressionsPart) {
        sessionHistory.add(expressionsPart);
    }

    public void addGeneralHistory(List<String> sessionHistory) {
        String stringHistory = String.join(" ", sessionHistory);
        generalHistory.add(stringHistory);
    }

    public String getSessionHistory() {
        return String.join(" ", sessionHistory);
    }
    public String getGeneralHistory() {
        return String.join("\n", generalHistory);
    }
}