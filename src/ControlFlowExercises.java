import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
boolean confirmation;
       do {
           int userInput;
           int squared;
           int cubed;


           System.out.println("Enter an integer");
           userInput = scan.nextInt();
           System.out.println("number  |  squared  |  cubed");
           System.out.println("------  |  -------  |  -----  ");

           for (int i = 1; i <= userInput; i++) {
               System.out.printf("%-8d" + "| " + "%-11d" + "| " + "%-3d", i, i * i, i * i * i);
               System.out.println("");
           }
           String keepGoing;
           System.out.println("Continue - yes/no?");
           keepGoing = scan.next();
          confirmation = keepGoing.equals("yes");
       }

       while(confirmation);

        }
    }