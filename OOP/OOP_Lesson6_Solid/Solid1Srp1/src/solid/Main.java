package solid;

import solid.srp.SquareCount;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {

        SquareCount square = new SquareCount(5);
        SquareView squareView = new SquareView();
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        squareView.draw(square.getSide()*3);
    }
}
