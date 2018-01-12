package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("morning shopping", "lemons", 15.0);
            case PAINTINGTASK:
                return new PaintingTask("livingroom painting", "silver", "cealing");
            case DRIVINGTASK:
                return new DrivingTask("trip", "to grandma", "sigway");
            default:
                return null;
        }
    }
}
