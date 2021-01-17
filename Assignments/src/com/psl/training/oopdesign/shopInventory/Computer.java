package com.psl.training.oopdesign.shopInventory;

public class Computer extends HardwareProduct implements OpSys, Memory{

 
	public Computer() {
		//super(ProductId, ProductName, SerialNo);
	}
	public Computer(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
	}
	@Override
	public void hasOS(String OsType) {
		System.out.println("Computer Has OS of type: "+OsType);
		
	}

	@Override
	public void sizeOfMemory(String size) {
		System.out.println("Computer Has Memory of size: "+size);
		
	}
	@Override
	void brandOfProduct(String brand) {
		System.out.print("This computer is of brand : "+brand);
		
	}
	@Override
	void hasBattery() {
		System.out.print("computer requires battery");
		
	}
	@Override
	void hasPrice(long price) {
		System.out.println("This computer has price "+price);	
		
	}
	
	
	

}
