package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder item1 = new ProductOrder("item1" , 1000 , 1);
        ProductOrder item2 = new ProductOrder("item2" , 2000 , 2);
        ProductOrder item3 = new ProductOrder("item3" , 3000 , 3);

        ProductOrder[] items = new ProductOrder[]{item1,item2,item3};
        
        int totalPrice = 0;
        for (ProductOrder item : items) {
            item.productInfo();
            totalPrice += item.price * item.quantity;
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
