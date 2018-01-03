package com.kodilla.rps;

public class DecideWhoWins {

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
}
