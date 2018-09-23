package com.together.learning.spring.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用alias可以为bean指定不同的名字，这样，不同系统模块在使用同一组件的时候，可以取不同的名字，
 * 这样就可以实现每个模块有自己的namespace, 最后为了将各个系统模块最终配置成同一个对象，可以通过
 * alias将各个名字就行相互绑定
 */
public class BeanAliasSupportSample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("step2/spring-application.xml");
        ModuleA moduleA = context.getBean(ModuleA.class);
        ModuleB moduleB = context.getBean(ModuleB.class);

        System.out.println(moduleA.getModuleADataSource() == moduleB.getModuleBDataSource());

    }
}
