package com.akai.interpreter.real;

import java.util.Deque;
import java.util.LinkedList;

// 表达式解释器类
public class ExpressionInterpreter {
    // 存放表达式的队列
    // 设计思想无处不在，面向抽象，而不是面向具体
    private Deque<AbstractExpression> numbers = new LinkedList<>();

    public long interpreter(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        // 获取表达式中的数字
        for (int i = 0; i < length / 2 + 1; i++) {
            // 在 Deque的尾部添加元素
            numbers.addLast(new NumExpression(elements[i]));
            // 其实就是从右往左插
        }
        // 获取表达式中的符号
        for (int i = length / 2 + 1; i < length; i++) {
            String operator = elements[i];
            // 符号必须有效
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) throw new RuntimeException("Expression is invalid: " + expression);

            AbstractExpression expression1 = numbers.pollFirst();
            AbstractExpression expression2 = numbers.pollFirst();

            AbstractExpression res = null;
            // 运算
            if (operator.equals("+")) {
                res = new PluExpression(expression1, expression2);
            } else if (operator.equals("-")) {
                res = new SubExpression(expression1, expression2);
            } else if (operator.equals("*")) {
                res = new MulExpression(expression1, expression2);
            } else if (operator.equals("/")) {
                res = new DivExpression(expression1, expression2);
            }
            long interpret = res.interpret();
            numbers.addFirst(new NumExpression(interpret));
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.pop().interpret();
    }

}
