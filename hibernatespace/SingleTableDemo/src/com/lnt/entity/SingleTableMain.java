package com.lnt.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SingleTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		
		Vehicle v=new Vehicle();
		v.setVehicleNo("V10");
		v.setVehicleModel("199");
		
		
		TwoWheeler tw=new TwoWheeler();
		tw.setVehicleNo("AC12");
		tw.setVehicleModel("21");
		tw.setSteeringHandle("Self ");
		
		FourWheeler fw=new FourWheeler();
		fw.setVehicleNo("BD12");
		fw.setVehicleModel("201");
		fw.setSteeringWheel("Power");
		
		
		session.save(v);
		session.save(tw);
		session.save(fw);
		
		t.commit();
		session.close();
	}

}
