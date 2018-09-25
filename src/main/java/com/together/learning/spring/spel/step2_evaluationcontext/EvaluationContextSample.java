package com.together.learning.spring.spel.step2_evaluationcontext;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author jiangjian
 */
public class EvaluationContextSample {
    public static void main(String[] args) {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        Balance balance = new Balance();
        Expression expression = spelExpressionParser.parseExpression("value");
        expression.setValue(evaluationContext, balance, "1.23");
        System.out.println(balance);
    }
}
