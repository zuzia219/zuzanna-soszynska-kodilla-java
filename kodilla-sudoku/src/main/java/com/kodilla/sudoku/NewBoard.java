package com.kodilla.sudoku;

public class NewBoard {

    private static final int MIN_INDEX = 0;
    private static final int MAX_BOARD_INDEX = 9;
    public static void prapareNewBoard(SudokuBoard board){
        SudokuRow sudokuRow;
        for (int k = MIN_INDEX; k < MAX_BOARD_INDEX; k++) {
            sudokuRow = new SudokuRow();
            for (int n = MIN_INDEX; n <= MAX_BOARD_INDEX; n++) {
                sudokuRow.getSudokuElementList().add(new SudokuElement());
            }
            board.getSudokuRowList().add(sudokuRow);
        }
    }
}
