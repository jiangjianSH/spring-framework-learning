package com.together.learning.spring.spel.step21_elvis_operator;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ElvisOperatorSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("name", "jiangjian");
        String name = expressionParser.parseExpression("#name?:'unknown'").getValue(evaluationContext, String.class);
        Integer age = expressionParser.parseExpression("#age?:'27'").getValue(evaluationContext, Integer.class);
        System.out.println(name);
        System.out.println(age);
    }
}
