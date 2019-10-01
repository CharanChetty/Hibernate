package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author CHARAN R
 * @creation date: 25th sep 2019 4.33pm
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
@Entity
@Table(name = "product")
public class Product {
@Id
@Column(name = "id")
	private int prod_id;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int prod_id, String name, String brand, float price) {
		this.prod_id = prod_id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
