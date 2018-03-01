import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(add(2, 2));
//
//        System.out.println(subtract(10, 5));
//
//        System.out.println(multiply(5, 5));
//
//        System.out.println(divide(10, 2));
//
//        System.out.println(modulo(10, 3));
//
//        System.out.println(times(100, 5));
//
//        Scanner scan = new Scanner(System.in);
//
//
        goFactorial();

        rollDice();


    }

    public static int add (int a, int b ){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply (int a, int b){
        return a * b;
    }

    public static int divide (int a, int b){
        return a/b;
    }

    public static int modulo (int a, int b){
        return a%b;
    }

    public static int times (int a, int b){
        int c = a;
        for(int i = 1;i<b;i++){
            a+=c;
        }
        return a;
    }

    public static long factorial(long a){
        for(long i = a-1;i>=1;i--){
            a*=i;
        }
        return a;
    }

    public static void goFactorial (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10 to factorialize");
        long userInput = scan.nextInt();
        if (userInput<1 || userInput>10){
            System.out.println("Whoops! Let's try that again, but with a number between 1 and 10");
            goFactorial();
        }
        System.out.println(factorial(userInput));
        System.out.println("Go again? [y/n]");
        scan.nextLine();
        String userAnswer = scan.nextLine();
        if(userAnswer.equalsIgnoreCase("y")) {
            goFactorial();
        }
        else{
            System.out.println("Thanks for playing!");
        }
    }

    public static void rollDice(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of sides on your die");

        int userInput = scan.nextInt();

     int roll1 = (int)Math.ceil(Math.random()*userInput);
     int roll2 = (int)Math.ceil(Math.random()*userInput);

        System.out.println("The first die was " + roll1);
        System.out.println("The second die was " + roll2);
        scan.nextLine();

        System.out.println("Play again? [y/n]");
        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("y")){
            rollDice();
        }
        else{
            System.out.println("Thanks for playing!");
        }
    }









};


