package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for(Map.Entry<Integer, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }
}
