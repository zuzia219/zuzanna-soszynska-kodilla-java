package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic {
    private final List<String> messages;
    private final String name;

    public ForumTopic(String name) {
        messages= new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messages.add(post);
    }
}
