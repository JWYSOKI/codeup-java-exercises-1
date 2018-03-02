package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        System.out.println("Enter a string");
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
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
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
        System.out.println("Enter a number (double)");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }



    public static void main(String[] args) {

                Input newInput = new Input();
                System.out.println(newInput.getString());
                System.out.println(newInput.yesNo());
                System.out.println(newInput.getInt(1,100));
                System.out.println(newInput.getInt());
                System.out.println(newInput.getDouble(0.01,99.99));
                System.out.println(newInput.getDouble());
            }

        }







