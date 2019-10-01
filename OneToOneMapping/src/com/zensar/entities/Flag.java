package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author CHARAN R
 * @creation date: 27th sep 2019 2.50 pm
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
@Entity
//child table
public class Flag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flagid;
	private String flagname;
	private String descrp;
	@OneToOne
	@JoinColumn(name = "con_id")
	private Country country;
	public int getFlagid() {
		return flagid;
	}
	public void setFlagid(int flagid) {
		this.flagid = flagid;
	}
	public String getFlagname() {
		return flagname;
	}
	public void setFlagname(String flagname) {
		this.flagname = flagname;
	}
	public String getDescrp() {
		return descrp;
	}
	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	

}
