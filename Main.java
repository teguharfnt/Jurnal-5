package com.example.stack;

public class Main {
    public static void main(String[] args) {
        PostfixConverter postfixConverter = new PostfixConverter();
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infix);
        System.out.println(postfixConverter.toPostfix(infix));
    }
}
