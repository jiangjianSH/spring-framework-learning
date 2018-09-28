package com.together.learning.spring.dataaccess.jdbc.step11_simple_jdbc_call_on_procedure_resultset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiangjian
 */
public class SimpleJdbcCallOnProcedureResultSetSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40), age int)");
        jdbcTemplate.execute("insert into user(name, age) values('alice', 20),('Bob', 18)");
        jdbcTemplate.execute("DROP PROCEDURE IF EXISTS list_users;");
        jdbcTemplate.execute("CREATE PROCEDURE list_users()\n" +
                "BEGIN\n" +
                " SELECT id, name, age FROM user;\n" +
                "END;");

        jdbcTemplate.setResultsMapCaseInsensitive(false);
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("list_users")
                .returningResultSet("users", BeanPropertyRowMapper.newInstance(User.class));

        Map result = simpleJdbcCall.execute(new HashMap<>(0));
        List<User> users = (List<User>) result.get("users");
        users.forEach(System.out::println);

        //清理环境
        jdbcTemplate.execute("drop table user");
    }
}
