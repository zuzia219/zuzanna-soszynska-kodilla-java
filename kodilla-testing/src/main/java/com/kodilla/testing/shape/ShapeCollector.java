package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public int showedFiguresCounter = 0;

    ArrayList<Shape> shapelist = new ArrayList<Shape>();

    public ShapeCollector(ArrayList<Shape> shapelist) {
        this.shapelist = shapelist;
    }

    public void addFigure(Shape shape) {
        shapelist.add(shape);

    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapelist.contains(shape)) {
            shapelist.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapelist.size()) {
            shape = shapelist.get(n);
        }
        return shape;

    }


    public int showFigures() {
        for (Shape showedFigure : shapelist) {
            System.out.println("Figure: " + showedFigure.getShapeName() + " Field: " + showedFigure.getField() + " m2");
            showedFiguresCounter++;
        }
        return showedFiguresCounter;

    }

}
