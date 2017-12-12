package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

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
        System.out.println(" ");
        System.out.println("Preparing test # " + testCounter);

    }

    @After
    public void afterEveryTest() {
        System.out.println(" ");
        System.out.println("Test # " + testCounter + " completed");
    }

    @Test
    public void testCalculateADVStatisticsAllZeros() {
        //Given
        Statistics statisticsmock = mock(Statistics.class);
        StatisticsProcessor processor = new StatisticsProcessor();


        //When
        processor.calculateAdvStatistics(statisticsmock);
        processor.showStatistics();

        //Then
        Assert.assertEquals(0, processor.getNumberOfComments());
        Assert.assertEquals(0, processor.getNumberOfPosts());
        Assert.assertEquals(0, processor.getNumberOfUsers());
        Assert.assertEquals(0, processor.getAvaragePostsNumberOfComments(), 0);
        Assert.assertEquals(0, processor.getAvarageUsersNumberOfComments(), 0);
        Assert.assertEquals(0, processor.getAvarageUsersNumberOfPosts(), 0);

    }


    @Test
    public void testCalculateADVStatisticsHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor processor = new StatisticsProcessor();
        ArrayList<String> usernames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usernames.add("testUser");
        }

        when(statisticsMock.usersNames()).thenReturn(usernames);


        //When
        processor.calculateAdvStatistics(statisticsMock);
        processor.showStatistics();

        //Then
        Assert.assertEquals(0, processor.getNumberOfComments());
        Assert.assertEquals(0, processor.getNumberOfPosts());
        Assert.assertEquals(100, processor.getNumberOfUsers());
        Assert.assertEquals(0, processor.getAvaragePostsNumberOfComments(), 0);
        Assert.assertEquals(0, processor.getAvarageUsersNumberOfComments(), 0);
        Assert.assertEquals(0, processor.getAvarageUsersNumberOfPosts(), 0);

    }

    @Test
    public void testCalculateADVStatisticsHundredUsersAndThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor processor = new StatisticsProcessor();
        ArrayList<String> usernames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usernames.add("testUser");
        }

        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(1000);


        //When
        processor.calculateAdvStatistics(statisticsMock);
        processor.showStatistics();

        //Then
        Assert.assertEquals(0, processor.getNumberOfComments());
        Assert.assertEquals(1000, processor.getNumberOfPosts());
        Assert.assertEquals(100, processor.getNumberOfUsers());
        Assert.assertEquals(0, processor.getAvaragePostsNumberOfComments(), 0);
        Assert.assertEquals(0, processor.getAvarageUsersNumberOfComments(), 0);
        Assert.assertEquals(10, processor.getAvarageUsersNumberOfPosts(), 0);

    }

    @Test
    public void testCalculateADVStatisticsLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor processor = new StatisticsProcessor();
        ArrayList<String> usernames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usernames.add("testUser");
        }

        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);


        //When
        processor.calculateAdvStatistics(statisticsMock);
        processor.showStatistics();

        //Then
        Assert.assertEquals(100, processor.getNumberOfComments());
        Assert.assertEquals(1000, processor.getNumberOfPosts());
        Assert.assertEquals(100, processor.getNumberOfUsers());
        Assert.assertTrue(processor.avaragePostsNumberOfComments < 1);
        Assert.assertEquals(1, processor.getAvarageUsersNumberOfComments(), 0);
        Assert.assertEquals(10, processor.getAvarageUsersNumberOfPosts(), 0);

    }

    @Test
    public void testCalculateADVStatisticsLessPostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor processor = new StatisticsProcessor();
        ArrayList<String> usernames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usernames.add("testUser");
        }

        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);


        //When
        processor.calculateAdvStatistics(statisticsMock);
        processor.showStatistics();

        //Then
        Assert.assertEquals(1000, processor.getNumberOfComments());
        Assert.assertEquals(100, processor.getNumberOfPosts());
        Assert.assertEquals(100, processor.getNumberOfUsers());
        Assert.assertTrue(processor.avaragePostsNumberOfComments > 1);
        Assert.assertEquals(10, processor.getAvarageUsersNumberOfComments(), 0);
        Assert.assertEquals(1, processor.getAvarageUsersNumberOfPosts(), 0);

    }

}




