package com.kodilla.sudoku;


import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoard;

public class SudokuGame {

    public static void main(String[] args) {


        SudokuRow sudokuRow = new SudokuRow();
        SudokuBoard board = new SudokuBoard();
        for (int n = 0; n <= 8; n++) {
            sudokuRow.getSudokuElementList().add(new SudokuElement());
        }
        for (int k = 0; k <= 8; k++) {
            board.getSudokuRowList().add(sudokuRow);

        }
        board.getSudokuRowList().get(0).getSudokuElementList().get(8).setValue(2);
        board.getSudokuRowList().get(8).getSudokuElementList().get(7).setValue(5);
        System.out.println(board.getSudokuRowList().get(8).getSudokuElementList().get(7).getValue());

        printSudokuBoard(board);

    }
}
