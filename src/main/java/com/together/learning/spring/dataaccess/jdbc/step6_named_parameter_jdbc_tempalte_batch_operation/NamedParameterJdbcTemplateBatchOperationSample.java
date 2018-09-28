package com.together.learning.spring.dataaccess.jdbc.step6_named_parameter_jdbc_tempalte_batch_operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiangjian
 */
public class NamedParameterJdbcTemplateBatchOperationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        NamedParameterJdbcTemplate namedParameterJdbcTemplate = ac.getBean(NamedParameterJdbcTemplate.class);

        namedParameterJdbcTemplate.getJdbcOperations().execute("drop table if exists user  ");
        namedParameterJdbcTemplate.getJdbcOperations().execute("create table user(id int auto_increment primary key, name varchar(40))");
        List<User> users = Arrays.asList(new User("Alice"), new User("Bob"));

        namedParameterJdbcTemplate.batchUpdate("insert into user(name) values (:name)", SqlParameterSourceUtils.createBatch(users));

        List<User> findUsers = namedParameterJdbcTemplate.query("select * from user", (rs, rowNum) -> new User(rs.getLong(1), rs.getString(2)));
        findUsers.forEach(System.out::println);

        namedParameterJdbcTemplate.getJdbcOperations().execute("drop table user");
    }
}
