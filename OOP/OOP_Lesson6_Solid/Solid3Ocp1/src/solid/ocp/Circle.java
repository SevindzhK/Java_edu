package solid.ocp;

import solid.Main;

public class Circle implements Shape {
    public Circle(int radius) {
        this.radius = radius;
    }
    private int radius;

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
