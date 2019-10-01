package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author CHARAN R
 * @creation date: 27th sep 2019 4.40 pm
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Song_id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "mov_id")
	private Movie movie;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(int song_id, String name) {
		super();
		Song_id = song_id;
		this.name = name;
	}
	public int getSong_id() {
		return Song_id;
	}
	public void setSong_id(int song_id) {
		Song_id = song_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Song [Song_id=" + Song_id + ", name=" + name + "]";
	}
	

}
