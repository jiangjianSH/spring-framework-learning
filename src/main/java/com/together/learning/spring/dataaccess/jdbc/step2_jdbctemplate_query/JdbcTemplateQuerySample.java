package com.together.learning.spring.dataaccess.jdbc.step2_jdbctemplate_query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateQuerySample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);

        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40))");

        jdbcTemplate.execute("insert into user(name) values ('jiangjian'), ('alice'), ('bob')");

        Integer count = jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
        System.out.println("count: " + count);

        List<User> users = jdbcTemplate.query("select * from user", (resultSet, i) -> {
            User user = new User();
            user.setId(resultSet.getLong(1));
            user.setName(resultSet.getString(2));
            return user;
        });
        users.forEach(System.out::println);

        System.out.println("-------------------after update ----");
        jdbcTemplate.update("update user set name = 'john' where id = 1");
        users = jdbcTemplate.query("select * from user", (resultSet, i) -> {
            User user = new User();
            user.setId(resultSet.getLong(1));
            user.setName(resultSet.getString(2));
            return user;
        });

        users.forEach(System.out::println);

        jdbcTemplate.execute("drop table user");
    }
}
