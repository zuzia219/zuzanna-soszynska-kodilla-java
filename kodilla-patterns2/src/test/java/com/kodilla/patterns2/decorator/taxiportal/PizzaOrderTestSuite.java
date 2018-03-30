package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrder() {
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new CockroachPizzaOrderDecorator(thePizzaOrder);
        thePizzaOrder = new CockroachPizzaOrderDecorator(thePizzaOrder);
        thePizzaOrder = new SauceSetPizzaOrderDecorator(thePizzaOrder);
        thePizzaOrder = new InMaxTwentyMinutesPizzaOrderDecorator(thePizzaOrder);

        assertEquals(new BigDecimal(22), thePizzaOrder.getCost());
        assertEquals("You ordered a pizza with tomato sauce and cheese and cockroaches and cockroaches and additional sauce set, delivered in max. 20 minutes", thePizzaOrder.getDescription());

    }
}
