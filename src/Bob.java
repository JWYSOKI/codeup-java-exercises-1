import java.util.Scanner;



public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean confirmation = true;
        String userInput;
        do {
            System.out.println("Say something to Bob, or tell him to \"Shut up!\" ");
            userInput = scan.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            }else if (userInput.equals("Shut up!")){
                System.out.println("Later brah!");
                confirmation = false;
            }else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            }else if (userInput.endsWith("!") || userInput.toUpperCase().equals(userInput)) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        } while (confirmation);
    }
}
