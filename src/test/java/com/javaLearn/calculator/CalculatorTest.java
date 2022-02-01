package com.javaLearn.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final double DELTA_PRECISION = 0.0001;

    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add (1.1, 2.2);

        //then
        Assert.assertEquals(3.3,result, DELTA_PRECISION);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add (-1.1, -2.2);

        //then
        Assert.assertEquals(-3.3,result, DELTA_PRECISION);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.subtract (2.2, 1.1);

        //then
        Assert.assertEquals(1.1,result, DELTA_PRECISION);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.subtract (-2.2, -1.1);

        //then
        Assert.assertEquals(-1.1,result, DELTA_PRECISION);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply (5.0, 1.1);

        //then
        Assert.assertEquals(5.5,result, DELTA_PRECISION);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply (-5.0, 1.1);

        //then
        Assert.assertEquals(-5.5,result, DELTA_PRECISION);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide (1.0, 2);

        //then
        Assert.assertEquals(0.5,result,DELTA_PRECISION);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.divide (-2.0, -4);

        //then
        Assert.assertEquals(0.5,result, DELTA_PRECISION);
    }
}
