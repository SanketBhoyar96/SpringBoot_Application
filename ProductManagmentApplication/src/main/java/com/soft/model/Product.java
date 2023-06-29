package com.soft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "product_seq",initialValue = 1,allocationSize = 1)
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="product_seq" )
	private int pid;
	private String pname;
	private String pqty;
	private float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, String pqty, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPqty() {
		return pqty;
	}
	public void setPqty(String pqty) {
		this.pqty = pqty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + "]";
	}
	
	
	
	
}
