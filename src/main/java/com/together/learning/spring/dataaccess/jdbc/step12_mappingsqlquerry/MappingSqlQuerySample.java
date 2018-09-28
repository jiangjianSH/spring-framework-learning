package com.together.learning.spring.dataaccess.jdbc.step12_mappingsqlquerry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author jiangjian
 */
public class MappingSqlQuerySample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40), age int)");
        jdbcTemplate.execute("insert into user(name, age) values('alice', 20),('Bob', 18)");

        UserMappingSqlQuery userMappingSqlQuery = new UserMappingSqlQuery(jdbcTemplate.getDataSource());
        User user = userMappingSqlQuery.findObject(1);
        System.out.println(user);

        UsersMappingSqlQuery usersMappingSqlQuery = new UsersMappingSqlQuery(jdbcTemplate.getDataSource());
        List<User> users = usersMappingSqlQuery.execute();
        users.forEach(System.out::println);

        //清理环境
        jdbcTemplate.execute("drop table user");
    }
}
