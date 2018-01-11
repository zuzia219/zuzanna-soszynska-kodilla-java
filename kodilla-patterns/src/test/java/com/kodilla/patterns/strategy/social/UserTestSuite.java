package com.kodilla.patterns.strategy.social;

import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        User adam88 = new YGeneration("adam88");
        User helena2005 = new ZGeneration("helena2005");
        User john2000 = new Millenials("john2000");

        adam88.share("i got a new job at big corpo");
        helena2005.share("i am eating a sandwich");
        john2000.share("whatever studies i choose i wont get job anyway");

    }

    @Test
    public void testIndividualSharingStrategy() {
        User edward = new YGeneration("edward");
        edward.setSocialPublishingStrategy(new SnapchatPublisher());
        edward.share("i am not interested in politics ");
    }
}
