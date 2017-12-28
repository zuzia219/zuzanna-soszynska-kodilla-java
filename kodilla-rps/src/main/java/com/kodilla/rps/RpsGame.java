package com.kodilla.rps;

import static com.kodilla.rps.PairToCompare.pairComparing;

public class RpsGame {
    String playersName;
    int howManyGames;

    static int playersPoints = 0;
    static int computersPoints = 0;

    public RpsGame(String playersName, int howManyGames) {
        this.playersName = playersName;
        this.howManyGames = howManyGames;
    }

    public void beginGame() {

        KeyboardControl control = new KeyboardControl();
        int choice = control.keyboardControlInts();
        Itemchoice itemchoice = new Itemchoice();
        RpsItem playersChoice = itemchoice.itemChoice(choice);
        int computerItemIndex = itemchoice.computersChoiceGenerator();
        RpsItem computerChoice = itemchoice.itemChoice(computerItemIndex);

        pairComparing(playersChoice, computerChoice, playersPoints, computersPoints);

        System.out.println(playersPoints);
        System.out.println(computersPoints);
    }
}
