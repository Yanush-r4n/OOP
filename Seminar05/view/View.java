package Seminar05.view;

import Seminar05.model.NumberParser;
import Seminar05.model.NumberType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);
    String userInput;
    boolean flag = false;


    public List<Object> getValue() {
        NumberParser np = new NumberParser();
        NumberType inputType;

        do {
            System.out.print("Введи число -> ");
            userInput = sc.nextLine();
            inputType = np.parseNumberType(userInput);

            if (inputType == null) {
                System.out.println("По-моему ты не число пишешь. Давай заново.");
            }
        } while (inputType == null);

        return new ArrayList<>(Arrays.asList(userInput.replaceAll(" ", ""), inputType));
    }

    public String getMenu() {
        String mathOperation;

        do {
            System.out.print("[+] [-] [*] [/] [=] -> ");
            mathOperation = sc.nextLine().trim();

            if (!mathOperation.equals("+") && !mathOperation.equals("-") &&
                    !mathOperation.equals("*") && !mathOperation.equals("/") && !mathOperation.equals("=")) {
                System.out.println("Неправильно операцию вводишь. Давай по новой.");
            }
        } while (!mathOperation.equals("+") && !mathOperation.equals("-") &&
                !mathOperation.equals("*") && !mathOperation.equals("/") && !mathOperation.equals("="));

        return mathOperation;
    }

    public String getEndMenu() {
        System.out.print("[Restart] [History] [Off] -> ");
        return sc.nextLine();
    }
}
