package com.kodilla.sudoku;

public class SudokuBoardPrinter {
    public static void printSudokuBoard(SudokuBoard board) {
        String result = "";
        for (int n = 0; n <= 8; n++) {
            result += "|";
            for (int k = 0; k <= 8; k++) {
                if (board.getSudokuRowList().get(n).getSudokuElementList().get(k).getValue() == -1) {
                    result += "__";
                } else {
                    result += board.getSudokuRowList().get(n).getSudokuElementList().get(k).getValue().toString();
                }
                result += "|";
            }
            result += "\n";
        }
        System.out.println(result);
    }
}

