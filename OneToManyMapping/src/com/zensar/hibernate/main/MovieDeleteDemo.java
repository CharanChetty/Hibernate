package com.zensar.hibernate.main;
import java.util.List;

/**
 * @author CHARAN R
 * @creation date: 27th sep 2019 4.40 pm
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {
	public static void main(String[] args) {
		Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction();
		Movie m=s.get(Movie.class,5);
		System.out.println(m.getTitle());
		System.out.println(m.getRelease_date());
		List<Song>songs=m.getSongs();
		for(Song s1:songs)
		{
			System.out.println(s1);
		}
		if(m!=null)
		{
			s.delete(m);
		}
		else
		{
			System.out.println("not possible");
		}
		
		
		t.commit();
		s.close();
		System.exit(0);
	}

}
