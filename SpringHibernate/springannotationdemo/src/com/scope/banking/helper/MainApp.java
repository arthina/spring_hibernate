package com.scope.banking.helper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.banking.entity.Account;
import com.scope.banking.entity.Bank;
import com.scope.banking.entity.DataSource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource resource=new ClassPathResource("spring-core.xml");
		//BeanFactory beanFactory=new XmlBeanFactory(resource);
		ApplicationContext applnCtx= new ClassPathXmlApplicationContext("spring-core.xml");
				
		//Customer customer=(Customer) applnCtx.getBean("customer");
		//System.out.println(customer.toString());
			
		Account account=(Account) applnCtx.getBean("scbAccount");
		account.setAccountNo("12345678");
		account.setAccountType("SavingsAccount");
		account.setBalance(60000);
		
		Bank bank=(Bank) applnCtx.getBean("bankInfo");
		System.out.println(bank.toString());
		
		DataSource ds=bank.getInstance();
		System.out.println(ds);
		
	}

}
