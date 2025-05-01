package com.zs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "cust_id")
	private int custId;
	@Column(length = 20, name = "cust_name")
	private String custName;
	@Column(name = "cr_limit")
	private double crLimit;
	
	public Customer() {
	}
	public Customer(int custId, String custName, double crLimit) {
		this.custId = custId;
		this.custName = custName;
		this.crLimit = crLimit;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", crLimit=" + crLimit + "]";
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCrLimit() {
		return crLimit;
	}
	public void setCrLimit(double crLimit) {
		this.crLimit = crLimit;
	}
}
