package com.kodilla.rps;

public class Points {

    int playersPoints;
    int computersPoints;

    public Points(int playersPoints, int computersPoints) {
        this.playersPoints = playersPoints;
        this.computersPoints = computersPoints;
    }

    public int getPlayersPoints() {
        return playersPoints;
    }

    public int getComputersPoints() {
        return computersPoints;
    }
}
