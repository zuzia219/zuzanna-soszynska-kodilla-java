package com.kodilla.good.patterns.challenges.flight;

import java.util.Map;

public final class FlightFinder {

    public void findFlight(Flight flight, Map<Integer, Flight> mapOfAvailableFlights) {

        if (flight.getArrivalAirport().isPresent() && flight.getDepartureAirport().isPresent()) {
            System.out.println("");
            System.out.println("Available flights from: " + flight.getDepartureAirport() + " through " + flight.getIntermediateAirport() + " to: " + flight.getArrivalAirport());
            System.out.println("");
            mapOfAvailableFlights.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(flight))
                    .forEach(System.out::println);
        }

        if ((!flight.getArrivalAirport().isPresent()) && (!flight.getIntermediateAirport().isPresent()) && flight.getDepartureAirport().isPresent()) {
            System.out.println("");
            System.out.println("Available flights from: " + flight.getDepartureAirport());
            System.out.println("");
            mapOfAvailableFlights.entrySet().stream()
                    .filter(entry -> entry.getValue().getDepartureAirport().equals(flight.getDepartureAirport()))
                    .forEach(System.out::println);
        }

        if ((!flight.getIntermediateAirport().isPresent()) && (!flight.getDepartureAirport().isPresent())) {
            System.out.println("");
            System.out.println("Available flights to: " + flight.getArrivalAirport());
            System.out.println("");
            mapOfAvailableFlights.entrySet().stream()
                    .filter(entry -> entry.getValue().getArrivalAirport().equals(flight.getArrivalAirport()))
                    .forEach(System.out::println);
        }
    }
}
