package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, length);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}