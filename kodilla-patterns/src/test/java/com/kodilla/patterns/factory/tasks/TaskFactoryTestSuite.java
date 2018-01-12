package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryTShoppingTask() throws Exception {
        TaskFactory factory = new TaskFactory();
        Task shoppingtask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        System.out.println("Task: " +shoppingtask.getTaskName());
        shoppingtask.executeTask();
        Assert.assertTrue(shoppingtask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() throws Exception {
        TaskFactory factory = new TaskFactory();
        Task paintingtask = factory.makeTask(TaskFactory.PAINTINGTASK);
        System.out.println("Task: " +paintingtask.getTaskName());
        paintingtask.executeTask();
        Assert.assertTrue(paintingtask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() throws Exception {
        TaskFactory factory = new TaskFactory();
        Task drivingtask = factory.makeTask(TaskFactory.DRIVINGTASK);
        System.out.println("Task: " +drivingtask.getTaskName());
        drivingtask.executeTask();
        Assert.assertTrue(drivingtask.isTaskExecuted());
    }
}
