package com.scope.banking.helper;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.banking.dao.CustomerDao;
import com.scope.banking.entity.Customer;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource resource=new ClassPathResource("spring-core.xml");
		//BeanFactory beanFactory=new XmlBeanFactory(resource);
		ApplicationContext applnCtx= new ClassPathXmlApplicationContext("spring-core.xml");
		
		CustomerDao custDao=(CustomerDao) applnCtx.getBean("custDaoImpl");
		Customer customer=(Customer) applnCtx.getBean("customer");
		customer.setCustomerId(2);
		customer.setName("RajalingamAthilingam");
		customer.setDob(new Date(47, 07, 07));
		customer.setAddress("Chennai");
		//custDao.addCustomer(customer);
		System.out.println(custDao.getAll());
		System.out.println(custDao.getCustomerById(1));
	}

}
