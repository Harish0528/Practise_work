package com.bitlabs.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
//import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
//import javax.persistence.UniqueConstraint;



@Entity
//@Table(uniqueConstraints = @UniqueConstraint(name = "uniqueNameConstraint",columnNames = {"pname"} ))
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	@NotNull(message = "Please Enter product name")
	private String pname;
	@Email(message = "please enter vaild email")
	private String email;
	private double pprice;
	private int pqty;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createddate;
	
	@PrePersist
	public void oncreated() {
		createddate = new java.util.Date();
	}
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

