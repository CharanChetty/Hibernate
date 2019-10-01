package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		Country con=new Country();
		con.setConid(1);
		con.setName("India");
		con.setLang("All Language");
		con.setPop(130000l);
		
		Flag f=new Flag();
		f.setFlagname("triranga");
		f.setDescrp("tri-color-flag");
		con.setFlag(f);
		f.setCountry(con);
		s.save(con);
		s.save(f);
		t.commit();
		s.close();
		System.exit(0);

	}

}
