package com.lnt.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Book book=new Book();
		book.setBookid(123);
		book.setBookTitle("Meluha");
		book.setAuthor("Amesh");
		book.setPrice(90);
		
		
		Book book1=new Book();
		book1.setBookid(12);
		book1.setBookTitle("Mha");
		book1.setAuthor("Ame");
		book1.setPrice(900);
		
		
		Book book2=new Book();
		book2.setBookid(1);
		book2.setBookTitle("Ma");
		book2.setAuthor("Ae");
		book2.setPrice(9);
		
		
		
		Book book3=new Book();
		book3.setBookid(8);
		book3.setBookTitle("Mha");
		book3.setAuthor("Ame");
		book3.setPrice(900);
		
		
		session.save(book);
		session.save(book1);
		session.save(book2);
		session.save(book3);
		
	
		
		transaction.commit();
		session.close();
	}

}
