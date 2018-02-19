package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoard;
import static com.kodilla.sudoku.SudokuBoardPrinter.printSudokuBoardPossibleValues;

public class SudokuSolver {

    SudokuBoard sudokuBoard;
    Integer valuesSetCounter;

    public SudokuSolver(SudokuBoard sudokuBoard, Integer valuesSetCounter) {
        this.sudokuBoard = sudokuBoard;
        this.valuesSetCounter = valuesSetCounter;
    }
    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public Integer getValuesSetCounter() {
        return valuesSetCounter;
    }

    public void setValuesSetCounter(Integer valuesSetCounter) {
        this.valuesSetCounter = valuesSetCounter;
    }

    public SudokuSolver eliminateFromColumns(SudokuBoard board) {
        Integer currentValue;
        for (int v = 0; v <= 8; v++) {
            for (int n = 0; n <= 8; n++) {
                currentValue = board.getSudokuRowList().get(v).getSudokuElementList().get(n).getValue();
                //System.out.println(currentValue);
                for (int k = 0; k <= 8; k++) {
                    board.getSudokuRowList().get(k).getSudokuElementList().get(n).getPossibleValues().remove(currentValue);
                    if (board.getSudokuRowList().get(k).getSudokuElementList().get(n).getPossibleValues().size() == 1) {
                        Integer valueToSet = board.getSudokuRowList().get(k).getSudokuElementList().get(n).getPossibleValues().get(0);
                        board.getSudokuRowList().get(k).getSudokuElementList().get(n).setValue(valueToSet);
                        board.getSudokuRowList().get(k).getSudokuElementList().get(n).getPossibleValues().clear();
                        valuesSetCounter++;
                        System.out.println("current set: "+ valuesSetCounter);
                    }
                }
            }
        }
        return new SudokuSolver(board, valuesSetCounter);
    }

    public SudokuSolver eliminateFromRows(SudokuBoard board) {
        Integer currentValue;
        for (int v = 0; v <= 8; v++) {
            for (int n = 0; n <= 8; n++) {
                currentValue = board.getSudokuRowList().get(n).getSudokuElementList().get(v).getValue();
                for (int k = 0; k <= 8; k++) {
                    board.getSudokuRowList().get(n).getSudokuElementList().get(k).getPossibleValues().remove(currentValue);
                    if (board.getSudokuRowList().get(n).getSudokuElementList().get(k).getPossibleValues().size() == 1) {
                        Integer valueToSet = board.getSudokuRowList().get(n).getSudokuElementList().get(k).getPossibleValues().get(0);
                        board.getSudokuRowList().get(n).getSudokuElementList().get(k).setValue(valueToSet);
                        board.getSudokuRowList().get(n).getSudokuElementList().get(k).getPossibleValues().clear();
                        valuesSetCounter++;
                        System.out.println("current set: "+ valuesSetCounter);

                    }
                }
            }
        }
        return new SudokuSolver(board, valuesSetCounter);
    }

    public SudokuSolver eliminateFromBlocks (SudokuBoard board) {
        Integer currentValue;
        int x = 0;
        int z = 0;
        for (z=0; z<=8; z+=3) {
            for (x = 0; x <= 8; x += 3) {
                for (int i = z; i <= 2 + z; i++) {
                    for (int n = x; n <= 2 + x; n++) {
                        currentValue = board.getSudokuRowList().get(i).getSudokuElementList().get(n).getValue();
                        for (int k = z; k <= 2 + z; k++) {
                            for (int l = x; l <= 2 + x; l++) {
                                board.getSudokuRowList().get(k).getSudokuElementList().get(l).getPossibleValues().remove(currentValue);
                                if (board.getSudokuRowList().get(k).getSudokuElementList().get(l).getPossibleValues().size() == 1) {
                                    Integer valueToSet = board.getSudokuRowList().get(k).getSudokuElementList().get(l).getPossibleValues().get(0);
                                    board.getSudokuRowList().get(k).getSudokuElementList().get(l).setValue(valueToSet);
                                    board.getSudokuRowList().get(k).getSudokuElementList().get(l).getPossibleValues().clear();
                                    valuesSetCounter++;
                                    System.out.println("current set: "+ valuesSetCounter);
                                }
                            }
                        }
                    }
                }
            }
        }

        return new SudokuSolver(board, valuesSetCounter);
    }

    public void solveSudoku(SudokuBoard board, SudokuSolver solver) {
        //int sizeSum = -1;

        while(true) {

            printSudokuBoard(board);
            printSudokuBoardPossibleValues(board);
            solver.setValuesSetCounter(0);
            eliminateFromBlocks(board);
            //System.out.println("current set: "+ solver.getValuesSetCounter());
            eliminateFromColumns(board);
            //System.out.println("current set: "+ solver.getValuesSetCounter());
            eliminateFromRows(board);
            //sizeSum = 0;
            //System.out.println("current set: "+ solver.getValuesSetCounter());
            int value;
            /*for (int v = 0; v <= 8; v++) {
                for (int n = 0; n <= 8; n++) {
                    value = board.getSudokuRowList().get(v).getSudokuElementList().get(n).getPossibleValues().size();
                    sizeSum += value;
                    //System.out.println(value);
                    //System.out.println("current set: "+ solver.getValuesSetCounter());
                    //System.out.println(sizeSum);
                }
            }*/
          if (solver.getValuesSetCounter() ==0) {
                System.out.println("current set: "+ solver.getValuesSetCounter());
                break;
          }
        }
    }
}
