package com.together.learning.spring.dataaccess.jdbc.step9_simple_jdbc_call_on_procedure;

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
public class SimpleJdbcCallSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40), age int)");
        jdbcTemplate.execute("insert into user(name, age) values('jiangjian', 26)");
        jdbcTemplate.execute("DROP PROCEDURE IF EXISTS read_user;");
        jdbcTemplate.execute("CREATE PROCEDURE read_user (\n" +
                "    IN in_id BIGINT,\n" +
                "    OUT out_id BIGINT,\n" +
                "    OUT out_name VARCHAR(40),\n" +
                "    OUT out_age int)\n" +
                "BEGIN\n" +
                "    SELECT id, name, age\n" +
                "    INTO out_id, out_name, out_age\n" +
                "    FROM user where id = in_id;\n" +
                "END");

        jdbcTemplate.setResultsMapCaseInsensitive(false);
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("read_user")
                .useInParameterNames("in_id")
                .declareParameters(new SqlParameter("in_id", Types.BIGINT),
                        new SqlOutParameter("out_id", Types.BIGINT),
                        new SqlOutParameter("out_name", Types.VARCHAR),
                        new SqlOutParameter("out_age", Types.INTEGER));

        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("in_id", "1");
        Map<String, Object> result = simpleJdbcCall.execute(in);

        User user = new User();
        user.setId((Long) result.get("out_id"));
        user.setName((String) result.get("out_name"));
        user.setAge((Integer) result.get("out_age"));
        System.out.println(user);

        //清理环境
        jdbcTemplate.execute("drop table user");
    }
}
