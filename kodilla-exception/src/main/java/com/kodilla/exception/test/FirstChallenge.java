package com.kodilla.exception.test;


public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
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
        boolean ifSucceed = false;
        try {

            double result = firstChallenge.divide(3, 0);

            System.out.println(result);
            ifSucceed = true;

        } catch (ArithmeticException ex) {

            System.out.println("You should not devide by O! " + ex);


        } finally {

            if (ifSucceed)
                System.out.println("The devision process has ended successfully");
            else
                System.out.println("The devision process has ended unsuccessfully");

        }

    }
}
