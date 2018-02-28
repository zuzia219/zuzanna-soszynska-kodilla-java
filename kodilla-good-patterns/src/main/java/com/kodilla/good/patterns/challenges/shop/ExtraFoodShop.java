package com.kodilla.good.patterns.challenges.shop;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to ExtraFoodShop. Be sure you are getting something Extraordinary!");
        return true;
    }
}
