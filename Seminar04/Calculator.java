package Seminar04;

import java.util.List;

public class Calculator {

    /**
     *
     * @param numbers
     * @return
     */
    public double sum(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    /**
     *
     * @param numbers
     * @return
     */
    public double prod(List<? extends Number> numbers) {
        double prod = numbers.get(0).doubleValue();
        for (Number number : numbers) {
            prod *= number.doubleValue();
        }
        return prod;
    }

    /**
     *
     * @param numbers
     * @return
     */
    public double dev(List<? extends Number> numbers) {
        double dev = numbers.get(0).doubleValue();
        for (Number number : numbers) {
            dev /= number.doubleValue();
        }
        return dev;
    }

    public void convertToBin(List<?> numbers) {
        for (Object number : numbers) {
            if (number instanceof Number) {
                int res = ((Number) number).intValue();
                System.out.print(Integer.toBinaryString(res) + ' ');

            } else if (number instanceof String) {
                if (isDigitString(number.toString())) {
                    int res = Integer.parseInt(number.toString());
                    System.out.println(Integer.toBinaryString(res) + ' ');

                } else {
                    System.out.println("Чёт не похоже на число");
                    break;
                }
            } else {
                System.out.println("Странный тип мне суешь");
                break;
            }
        }
        System.out.println();
    }

    public static boolean isDigitString(String input) {
        return input.matches("\\d+");
    }
}
