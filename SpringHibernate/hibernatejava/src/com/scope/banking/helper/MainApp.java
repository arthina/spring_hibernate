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

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		
		/*Flight flight=new Flight();
		flight.setServiceProvider("MalaysiaAirlines");
		flight.setFlightStatus(FlightStatus.Active);
		flight.setCapacity(500);
		flight.setDOP(new Date(88,07,07));*/
		
		/*Order order = new Order();
		Product product = new Product();
		List<Product> productLst= new ArrayList<Product>();
		
		order.setOrderDate(new Date(115, 5, 8));
		order.setOrderBy("Thina");
		
		product.setName("Mobile");
		product.setActualRate(50000);
		product.setDOP(new Date(116, 5, 8));
		product.setOrder(order);
		productLst.add(product);
		
		
		product=new Product();
		product.setName("Laptop");
		product.setActualRate(80000);
		product.setDOP(new Date(115, 5, 8));
		product.setOrder(order);
		productLst.add(product);
		order.setProductList(productLst);*/
		
		GuestUser guser=new GuestUser();
		guser.setCount(1);
		guser.setEmaiId("abc@gmail.com");
		guser.setMobileNo(123456);
		guser.setName("Thinaharan");
		
		RegisteredUser  ruser=new RegisteredUser();
		ruser.setUserId("userId1");
		ruser.setPassword("sivaraman");
		ruser.setEmaiId("efg@gmail.com");
		ruser.setMobileNo(12345678);
		ruser.setName("Rajalingam");
		
		
		try{
			session.save(guser);
			session.save(ruser);
			session.getTransaction().commit();
		}
		catch(HibernateException hib){
			
			hib.printStackTrace();
			session.getTransaction().rollback();
		}
		
		session.close();
	}

}
