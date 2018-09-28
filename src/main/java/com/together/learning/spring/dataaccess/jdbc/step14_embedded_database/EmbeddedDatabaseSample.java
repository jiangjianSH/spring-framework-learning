package com.together.learning.spring.dataaccess.jdbc.step14_embedded_database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author jiangjian
 */
public class EmbeddedDatabaseSample {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:dataaccess/jdbc/step14_embedded_database/spring.xml");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ac.getBean(DataSource.class));
        jdbcTemplate.query("select * from user", (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            return user;
        }).forEach(System.out::println);
    }
}
