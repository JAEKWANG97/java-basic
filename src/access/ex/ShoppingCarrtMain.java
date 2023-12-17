package access.ex;

public class ShoppingCarrtMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("Garic" , 2000, 2);
        Item item2 = new Item("SangChu" , 3000 , 4);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.displayItem();

    }
}
