package com.kodilla.good.patterns.challenges.order;

public class OrderProcessor {

    private PaymentService paymentService;
    private OrderService orderService;
    private DeliveryService deliveryService;

    public OrderProcessor(PaymentService paymentService, OrderService orderService, DeliveryService deliveryService) {
        this.paymentService = paymentService;
        this.orderService = orderService;
        this.deliveryService = deliveryService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean ordered = orderService.createOrder(orderRequest.getUser(), orderRequest.getInvoice());
        boolean paid = false;
        if (ordered) {
            paid = paymentService.pay(orderRequest.getInvoice());
            if (paid) {
                deliveryService.deliverTo(orderRequest.getUser());
            }
        }
        return new OrderDto(orderRequest.getUser(), orderRequest.getInvoice(), ordered, paid);
    }
}
