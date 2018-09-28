package com.together.learning.spring.dataaccess.jdbc.step13_sqlupdate;

import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jiangjian
 */
public class UsersMappingSqlQuery extends MappingSqlQuery<User> {
    public UsersMappingSqlQuery(DataSource dataSource) {
        super(dataSource, "select id, name, age from user");
        compile();
    }

    @Override
    protected User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        return user;
    }
}
