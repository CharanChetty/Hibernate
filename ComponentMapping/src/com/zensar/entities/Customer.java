package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")

public class Customer {
	@Id
	@Column(name = "cid")
	private int cust_id;
	private Name name;
	private String gen;
	private int age;
	private String address;
	private LocalDate dob;
	private Blob pic;
	private Clob descrp;
	 public Customer()
	{
		
	}

	public int getCust_id() {
		return cust_id;
	}





	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}





	public Name getName() {
		return name;
	}





	public void setName(Name name) {
		this.name = name;
	}





	public String getGen() {
		return gen;
	}





	public void setGen(String gen) {
		this.gen = gen;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public LocalDate getDob() {
		return dob;
	}





	public void setDob(LocalDate dob) {
		this.dob = dob;
	}





	public Blob getPic() {
		return pic;
	}





	public void setPic(Blob pic) {
		this.pic = pic;
	}





	public Clob getDescrp() {
		return descrp;
	}





	public void setDescrp(Clob descrp) {
		this.descrp = descrp;
	}





	public Customer(int cust_id, Name name, String gen, int age, String address) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.gen = gen;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", gen=" + gen + ", age=" + age + ", address="
				+ address + "]";
	}
	

}
