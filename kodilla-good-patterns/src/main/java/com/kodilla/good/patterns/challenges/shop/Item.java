package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;

public class Item {
    private Product product;
    private BigDecimal quantity;

    public Item(Product product, BigDecimal quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}
