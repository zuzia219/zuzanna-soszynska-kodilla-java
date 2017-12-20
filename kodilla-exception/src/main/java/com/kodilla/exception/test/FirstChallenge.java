package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {

        try {

        } catch (ArithmeticException e) {


        } finally {

            System.out.println("The devision process has ended the result is:");

        }
        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
