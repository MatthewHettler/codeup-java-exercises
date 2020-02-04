package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter()); // returns 18
        System.out.println(box1.getArea()); // returns 20

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter()); // returns 20
        System.out.println(box2.getArea()); // returns 25
    }
}
