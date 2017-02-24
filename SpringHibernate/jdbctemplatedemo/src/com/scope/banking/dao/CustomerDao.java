package com.scope.banking.dao;

import java.util.List;

import com.scope.banking.entity.Customer;

public interface CustomerDao {
	
	void addCustomer(Customer customer);
	List<Customer> getAll();
	Customer getCustomerById(int custId);
	Void update(Customer customer);
	void insertBatch(List<Customer> customerList);
	void deleteCustomer(int custId);

}
