import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        highLow();
    }


    public static void playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again? [y/n]");
        String playAgain = scan.nextLine();
        if(playAgain.equals("y")){
            highLow();
        }else{
            System.out.println("Thanks for playing, better luck next time");
        }
    }



    public static void outOfGuesses(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Really? If you haven't got it by now you never will.");
        System.out.println("Would you like to play again? [y/n]");
        String playAgain = scan.nextLine();
        if(playAgain.equals("y")){
            highLow();
        }else{
            System.out.println("Thanks for playing, better luck next time");
        }
    }



    public static void highLow() {
        Scanner scan = new  Scanner(System.in);
        int secretNumber = (int) Math.round(Math.random() * 100);
//        System.out.println(secretNumber);
        boolean correct = false;
        int count = 0;
            while (!correct) {
                if(count == 0){
                    System.out.println("Guess a number between 1 and 100! You get 7 guesses!");
                }

                if(count ==7){
                    outOfGuesses();
                    correct = true;
                }

                if(count >=1 && count<6){
                    System.out.println("This is guess number " + (count+1) + ", guess again!");
                }else if (count == 6){
                    System.out.println("This is your last chance!");
                }

                int userInput;
                userInput = scan.nextInt();
                scan.nextLine();

                if(userInput == secretNumber && count == 0){
                    System.out.println("WHOAH! You got it on the first try!");
                    correct = true;
                    playAgain();

                }else if (userInput == secretNumber && count != 0) {
                    count +=1;
                    System.out.println("You got it, and it took you " + count + " guesses!");
                    correct = true;
                    playAgain();
                }
                if(userInput<1 || userInput>100){
                    System.out.println("That's out of range! Remember, the secret number is between 1 and 100");
                    count +=1;
                }else if (userInput < secretNumber && count<=7) {
                    System.out.print("Too low! - ");
                    count +=1;
                }else if (userInput > secretNumber) {
                        System.out.print("Too high! - ");
                        count += 1;
                }
            }
        }
    }






