package com.kodilla.good.patterns.challenges.order;

public class UsersAddress {

    private String city;
    private String cityCode;
    private String street;
    private String houseNumber;

    public UsersAddress(String city, String cityCode, String street, String houseNumber) {
        this.city = city;
        this.cityCode = cityCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
