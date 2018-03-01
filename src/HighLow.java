import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }
    public static void highLow() {
        Scanner scan = new  Scanner(System.in);
        int secretNumber = (int) Math.round(Math.random() * 100);
        System.out.println(secretNumber);
        boolean correct = false;
        int count = 0;
            while (!correct) {
                if(count == 0){
                    System.out.println("Guess a number between 1 and 100!");
                }

                if(count ==7){
                    System.out.println("Come on seriously? If you haven't got it by now you never will. The secret number was " + secretNumber);
                    System.out.println("Would you like to play again? [y/n]");
                    String playAgain = scan.nextLine();
                    if(playAgain.equals("y")){
                        highLow();
                    }else{
                        System.out.println("Thanks for playing, better luck next time");
                    }
                }

                if(count >=1){
                    System.out.println("This is guess number " + (count+1) + ", guess again!");
                }

                int userInput;
                userInput = scan.nextInt();
                scan.nextLine();

                if(userInput == secretNumber && count == 0){
                    System.out.println("WHOAH! You got it on the first try!");
                    correct = true;
                    System.out.println("Would you like to play again? [y/n]");
                    String playAgain = scan.nextLine();
                    if(playAgain.equals("y")){
                        highLow();
                    }else{
                        System.out.println("Thanks for playing, better luck next time");
                    }
                }

                if (userInput == secretNumber && count != 0) {
                    count +=1;
                    System.out.println("You got it, and it only took you " + count + " guesses");
                    correct = true;
                    System.out.println("Would you like to play again? [y/n]");
                    String playAgain = scan.nextLine();
                    if(playAgain.equals("y")){
                        highLow();
                    }else{
                        System.out.println("Thanks for playing, better luck next time");
                    }
                }



                if (userInput < secretNumber && count<=7) {
                    System.out.print("Too low! - ");
                    count +=1;

                }

                if (userInput > secretNumber) {
                    if(userInput>100){
                        System.out.println("That's too high. Remember, it's between 1 and 100");
                        count +=1;
                    }else {
                        System.out.print("Too high! - ");
                        count += 1;
                    }
                }
            }
    }

}





