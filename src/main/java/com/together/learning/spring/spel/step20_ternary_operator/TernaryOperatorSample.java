package com.together.learning.spring.spel.step20_ternary_operator;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TernaryOperatorSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("name", "jiangjian");
        String name = expressionParser.parseExpression("#name != null ? #name : 'unknown'").getValue(evaluationContext, String.class);
        Integer age = expressionParser.parseExpression("#age != null ? #age : '27'").getValue(evaluationContext, Integer.class);
        System.out.println(name);
        System.out.println(age);
    }
}
