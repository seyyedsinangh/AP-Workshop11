package com.example.apworkshop11;

import java.util.Arrays;

public abstract class MathParser {
    public static double parse(String expression) {
        String[] tokens = expression.split("(?=[-+*/])|(?<=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            double operand = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    if (operand == 0.0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
        return result;
    }
}
