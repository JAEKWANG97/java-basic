package class1.ex;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    ProductOrder(String productName,  int price ,int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void productInfo(){
        System.out.println("productName : " + productName + " price : " + price + " quantity : " + quantity);
    }
}
