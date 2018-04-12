package com.kodilla.testing2.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList <Integer> emptylist = new ArrayList<Integer>();
        ArrayList<Integer> emptylistAfterExtermination = exterminator.exterminate(emptylist);
        System.out.println("Actual arraylist" + emptylistAfterExtermination);

        //Then
        ArrayList <Integer> result = new ArrayList<Integer>();
        System.out.println("Expected arraylist" + result);
        Assert.assertEquals(result, emptylistAfterExtermination);
    }

    @Test
    public void testOddNumbersExterminatorNormalListt(){
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();


        //When
        ArrayList <Integer> fulllist = new ArrayList<Integer>();
        fulllist.add(2);
        fulllist.add(3);
        fulllist.add(5);
        fulllist.add(4);
        ArrayList<Integer> evennumbersfulllist = exterminator2.exterminate(fulllist);
        System.out.println("Actual arraylist" + evennumbersfulllist);

        //Then
        ArrayList <Integer> result2 = new ArrayList<Integer>();
        result2.add(2);
        result2.add(4);
        System.out.println("Expected arraylist" + result2);
        Assert.assertEquals(result2, evennumbersfulllist);
    }




}
