package com.kodilla.good.patterns.challenges.order;

public class CourierDeliveryService implements DeliveryService {
    public boolean deliverTo(User user) {
        System.out.println("Delivering to " + user.getFirstName() + " " + user.getFamilyName());
        System.out.println( "adress: " + user.getUsersAddress().getStreet() + " " + user.getUsersAddress().getHouseNumber() + " " + user.getUsersAddress().getCityCode() +" " + user.getUsersAddress().getCity());
        return true;
    }
}
