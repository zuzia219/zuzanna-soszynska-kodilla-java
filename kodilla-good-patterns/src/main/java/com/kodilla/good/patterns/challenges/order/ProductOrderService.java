package com.kodilla.good.patterns.challenges.order;

public class ProductOrderService implements OrderService {
    public boolean createOrder(final User user, final Invoice invoice) {
        System.out.println("Created an order for " +user.getFirstName() +" "+ user.getFamilyName() + " Invoice number is " + invoice.getId());
        return true;
    }
}
