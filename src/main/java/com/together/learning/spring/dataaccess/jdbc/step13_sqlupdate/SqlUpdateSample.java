package com.together.learning.spring.dataaccess.jdbc.step13_sqlupdate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author jiangjian
 */
public class SqlUpdateSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        DataSource dataSource = ac.getBean(DataSource.class);
        //初始化数据库
        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40), age int)");
        jdbcTemplate.execute("insert into user(name, age) values('alice', 20),('Bob', 18)");

        UserSqlUpdate userSqlUpdate = new UserSqlUpdate(dataSource);
        userSqlUpdate.update("tom", 1);

        UsersMappingSqlQuery usersMappingSqlQuery = new UsersMappingSqlQuery(dataSource);
        List<User> users = usersMappingSqlQuery.execute();
        users.forEach(System.out::println);

        //清理环境
        jdbcTemplate.execute("drop table user");
    }
}
