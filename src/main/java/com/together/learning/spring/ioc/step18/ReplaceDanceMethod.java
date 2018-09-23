package com.together.learning.spring.ioc.step18;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplaceDanceMethod implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("i am a singer not a dancer any more");
        return null;
    }
}
