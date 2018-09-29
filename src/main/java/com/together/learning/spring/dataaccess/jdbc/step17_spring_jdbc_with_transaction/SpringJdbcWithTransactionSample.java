package com.together.learning.spring.dataaccess.jdbc.step17_spring_jdbc_with_transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class SpringJdbcWithTransactionSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = ac.getBean(UserService.class);
        userService.saveUser(createDummyUser());
    }

    private static User createDummyUser() {
        User user = new User();
        user.setName("jiangjian");
        user.setAge(26);
        Address address = new Address();
        address.setAddress("哔哔哔哔哔哔哔哔哔哔哔哔哔哔哔");
        user.setAddress(address);
        return user;
    }
}
