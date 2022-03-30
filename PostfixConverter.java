package com.example.stack;

import java.util.Stack;

public class PostfixConverter {
    public int precedance(char operator){
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public String toPostfix(String infix){
        StringBuilder result = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); ++i) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) result.append(ch);
            else if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());

                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedance(ch) <= precedance(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid Expression";
            result.append(stack.pop());
        }
        return result.toString();
    }
}
