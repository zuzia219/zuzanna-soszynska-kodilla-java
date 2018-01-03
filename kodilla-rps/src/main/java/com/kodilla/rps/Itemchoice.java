package com.kodilla.rps;

import java.util.List;
import java.util.Map;
import java.util.Random;


public class Itemchoice {

    public RpsItem itemChoice(String choice,  Map<String, RpsItem> mapOfKeyboardKeys) {

        return mapOfKeyboardKeys.get(choice) ;
    }

    public String computersChoiceGenerator(List<String> listOfKeyboardKeys) {

        Random randomGenerator = new Random();
        int choice = randomGenerator.nextInt(listOfKeyboardKeys.size());

        return listOfKeyboardKeys.get(choice);
    }
}
