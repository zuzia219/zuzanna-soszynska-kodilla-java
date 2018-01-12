package com.kodilla.patterns.factory.tasks;

public interface Task {

    void executeTask() throws TaskAlreadyExecutedException;

    String getTaskName();

    boolean isTaskExecuted();
}
