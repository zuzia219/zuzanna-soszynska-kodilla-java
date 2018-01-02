package com.kodilla.good.patterns.challenges.flight;

import java.util.Optional;

public final class Flight {

    private final String departureAirport;
    private final Optional<String> intermediateAirport;
    private final String arrivalAirport;

    public Flight(String departureAirport, Optional<String> intermediateAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.intermediateAirport = intermediateAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Optional<String> getIntermediateAirport() {
        return intermediateAirport;
    }

    public String getArrivalAirport() {
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
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", intermediateAirport=" + intermediateAirport +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}
