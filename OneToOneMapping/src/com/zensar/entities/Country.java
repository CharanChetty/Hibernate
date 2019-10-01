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
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int conid;
private String name;
private String lang;
private  long pop;
@OneToOne(mappedBy = "country")//parent table

private Flag flag;
public int getConid() {
	return conid;
}
public void setConid(int conid) {
	this.conid = conid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
public long getPop() {
	return pop;
}
public void setPop(long pop) {
	this.pop = pop;
}
public Flag getFlag() {
	return flag;
}
public void setFlag(Flag flag) {
	this.flag = flag;
}




}
