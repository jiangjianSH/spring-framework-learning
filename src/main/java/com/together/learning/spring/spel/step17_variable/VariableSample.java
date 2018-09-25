package com.together.learning.spring.spel.step17_variable;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class VariableSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("name", "jiangjian");
        System.out.println(expressionParser.parseExpression("#name").getValue(evaluationContext, String.class));
    }
}
