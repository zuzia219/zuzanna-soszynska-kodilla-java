package com.kodilla.good.patterns.challenges.order;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private int id;
    private List<Item> itemList = new ArrayList<>();

    public Invoice(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
