package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setName("charan");
		e.setJoinDate(LocalDate.of(2019,06,26));
		e.setSal(45000);
		s.save(e);
		
		
		WageEmp we=new WageEmp();
		we.setName("chaithrodaya");
		we.setJoinDate(LocalDate.of(2019,06,26));
		we.setSal(40000);
		we.setHours(9);
		we.setRate(450);
		s.save(we);
		
		
		
		
		
		
		t.commit();
		s.close();
	}

}
