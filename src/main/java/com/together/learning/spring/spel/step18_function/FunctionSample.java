package com.together.learning.spring.spel.step18_function;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class FunctionSample {
    public static void main(String[] args) throws NoSuchMethodException {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("reverseString", FunctionSample.class.getDeclaredMethod("reverseString", String.class));
        System.out.println(expressionParser.parseExpression("#reverseString('abcd')").getValue(evaluationContext, String.class));
    }

    public static String reverseString(String input) {
        StringBuilder backwards = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            backwards.append(input.charAt(input.length() - 1 - i));
        }
        return backwards.toString();
    }
}
