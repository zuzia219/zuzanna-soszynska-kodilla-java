package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    boolean isTaskExecuted;
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() throws TaskAlreadyExecutedException {
        if (isTaskExecuted) {
            throw new TaskAlreadyExecutedException();
        } else {
            System.out.println("Task is beeing executed...");
            isTaskExecuted = true;
        }
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
