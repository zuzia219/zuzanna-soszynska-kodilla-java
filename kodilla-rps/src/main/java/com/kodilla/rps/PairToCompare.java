package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class PairToCompare {

    String playersChoiceName;
    String computersChoiceName;

    public PairToCompare(String playersChoiceName, String computersChoiceName) {
        this.playersChoiceName = playersChoiceName;
        this.computersChoiceName = computersChoiceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairToCompare that = (PairToCompare) o;

        if (!playersChoiceName.equals(that.playersChoiceName)) return false;
        return computersChoiceName.equals(that.computersChoiceName);
    }

    @Override
    public int hashCode() {
        int result = playersChoiceName.hashCode();
        result = 31 * result + computersChoiceName.hashCode();
        return result;
    }

    public static void pairComparing(RpsItem playersChoice, RpsItem computersChoice, int playersPoints, int computersPoints) {

        PairToCompare pairToCompare = new PairToCompare(playersChoice.getItemsName(), computersChoice.getItemsName());

        Map<PairToCompare, Boolean> pairToCompareBooleanMap = new HashMap<PairToCompare, Boolean>();
        pairToCompareBooleanMap.put(new PairToCompare("Rock", "Paper"), false);
        pairToCompareBooleanMap.put(new PairToCompare("Rock", "Scissors"), true);
        pairToCompareBooleanMap.put(new PairToCompare("Paper", "Scissors"), false);
        pairToCompareBooleanMap.put(new PairToCompare("Paper", "Rock"), true);
        pairToCompareBooleanMap.put(new PairToCompare("Scissors", "Rock"), false);
        pairToCompareBooleanMap.put(new PairToCompare("Scissors", "Paper"), true);

        if ((playersChoice.getItemsName()).equals(computersChoice.getItemsName()))
            System.out.println("It's a draw");
        else {

            if (pairToCompareBooleanMap.get(pairToCompare)) {
                playersPoints++;
                System.out.println("");
                System.out.println(playersChoice.getItemsName() + " beats " + computersChoice.getItemsName());
            } else {
                computersPoints++;
                System.out.println("");
                System.out.println(playersChoice.getItemsName() + " is beaten by " + computersChoice.getItemsName());
            }
        }
    }
}
