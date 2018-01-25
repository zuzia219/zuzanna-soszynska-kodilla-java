package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {

    public static void main(String[] args) {

        Character key = 13;
        System.out.println(key);
        System.out.println("press enter:");
        Scanner scanner = new Scanner(System.in);
        String pressedKey = scanner.next();

        boolean rightKey = false;
        if(pressedKey.equals(Character.toString(key))) {
            rightKey = true;
        }
        System.out.println(rightKey);

    }
}
