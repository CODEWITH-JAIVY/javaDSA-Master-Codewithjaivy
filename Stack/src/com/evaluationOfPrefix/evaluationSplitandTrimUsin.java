package com.evaluationOfPrefix;

import java.util.Arrays;
import java.util.Stack;

public class evaluationSplitandTrimUsin {

    private static boolean isOperator(String c) {
        return (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"));
    }

    private static int compute(int num1, int num2, String op) {
        switch (op) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2; // integer division
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    private static int evaluationMul(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] strarr = exp.trim().split("\\s+"); // split by spaces

        System.out.println("Tokens: " + Arrays.toString(strarr));

        for (int i = strarr.length - 1; i >= 0; i--) {
            String token = strarr[i];
            if (isOperator(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int newnum = compute(num1, num2, token);
                stack.push(newnum);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        try {
            String exp = "- * 9 2 3 / 8 40";
            System.out.println("Result: " + evaluationMul(exp));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
