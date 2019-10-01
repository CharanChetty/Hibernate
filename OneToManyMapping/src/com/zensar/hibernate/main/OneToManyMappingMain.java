package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		Movie mov=new Movie();
		mov.setTitle("Bhajaranghi bhaai jaan");
		mov.setRelease_date(LocalDate.of(2019, 9, 01));
		 Song son1=new Song();
		 son1.setName("Selfie le le re");
		 Song son2=new Song();
		 son2.setName("Chicken song");
		 Song son3=new Song();
		 son3.setName("Aaj ki party");
		  son1.setMovie(mov);
		  son2.setMovie(mov);
		  son3.setMovie(mov);
		  
		  List<Song> sg=new ArrayList<Song>();
		  sg.add(son1);
		  sg.add(son2);
		  sg.add(son3);
		
		  mov.setSongs(sg);
		  
		 
		  s.save(mov);
		  s.save(son1);
		  s.save(son2);
		  s.save(son3);
		t.commit();
		s.close();
		System.exit(0);

	}

}
