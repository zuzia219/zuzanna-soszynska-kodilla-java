package com.kodilla.good.patterns.challenges.flight;

import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.challenges.flight.MapOfAvailableFlights.getMapOfAvailableFlights;

public class FlightFinderRunner {

    public static void main(String args[]) {

        String departureAirport = "Warsaw";
        Optional<String> intermediateAirport = Optional.ofNullable("Cracow");
        String arrivalAirport = "Gdansk";

        Flight flight = new Flight(departureAirport, intermediateAirport, arrivalAirport);
        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> mapOfAvailableFlights = getMapOfAvailableFlights();

        flightFinder.findFlightWithIntermediateAirport(flight, mapOfAvailableFlights);
        flightFinder.findFlightFromAirport(departureAirport, mapOfAvailableFlights);
        flightFinder.findFlightToAirport(arrivalAirport, mapOfAvailableFlights);
    }
}
