package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
    public void order(){
        User user = new User();
        Product product = new Product();
        Order oder = new Order(user, product);
    }
}
