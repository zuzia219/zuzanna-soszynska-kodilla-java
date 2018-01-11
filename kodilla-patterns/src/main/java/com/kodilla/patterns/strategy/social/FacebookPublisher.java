package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    public void share() {
        System.out.println("Facebook");
    }
}
