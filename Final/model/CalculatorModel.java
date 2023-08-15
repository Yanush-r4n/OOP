package Final.model;

import Final.model.MathOperations.MathOperation;

public class CalculatorModel {
    CalculatorMemory cm = new CalculatorMemory();

    public Number calculate(MathOperation operation, Number firstNum, Number secondNum) {
        return operation.result(firstNum, secondNum);
    }

    public CalculatorMemory cm() {
        return this.cm;
    }
}
