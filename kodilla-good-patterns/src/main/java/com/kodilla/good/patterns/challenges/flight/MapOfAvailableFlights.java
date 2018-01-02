package com.kodilla.good.patterns.challenges.flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class MapOfAvailableFlights {

    public static Map<Integer, Flight> getMapOfAvailableFlights() {

        Map<Integer, Flight> mapOfAvailableFlights = new HashMap<>();
        mapOfAvailableFlights.put(1, new Flight("Warsaw", Optional.ofNullable("Gdansk"), "Cracow"));
        mapOfAvailableFlights.put(2, new Flight("Gdansk", Optional.empty(),"Warsaw"));
        mapOfAvailableFlights.put(3, new Flight("Warsaw", Optional.empty(), "Gdansk"));
        mapOfAvailableFlights.put(4, new Flight("Gdansk", Optional.ofNullable("Warsaw"), "Rzeszow"));
        mapOfAvailableFlights.put(3, new Flight("Warsaw", Optional.ofNullable("Cracow"), "Gdansk"));

        return mapOfAvailableFlights;
    }
}
