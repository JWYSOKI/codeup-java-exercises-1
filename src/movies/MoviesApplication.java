package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    private static Movie[] movieFinder = MoviesArray.findAll();
    public static Input userInput = new Input();
    String userChoice = userInput.getString();


    //    Method to print all movies from the "movieFinder" array
    public static void printMovies(){
        for (Movie movie : movieFinder)
            System.out.printf("%-30.30s  %-30.30s%n", movie.getTitle(), movie.getCategory());
    }



    //    Method to print movies from the "movieFinder" array if they contain the passed in category
    public static void printMovies(String category){
        for (Movie movie : movieFinder) {
            if (movie.getCategory().equals(category)) {
                System.out.printf("%-30.30s  %-30.30s%n", movie.getTitle(), movie.getCategory());
            }
        }
    }


//    Method to ask user what they want to do each time
    public static void promptUser() {
        System.out.println("Welcome to the movies_application - What would you like to do?" +
                "\n0 - exit\n" +
                "1 - view all movies \n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a movie!\n" +
                "Enter your choice");
    }


//    Method that takes in a new title and new category from the user, builds a movie object and puts it into a copy of the movieFinder array
//    The new copied array is then reassigned to be movieFinder original array;
    private static void addMovie() {
        System.out.println("Enter the title:");
        String title = userInput.getString();
        System.out.println("Enter the category:");
        String category = userInput.getString();
        Movie newMovie = new Movie(title, category);
        Movie[] moviesPlus = Arrays.copyOf(movieFinder, movieFinder.length + 1);
        int lastIndex = moviesPlus.length-1;
        moviesPlus[lastIndex] = newMovie;
        movieFinder = moviesPlus;
    }

//    Main method to prompt user for their choice and then do that.
    public static void main(String[] args) {

        do {
            promptUser();
            String userChoice = userInput.getString();

            switch (userChoice){

                case "1":
                    printMovies();
                    break;

                case "2":
                    printMovies("Animated");
                    break;

                case "3":
                    printMovies("drama");
                    break;

                case "4":
                    printMovies("horror");
                    break;

                case "5":
                    printMovies("scifi");
                    break;

                case "6":
                    addMovie();
                    break;

                case "0":
                    System.out.println("Thanks for using the movies application!");
                    return;
            }

        } while (true);

    }

}

