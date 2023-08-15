package Final.view;

import Final.model.Number;
import Final.model.NumberParser;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public Number numberInput() {
        NumberParser np = new NumberParser();
        String stringNumber;

        System.out.print("Введи число -> ");
        stringNumber = sc.nextLine();

        while (np.inputConverter(stringNumber) == null) {
            System.out.print("Неправильно число вводишь, давай по новой -> ");
            stringNumber = sc.nextLine();
        }

        return np.inputConverter(stringNumber);
    }

    public String mathOperation() {
        System.out.print("[+] [-] [*] [/] [=] -> ");
        String operator = sc.nextLine();

        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") &&
               !operator.equals("=")) {
            System.out.print("Неправильно знак указываешь, давай ещё раз -> ");
            operator = sc.nextLine();
        }

        return operator;
    }
}
