package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapOfAvailableAirports = new HashMap<String, Boolean>();

        mapOfAvailableAirports.put("Cracow", false);
        mapOfAvailableAirports.put("Gdansk", false);
        mapOfAvailableAirports.put("Rzeszow", true);
        mapOfAvailableAirports.put("Bydgoszcz", true);


        if ((!mapOfAvailableAirports.containsKey(flight.getArrivalAirport())))
            throw new RouteNotFoundException();
        else {

            for (Map.Entry<String, Boolean> entry : mapOfAvailableAirports.entrySet()) {

                if (entry.getKey().equals(flight.getArrivalAirport())) {

                    if (entry.getValue())
                        System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available ");

                    else
                        System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available ");

                }
            }
        }
    }
}

