package com.together.learning.spring.ioc.step16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 	The autowire-candidate attribute is designed to only affect
 * 	type-based autowiring. It does not affect explicit references
 * 	by name, which get resolved even if the specified bean is not
 * 	marked as an autowire candidate. As a consequence,autowiring by
 * 	name nevertheless injects a bean if the name matches.

 You can also limit autowire candidates based on pattern-matching
 against bean names. The top-level <beans/> element accepts one or more
 patterns within its default-autowire-candidates attribute. For example,
 to limit autowire candidate status to any bean whose name ends with Repository,
 provide a value of *Repository. To provide multiple patterns,
 define them in a comma-separated list. An explicit value of true or false for
 a bean definition’s autowire-candidate attribute always takes precedence
 */
public class AutowiredSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/step16/spring-application.xml");
        A a = ac.getBean(A.class);
        System.out.println(a.getB());
        System.out.println(a.getB() == null);
        B b = ac.getBean(B.class);
        System.out.println(b == a.getB());
    }
}
