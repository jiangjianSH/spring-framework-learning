package com.together.learning.spring.dataaccess.jdbc.step7_batch_operation_with_multi_batches;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiangjian
 */
public class BatchOperationWithMultiBatchesSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemplate = ac.getBean(JdbcTemplate.class);

        jdbcTemplate.execute("drop table if exists user  ");
        jdbcTemplate.execute("create table user(id int auto_increment primary key, name varchar(40))");

        List<User> users = Arrays.asList(new User("alice"),
                new User("bob"),
                new User("cindy"),
                new User("dave"));
        int[][] batchResult = jdbcTemplate.batchUpdate("insert into user(name) values(?)", users, 2, (ps, argument) -> {
            ps.setString(1, argument.getName());
        });

        //batchResult这个数组的最上层的长度表示batch的数量，而第二级的数组长度表示每次batch包含的update语句数量,
        // 而每个具体数组的值包含着当前update语句修改记录的数量（由jdbc driver提供)
        //上面的例子中，users分两个批次，每个批次应该为2， 而且每个批次里面的statement数量为2，具体每个statement的
        //update 数量为1（因为当前是insert语句),所以batchResult应该是int[2][2]维度的数组，而且值都为1，
        System.out.println("第一维度长度为:" + batchResult.length);
        System.out.println("第二维度长度为:" + batchResult[0].length);
        //下面是输出所有的值
        for(int i = 0; i < batchResult.length; i++) {
            for(int j = 0; j < batchResult[0].length; j++) {
                System.out.println(batchResult[i][j]);
            }
        }

        List<User> findUsers = jdbcTemplate.query("select * from user",
                (rs, rowNum) -> new User(rs.getLong(1), rs.getString(2)));
        findUsers.forEach(System.out::println);

        jdbcTemplate.execute("drop table user");
    }
}
