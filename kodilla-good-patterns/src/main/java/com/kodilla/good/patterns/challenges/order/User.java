package com.kodilla.good.patterns.challenges.order;

public class User {
    private String nickName;
    private String firstName;
    private String familyName;
    private UsersAddress usersAddress;

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public UsersAddress getUsersAddress() {
        return usersAddress;
    }

    public User(String nickName, String firstName, String familyName, UsersAddress usersAddress) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.familyName = familyName;
        this.usersAddress = usersAddress;
    }
}
