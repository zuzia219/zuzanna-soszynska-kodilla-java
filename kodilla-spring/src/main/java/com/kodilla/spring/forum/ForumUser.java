package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser() {
        username = "John Smith";
    }
}
