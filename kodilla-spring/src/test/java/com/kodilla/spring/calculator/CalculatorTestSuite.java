package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(1.1, 1.2);
        double subResult = calculator.sub(1.5, 1.1);
        double mulResult = calculator.mul(5.0, 1.1);
        double divResult = calculator.div(12.0, 1.99);
        //Then
        Assert.assertEquals(addResult, 2.3, 0.0);
        Assert.assertEquals(subResult, 0.4, 0.1);
        Assert.assertEquals(mulResult, 5.5, 0.0);
        Assert.assertEquals(divResult, 6.0, 0.1);
    }
}
