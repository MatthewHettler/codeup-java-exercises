package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected Integer length;
    protected Integer width;

    public Quadrilateral (int width, int length){
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public abstract int setWidth();
    public abstract int setLength();

}
