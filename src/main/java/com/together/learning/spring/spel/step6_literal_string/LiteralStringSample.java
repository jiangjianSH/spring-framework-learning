package com.together.learning.spring.spel.step6_literal_string;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author jiangjian
 */
public class LiteralStringSample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        // evals to "Hello World"
        String helloWorld = (String) parser.parseExpression("'Hello World'").getValue();
        System.out.println(helloWorld);

        double avogadrosNumber = (Double) parser.parseExpression("6.0221415E+23").getValue();
        System.out.println(avogadrosNumber);

        // evals to 2147483647
        int maxValue = (Integer) parser.parseExpression("0x7FFFFFFF").getValue();
        System.out.println(maxValue);

        boolean trueValue = (Boolean) parser.parseExpression("true").getValue();
        System.out.println(trueValue);

        Object nullValue = parser.parseExpression("null").getValue();
        System.out.println(nullValue);
    }
}
