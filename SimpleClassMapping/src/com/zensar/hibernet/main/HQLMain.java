package com.zensar.hibernet.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class HQLMain {
	public static void main(String[] args) {
		Configuration c= new Configuration().configure();
		//single ton and heavy weight session factory
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();//represents the database connection and leight weight
		Transaction t=s.beginTransaction();
		//Jpa Query(java persistant api)
		//Query q=s.createQuery("from Product");
		//Query q=s.createQuery("from Product p where p.name='mobile'");
		//Query q=s.createQuery("from Product p where p.price between 10000 and 20000");
		//Query q=s.createQuery("from Product p where p.brand like'vivo'");
		/*
		 * Query q=s.createQuery("from Product p where p.brand like'vivo'");
		 * List<Product> products=q.getResultList(); for(Product p:products) {
		 * System.out.println(p); }
		 */
		
		/*
		 * Query query=s.createQuery("select pr.name,price from Product pr");
		 * List<Object[]> objects=query.getResultList(); for(Object[] obj:objects) {
		 * for(int i=0;i<obj.length;i++) { System.out.println(obj[i]); } }
		 */
		/*
		 * Query query=s.createQuery("select min(pr.price) from Product pr"); float
		 * min=(float) query.getSingleResult(); System.out.println(min);
		 */
		
		/*
		 * Criteria cr=s.createCriteria(Product.class); List<Product>
		 * products=cr.list(); for(Product p:products) { System.out.println(p); }
		 */
		t.commit();
		s.close();
	}

}
