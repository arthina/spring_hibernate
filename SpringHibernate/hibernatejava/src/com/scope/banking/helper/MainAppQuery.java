package com.scope.banking.helper;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.scope.banking.entity.Flight;

public class MainAppQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.createQuery("from Flight");
		
		for(Flight flight: (List<Flight>)query.list()){
			
			System.out.println(flight);
			
		}
		
		Criteria criteria=session.createCriteria(Flight.class);
		//criteria.setProjection(Projections.property("capacity"));
		criteria.setProjection(Projections.property("serviceProvider"));
		
		for(String serviceprovider : (List<String>)criteria.list()){
			System.out.println(serviceprovider);
		}
		
		
		Query columnQuery=session.createQuery
				("select f.serviceProvider,f.capacity from Flight f");
		Iterator itr=columnQuery.iterate();
		System.out.println("Service Provider"+"\t"+"capacity");
		while(itr.hasNext()){
			Object[] obj=(Object[])itr.next();
			System.out.println(obj[0]+"\t"+obj[1]);
		}
		
		session.close();
	}
}