package com.kodilla.good.patterns.challenges.order;

public interface OrderService {
    boolean createOrder(final User user, final Invoice invoice);
}
