package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    public static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This is the end of tests");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing test # " + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test # " + testCounter + " completed");
    }

    @Test
    public void testAddFigure() {

        //Given
        ArrayList<Shape> shapelist = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapelist);

        //When
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);

        //Then
        Assert.assertEquals(1, shapelist.size());

    }

    @Test
    public void testRemoveFigures() {

        //Given
        ArrayList<Shape> shapelist = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapelist);
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        collector.addFigure(triangle);

        //When
        boolean result = collector.removeFigure(triangle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, shapelist.size());

    }

    @Test
    public void testRemoveFiguresNotExisting() {
        //Given
        ArrayList<Shape> shapelist = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapelist);
        Triangle triangle = new Triangle();

        //When
        boolean result = collector.removeFigure(triangle);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testGetFigure() {

        //Given
        ArrayList<Shape> shapelist = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapelist);


        //When
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        Shape result = collector.getFigure(0);


        //Then
        Assert.assertEquals(triangle, result);

    }

    @Test
    public void testShowFigures() {

        //Given
        ArrayList<Shape> shapelist = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapelist);
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);

        //When

        int result = collector.showFigures();

        //Then
        Assert.assertEquals(1, result);

    }

}
