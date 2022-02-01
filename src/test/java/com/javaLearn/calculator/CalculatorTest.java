package com.javaLearn.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add (1, 2);

        //then
        Assert.assertEquals(3,result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add (-1, -2);

        //then
        Assert.assertEquals(-3,result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide (1, 2);

        //then
        Assert.assertEquals(0.5,result,0.1);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.divide (-2, -4);

        //then

        Assert.assertEquals(0.5,result, 0.001);
    }

    @Test
    public void testDivideShouldDivideWhenDenominatorIsZero(){
        //given
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.divide (2.0, 0);

        //then

        Assert.assertEquals(Double.POSITIVE_INFINITY,result,0.1);
    }

}
