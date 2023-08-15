package Final.model;

public class Number {
    private double real;
    private double imaginary;

    public Number(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        String stringReal =
                real == Math.floor(real) ? Integer.toString((int) real) : Double.toString(real);
        String stringImaginary =
                imaginary == Math.floor(imaginary) ? (int) imaginary + "i" : imaginary + "i";

        if (imaginary == 1 || imaginary == -1) stringImaginary = imaginary == 1 ? "i" : "-i";

        if (imaginary == 0) return stringReal;
        if (real == 0) return stringImaginary;

        return stringReal + (imaginary >= 0 ? "+" : "") + stringImaginary;
    }

    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
}
