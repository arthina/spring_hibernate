package com.scope.banking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scope.banking.dao.CustomerDao;
import com.scope.banking.entity.Customer;

@Service
@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED, 
rollbackFor={RuntimeException.class})
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomerDao(customer);
	}

}
