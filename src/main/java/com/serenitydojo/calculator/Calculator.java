package com.serenitydojo.calculator;public class Calculator {
    public int evaluate(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }

        String[] tokens = expression.split("\\s+");
        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    throw new IllegalMathsOperatorException("Unsupported operator: " + operator);
            }
        }

        return result;
    }
}
