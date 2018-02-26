package com.kodilla.sudoku;


public class SudokuSolver {

    private static final int MIN_INDEX = 0;
    private static final int MAX_BOARD_INDEX = 9;
    private static final int MAX_BLOCK_INDEX = 3;

    private int valuesSetCounter;

    public int getValuesSetCounter() {
        return valuesSetCounter;
    }

    public SudokuSolver() {
        this.valuesSetCounter = 0;
    }

    public void setValueIfOnlyOneIsLeft(SudokuBoard board) {
        for (int v = MIN_INDEX; v < MAX_BOARD_INDEX; v++) {
            for (int n = MIN_INDEX; n < MAX_BOARD_INDEX; n++) {
                if (board.getSudokuRowList().get(v).getSudokuElementList().get(n).getPossibleValues().size() == 1) {
                    Integer valueToSet = board.getSudokuRowList().get(v).getSudokuElementList().get(n).getPossibleValues().get(0);
                    board.getSudokuRowList().get(v).getSudokuElementList().get(n).setValue(valueToSet);
                    board.getSudokuRowList().get(v).getSudokuElementList().get(n).getPossibleValues().clear();
                    valuesSetCounter++;
                }
            }
        }
    }

    public void elimianateValues(SudokuBoard board) {
        Integer currentValue;
        for (int v = MIN_INDEX; v < MAX_BOARD_INDEX; v++) {
            for (int n = MIN_INDEX; n < MAX_BOARD_INDEX; n++) {
                currentValue = board.getSudokuRowList().get(v).getSudokuElementList().get(n).getValue();
                for (int k = MIN_INDEX; k < MAX_BOARD_INDEX; k++) {
                    board.getSudokuRowList().get(v).getSudokuElementList().get(k).getPossibleValues().remove(currentValue);
                    board.getSudokuRowList().get(k).getSudokuElementList().get(n).getPossibleValues().remove(currentValue);
                }
                int blockX = n / MAX_BLOCK_INDEX;
                int blockY = v / MAX_BLOCK_INDEX;
                for (int y = blockY * MAX_BLOCK_INDEX; y < (blockY + 1) * MAX_BLOCK_INDEX; y++) {
                    for (int x = blockX * MAX_BLOCK_INDEX; x < (blockX + 1) * MAX_BLOCK_INDEX; x++) {
                        board.getSudokuRowList().get(y).getSudokuElementList().get(x).getPossibleValues().remove(currentValue);
                    }
                }
            }
        }
    }
}

