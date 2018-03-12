package Groceries;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<Item> groceryList = new ArrayList<>();

    public ArrayList<Item> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<Item> groceryList) {
        this.groceryList = groceryList;
    }
}
