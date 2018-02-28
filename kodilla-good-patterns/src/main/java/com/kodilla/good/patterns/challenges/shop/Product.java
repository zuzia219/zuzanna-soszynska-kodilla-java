package com.kodilla.good.patterns.challenges.shop;

public class Product {
    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
