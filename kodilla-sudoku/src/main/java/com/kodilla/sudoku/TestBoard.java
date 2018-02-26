package com.kodilla.sudoku;

public class TestBoard {

    private static final int MIN_INDEX = 0;
    private static final int MAX_BOARD_INDEX = 9;

    public static void prepareTestBoard(SudokuBoard board) {

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


        for (int n = MIN_INDEX; n < MAX_BOARD_INDEX; n++) {
            for (int k = MIN_INDEX; k < MAX_BOARD_INDEX; k++) {
                if (board.getSudokuRowList().get(n).getSudokuElementList().get(k).getValue() != -1) {

                    board.getSudokuRowList().get(n).getSudokuElementList().get(k).getPossibleValues().clear();
                }
            }

        }
    }

}
