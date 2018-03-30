package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class InMaxTwentyMinutesPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public InMaxTwentyMinutesPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", delivered in max. 20 minutes";
    }
}
