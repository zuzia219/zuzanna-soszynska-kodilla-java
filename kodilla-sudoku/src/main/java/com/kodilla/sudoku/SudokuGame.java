package com.kodilla.sudoku;

import static com.kodilla.sudoku.NewBoard.prapareNewBoard;
import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoard;
import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoardPossibleValues;
import static com.kodilla.sudoku.TestBoard.prepareTestBoard;

public class SudokuGame {

    public static void main(String[] args) {

        SudokuBoard board = new SudokuBoard();
        prapareNewBoard(board);
        prepareTestBoard(board);

        printSudokuBoard(board);
        printSudokuBoardPossibleValues(board);

        SudokuSolver solver = new SudokuSolver();
        solver.elimianateValues(board);
        solver.setValueIfOnlyOneIsLeft(board);
        printSudokuBoard(board);
        printSudokuBoardPossibleValues(board);
        System.out.println(solver.getValuesSetCounter());

    }

}
