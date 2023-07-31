package Seminar05.model;

import java.util.List;

public class IntegerModel implements CalculatorModel {

    @Override
    public String Sum(String currentResult, String userInput, NumberType inputType) {
        switch (inputType) {
            case INTEGER:
                int intSum = Integer.parseInt(currentResult) + Integer.parseInt(userInput);
                return Integer.toString(intSum);
            case RATIONAL:
                double doubleSum = Double.parseDouble(currentResult) + Double.parseDouble(userInput);
                return Double.toString(doubleSum);
            case COMPLEX:
                if (userInput.contains("+")){
                    List<String> real = List.of(userInput.split("\\+"));
                    double realSum = Double.parseDouble(currentResult) + Double.parseDouble(real.get(0));
                    return realSum + "+" + real.get(1);
                } else if (userInput.contains("-")) {
                    List<String> real = List.of(userInput.split("-"));
                    double realSum = Double.parseDouble(currentResult) + Double.parseDouble(real.get(0));
                    return realSum + "+" + real.get(1);
                } else {
                    return currentResult + "+" + userInput;
                }
        }
        return null;
    }

    @Override
    public String Sub(String currentResult, String userInput, NumberType inputType) {
        return null;
    }

    @Override
    public String Prod(String currentResult, String userInput, NumberType inputType) {
        return null;
    }

    @Override
    public String Div(String currentResult, String userInput, NumberType inputType) {
        return null;
    }
}
