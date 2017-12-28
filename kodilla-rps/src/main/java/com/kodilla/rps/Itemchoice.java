package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Itemchoice {

    public RpsItem itemChoice(int choice) {

        List<RpsItem> availableItems = new ArrayList<>();
        availableItems.add(new Rock());
        availableItems.add(new Paper());
        availableItems.add(new Scissors());

        return availableItems.get(choice - 1);
    }

    public int computersChoiceGenerator() {

        Random randomGenerator = new Random();
        return (randomGenerator.nextInt(3) + 1);

    }
}
