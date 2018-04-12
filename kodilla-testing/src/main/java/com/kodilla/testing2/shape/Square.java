package com.kodilla.testing2.shape;

public class Square implements Shape {
    @Override
    public double getField() {
        return 4;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}
