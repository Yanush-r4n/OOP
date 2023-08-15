package Final.model;

public class NumberParser {
    public Number inputConverter(String userInput) {
        StringBuilder sb = new StringBuilder(userInput.replace(" ", ""));
        if (!isValidInput(sb)) return null;

        if (sb.toString().equals("i")) return new Number(0.0, 1.0);
        else if (sb.toString().equals("-i")) return new Number(0.0, -1.0);

        StringBuilder real = new StringBuilder();
        StringBuilder imaginary = new StringBuilder();

        boolean flag = false;
        for (int i = 0; i < userInput.length(); i++) {
            if (sb.charAt(i) == '+' || sb.charAt(i) == '-') flag = i != 0;
            if (!flag) real.append(sb.charAt(i));
            else imaginary.append(sb.charAt(i));
        }

        if (real.toString().contains("i")) {
            real.deleteCharAt(real.length() - 1);
            return new Number(0.0, Double.parseDouble(real.toString()));
        }

        if (imaginary.toString().contains("i")) {
            imaginary.deleteCharAt(imaginary.length() - 1);
        }

        String realString = real.isEmpty() ? "0" : real.toString();
        String imaginaryString = imaginary.isEmpty() ? "0" : imaginary.toString();

        return new Number(Double.parseDouble(realString), Double.parseDouble(imaginaryString));
    }

    private boolean isValidInput(StringBuilder sb) {
        int dot = 2;
        int sgn = 1;
        int img = 1;

        for (int i = 0; i < sb.length(); i++) {
            char current = sb.charAt(i);
            char next = i == sb.length() - 1 ? ' ' : sb.charAt(i + 1);

            if (sb.charAt(0) == '.') return false;
            if (!isValidCharacter(current)) return false;
            switch (next) {
                case '.' -> {
                    if (dot == 0) return false;
                    if (!Character.isDigit(current)) return false;
                    dot--;
                }
                case '+', '-' -> {
                    if (sgn == 0) return false;
                    if (!Character.isDigit(current)) return false;
                    if (dot == 2) dot--;
                    sgn--;
                }
                case 'i' -> {
                    if (current == '.') return false;
                    img--;
                }
                default -> {
                    if (sgn == 1 && dot == 0) return false;
                    if (current == 'i' & next != ' ') return false;
                }
            }
        }
        return sgn != 0 || img != 1;
    }

    private boolean isValidCharacter(Character ch) {
        return Character.isDigit(ch) || ch.equals('.') || ch.equals('i') || ch.equals('+') || ch.equals('-');
    }
}
