package com.psl.training.oopdesign.shopInventory;

public class Laptop extends HardwareProduct implements OpSys,Memory {

	
	
	public Laptop(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
	}
	@Override
	public void hasOS(String OsType) {
		System.out.println("Laptop Has OS of type: "+OsType);
		
	}

	@Override
	public void sizeOfMemory(String size) {
		System.out.println("Laptop Has Memory of size: "+size);
		
	}
	@Override
	void brandOfProduct(String brand) {
		System.out.print("This laptop is of brand : "+brand);
		
	}
	@Override
	void hasBattery() {
		System.out.print("laptop requires battery");
		
	}
	@Override
	void hasPrice(long price) {
		System.out.println("this Laptop has price "+price);	
		
	}
	
	
}
