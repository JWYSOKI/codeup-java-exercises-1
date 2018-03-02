
package shapes;

public class Circle {

    private double radius;

    public static int count;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = Math.pow(this.radius,2) * Math.PI;
        return area;
    }

    public double getCircumference(){
        double c = Math.pow(Math.PI,2) * this.radius;
        return c;
    }
}
