package com.scope.banking.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scope.banking.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomerDao(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("addCustomerDaoImpl");
		sessionFactory.getCurrentSession().save(customer);
		
	}

}
