package solid;
// проблема в том, что когда квадрат наследует прямоугольник (как в геометрии), расчитать площадь квадрата с корректным выводом в консоли по аналогии с прямоугольником не получается. Решение: квадрат не должен наследовать прямоугольник, т.к. тогда нарушается принцип Барбары Лисков - принцип подстановки: "Если подставить на место базового типа один из производных, то система не должна ломаться"

import solid.lsp.Rectangle;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}
