package com.zensar.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		//single ton and heavy weight session factory
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();//represents the database connection and leight weight
		Transaction t=s.beginTransaction();
		//insert new record
		
	/*	Product p=new Product(1009,"mobile","samsung",17800);
		s.save(p);
		t.commit();
		s.close();*/
		
		Product p=s.get(Product.class, 1002);
		s.save(p);
		
		/*if(p!=(null))
		{
			System.out.println(p);
		}
		else
		{
			System.out.println("product  not found");
		}*/
	
		p=s.get(Product.class, 1002);
		
		if(p!=(null))
		{
			float inc=p.getPrice();
			p.setPrice(2000+inc);
			s.update(p);
		}
		else
		{
			System.out.println("product  not found");
		}
		
		t.commit();
		s.close();
		
	}

}
