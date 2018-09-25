package com.together.learning.spring.spel.step15_types;

import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * You can use the special T operator to specify an instance of java.lang.Class (the type).
 * Static methods are invoked by using this operator as well. The StandardEvaluationContext
 * uses a TypeLocator to find types, and the StandardTypeLocator (which can be replaced) is
 * built with an understanding of the java.lang package. This means that T() references to
 * types within java.lang do not need to be fully qualified, but all other type references
 * must be.
 */
public class TypesSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Class exceptionClass = expressionParser.parseExpression("T(Exception)").getValue(Class.class);
        System.out.println(exceptionClass);

        Class randomClass = expressionParser.parseExpression("T(java.util.Random)").getValue(Class.class);
        System.out.println(randomClass);

        boolean compareResult = expressionParser.parseExpression("T(Integer).MIN_VALUE < T(Integer).MAX_VALUE").getValue(Boolean.class);
        System.out.println(compareResult);
    }
}
