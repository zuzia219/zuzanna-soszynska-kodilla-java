package com.kodilla.rps;


public class RpsGame {
    String playersName;
    int howManyGames;

    public RpsGame(String playersName, int howManyGames) {
        this.playersName = playersName;
        this.howManyGames = howManyGames;
    }

    public String getPlayersName() {
        return playersName;
    }

    public void decideWhoWins(int playersSum, int computersSum, RpsGame game) {

        System.out.println("The game has ended");
        System.out.println("Total players points: " + playersSum + " Total computers points: " + computersSum);
        if (playersSum > computersSum)
            System.out.println(game.getPlayersName() + " has won!");
        else if (playersSum == computersSum)
            System.out.println("It's a draw!");
        else
            System.out.println("The computer has won!");
    }

    public boolean IfGameEnds() {
        boolean end = false;
        boolean ifThekeyIsRight = false;
        while (!ifThekeyIsRight) {
            System.out.println("");
            System.out.println("If you wish to play again - please enter  - n, if you wish to end the game - please enter x");
            KeyboardControl control = new KeyboardControl();
            String ifGameEnds = control.keyboardControlStrings();
            if (ifGameEnds.equals("x")) {
                System.out.println("Do you REALLY want to end the game? If you wish to play again - please enter - n, if you wish to end the game please enter x");
                ifGameEnds = control.keyboardControlStrings();
                if (ifGameEnds.equals("x")) {
                    ifThekeyIsRight = true;
                    end = true;
                }
                if (ifGameEnds.equals("n"))
                    ifThekeyIsRight = true;
                else
                    System.out.println("Key not active");
            } else if (ifGameEnds.equals("n")) {
                System.out.println("The new game will begin");
                ifThekeyIsRight = true;
            } else
                System.out.println("Key not active");

        }
        return end;
    }

    public static void beginGame() {

        boolean end = false;

        while (!end) {
            System.out.println("Please enter your name: ");
            KeyboardControl control = new KeyboardControl();
            String playersName = control.keyboardControlStrings();
            System.out.println("Please enter the number of games you wish to play: ");
            int howManyGames = control.keyboardControlInts();
            RpsGame game = new RpsGame(playersName, howManyGames);
            int playersSum = 0;
            int computersSum = 0;

            for (int i = howManyGames; i > 0; i--) {
                RpsSingleRound rpsSingleRound = new RpsSingleRound();
                Points totalPoints = rpsSingleRound.beginSingleRound();
                playersSum = playersSum + totalPoints.getPlayersPoints();
                computersSum = computersSum + totalPoints.getComputersPoints();
                System.out.println("");
                System.out.println("Current players points: " + playersSum + " Current computers points: " + computersSum);
                System.out.println("");
                System.out.println((i - 1) + " games left to go...");
                System.out.println("");
            }
            game.decideWhoWins(playersSum, computersSum, game);
            end = game.IfGameEnds();
        }
    }
}

