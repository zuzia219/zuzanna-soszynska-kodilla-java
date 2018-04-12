package com.kodilla.testing2.shape;

public class Circle implements Shape {

    @Override
    public double getField() {
        return 3.14;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
