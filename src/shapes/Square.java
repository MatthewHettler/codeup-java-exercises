package shapes;

public class Square extends Quadrilateral {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int setWidth() {
        return width;
    }

    @Override
    public int setLength() {
        return length;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

}
