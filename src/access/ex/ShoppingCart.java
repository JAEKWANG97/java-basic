package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int maxQuantity;
    private int currentQuantity;

    private int index;

    public ShoppingCart() {
        maxQuantity = 10;
        currentQuantity = 0;
        index = 0;
    }

    public void addItem(Item item) {
        if (currentQuantity + item.getQuantity() < maxQuantity) {
            currentQuantity += item.getQuantity();
            items[index] = item;
            index += 1;
            return;
        }
        System.out.println("The cart is max");
    }

    public void displayItem() {
        for (int i = 0; i < index; i++) {
            System.out.println("name = " + items[i].getItemName() + " Total Amount : "
                    + items[i].getPrice() * items[i].getQuantity());
        }
    }
}
