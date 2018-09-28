package com.together.learning.spring.dataaccess.jdbc.step5_batch_operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiangjian
 */
public class JdbcTemplateBatchOperationSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);

        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40))");

        List<String> users = Arrays.asList("Alice", "Bob");
        jdbcTemplate.batchUpdate("insert into user(name) values(?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, users.get(i));
            }

            @Override
            public int getBatchSize() {
                return users.size();
            }
        });

        Long count = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        System.out.println("count is :" + count);

        //另外一种方式去批量插入
        List<Object[]> moreUsers = new ArrayList<>();
        moreUsers.add(new Object[]{"Jim"});
        moreUsers.add(new Object[]{"Tom"});
        jdbcTemplate.batchUpdate("insert into user(name) value(?)", moreUsers);
        count = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        System.out.println("after add more users, count is :" + count);


        jdbcTemplate.execute("drop table user");
    }
}
