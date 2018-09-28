package com.together.learning.spring.dataaccess.jdbc.step12_mappingsqlquerry;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * @author jiangjian
 */
public class UserMappingSqlQuery extends MappingSqlQuery<User> {
    public UserMappingSqlQuery(DataSource dataSource) {
        super(dataSource, "select id, name, age from user where id = ?");
        declareParameter(new SqlParameter("id", Types.BIGINT));
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
