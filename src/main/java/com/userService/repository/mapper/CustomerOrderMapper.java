package com.userService.repository.mapper;

import com.userService.model.CustomerOrder;
import com.userService.model.CustomerOrderCurrency;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerOrderMapper  implements RowMapper<CustomerOrder> {

    @Override
    public CustomerOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CustomerOrder(
                rs.getLong("id"),
                rs.getLong("customer_id"),
                rs.getString("item_name"),
                rs.getLong("price"),
                CustomerOrderCurrency.valueOf(rs.getString("currency"))
        );
    }
}
