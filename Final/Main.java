package Final;

import Final.controller.Controller;
import Final.model.CalculatorModel;
import Final.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new CalculatorModel(), new View());
        controller.on();
    }
}
