package com.together.learning.spring.dataaccess.jdbc.step10_simple_jdbc_call_on_function;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.sql.Types;
import java.util.Map;

/**
 * @author jiangjian
 */
public class SimpleJdbcCallOnFunctionSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40), age int)");
        jdbcTemplate.execute("insert into user(name, age) values('jiangjian', 26)");
        jdbcTemplate.execute("DROP FUNCTION IF EXISTS get_user_description;");
        jdbcTemplate.execute("CREATE FUNCTION get_user_description (in_id INTEGER)\n" +
                "RETURNS VARCHAR(200) READS SQL DATA\n" +
                "BEGIN\n" +
                "    DECLARE out_description VARCHAR(200);\n" +
                "    SELECT concat('name is ', name, ' and age is ', age)\n" +
                "        INTO out_description\n" +
                "        FROM user where id = in_id;\n" +
                "    RETURN out_description;\n" +
                "END");

        jdbcTemplate.setResultsMapCaseInsensitive(false);
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName("get_user_description");

        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("in_id", "1");
        String description = simpleJdbcCall.executeFunction(String.class, in);
        System.out.println(description);

        //清理环境
        jdbcTemplate.execute("drop table user");
    }
}
