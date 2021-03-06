package com.lnt.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ManyToManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee emp1=new Employee();
		emp1.setEmpId("109");
		emp1.setFirstName("Nandhu");
		emp1.setLastName("Segar");
		
		Employee emp2=new Employee();
		emp2.setEmpId("112");
		emp2.setFirstName("Nan");
		emp2.setLastName("Ser");
		
		Employee emp3=new Employee();
		emp3.setEmpId("113");
		emp3.setFirstName("Nand");
		emp3.setLastName("Sar");
		
		Employee emp4=new Employee();
		emp4.setEmpId("114");
		emp4.setFirstName("Nandy");
		emp4.setLastName("rajasegar");
		
		Meeting meeting1=new Meeting();
		meeting1.setMeetingId("M1");
		meeting1.setMeetingType("Weekly");
		
		Meeting meeting2=new Meeting();
		meeting2.setMeetingId("M2");
		meeting2.setMeetingType("Monthly");
		
		meeting2.getEmployees().add(emp1);
		meeting2.getEmployees().add(emp2);
		
		emp1.getMeetings().add(meeting2);
		emp2.getMeetings().add(meeting2);
		
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(meeting1);
		session.save(meeting2);
		
		
		t.commit();
		session.close();
		
		
		System.out.println("Employe- Meeting data stored succseegully!");
		
		
		

	}

}
