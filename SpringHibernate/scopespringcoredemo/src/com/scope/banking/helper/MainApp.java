package com.scope.banking.helper;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.scope.banking.Transaction;
import com.scope.banking.entity.Bank;
import com.scope.banking.entity.Customer;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("spring-core.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		System.out.println("isSingleton: "+beanFactory.isSingleton("debitCard"));
		
		Transaction transactiondc=(Transaction) beanFactory.getBean("debitCard");
		System.out.println(transactiondc.payment(3000));
				
		Transaction transactioncc=(Transaction) beanFactory.getBean("creditCard");
		System.out.println(transactioncc.payment(5000));
		
		Customer customer=(Customer) beanFactory.getBean("customer1");
		Bank bank=(Bank) beanFactory.getBean("bankInfo");
		
		//System.out.printf("id=%d\n",customer.getCustomerId());
	/*	System.out.println(customer.getCustomerId());
		System.out.println(customer.getName());
		System.out.println(customer.getPermAddress());
		System.out.println(customer.getClass().getCanonicalName());
		System.out.println(customer.getCommnAddress());
		System.out.println(customer.getDob().toLocaleString());
		System.out.println(customer.getContactInfo());*/
		System.out.println(bank.toString());
		
	}

}
