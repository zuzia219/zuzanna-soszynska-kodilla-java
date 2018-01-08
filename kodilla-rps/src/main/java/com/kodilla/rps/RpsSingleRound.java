package com.kodilla.rps;

import static com.kodilla.rps.PairToCompare.pairComparing;

public class RpsSingleRound {

    int playersPoints;
    int computersPoints;

    public Points beginSingleRound() {

        AvailableItems availableItems = new AvailableItems();
        KeyboardControl control = new KeyboardControl();
        boolean ifKeyIsRiht = false;
        String choice = "";
        while (ifKeyIsRiht != true) {
            availableItems.printItemOptions(availableItems.getMapOfKeyboardKeys());
            choice = control.keyboardControlStrings();
            if (availableItems.getListOfKeyboardKeys(availableItems.getMapOfKeyboardKeys()).contains(choice)) {
                ifKeyIsRiht = true;
            } else {
                System.out.println("Key not active");
            }
        }
        Itemchoice itemchoice = new Itemchoice();
        RpsItem playersChoice = itemchoice.itemChoice(choice, availableItems.getMapOfKeyboardKeys());
        String computerItem = itemchoice.computersChoiceGenerator(availableItems.getListOfKeyboardKeys(availableItems.getMapOfKeyboardKeys()));
        RpsItem computerChoice = itemchoice.itemChoice(computerItem, availableItems.getMapOfKeyboardKeys());

        Points points = pairComparing(playersChoice, computerChoice, playersPoints, computersPoints, availableItems.getPairToCompareBooleanMap());

        return points;
    }
}
