package Seminar05;

import Seminar05.controller.Controller;
import Seminar05.model.IntegerModel;
import Seminar05.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new IntegerModel());
        controller.on();
    }

    public static void printClassName(Object obj) {
        System.out.println("Тип переменной: " + obj.getClass().getSimpleName());
    }
}
