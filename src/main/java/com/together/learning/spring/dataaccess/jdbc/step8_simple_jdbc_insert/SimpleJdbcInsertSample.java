package com.together.learning.spring.dataaccess.jdbc.step8_simple_jdbc_insert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiangjian
 */
public class SimpleJdbcInsertSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);
        //初始化数据库
        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40), age int)");

        DataSource dataSource = ac.getBean(DataSource.class);
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                //必须操作: 这里我们配置当前作用的table
                .withTableName("user")
                //可选操作: 这里我们可以显示的配置，我们insert语句中的column的名称，未被列出的column则不会插入值，
                //         取各自的默认值
                .usingColumns("name", "age")
                //可选操作: 这里我们配置table 自动生成的column名称，如果没有，则不需要配置，
                //         此处配置是我们想了解自动生成key的信息
                .usingGeneratedKeyColumns("id");

        //方式一
        //准备参数
        Map<String, Object> insertUser = new HashMap<>(2);
        insertUser.put("name", "bob");
        insertUser.put("age", 26);
        //调用插入，如果不需要了解自动生成字段的值，则直接调用execute方法，
        Number bobId = simpleJdbcInsert.executeAndReturnKey(insertUser);
        System.out.println("bob id: " + bobId.longValue());

        //方法二
        // 不需要调用executeAndReturnKey方法,而且传入的值可以是Map，也可以是SqlParameterSource
        Number aliceId = simpleJdbcInsert.executeAndReturnKey(new BeanPropertySqlParameterSource(new User("alice", 18)));
        System.out.println("alice id: " + aliceId.longValue());

        List<User> findUsers = jdbcTemplate.query("select * from user",
                (rs, rowNum) -> new User(rs.getLong(1), rs.getString(2)));
        findUsers.forEach(System.out::println);

        //清理环境
        jdbcTemplate.execute("drop table user");
    }
}
