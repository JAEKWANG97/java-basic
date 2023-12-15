package class1.ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder item1 = new ProductOrder("item1", 1000, 1);
        ProductOrder item2 = new ProductOrder("item2", 2000, 2);
        ProductOrder item3 = new ProductOrder("item3", 3000, 3);

        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = item1;
        productOrders[1] = item2;
        productOrders[2] = item3;

        printProductOrder(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("totalAmount = " + totalAmount);


    }

    static void printProductOrder(ProductOrder[] productOrders){
        for (ProductOrder productOrder : productOrders) {
            System.out.print("productOrder.name = " + productOrder.name);
            System.out.print(" productOrder.price = " + productOrder.price);
            System.out.println(" productOrder.quantity = " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders){
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
