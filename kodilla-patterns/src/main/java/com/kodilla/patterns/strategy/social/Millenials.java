package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
