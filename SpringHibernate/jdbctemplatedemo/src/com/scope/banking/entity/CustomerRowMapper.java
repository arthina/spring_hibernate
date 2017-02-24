package com.scope.banking.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rownumber) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();  
		customer.setCustomerId(rs.getInt(1));  
		customer.setName(rs.getString(2));  
		customer.setDob(rs.getDate(3));
		customer.setAddress(rs.getString(4));
        return customer;  
	}

}
