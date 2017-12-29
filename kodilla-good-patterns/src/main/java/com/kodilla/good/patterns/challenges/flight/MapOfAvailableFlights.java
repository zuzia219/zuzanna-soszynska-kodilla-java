package com.kodilla.good.patterns.challenges.flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class MapOfAvailableFlights {

    public static Map<Integer, Flight> getMapOfAvailableFlights() {

        Map<Integer, Flight> mapOfAvailableFlights = new HashMap<>();
        mapOfAvailableFlights.put(1, new Flight(Optional.ofNullable("Warsaw"), Optional.ofNullable("Gdansk"), Optional.ofNullable("Cracow")));
        mapOfAvailableFlights.put(2, new Flight(Optional.ofNullable("Gdansk"), Optional.ofNullable(null), Optional.ofNullable("Warsaw")));
        mapOfAvailableFlights.put(3, new Flight(Optional.ofNullable("Warsaw"), Optional.ofNullable(null), Optional.ofNullable("Gdansk")));
        mapOfAvailableFlights.put(4, new Flight(Optional.ofNullable("Gdansk"), Optional.ofNullable("Warsaw"), Optional.ofNullable("Rzeszow")));

        return mapOfAvailableFlights;
    }
}
