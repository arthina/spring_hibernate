package com.lnt.executor;

import java.util.Iterator;
import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lnt.pojo.Book;

public class HQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//String q="from Book" ; //accessing from Book class in hql we neeed to give class name not table name
		//String q="from Book b where b.price>9";//first make update in cfg file then run BookMain.java and then run HQLDemo
		//String q="from Book b where b.price=900";
		String q="select b.bookTitle from Book b ";//bookTitle is the property name
		Query query=session.createQuery(q);
		List<Object> results=query.list();//list will contain Book objects when we want to get something from the table we use list
		
		//to get the object we use iterator,foreach loop
		Iterator iter =results.iterator();
		while(iter.hasNext())
		{
			//Book book =(Book)iter.next();
			String title = (String)iter.next();
			
			//System.out.println(book.getBookid() +"\t" + book.getBookTitle() +"\t" + book.getAuthor() +"\t" + book.getPrice());
			System.out.println(title);
			
			
		}
		
		
		//update
		
		//String q1="update Book set price=1200 where bookId=123";
	/*	String q1="update Book set price=:pr where bookId=:bid";//named parameter method
		query=session.createQuery(q1);
		query.setParameter("pr",1200.00);//because price is double
		query.setParameter("bid",123);
		
		
		int noofRows=query.executeUpdate();
		System.out.println("No of rows update" +noofRows);*/
		
		
		
		//delete record
		
		String q2="delete Book where bookId=:bid";//named parameter method
		query=session.createQuery(q2);
		//query.setParameter("pr",1200.00);//because price is double
		query.setParameter("bid",123);
		
		
		int noofRows1=query.executeUpdate();
		System.out.println("No of rows deleted" +noofRows1);
		
		
		
		
		transaction.commit();
		session.close();
		
		

	}

}
