package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        double x = 3.0;
        double y = 3.0;

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));

        } catch (Exception e) {

            System.out.println("This combination of doubles is unacceptable! if(x >= 2 || x < 1 || y == 1.5) - I will surelly throw an exception!");
        }

    }
}
