package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {


        Input input = new Input();

        String output = "circle";

        do {
            Circle newCircle = new Circle(input.getDouble("Enter the radius of a circle"));
            System.out.println("The area of a circle with the radius of " + newCircle.getRadius() + " is " + newCircle.getArea() + "\n\n"
                    + "The circumfrence of that circle is " + newCircle.getCircumference());
            System.out.println();

        } while(input.yesNo("Would you like to go again? [yes/no]"));

        if(Circle.count>1) {
            output += "s";
        }
        System.out.println("Thanks for playing. You made a total of " + Circle.count + " " +output);
    }
    }



