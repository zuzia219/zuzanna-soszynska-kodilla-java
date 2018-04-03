package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueuesForMentorsTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue alicealisonTaskQueue = new StudentAliceAlisonTaskQueue();
        TaskQueue rogerRogerTaskQueue = new StudentRogerRogerTaskQueue();
        TaskQueue johnSmithTaskQueue = new StudentJohnSmithTaskQueue();
        Mentor steveKowalski = new Mentor("Steve Kowalski");
        Mentor evelynJohnson = new Mentor("Evelyn Johson");
        alicealisonTaskQueue.registerObserver(steveKowalski);
        rogerRogerTaskQueue.registerObserver(evelynJohnson);
        johnSmithTaskQueue.registerObserver(evelynJohnson);
        johnSmithTaskQueue.registerObserver(steveKowalski);
        //When
        alicealisonTaskQueue.offerTask("task 32.2");
        alicealisonTaskQueue.offerTask("task 7.2");
        rogerRogerTaskQueue.offerTask("task 1.2");
        rogerRogerTaskQueue.offerTask("task 6.6");
        johnSmithTaskQueue.offerTask("task 7.8");
        johnSmithTaskQueue.offerTask("task 1.0");
        //Then
        assertEquals(4, evelynJohnson.getUpdateCount());
        assertEquals(4, steveKowalski.getUpdateCount());

    }
}
