package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given
        //Create counties

        Country country1 = new Country("Utopia1","1111111111");
        Country country2 = new Country("Utopia2","1111111111");
        Country country3 = new Country("Utopia3","1111111111");
        Country country4 = new Country("Centopia1","2222222222");
        Country country5 = new Country("Centopia2","2222222222");
        Country country6 = new Country("Centopia3","2222222222");

        //Create continents

        Continent utopia = new Continent("Utopia");
        utopia.addCoutry(country1);
        utopia.addCoutry(country2);
        utopia.addCoutry(country3);

        Continent centopia = new Continent("Centopia");
        centopia.addCoutry(country4);
        centopia.addCoutry(country5);
        centopia.addCoutry(country6);

        //Create world

        World world = new World();
        world.addContinents(utopia);
        world.addContinents(centopia);

        //When

        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("9999999999");

        //Then
        Assert.assertEquals(expected,result);

    }
}
