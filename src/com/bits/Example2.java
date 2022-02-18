package com.bits;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Item itm=new Item();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter item id: ");
		String id=sc.next();
		itm.setItemidNo(id);
		
		System.out.println("Enter item name: ");
		String name=sc.next();
		itm.setItemName(name);
		
		
		  System.out.println("Enter quantity: "); int qua= sc.nextInt();
		  itm.setItemQuantity(qua);
		  
		  System.out.println("Enter item price"); double price=sc.nextDouble();
		  itm.setItemPrice(price);
		 
		
		System.out.println("Item details are: ");
		
		if(qua==0&&price==0)
		{
			Item itm1=new Item(id,name,1,500);
			System.out.println("ItemId: "+itm1.getItemidNo()+"      "+"ItemName: "
	                  +itm1.getItemName()+"      "+"itemQuantity: "+itm1.getItemQuantity()+"        "+
			           "ItemPrice: "+itm1.getItemPrice());
		}
		else
		{
		System.out.println("ItemId: "+itm.getItemidNo()+"      "+"ItemName: "
		                  +itm.getItemName()+"      "+"itemQuantity: "+itm.getItemQuantity()+"        "+
			"ItemPrice: "+itm.getItemPrice());
		}
		
		
		Customer c=new Customer();
		
		
	}

}
