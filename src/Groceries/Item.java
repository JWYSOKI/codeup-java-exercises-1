package Groceries;

public class Item {

    public String itemName;
    public int quantity;
    public Object category;

    public Item(String itemName, int quantity, Object category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }
}
