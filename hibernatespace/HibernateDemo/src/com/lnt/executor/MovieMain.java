package com.lnt.executor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.lnt.pojo.Movie;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		
		Movie m=new Movie();
		m.setMovieId("1223");
		m.setMovieTitle("AAA");
		m.setLeadActor("simbu");
		
		Movie m1=new Movie();
		m1.setMovieId("122");
		m1.setMovieTitle("twilight");
		m1.setLeadActor("patison");
		
		session.save(m);
		session.save(m1);
		
		
		t.commit();
		session.close();

	}

}
