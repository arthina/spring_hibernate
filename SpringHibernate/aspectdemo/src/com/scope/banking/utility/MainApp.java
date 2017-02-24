package com.scope.banking.utility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.banking.entities.Flight;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml");
		Flight flight = (Flight) context.getBean("flight");
		try {
			flight.setCapacity(-6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		flight.getCapacity();
	}

}
