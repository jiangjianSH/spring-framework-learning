package com.together.learning.spring.dataaccess.jdbc.step4_auto_generated_key;

import com.together.learning.spring.dataaccess.jdbc.step2_jdbctemplate_query.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;

public class AutoGeneratedKeySample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);

        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40))");
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user(name) values(?)", new String[]{"id"});
            preparedStatement.setString(1, "jiangjian");
            return preparedStatement;
        }, keyHolder);
        System.out.println(keyHolder.getKey());
        jdbcTemplate.execute("drop table user");
    }
}
