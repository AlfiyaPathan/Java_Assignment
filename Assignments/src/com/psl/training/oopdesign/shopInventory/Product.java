package com.psl.training.oopdesign.shopInventory;

public abstract class Product {
	
	int ProductId;
	String ProductName;
	String SerialNo;
	long price;

	public Product() {}
	public Product(int ProductId,String ProductName,String SerialNo) {

		this.ProductId= ProductId;
		this.ProductName=ProductName;
		this.SerialNo=SerialNo;
		/*System.out.println("ProductId : "+ProductId);
		System.out.println("ProductName : "+ProductName);
		System.out.println("Product Serial Number : "+SerialNo);*/
	}
	abstract void hasPrice(long price);
	

}
