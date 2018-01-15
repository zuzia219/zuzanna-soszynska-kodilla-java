package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class BigmacTestSuite {
    @Test
    public void testYourNewBigMacRightNow() throws Exception {
        //Given
        List<String> availableIngriedients = Arrays.asList("lettuce", "onion", "bacon", "cucumber", "chilli pepper", "mushroom", "shrimps", "cheese");
        List<String> availableRolls = Arrays.asList("with sesame", "without sesame");
        List<String> availableSauces = Arrays.asList("standard", "1000 islands", "barbecue");
        int maxNumberOfBurgers = 3;
        Bigmac bigmac = new Bigmac.BigmacBuilder(availableIngriedients, availableRolls, availableSauces, maxNumberOfBurgers)
                .ingridient("lettuce")
                .roll("with sesame")
                .burgers(2)
                .build();
        System.out.println("preparing bic mac..." + bigmac);
        //When
        int howmanyIndredients = bigmac.getIngridients().size();
        //Then
        Assert.assertEquals(1, howmanyIndredients);
    }
}
