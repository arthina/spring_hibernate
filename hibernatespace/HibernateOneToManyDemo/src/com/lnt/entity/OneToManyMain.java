package com.lnt.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class OneToManyMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Department dept=new Department();
		dept.setDeptid(121L);
		dept.setDeptname("Sales");
		
		session.save(dept);
		Employee emp1 = new Employee();
		emp1.setId(123L);
		emp1.setFirstname("Nandhu");
		emp1.setLastname("Rajasegar");
		emp1.setDept(dept);
		
		Employee emp2=new Employee();
		emp2.setId(134L);
		emp2.setFirstname("priya");
		emp2.setLastname("seg");
		emp2.setDept(dept);
		
		dept.getEmployees().add(emp1);
		dept.getEmployees().add(emp2);
		
		session.save(emp1);
		session.save(emp2);
		
		
		
		t.commit();
		session.close();
		
		
	}

}
