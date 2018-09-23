package com.together.learning.spring.ioc.step23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The callback is invoked after population of normal bean properties but before an initialization callback
 * such as InitializingBean, afterPropertiesSet, or a custom init-method.
 */
public class AwareMechanismSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step23/spring-application.xml");
        MultiAwareBean multiAwareBean = ac.getBean(MultiAwareBean.class);
        ((ClassPathXmlApplicationContext) ac).registerShutdownHook();
    }
}
