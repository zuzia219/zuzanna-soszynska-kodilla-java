package com.kodilla.rps;

import java.util.Scanner;

public class KeyboardControl {

    public int keyboardControlInts() {
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        return key;
    }

    public String keyboardControlStrings() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        return key;
    }
}
