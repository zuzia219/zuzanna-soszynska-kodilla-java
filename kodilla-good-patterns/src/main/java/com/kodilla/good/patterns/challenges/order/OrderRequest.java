package com.kodilla.good.patterns.challenges.order;

public class OrderRequest {
    private User user;
    private Invoice invoice;

    public OrderRequest(User user, Invoice invoice) {
        this.user = user;
        this.invoice = invoice;
    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
