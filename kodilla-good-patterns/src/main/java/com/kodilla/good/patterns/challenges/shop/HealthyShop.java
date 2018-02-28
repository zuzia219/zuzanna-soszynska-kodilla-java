package com.kodilla.good.patterns.challenges.shop;

public class HealthyShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to HealthyFoodShop. You can be proud of you healthy choice!");
        return true;
    }
}
