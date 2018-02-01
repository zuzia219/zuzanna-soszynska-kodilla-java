package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.List;

public class SudokuElement {
    private Integer value;
    private List<Integer> possibleValues;

    public SudokuElement() {
        this.value = -1;
        this.possibleValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public Integer getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void removePossibleValue(Integer valueToRemove) {
        possibleValues.remove(valueToRemove);
    }

    public void addBackPossibleValue(Integer valuetoAddBack) {
        possibleValues.add(valuetoAddBack);
    }
}
