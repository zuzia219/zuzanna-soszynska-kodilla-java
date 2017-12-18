package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final String bigDecimalInString;

    public Country(final String countryName, final String bigDecimalInString) {
        this.countryName = countryName;
        this.bigDecimalInString = bigDecimalInString;
    }

    public BigDecimal getCountryPeopleQuantity() {
        BigDecimal countryPoepleQuantity = new BigDecimal(bigDecimalInString);
        return countryPoepleQuantity;

    }

}
