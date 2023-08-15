package Final.model.MathOperations;

import Final.model.Number;

public class Sub implements MathOperation {
    @Override
    public Number result(Number firstNum, Number secondNum) {
        double real = firstNum.getReal() - secondNum.getReal();
        double imaginary = firstNum.getImaginary() - secondNum.getImaginary();
        return new Number(real, imaginary);
    }
}
