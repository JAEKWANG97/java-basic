package class1.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert order amount : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        ProductOrder[] productOrders = new ProductOrder[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println(i + 1 + ". insert order info");

            System.out.print("Product Name : ");
            String productName = scanner.next();

            System.out.print("Product Price : ");
            int productPrice = scanner.nextInt();

            System.out.print("Product Quantity : ");
            int productQuantity = scanner.nextInt();

            scanner.nextLine();

            ProductOrder productOrder = new ProductOrder(productName, productPrice, productQuantity);
            productOrders[i] = productOrder;
        }
        printTotalOrder(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("totalAmount = " + totalAmount);
    }

    static void printTotalOrder(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.print("productOrder.name = " + productOrder.name);
            System.out.print(", productOrder.price = " + productOrder.price);
            System.out.println(", productOrder.quantity = " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
