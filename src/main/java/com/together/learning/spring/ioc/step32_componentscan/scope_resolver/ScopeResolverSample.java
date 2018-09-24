package com.together.learning.spring.ioc.step32_componentscan.scope_resolver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 请注意当前被注释掉的调用方法，这里配置bean的scoped-proxy=target_class,这种模式下
 * 生成的是代理，属于懒加载的情况， 如果没有显示的调用bean的方法，则不会创建真实的bean实例
 */
public class ScopeResolverSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step32_componentscan/scope_resolver/spring-application.xml");
        A a1 = ac.getBean(A.class);
//        a1.sayWhat();
        A a2 = ac.getBean(A.class);
//        a2.sayWhat();
        System.out.println(a1 == a2);
    }
}
