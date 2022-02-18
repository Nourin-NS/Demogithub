package com.bits;

public class Customer {
	
	private String custName;
	private String custidNo;
	private double balance=500;

	Item item;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName, String custidNo, double balance, Item item) {
		super();
		this.custName = custName;
		this.custidNo = custidNo;
		this.balance = balance;
		this.item = item;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustidNo() {
		return custidNo;
	}

	public void setCustidNo(String custidNo) {
		this.custidNo = custidNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
