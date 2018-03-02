package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or y");
        String firstLine = scanner.next();
        return (firstLine.equalsIgnoreCase("yes") || firstLine.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String firstLine = scanner.next();
        return (firstLine.equalsIgnoreCase("yes") || firstLine.equalsIgnoreCase("y"));
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else return userInput;
    }

    public int getInt() {
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number (double)");
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else return userInput;
    }

    public double getDouble() {
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }


}
