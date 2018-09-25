package com.together.learning.spring.spel.step25_expression_template;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ExpressionTemplateSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("name", "jiangjian");
        Expression templateStr = expressionParser.parseExpression("my name is #{#name}", new TemplateParserContext());
        System.out.println(templateStr.getValue(evaluationContext, String.class));
    }
}
