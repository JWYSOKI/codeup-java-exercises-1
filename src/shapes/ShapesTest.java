package shapes;

public class ShapesTest {

    public static void main(String[] args) {

    Measurable newShape = new Square(5,5);

    Measurable myShape2 = new Rectangle(5,10);

        System.out.println(myShape2.getArea() + " is the area of my rectangle, and " + newShape.getArea() + " is the area of my square");

    }


}
