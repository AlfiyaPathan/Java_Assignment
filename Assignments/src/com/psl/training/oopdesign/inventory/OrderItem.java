package com.psl.training.oopdesign.inventory;

import java.util.Scanner;

public class OrderItem {
 double numberOfIteams;
 String name;
 int n;
 int id;
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

Scanner sc = new Scanner(System.in);
 
 
public StockItem stock[]=new StockItem[5];
 
 StockItem stockItem=new StockItem();
 
 double getNoItems() {
	 return numberOfIteams;
 }

 String getNameOrder()
 {
	 return name;
 }

 
 void setOrderName(String name)
 {
 	 this.name=name;
 }

 void setOrderItem(int numberOfIteams)
{
	 this.numberOfIteams=numberOfIteams;
}
 
 void printOrderDetails() {
	 System.out.print("Item Id:"+getId()+"  ");
	 System.out.print("Item Name: "+getNameOrder()+"  ");
	 System.out.println("Number of Item : "+getNoItems()+"  ");
 }
 double calPrice() {
	 double pro=0;
	 //System.out.println("Item Name for cal: "+getNameOrder());
	// System.out.println(" Befor loop stock num:item num:"+getId());
	for (int i = 0; i < n; i++) {
		 System.out.println("stock num:"+ stock[i].itemNumber+"item num:"+getId());
	if ((stock[i].itemNumber)==getId()) {
			
			  pro=stock[i].itemPrice*getNoItems();
		  System.out.println("Total Item Price: "+pro);
		}
	}
	return pro;
	 
 }
 void createStock()
 {
	 System.out.println("How many Iteams you want in stock:");
	 this.n = sc.nextInt();
	
	 for(int i =0;i<n;i++) {
		 sc.nextLine();
		 System.out.print("Set Item Name: ");
		 String des=sc.nextLine();
		 System.out.print("Set Item Price: ");
		 int p= sc.nextInt();
		 stock[i]=new StockItem(i+1,des,p);
	 }
	 
 }
 
 void printStockItems()
 {
	 System.out.println("-----------------------------------");
	 System.out.println("This is list of present stock:");
	 for (int i = 0; i < n; i++) {
			stock[i].printStockIteams();
		}
	 
 }

 
 
	
}
