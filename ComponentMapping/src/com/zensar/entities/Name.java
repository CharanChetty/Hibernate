package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name { 
	@Column(name = "first",length = 30)
	private String fname;
	@Column(name = "middle",length = 30)
	private String mname;
	@Column(name = "last",length = 30)
	private String lname;
	public Name()
	{
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Name(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}

}