package com.akai.interpreter.raw;

public class Client {
    public static void main(String[] args) {
        String expression = "1 2 3 4 5 * * * *";
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        long res = interpreter.interpret(expression);
        System.out.println(res);
    }
}
