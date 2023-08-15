package Final.model.MathOperations;

import Final.model.Number;

public class Prod implements MathOperation {
    @Override
    public Number result(Number firstNum, Number secondNum) {
        double x1 = firstNum.getReal() * secondNum.getReal();
        double y1 = firstNum.getReal() * secondNum.getImaginary();
        double x2 = firstNum.getImaginary() * secondNum.getImaginary() * (-1);
        double y2 = firstNum.getImaginary() * secondNum.getReal();
        return new Number(x1 + x2, y1 + y2);
    }
}
