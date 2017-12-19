package com.kodilla.stream.array;

import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage() {

        //Given

        int[] testNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //When

        double result = getAverage(testNumbers);

        //Then

        assertEquals(10.5, result, 0);

    }

}
