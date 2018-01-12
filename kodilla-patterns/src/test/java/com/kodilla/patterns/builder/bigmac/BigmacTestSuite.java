package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bigmac.BigmacBuilder.*;

public class BigmacTestSuite {
    @Test
    public void testYourNewBigMacRightNow() throws Exception {
        //Given
        System.out.println("Available ingriedients are: "+ setAvailableIngriedients());
        System.out.println("Available rolls are: "+ setAvailableRolls());
        System.out.println("Available sauces are: "+ setAvailableSauces());
        System.out.println("Max number of burgers is: "+ setMaxNumberOfBurgers());
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingridient("lettuce")
                .roll("with sesame")
                .burgers(2)
                .build();
        System.out.println("preparing bic mac..."+bigmac);
        //When
        int howmanyIndredients = bigmac.getIngridients().size();
        //Then
        Assert.assertEquals(1, howmanyIndredients);
    }
}
