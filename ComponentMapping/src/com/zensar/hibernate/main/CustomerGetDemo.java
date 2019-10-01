package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;

public class CustomerGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		Customer cust=s.get(Customer.class,4);
		System.out.println(cust.getCust_id());
		System.out.println(cust.getAddress());
		System.out.println(cust.getDob());


		try {
			Clob des=cust.getDescrp();
			Reader r=des.getCharacterStream();
			PrintWriter pw= new PrintWriter("./Resources/customerDb_info.txt");
			int chardata=0;
			while((chardata=r.read())!=-1)
			{
				pw.print((char)chardata);
			} r.close();
			pw.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		t.commit();
		s.close();
	}

	private static char[] Char(int chardata) {
		// TODO Auto-generated method stub
		return null;
	}

}
