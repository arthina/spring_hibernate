package com.scope.banking.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scope.banking.entity.Flight;
import com.scope.banking.entity.FlightStatus;
import com.scope.banking.entity.Order;
import com.scope.banking.entity.Product;
import com.scope.banking.inheritence.entity.GuestUser;
import com.scope.banking.inheritence.entity.RegisteredUser;

public class MainAppFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		
		Flight flight=new Flight();
		flight.setServiceProvider("MalaysiaAirlines");
		flight.setFlightStatus(FlightStatus.Active);
		flight.setCapacity(500);
		flight.setDOP(new Date(88,07,07));
		
		
		
		
		try{
			session.save(flight);
			session.getTransaction().commit();
		}
		catch(HibernateException hib){
			
			hib.printStackTrace();
			session.getTransaction().rollback();
		}
		
		session.close();
	}

}
