package com.akai.interpreter.real;

public class Client {
    public static void main(String[] args) {
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        String expression = "1 2 3 4 5 * * * *";
        long res = interpreter.interpreter(expression);
        System.out.println(res);
    }
}
