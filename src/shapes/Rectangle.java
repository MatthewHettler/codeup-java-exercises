package shapes;

public class Rectangle {

    protected Integer length;
    protected Integer width;

    public Rectangle (int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getArea () {
        return width * length;
    }

    public int getPerimeter () {
        return (2 * width) + (2 * length);
    }


}
