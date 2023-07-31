package Seminar05.model;

public interface CalculatorModel {
    String Sum(String currentResult, String userInput, NumberType inputType);

    String Sub(String currentResult, String userInput, NumberType inputType);

    String Prod(String currentResult, String userInput, NumberType inputType);

    String Div(String currentResult, String userInput, NumberType inputType);
}