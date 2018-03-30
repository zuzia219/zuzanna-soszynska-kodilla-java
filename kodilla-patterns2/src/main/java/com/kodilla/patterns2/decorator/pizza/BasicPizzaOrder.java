package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10);
    }

    @Override
    public String getDescription() {
        return "You ordered a pizza with tomato sauce and cheese";
    }
}
