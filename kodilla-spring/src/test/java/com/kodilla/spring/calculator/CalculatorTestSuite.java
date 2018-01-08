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
        double addResult = calculator.add(1.0, 1.0);
        double subResult = calculator.sub(1.0, 1.0);
        double mulResult = calculator.mul(1.0, 1.0);
        double divResult = calculator.div(1.0, 1.0);
        //Then
        Assert.assertEquals(addResult, 2.0, 0.0);
        Assert.assertEquals(subResult, 0.0, 0.0);
        Assert.assertEquals(mulResult, 1.0, 0.0);
        Assert.assertEquals(divResult, 1.0, 0.0);
    }
}
