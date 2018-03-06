package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(5);

        System.out.println("The area of box 1 is " + box1.getArea());
        System.out.println("The perimeter of box 1 is " + box1.getPerimeter());
        System.out.println("The area of box 2 (square) is " + box2.getArea());
        System.out.println("The perimeter of box 2 (square) is " + box2.getPerimeter());

    }
}
