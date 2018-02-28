package com.kodilla.good.patterns.challenges.shop;

public class OrderProcessor {
    public void processOrder(Shop shop, Item item) {
        boolean ordered = shop.process(item);
        if(ordered) {
            System.out.println("Your order is beeing created...");
        } else {
            System.out.println("Your order was rejected... Please contact our support...");
        }
    }
}
