package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuRowList;
    private SudokuBoard board;

    public SudokuBoard() {
        this.sudokuRowList = new ArrayList<>();
    }

    public List<SudokuRow> getSudokuRowList() {
        return sudokuRowList;
    }

    public void setSudokuRowList(List<SudokuRow> sudokuRowList) {
        this.sudokuRowList = sudokuRowList;
    }

}
