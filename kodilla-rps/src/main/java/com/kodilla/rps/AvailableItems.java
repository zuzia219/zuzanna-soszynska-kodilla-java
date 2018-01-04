package com.kodilla.rps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class AvailableItems {

    public Map<String, RpsItem> getMapOfKeyboardKeys() {

        Map<String, RpsItem> mapOfKeyboardKeys = new HashMap<>();

        mapOfKeyboardKeys.put("1", new RpsItem("Rock"));
        mapOfKeyboardKeys.put("2", new RpsItem("Paper"));
        mapOfKeyboardKeys.put("3", new RpsItem("Scissors"));

        return mapOfKeyboardKeys;
    }

    public Map<PairToCompare, Boolean> getPairToCompareBooleanMap() {
        Map<PairToCompare, Boolean> pairToCompareBooleanMap = new HashMap<PairToCompare, Boolean>();
        pairToCompareBooleanMap.put(new PairToCompare("Rock", "Paper"), false);
        pairToCompareBooleanMap.put(new PairToCompare("Rock", "Scissors"), true);
        pairToCompareBooleanMap.put(new PairToCompare("Paper", "Scissors"), false);
        pairToCompareBooleanMap.put(new PairToCompare("Paper", "Rock"), true);
        pairToCompareBooleanMap.put(new PairToCompare("Scissors", "Rock"), false);
        pairToCompareBooleanMap.put(new PairToCompare("Scissors", "Paper"), true);

        return pairToCompareBooleanMap;
    }

    public List<String> getListOfKeyboardKeys(Map<String, RpsItem> mapOfKeyboardKeys) {

        List<String> listOfKeyboardKeys = mapOfKeyboardKeys.entrySet().stream()
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        return listOfKeyboardKeys;
    }

    public void printItemOptions(Map<String, RpsItem> mapOfKeyboardKeys) {

        System.out.println("Available options are: ");
        Map<String, String> mapOfItemsNames = mapOfKeyboardKeys.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().getItemsName()));

        mapOfItemsNames.entrySet().stream()
                .forEach(System.out::println);
    }
}
