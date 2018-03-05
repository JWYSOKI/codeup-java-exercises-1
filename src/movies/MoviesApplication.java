package movies;

import util.Input;

public class MoviesApplication {

    static Movie[] movieFinder = MoviesArray.findAll();

    public static void main(String[] args) {


        Input userInput = new Input();
        boolean keepGoing = true;

        do {

            System.out.println("Welcome to the movies_application - What would you like to do?" +
                    "\n0 - exit\n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "Enter your choice");

            String userChoice = userInput.getString();

            if (userChoice.equals("1")) {
                for (Movie movie : movieFinder)
                    System.out.printf("%-30.30s  %-30.30s%n", movie.getName(), movie.getCategory());
            } if (userChoice.equals("2")) {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.printf("%-30.30s  %-30.30s%n", movie.getName(), movie.getCategory());
                    }

                }
            } if (userChoice.equals("3")) {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.printf("%-30.30s  %-30.30s%n", movie.getName(), movie.getCategory());
                    }

                }
            } if (userChoice.equals("4")) {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.printf("%-30.30s  %-30.30s%n", movie.getName(), movie.getCategory());
                    }

                }
            } if (userChoice.equals("5")) {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.printf("%-50s  %30s%n", movie.getName(), movie.getCategory());
                    }

                }
            }

            if (userChoice.equals("0")){
                System.out.println("Thanks for using the movies application!");
                keepGoing = false;
            }
        } while(keepGoing);

        }
        }


