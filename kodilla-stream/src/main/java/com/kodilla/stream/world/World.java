package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World implements PeopleQuantity {

    public final Set<Continent> worldsContinents = new HashSet<Continent>();

    public void addContinents(Continent continent) {

        worldsContinents.add(continent);
    }


    public BigDecimal getPeopleQuantity() {
        return worldsContinents.stream()
                .flatMap(world -> world.getContinentsCountries().stream())
                .map(Country::getCountryPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

}
