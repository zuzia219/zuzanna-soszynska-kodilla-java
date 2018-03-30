package com.kodilla.hibernate.manytomany.facade;


public class SearchException extends Exception {
    public static final String ERR_SUBSTRINGS_LENGTH_IS_NOT_THREE = "The search phrase's length should be exactly three letters";
    public static final String ERR_STRING_LENGTH_IS_ZERO = "The search phrase's length should be at least one letter";

    public SearchException(String message) {
        super(message);
    }
}
