package com.kodilla.good.patterns.challenges.flight;

import java.util.Optional;

public final class Flight {

    private final Optional<String> departureAirport;
    private final Optional<String> intermediateAirport;
    private final Optional<String> arrivalAirport;

    public Flight(final Optional<String> departureAirport, final Optional<String> intermediateAirport, final Optional<String> arrivalAirport) {
        this.departureAirport = departureAirport;
        this.intermediateAirport = intermediateAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Optional<String> getDepartureAirport() {
        return departureAirport;
    }

    public Optional<String> getIntermediateAirport() {
        return intermediateAirport;
    }

    public Optional<String> getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (!intermediateAirport.equals(flight.intermediateAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + intermediateAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight: " +
                "departureAirport='" + departureAirport + '\'' +
                ", intermediateAirport='" + intermediateAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'';
    }
}
