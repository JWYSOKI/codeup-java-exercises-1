package oop;

public class BurgerTools {

    public static String mostPopularTopping;
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;
    public static boolean hasCheese;

    public static void grill(){
        System.out.print("Grilling burger");
    }
}

class BurgerTester {

    public static void main(String[] args) {

        BurgerTools.mostPopularTopping = "Grilled Onions";
        BurgerTools.averageDaysBeforeExpiration = 5;
        BurgerTools.temperatureWhenCooked = 160;
        BurgerTools.hasCheese = true;

        System.out.println("Most popular topping is " + BurgerTools.mostPopularTopping);
        System.out.println("Expires after " + BurgerTools.averageDaysBeforeExpiration + " days.");
        System.out.println("Cooked when internal temp is " + BurgerTools.temperatureWhenCooked);
        System.out.println("It's " + BurgerTools.hasCheese + " that a burger is better with cheese.");
        BurgerTools.grill();
    }

}


