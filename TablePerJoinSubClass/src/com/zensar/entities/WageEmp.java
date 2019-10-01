package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wage_emp_two")
public class WageEmp extends Employee {
	private int hours;
	private float rate;
	
public WageEmp() {
	// TODO Auto-generated constructor stub
}

public WageEmp(int emp_id, String name, LocalDate joinDate, double sal, int hours, float rate) {
	super(emp_id, name, joinDate, sal);
	this.hours = hours;
	this.rate = rate;
}

public int getHours() {
	return hours;
}

public void setHours(int hours) {
	this.hours = hours;
}

public float getRate() {
	return rate;
}

public void setRate(float rate) {
	this.rate = rate;
}

@Override
public String toString() {
	return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
}



}
