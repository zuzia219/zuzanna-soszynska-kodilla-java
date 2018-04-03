package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<Observer> observers;
    ArrayDeque<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void offerTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
