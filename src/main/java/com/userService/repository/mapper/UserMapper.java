package com.userService.repository.mapper;
import com.userService.model.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("address"),
                rs.getDate("joining_date").toLocalDate()
        );
    }
}