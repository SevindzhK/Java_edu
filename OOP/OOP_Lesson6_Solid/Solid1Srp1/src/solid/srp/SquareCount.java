package solid.srp;

public class SquareCount {
    private int side;

    public int getSide() {
        return side;
    }

    public SquareCount(int side) {
        this.side = side;
    }
    public int getArea() {
        return side * side;
    }
}
