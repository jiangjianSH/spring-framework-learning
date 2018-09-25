package com.together.learning.spring.spel.step19_bean_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * 1. reference to bean
 *   If the evaluation context has been configured with a bean resolver,
 *   you can look up beans from an expression by using the @ symbol.
 *
 * 2. reference to factoryBean
 *   To access a factory bean itself, you should instead prefix the bean name with an & symbol
 *
 */
public class BeanReferenceSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(A.class, AFactoryBean.class);

        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        ((StandardEvaluationContext) evaluationContext).setBeanResolver(new BeanFactoryResolver(ac));
        Object bean = expressionParser.parseExpression("@a").getValue(evaluationContext);
        System.out.println(bean);

        Object factoryBean = expressionParser.parseExpression("&aFactoryBean").getValue(evaluationContext);
        System.out.println(factoryBean);
    }
}
