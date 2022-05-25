package com.calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double result = simpleCalculator.substractAFromB(6.1, 4.9);

        System.out.println(String.format("%.2f", result));
    }

}
