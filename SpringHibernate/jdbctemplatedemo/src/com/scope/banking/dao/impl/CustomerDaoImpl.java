package com.scope.banking.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.scope.banking.dao.CustomerDao;
import com.scope.banking.entity.Customer;
import com.scope.banking.entity.CustomerRowMapper;

public class CustomerDaoImpl implements CustomerDao {

	private DataSource dsr;
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("Insert into customer_tbl(customerId,name,dob,address) "
				+ "values(?,?,?,?)",customer.getCustomerId(),customer.getName(),customer.getDob(),customer.getAddress());
		System.out.println("addCustomer success");
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from customer_tbl",new RowMapper<Customer>(){  
		      @Override  
		      public Customer mapRow(ResultSet rs, int rownumber) throws  SQLException    {  
		            Customer c=new Customer();  
		            c.setCustomerId(rs.getInt(1));  
		            c.setName(rs.getString(2));  
		            c.setDob(rs.getDate(3));
		            c.setAddress(rs.getString(4));
		            return c;  
		          }  
		      });  
	}
		     // End of all the function
	
	

	@Override
	public Customer getCustomerById(int custId) {
		// TODO Auto-generated method stub
		return (Customer) jdbcTemplate.queryForObject(
	            "select * from customer_tbl WHERE customerid=?",
	            new Object[]{custId}, new CustomerRowMapper()
	        );
		
		
		/*return (Customer) jdbcTemplate.queryForObject(
	            "select * from customer_tbl WHERE customerid=?",
	            new Object[]{custId}, new RowMapper<Customer>(){  
	  		      @Override  
			      public Customer mapRow(ResultSet rs, int rownumber) throws  SQLException    {  
			            Customer c=new Customer();  
			            c.setCustomerId(rs.getInt(1));  
			            c.setName(rs.getString(2));  
			            c.setDob(rs.getDate(3));
			            c.setAddress(rs.getString(4));
			            return c;  
			          }  
			      }
	            
	        );*/
	}

	@Override
	public Void update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBatch(List<Customer> customerList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		
	}

	public DataSource getDsr() {
		return dsr;
	}

	public void setDsr(DataSource dsr) {
		this.dsr = dsr;
		jdbcTemplate=new JdbcTemplate(dsr);
	}

}
