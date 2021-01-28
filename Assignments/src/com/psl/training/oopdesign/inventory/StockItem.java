package com.psl.training.oopdesign.inventory;

public class StockItem {
	
	int itemNumber,quantity;
	String Description;
	double itemPrice;
	
	public StockItem() {
		
	}
	public StockItem(int itemNumber,String Des,double price) {
		this.itemNumber=itemNumber;
		this.Description=Des;
		this.itemPrice=price;
		
	}
	
	void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQauntity() {
		return quantity;
	}
	void printStockIteams()
	{
		System.out.println("-------------------------");
		 System.out.println("Stock Id: "+itemNumber);
		 System.out.println("Stock Name: "+Description);
		 System.out.println("Stock Price per item: "+itemPrice);
	}

}
