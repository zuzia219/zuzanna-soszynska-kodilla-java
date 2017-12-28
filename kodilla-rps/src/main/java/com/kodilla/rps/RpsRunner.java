package com.kodilla.rps;


public class RpsRunner {

    public static void main(String[] args) {

        boolean end = false;

        while (!end) {

            System.out.println("Please enter your name: ");
            KeyboardControl control = new KeyboardControl();
            String playersName = control.keyboardControlStrings();

            System.out.println("Please enter the number of games you wish to play: ");
            int howManyGames = control.keyboardControlInts();

            for (int i = howManyGames; i > 0; i--) {


                System.out.println("Please choose an option:  - Rock - 1, Paper - 2, Scissors - 3");
                RpsGame game = new RpsGame(playersName, howManyGames);
                game.beginGame();
                System.out.println("");
                System.out.println((i-1) + " games left to go...");
                System.out.println("");
            }
            System.out.println("If you wish t play again - please enter  - n, if you wish to end the game please enter x");
            String ifGameEnds = control.keyboardControlStrings();
            if (ifGameEnds.equals("x"))
                end = true;
        }
    }
}
