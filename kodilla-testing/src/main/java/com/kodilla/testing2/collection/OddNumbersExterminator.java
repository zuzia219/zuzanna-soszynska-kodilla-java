package com.kodilla.testing2.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evennumbers = new ArrayList<Integer>();


        for (Integer even: numbers) {

            if(even%2 == 0){

                evennumbers.add(even);
            }
        }

        return evennumbers;

    }
}
