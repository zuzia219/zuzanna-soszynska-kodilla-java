package com.kodilla.good.patterns.challenges.flight;

import java.util.Map;

public final class FlightFinder {

    public void findFlightFromAirport(String departureAirport, Map<Integer, Flight> mapOfAvailableFlights) {
        System.out.println("");
        System.out.println("Available flights from: " + departureAirport);
        System.out.println("");
        mapOfAvailableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightToAirport(String arrivalAirport, Map<Integer, Flight> mapOfAvailableFlights) {
        System.out.println("");
        System.out.println("Available flights to: " + arrivalAirport);
        System.out.println("");
        mapOfAvailableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightWithIntermediateAirport(Flight flight, Map<Integer, Flight> mapOfAvailableFlights) {
        System.out.println("");
        System.out.println("Available flights from: " + flight.getDepartureAirport() + " through " + flight.getIntermediateAirport() + " to: " + flight.getArrivalAirport());
        System.out.println("");
        mapOfAvailableFlights.entrySet().stream()
                .filter(entry -> (entry.getValue().equals(flight)))
                .forEach(System.out::println);
    }
}
