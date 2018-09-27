package com.together.learning.spring.dataaccess.jdbc.step3_named_parameter_jdbc_template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class NamedParameterJdbcTemplateSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        NamedParameterJdbcTemplate namedParameterJdbcTemplate = ac.getBean(NamedParameterJdbcTemplate.class);

        namedParameterJdbcTemplate.getJdbcOperations().execute("drop table if exists user  ");
        namedParameterJdbcTemplate.getJdbcOperations().execute("create table user(id int auto_increment primary key, name varchar(40))");

        namedParameterJdbcTemplate.getJdbcOperations().execute("insert into user(name) values ('jiangjian'), ('alice'), ('bob'), ('alice')");

        MapSqlParameterSource  params = new MapSqlParameterSource();
        params.addValue("name", "jiangjian");
        Integer count = namedParameterJdbcTemplate.queryForObject("select count(*) from user where name = :name", params, Integer.class);
        System.out.println("jiangjian count: " + count);

        BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(new User("alice"));
        count = namedParameterJdbcTemplate.queryForObject("select count(*) from user where name = :name", beanPropertySqlParameterSource, Integer.class);
        System.out.println("alice count: " + count);


        List<User> users = namedParameterJdbcTemplate.query("select * from user", (resultSet, i) -> {
            User user = new User();
            user.setId(resultSet.getLong(1));
            user.setName(resultSet.getString(2));
            return user;
        });
        users.forEach(System.out::println);

        System.out.println("-------------------after update ----");
        namedParameterJdbcTemplate.getJdbcOperations().update("update user set name = 'john' where id = 1");
        users = namedParameterJdbcTemplate.query("select * from user", (resultSet, i) -> {
            User user = new User();
            user.setId(resultSet.getLong(1));
            user.setName(resultSet.getString(2));
            return user;
        });

        users.forEach(System.out::println);

        namedParameterJdbcTemplate.getJdbcOperations().execute("drop table user");
    }
}
