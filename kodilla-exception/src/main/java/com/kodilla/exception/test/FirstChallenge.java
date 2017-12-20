package com.kodilla.exception.test;

public class FirstChallenge {

    public Integer divide(Integer a, Integer b) {

        Integer result = null;

        try {

            result = a / b;

        } catch (ArithmeticException ex) {

            if (b == 0)
                System.out.println("You should not devide by O! " + ex);


        } finally {

            if (b != 0)
                System.out.println("The devision was succesful");
            else
                System.out.println("The devision was unsuccesful");


        }

        return result;

    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        Integer result = firstChallenge.divide(3, 0);

        System.out.println("The result is: " + result);

    }
}
