package Seminar04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        List<Integer> numbers1 = new ArrayList<>();
        List<Double> numbers2 = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            numbers1.add(i);
            numbers2.add((double) i);
        }

        System.out.println("calculator.sum(numbers1) = " + calculator.sum(numbers1));
        System.out.println("calculator.sum(numbers2) = " + calculator.sum(numbers2) + '\n');

        System.out.println("calculator.prod(numbers1) = " + calculator.prod(numbers1));
        System.out.println("calculator.prod(numbers2) = " + calculator.prod(numbers2) + '\n');

        System.out.println("calculator.dev(numbers1) = " + calculator.dev(numbers1));
        System.out.println("calculator.dev(numbers2) = " + calculator.dev(numbers2) + '\n');

        calculator.convertToBin(numbers1);
        calculator.convertToBin(numbers2);

        List<Object> coll = new ArrayList<>();
        coll.add(2);
        coll.add(4.0);
        coll.add("6");
        coll.add("asd");

        calculator.convertToBin(coll);
    }
}
