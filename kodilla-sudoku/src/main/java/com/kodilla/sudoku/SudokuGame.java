package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoard;
import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoardPossibleValues;

public class SudokuGame {

    public static void main(String[] args) {


        SudokuBoard board = new SudokuBoard();
        SudokuRow sudokuRow;
        for (int k = 0; k <= 8; k++) {
            sudokuRow = new SudokuRow();
            for (int n = 0; n <= 8; n++) {
                sudokuRow.getSudokuElementList().add(new SudokuElement());
            }
            board.getSudokuRowList().add(sudokuRow);
        }
        board.getSudokuRowList().get(0).getSudokuElementList().get(2).setValue(8);
        board.getSudokuRowList().get(0).getSudokuElementList().get(6).setValue(3);
        board.getSudokuRowList().get(0).getSudokuElementList().get(8).setValue(2);

        board.getSudokuRowList().get(1).getSudokuElementList().get(1).setValue(1);
        board.getSudokuRowList().get(1).getSudokuElementList().get(5).setValue(2);
        board.getSudokuRowList().get(1).getSudokuElementList().get(8).setValue(7);

        board.getSudokuRowList().get(2).getSudokuElementList().get(2).setValue(9);
        board.getSudokuRowList().get(2).getSudokuElementList().get(4).setValue(3);
        board.getSudokuRowList().get(2).getSudokuElementList().get(5).setValue(1);

        board.getSudokuRowList().get(3).getSudokuElementList().get(1).setValue(8);
        board.getSudokuRowList().get(3).getSudokuElementList().get(5).setValue(3);
        board.getSudokuRowList().get(3).getSudokuElementList().get(6).setValue(1);
        board.getSudokuRowList().get(3).getSudokuElementList().get(7).setValue(7);

        board.getSudokuRowList().get(4).getSudokuElementList().get(0).setValue(9);
        board.getSudokuRowList().get(4).getSudokuElementList().get(1).setValue(4);
        board.getSudokuRowList().get(4).getSudokuElementList().get(7).setValue(8);
        board.getSudokuRowList().get(4).getSudokuElementList().get(8).setValue(3);

        board.getSudokuRowList().get(5).getSudokuElementList().get(1).setValue(5);
        board.getSudokuRowList().get(5).getSudokuElementList().get(2).setValue(7);
        board.getSudokuRowList().get(5).getSudokuElementList().get(3).setValue(6);
        board.getSudokuRowList().get(5).getSudokuElementList().get(7).setValue(4);

        board.getSudokuRowList().get(6).getSudokuElementList().get(3).setValue(3);
        board.getSudokuRowList().get(6).getSudokuElementList().get(4).setValue(9);
        board.getSudokuRowList().get(6).getSudokuElementList().get(6).setValue(4);

        board.getSudokuRowList().get(7).getSudokuElementList().get(0).setValue(1);
        board.getSudokuRowList().get(7).getSudokuElementList().get(3).setValue(7);
        board.getSudokuRowList().get(7).getSudokuElementList().get(7).setValue(3);

        board.getSudokuRowList().get(8).getSudokuElementList().get(0).setValue(2);
        board.getSudokuRowList().get(8).getSudokuElementList().get(2).setValue(4);
        board.getSudokuRowList().get(8).getSudokuElementList().get(6).setValue(7);


        for (int n = 0; n <= 8; n++) {
            for (int k = 0; k <= 8; k++) {
                if (board.getSudokuRowList().get(n).getSudokuElementList().get(k).getValue() != -1) {

                  board.getSudokuRowList().get(n).getSudokuElementList().get(k).getPossibleValues().clear();
                }
            }

        }

        printSudokuBoard(board);
        printSudokuBoardPossibleValues(board);

        SudokuSolver solver = new SudokuSolver(board, 0);
        //solver.eliminateFromRows(board);
        //solver.eliminateFromColumns(board);
        //solver.eliminateFromBlocks(board);
        solver.solveSudoku(board, solver);

        printSudokuBoard(board);
        printSudokuBoardPossibleValues(board);
        //System.out.println(solver.getValuesSetCounter());

    }

}
