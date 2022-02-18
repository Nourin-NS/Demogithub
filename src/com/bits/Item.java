package com.bits;

public class Item {

	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemidNo() {
		return itemidNo;
	}
	public void setItemidNo(String itemidNo) {
		this.itemidNo = itemidNo;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
