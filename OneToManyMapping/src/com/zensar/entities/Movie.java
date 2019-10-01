package com.zensar.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {
@Id
@GeneratedValue(strategy = GenerationType.AUTO )
private int mov_id;
private  String title;
private LocalDate release_date; 
@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
 private List<Song> songs;
public int getMov_id() {
	return mov_id;
}
public void setMov_id(int mov_id) {
	this.mov_id = mov_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public LocalDate getRelease_date() {
	return release_date;
}
public void setRelease_date(LocalDate release_date) {
	this.release_date = release_date;
}
public List<Song> getSongs() {
	return songs;
}
public void setSongs(List<Song> songs) {
	this.songs = songs;
}



}
