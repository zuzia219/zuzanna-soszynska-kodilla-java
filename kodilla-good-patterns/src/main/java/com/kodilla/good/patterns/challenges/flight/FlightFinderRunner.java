package com.kodilla.good.patterns.challenges.flight;

import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.challenges.flight.MapOfAvailableFlights.getMapOfAvailableFlights;

public class FlightFinderRunner {

    public static void main(String args[]) {

        Optional<String> departureAirport = Optional.ofNullable("Warsaw");
        Optional<String> intermediateAirport = Optional.ofNullable(null);
        Optional<String> arrivalAirport = Optional.ofNullable(null);

        Flight flight = new Flight(departureAirport, intermediateAirport, arrivalAirport);
        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> mapOfAvailableFlights = getMapOfAvailableFlights();

        flightFinder.findFlight(flight, mapOfAvailableFlights);
    }
}
