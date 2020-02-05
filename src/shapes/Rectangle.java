package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int width, int length) {
        super(width, length);
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
        return (2 * length) + (2 * width);
    }

    @Override
    public int getArea() {
        return length * width;
    }

}
