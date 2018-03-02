package oop;

public class RestaurantTest {

    public static void main(String[] args) {



        RestaurantDish dish = new RestaurantDish(800,"Pad Thai",true);


        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());

        RestaurantDish newDish = new RestaurantDish(500, "Chicken", true);

        System.out.println(newDish.getCostInCents());
        System.out.println(newDish.getNameOfDish());
        System.out.println(newDish.isWouldRecommend());




    }
}
