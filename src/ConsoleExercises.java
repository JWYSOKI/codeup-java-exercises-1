import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int userInput;
        System.out.println("Enter an integer:");
        userInput = scan.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Enter three seperate words:");
        String firstString = scan.next();
        String secondString = scan.next();
        String thirdString = scan.next();
        System.out.printf("%s " + "%s " + "%s",firstString, secondString, thirdString);
        System.out.println("");
        scan.nextLine();



        String userString;
        System.out.println("Enter a sentence");
        userString = scan.nextLine();
        System.out.println(userString);

double length;
double width;
double height;
double area;
double perimeter;
double volume;

        System.out.println("Enter the length, width, and height of the room, seperated by spaces");

        length = scan.nextDouble();
        width = scan.nextDouble();
        height = scan.nextDouble();
        area = length * width;
        perimeter = (length * 2) + (width * 2);
        volume = length * height * width;

        System.out.printf("The area of the room is " + "%.2f" + "ft. - perimeter is " + "%.2f" + "ft. - and volume is " + "%.2f" + " ft.", area, perimeter, volume);

    }
}
