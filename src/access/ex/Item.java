package access.ex;

public class Item {
    private final String ItemName;
    private final int price;
    private final int quantity;


    public Item(String itemName, int price, int quantity) {
        this.ItemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
