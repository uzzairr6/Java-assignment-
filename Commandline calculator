package ExamPackage;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Command-Line Calculator ---");

        for (int i = 0; i < 3; i++) { // Allow 3 expressions
            System.out.println("Enter a mathematical expression:");
            String expression = scanner.nextLine();

            try {
                double result = evaluate(expression);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid expression. Please try again.");
            }
        }
        scanner.close();
    }

    // Evaluate the expression
    private static double evaluate(String expression) {
        return parseExpression(expression.replaceAll("\\s", ""), 0).value;
    }

    // Parse expression and handle operator precedence
    private static Result parseExpression(String expr, int index) {
        Result current = parseTerm(expr, index);

        while (current.index < expr.length() && 
              (expr.charAt(current.index) == '+' || expr.charAt(current.index) == '-')) {
            char operator = expr.charAt(current.index);
            Result next = parseTerm(expr, current.index + 1);

            if (operator == '+') {
                current.value += next.value;
            } else {
                current.value -= next.value;
            }
            current.index = next.index;
        }

        return current;
    }

    // Parse term for * and / operators
    private static Result parseTerm(String expr, int index) {
        Result current = parseFactor(expr, index);

        while (current.index < expr.length() &&
              (expr.charAt(current.index) == '*' || expr.charAt(current.index) == '/')) {
            char operator = expr.charAt(current.index);
            Result next = parseFactor(expr, current.index + 1);

            if (operator == '*') {
                current.value *= next.value;
            } else {
                current.value /= next.value;
            }
            current.index = next.index;
        }

        return current;
    }

    // Parse factor, including handling parentheses
    private static Result parseFactor(String expr, int index) {
        if (expr.charAt(index) == '(') {
            Result inner = parseExpression(expr, index + 1);
            if (inner.index >= expr.length() || expr.charAt(inner.index) != ')') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            inner.index++;
            return inner;
        }

        return parseNumber(expr, index);
    }

    // Parse a number
    private static Result parseNumber(String expr, int index) {
        int startIndex = index;

        while (index < expr.length() && 
              (Character.isDigit(expr.charAt(index)) || expr.charAt(index) == '.')) {
            index++;
        }

        if (startIndex == index) {
            throw new IllegalArgumentException("Expected a number at index " + startIndex);
        }

        double value = Double.parseDouble(expr.substring(startIndex, index));
        return new Result(value, index);
    }

    // Helper class to return both value and index
    private static class Result {
        double value;
        int index;

        Result(double value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
