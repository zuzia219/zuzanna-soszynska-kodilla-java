package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapOfAvailableAirports = new HashMap<String, Boolean>();

        mapOfAvailableAirports.put("Warsaw", false);
        mapOfAvailableAirports.put("Cracow", false);
        mapOfAvailableAirports.put("Gdansk", false);
        mapOfAvailableAirports.put("Rzeszow", true);
        mapOfAvailableAirports.put("Bydgoszcz", true);


        if ((!mapOfAvailableAirports.containsKey(flight.getArrivalAirport())) || (!mapOfAvailableAirports.containsKey(flight.getDepartureAirport()))) {
            throw new RouteNotFoundException();
        } else if (flight.getArrivalAirport().equals(flight.getDepartureAirport()))
            System.out.println("The departure airport has to be different from arrival airport to check flight availability ");

        else {

            for (Map.Entry<String, Boolean> entry : mapOfAvailableAirports.entrySet()) {
                if (entry.getValue() && (entry.getKey().equals(flight.getArrivalAirport())))
                    System.out.println("The flight from " + flight.getDepartureAirport() + " to " + entry.getKey() + " is available ");
                else if (entry.getValue() == false && entry.getKey().equals(flight.getArrivalAirport()))
                    System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available ");
            }
        }
    }
}
