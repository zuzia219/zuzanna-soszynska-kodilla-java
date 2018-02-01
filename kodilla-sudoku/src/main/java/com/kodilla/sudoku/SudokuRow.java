package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> sudokuElementList;

    public SudokuRow() {
        this.sudokuElementList = new ArrayList<>();
    }

    public List<SudokuElement> getSudokuElementList() {
        return sudokuElementList;
    }

    public void setSudokuElementList(List<SudokuElement> sudokuElementList) {
        this.sudokuElementList = sudokuElementList;
    }
}
