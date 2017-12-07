package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

         // test1
        int result1 = calculator.add(5,4);

        if (result1 == 9)
            System.out.println("test 1 OK");
         else
            System.out.println("Error!");


        // test2
        int result2 = calculator.substract(5,4);

        if (result2 == 1)
            System.out.println("test 2 OK");
        else
            System.out.println("Error!");

    }
}
