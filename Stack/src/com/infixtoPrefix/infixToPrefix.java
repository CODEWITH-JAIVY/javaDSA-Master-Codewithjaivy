package com.infixtoPrefix;
import java.util.Stack;

public class infixToPrefix {
    public static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
        }
        return -1;
    }
    // Reverse and swap brackets
    public static String reverseAndSwap(String exp) {
        StringBuilder sb = new StringBuilder();
        for (int i = exp.length() - 1; i >= 0; i--) {
            if (exp.charAt(i) == '(') {
                sb.append(')');
            } else if (exp.charAt(i) == ')') {
                sb.append('(');
            } else {
                sb.append(exp.charAt(i));
            }
        }
        return sb.toString();
    }
    // Infix to Postfix
    public static String infixToPostfix(String exp) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // remove '('
            } else { // operator
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    // Infix to Prefix
    public static String infixToPrefix(String exp) {
        String reversed = reverseAndSwap(exp);     // Step 1
        String postfix = infixToPostfix(reversed); // Step 2
        return new StringBuilder(postfix).reverse().toString(); // Step 3
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix:   " + exp);
        System.out.println("Prefix:  " + infixToPrefix(exp));
    }
}
