package Groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Grocery {


    public static void main(String[] args) {

        ArrayList<Item> groceryList = new ArrayList<>();

        HashMap<Integer, String> categories = new HashMap();

        categories.put(1,"Dairy");
        categories.put(2,"Meat");
        categories.put(3,"Canned Food");
        categories.put(4,"Bakery");
        categories.put(5,"Frozen");
        categories.put(6,"Household Items");
        getGroceries(categories, groceryList);
    }

    public static Item getGroceries(HashMap categories, ArrayList groceryList) {
        Input input = new Input();
        Item newItem;

        do {
            System.out.println("Would you like to create a grocery list? [y/n]");
            String userInput = input.getString();

            if (!userInput.equalsIgnoreCase("y")) {
                return null;
            }
                System.out.println("Choose the category of the item you'd like to add [enter the corresponding number]");
                System.out.println(categories);


                Object newCategory = categories.get(input.getInt());

                System.out.println("What is the name of the item?");
                String userItem = input.getString();

                System.out.println("How many " + userItem + "'s do you need?");
                int userQuantity = input.getInt();

                newItem = new Item(userItem, userQuantity, newCategory);

                groceryList.add(newItem);
                System.out.println(groceryList);
                return newItem;

        }while(true);

    }

}
