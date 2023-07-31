package Seminar05.model;

import java.util.Stack;

public class NumberParser {
    /**
     * @apiNote Определяет вид числа, то есть оно целое, рациональное или комплексное.
     * @param userInput строка-число, введённе пользователем.
     * @return тип числа в виде енам.
     */
    public NumberType parseNumberType(String userInput) {
        Stack<Character> inputStack = parseStringToStack(userInput);

        int imaginary = 1;
        int rational = 2;
        int sign = 1;

        while (!inputStack.isEmpty()) {
            Character last = inputStack.pop();
            Character nextToLast = inputStack.isEmpty() ? ' ' : inputStack.peek();
            boolean rationalDivs = nextToLast.equals('.') || nextToLast.equals(',');

            if (isInvalidCharacter(last)) return null;

            if (Character.isDigit(last)) {
                if (nextToLast.equals('i')) {
                    return null;
                } else if (rationalDivs) {
                    rational--;
                    if (rational == 0 && sign == 1) return null;
                    if (rational < 0) return null;
                } else if (nextToLast.equals('+') || nextToLast.equals('-')) {
                    if (imaginary > 0) return null;
                    sign--;
                    if (sign < 0) return null;
                }
            } else if (last.equals('i')) {
                if (nextToLast.equals(' ')) {
                    imaginary--;
                } else if (Character.isDigit(nextToLast)) {
                    imaginary--;
                } else if (nextToLast.equals('i') || rationalDivs) {
                    return null;
                } else if (nextToLast.equals('+') || nextToLast.equals('-')) {
                    imaginary--;
                    sign--;
                    rational--;
                    if (rational < 0) return null;
                    if (sign < 0) return null;
                }
            } else if (last.equals('.') || last.equals(',') ||
                    last.equals('+') || last.equals('-')) {
                if (nextToLast.equals(' ') || nextToLast.equals('i') || rationalDivs ||
                        nextToLast.equals('+') || nextToLast.equals('-')) return null;
            }
        }

        if (imaginary == 1 && rational == 2 && sign == 1) return NumberType.INTEGER;
        if (imaginary == 1 && rational == 1 && sign == 1) return NumberType.RATIONAL;
        if (imaginary == 0) return NumberType.COMPLEX;

        return null;
    }

    private Stack<Character> parseStringToStack(String inputNumber) {
        Stack<Character> stack = new Stack<>();

        for (char ch : inputNumber.toCharArray()) {
            if (ch != ' ') {
                stack.push(ch);
            }
        }

        return stack;
    }

    private static boolean isInvalidCharacter(Character ch) {
        return !Character.isDigit(ch) && !ch.equals('i') && !ch.equals('+') &&
                !ch.equals('-') && !ch.equals(',') && !ch.equals('.');
    }
}
