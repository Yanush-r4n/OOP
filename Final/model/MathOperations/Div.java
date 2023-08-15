package Final.model.MathOperations;

import Final.model.Number;

public class Div implements MathOperation {
    @Override
    public Number result(Number firstNum, Number secondNum) {
        MathOperation prod = new Prod();
        Number squarePart = new Number(secondNum.getReal(), (-1) * secondNum.getImaginary());

        Number numerator = prod.result(firstNum, squarePart);
        Number denominator = prod.result(secondNum, squarePart);

        double real = numerator.getReal() / denominator.getReal();
        double imaginary = numerator.getImaginary() / denominator.getReal();

        return new Number(real, imaginary);
    }
}
