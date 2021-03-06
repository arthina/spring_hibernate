package com.lnt.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class OneToOneMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
ServiceRegistry serviRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();
Transaction t=session.beginTransaction();

EmployeeDetail ed=new EmployeeDetail();
ed.setEmployeeid(103L);
ed.setStreetno(100);
ed.setStreetname("Virat street");
ed.setCity("Madurai");
ed.setCountry("India");

Employee employee=new Employee();
employee.setId(103L);
employee.setFirstname("Sachin");
employee.setLastname("Tendulkar");
employee.setEmployeeDetail(ed);
ed.setEmployee(employee);

EmployeeDetail ed1=new EmployeeDetail();
ed1.setEmployeeid(104L);
ed1.setStreetno(101);
ed1.setStreetname("Baba street");
ed1.setCity("Cartoon City");
ed1.setCountry("Joyas");

Employee employee1=new Employee();
employee1.setId(104L);
employee1.setFirstname("Rahul");
employee1.setLastname("Dravid");
employee1.setEmployeeDetail(ed1);
ed1.setEmployee(employee1);

session.save(employee);
session.save(employee1);

t.commit();
session.close();

	}

}
