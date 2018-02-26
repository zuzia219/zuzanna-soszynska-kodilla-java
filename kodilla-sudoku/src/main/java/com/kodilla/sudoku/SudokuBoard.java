package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype {
    private List<SudokuRow> sudokuRowList;
    private SudokuBoard board;

    public SudokuBoard() {
        this.sudokuRowList = new ArrayList<>();
    }

    public List<SudokuRow> getSudokuRowList() {
        return sudokuRowList;
    }


/*    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.sudokuRowList = new ArrayList<SudokuRow>();
        for( SudokuRow theSudokuRow : sudokuRowList) {
            SudokuRow clonedSudokuRow = new SudokuRow();
            for (SudokuElement theSudokuRow : theSudokuRow.getSudokuElementList()) {

            }
        }
    }*/

}
