package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		Name name=new Name();
		name.setFname("charan");
		//name.setMname("throday");
		name.setLname("chetty");
		
		 Customer cust=new Customer(4,name,"male",23,"bangalore");
		 LocalDate.of(1997, 11, 14);
		 cust.setDob(LocalDate.of(1997, 11, 14));
		 
		 try {
			File pic=new File("./Resources/sha.jpg");
			 FileInputStream fin= new FileInputStream(pic);
			 Blob customerphoto=BlobProxy.generateProxy(fin,pic.length());
			 cust.setPic(customerphoto);
			 File des=new File("./Resources/customer-info.txt");
			 FileReader fr=new FileReader(des);
			 Clob descrp=ClobProxy.generateProxy(fr, des.length());
			 cust.setDescrp(descrp);
			 s.save(cust);
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
