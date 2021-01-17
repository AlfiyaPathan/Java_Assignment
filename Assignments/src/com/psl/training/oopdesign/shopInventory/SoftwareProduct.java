package com.psl.training.oopdesign.shopInventory;

public abstract class SoftwareProduct extends Product {
	
	
	public SoftwareProduct() {}
	
	public SoftwareProduct(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
		System.out.println("****In Software Product class constructor*****");
		System.out.println("ProductId : "+ProductId);
		System.out.println("ProductName : "+ProductName);
		System.out.println("Product Serial Number : "+SerialNo);
	}
	abstract void hasLicenseKey();
	
	
	

}
