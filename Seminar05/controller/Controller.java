package Seminar05.controller;

import Seminar05.model.*;
import Seminar05.view.View;

import java.util.List;

public class Controller {
    private final View view;
    private final CalculatorModel model;

    public Controller(View view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void on() {
        Memory mr = new Memory();
        NumberParser np = new NumberParser();

        List<Object> value;
        String userInput;
        NumberType inputType;
        String result = null;
        NumberType resultType = null;
        String mathOperation;

        boolean offFlag = false;

        value = view.getValue();
        result = value.get(0).toString();
        resultType = (NumberType) value.get(1);
        mr.addSessionHistory(result);

        while (!offFlag) {
            mathOperation = view.getMenu();
            mr.addSessionHistory(mathOperation);

            value = view.getValue();
            userInput = value.get(0).toString();
            inputType = (NumberType) value.get(1);
            mr.addSessionHistory(userInput);

            switch (mathOperation) {
                case "+" -> {
                    switch (resultType) {
                        case INTEGER:
                            assert model instanceof IntegerModel;
                            result = model.Sum(result, userInput, inputType);
                            resultType = np.parseNumberType(result);
                            break;
                        case RATIONAL:
                            assert model instanceof RationalModel;
                            result = model.Sum(result, userInput, inputType);
                            resultType = np.parseNumberType(result);
                            break;
                        case COMPLEX:

                    }
                }
                case "-" -> {

                }
                case "*" -> {

                }
                case "/" -> {

                }
                case "=" -> {

                }
            }

            System.out.println(mr.getSessionHistory() + " = " + result);
        }
    }
}
