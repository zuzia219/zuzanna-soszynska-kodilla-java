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
            DecideWhoWins decideWhoWins = new DecideWhoWins();
            decideWhoWins.decideWhoWins(playersSum, computersSum, game);
            DecideIfGameEnds decideIfGameEnds = new DecideIfGameEnds();
            end = decideIfGameEnds.IfGameEnds();
        }
    }
}

