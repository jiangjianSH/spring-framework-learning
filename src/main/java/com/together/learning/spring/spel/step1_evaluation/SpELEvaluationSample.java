package com.together.learning.spring.spel.step1_evaluation;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author jiangjian
 */
public class SpELEvaluationSample {
    public static void main(String[] args) {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("new String('jiangjian').toUpperCase()");
        System.out.println(expression.getValue());
    }
}
