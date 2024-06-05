package com.akai.interpreter.raw;

import java.util.Deque;
import java.util.LinkedList;

// 表达式解释器类
public class ExpressionInterpreter {
    // Deque双向队列，可以从队列的两端增加或者删除元素
    private Deque<Long> numbers = new LinkedList<>();

    // 接收表达式进行解析
    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        // 获取表达式中的数字
        for (int i = 0; i < length / 2 + 1; i++) {
            // 在 Deque的尾部添加元素
            numbers.addLast(Long.parseLong(elements[i]));
        }
        // 获取表达式中的符号
        for (int i = length / 2 + 1; i < length; i++) {
            String operator = elements[i];
            // 符号必须有效
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) throw new RuntimeException("Expression is invalid: " + expression);

            // 弹出前两个数字
            Long num1 = numbers.pollFirst();
            Long num2 = numbers.pollFirst();

            Long res = 0l;  // 运算结果
            // 运算
            if (operator.equals("+")) {
                res = num1 + num2;
            } else if (operator.equals("-")) {
                res = num1 - num2;
            } else if (operator.equals("*")) {
                res = num1 * num2;
            } else if (operator.equals("/")) {
                res = num1 / num2;
            }
            numbers.addFirst(res);
        }
        // 运算完成 numbers中应该保存着运算结果，否则是无效表达式
        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }
        // 移除 Deque的第一个元素，并返回
        return numbers.pop();
    }
}
