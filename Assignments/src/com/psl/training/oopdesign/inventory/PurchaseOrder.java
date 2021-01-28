package com.psl.training.oopdesign.inventory;
import java.sql.Date;
import java.util.Scanner;
public class PurchaseOrder {
	
	int poNumber;
	Date orderDate;
	Date shipDate;
	Scanner sc = new Scanner(System.in);
	public PurchaseOrder() {}
	
	void create(int poNo,Date OrderDate) {
		
		this.orderDate=OrderDate;
		this.poNumber=poNo;
	}
	void setShipDate(Date shipDate) {
		
		this.shipDate=shipDate;
	}
	
/*	boolean isShipped() {
		long current=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(current);  
		//System.out.println(" current Date"+date);
		if (shipDate.compareTo(date)==0&&shipDate.compareTo(date)<0) {
			return true;
		}
		return false;
		
	}*/
	
	 
	
	 OrderItem[] getItems(int n) {
		 OrderItem order[] = new OrderItem[n];
		 for (int j = 0; j < order.length; j++) {
			order[j]=new OrderItem();
			System.out.println("please give id of stock  "+(j+1)+":");
			int id=sc.nextInt();
			order[j].setId(id);
			sc.nextLine();
			System.out.println("please give name  "+(j+1)+":");
			String name=sc.nextLine();
			order[j].setOrderName(name);
			System.out.println("How many numbers of each items you want to purchase: ");
			int numberOfIteams= sc.nextInt();
			order[j].setOrderItem(numberOfIteams);
			sc.nextLine();
			
		}
		return order;
		 
	}
	 
	void PrintDetails(OrderItem[] order)
	{
		for (int i = 0; i < order.length; i++) {
			order[i].printOrderDetails();
		}
	}
	
	
	
	

}
