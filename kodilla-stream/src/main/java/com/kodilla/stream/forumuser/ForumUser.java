package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfposts;

    public ForumUser(final int userId, final String userName, final char gender, final LocalDate dateOfBirth, final int numberOfposts) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfposts = numberOfposts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfposts() {
        return numberOfposts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfposts=" + numberOfposts +
                '}';
    }
}
