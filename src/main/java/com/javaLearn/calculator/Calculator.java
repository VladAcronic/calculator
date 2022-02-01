package com.javaLearn.calculator;

import java.util.Optional;

public class Calculator {

    public int add (int first, int second) {
        return first + second;
    }

    public Double divide(double first, double second) {
        //Double result =  Double.valueOf(first/second);
        Double result = null;
        //double result = 0;

        try {
            //result = Double.valueOf(first / second);
            result = (first / second);
            if (result == Double.POSITIVE_INFINITY){
                System.out.println(result);
                throw new ArithmeticException("ERROR: found divide by zero");
            }
        }

        catch (ArithmeticException ex) {
            //System.out.println("ERROR: found divide by zero");
            ex.printStackTrace();
        }

        return result;
    }
}
