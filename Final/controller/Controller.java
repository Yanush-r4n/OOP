package Final.controller;

import Final.model.CalculatorModel;
import Final.model.MathOperations.Div;
import Final.model.MathOperations.Prod;
import Final.model.MathOperations.Sub;
import Final.model.MathOperations.Sum;
import Final.model.Number;
import Final.view.View;

public class Controller {
    CalculatorModel model;
    View view;

    public Controller(CalculatorModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void on() {
        boolean flag = true;
        System.out.println("Дарова!");

        Number result = view.numberInput();
        Number currentNumber;
        String operator;

        model.cm().addSessionMemory(result.toString());

        while (flag) {
            operator = view.mathOperation().trim();
            model.cm().addSessionMemory(operator);

            if (operator.equals("=")) {
                model.cm().getSessionMemory(result.toString());
                model.cm().addSessionMemory(result.toString());
                flag = false;
                continue;
            }

            currentNumber = view.numberInput();
            model.cm().addSessionMemory(currentNumber.toString());

            switch (operator) {
                case "+" -> result = model.calculate(new Sum(), result, currentNumber);
                case "-" -> result = model.calculate(new Sub(), result, currentNumber);
                case "*" -> result = model.calculate(new Prod(), result, currentNumber);
                case "/" -> result = model.calculate(new Div(), result, currentNumber);
            }

            model.cm().getSessionMemory("= " + result);
        }
    }
}
