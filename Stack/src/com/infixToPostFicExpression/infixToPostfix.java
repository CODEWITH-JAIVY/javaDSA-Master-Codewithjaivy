package com.infixToPostFicExpression;
import java.util.Stack;
public class infixToPostfix {
    // Check precedence
    public static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
        }
        return -1;
    }
    // Convert infix to postfix
    public static String infixToPostfixOPe(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // pop '('
            } else if (ch == ' ') {
                continue; // skip spaces
            } else { // operator
                while (!stack.isEmpty() &&
                        (precedence(ch) < precedence(stack.peek()) ||
                                (precedence(ch) == precedence(stack.peek()) && ch != '^'))) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        // Pop remaining operators
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix:   " + exp);
        System.out.println("Postfix: " + infixToPostfixOPe(exp));
    }
}
