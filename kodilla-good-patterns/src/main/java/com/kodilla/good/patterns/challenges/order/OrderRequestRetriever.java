package com.kodilla.good.patterns.challenges.order;

import java.math.BigDecimal;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        UsersAddress usersAddress = new UsersAddress("Wachock", "85-987", "WachockStreet", "5/16");

        User user = new User("user23", "John", "Johnson", usersAddress);

        Product product1 = new Product("Soap");
        Product product2 = new Product("Towel");

        Item item1 = new Item(1, product1, new BigDecimal("12"), 2, new BigDecimal("24"));
        Item item2 = new Item(2, product2, new BigDecimal("13"), 3, new BigDecimal("39"));

        Invoice invoice = new Invoice(256545);

        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);

        return new OrderRequest(user, invoice);
    }
}
