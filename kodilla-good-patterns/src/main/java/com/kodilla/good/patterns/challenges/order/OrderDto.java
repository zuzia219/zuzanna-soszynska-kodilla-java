package com.kodilla.good.patterns.challenges.order;

public class OrderDto {
    private User user;
    private Invoice invoice;
    private boolean isOrdered;
    private boolean isPaid;

    public OrderDto(final User user, final Invoice invoice, boolean isOrdered, boolean isPaid) {
        this.user = user;
        this.invoice = invoice;
        this.isOrdered = isOrdered;
        this.isPaid = isPaid;
    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
