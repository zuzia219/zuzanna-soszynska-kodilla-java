package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": Has new task waiting in line in: " + taskQueue.getName() + "\n" + " (total:  " + taskQueue.getTasks().size() + " tasks");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
